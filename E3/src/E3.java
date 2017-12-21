import java.util.*;
import java.util.stream.*;

public class E3 {

   /**
      Just a helper method to display a message followed by a List of Student objects.
   **/
   public static void display(String msg, List<Student> std){
      System.out.println(msg);
      std.forEach(s -> System.out.println("\t" + s));
   }
   
   
   public static void main(String[] args){
      
     /*  We are going to use the list of Student objects below to test our programs.
         Feel free to add more students entries in order to test your code more thoroughly
     */
      List<Student> students = Arrays.asList(
         new Student("John", "Wick", "BSIT"), 
         new Student("James Mc", "Pherson",  "BSIT"),
         new Student("Thomas A.", "Anderson", "MSIT"),
         new Student("Elliot", "Alderson", "MSIT"),
         new Student("Harold", "Finch", "MSIT")
         );
      
      /**
         When you run your program, you will get an output similar to the following; 
         Please note that the GPA values being random, there will be differences
         every time you run the program.
         Original List of Students
         	John Wick @ BSIT(1.94)
         	James Mc Pherson @ BSIT(1.87)
         	Thomas A. Anderson @ MSIT(3.42)
         	Elliot Alderson @ MSIT(2.31)
         	Harold Finch @ MSIT(0.64)
            
         TASK #1 - high GPA students only
         	Thomas A. Anderson @ MSIT(3.42)
         
         TASK #2 - Mean GPA among all students = 2.036
         
         TASK #3 - Students by programs
         {BSIT=[John Wick @ BSIT(1.94), James Mc Pherson @ BSIT(1.87)], MSIT=[Thomas A. Anderson @ MSIT(3.42), Elliot Alderson @ MSIT(2.31), Harold Finch @ MSIT(0.64)]}
         
         TASK #4 - Students by programs (version 2)
         {BSIT=Wick, Pherson, MSIT=Anderson, Alderson, Finch}
         
         TASK #5 - The ONE student =  Thomas A. Anderson @ MSIT(3.42)            
      **/
      
      
         
      display("Original List of Students", students);
   
   
   
      /* TASK #1 ---------------------------------------------------------------------------------
         Complete the statement below so that it computes the required collection featuring only
         students with a gpa greater than, or equal, to 3.0
      */
      List<Student> high =
         students .stream().filter(student -> student.getGPA()>=3.0).collect(Collectors.toList())
                  //...
                  ;
      display("\nTASK #1 - high GPA students only", high);
      
      
   
      /* TASK #2 ---------------------------------------------------------------------------------
         Complete the statement below so that it computes the average GPA for all students
         Hint - there is a method to get averages, just like we saw the method to compute sums
      */
      OptionalDouble meanGPA =
         students .stream().mapToDouble(student -> student.getGPA()).average()
                  //...
                  ;
      System.out.print("\nTASK #2 - Mean GPA among all students = ");
      meanGPA.ifPresent(System.out::println);
      
      
      
      /* TASK #3 ---------------------------------------------------------------------------------
         Complete the statement below so that it computes a map where the key is the program
         and the value is a list of Student objects representings the students enrolled in that program
      */
      Map<String, List<Student>> byPrograms = 
         students .stream().collect(Collectors.groupingBy(Student::getProgram))
                  //...
                  ;
      System.out.println("\nTASK #3 - Students by programs");
      System.out.println(byPrograms);
      
   
   
      /* TASK #4 ---------------------------------------------------------------------------------
         Modify the code for the previous task so that the value in the map is a simple String
         containing all the lastnames of the students enrolled in the program specified by the key.
         You will separate the names by a comma followed by a space. 
         Hint - use a joining inside the mapping inside your groupingBy
      */
      Map<String, String> byPrograms2 = 
         students .stream().map(Student::getProgram).collect(Collectors.groupingBy(Student::getLastName)))
                  //...
                  ;
      System.out.println("\nTASK #4 - Students by programs (version 2)");
      System.out.println(byPrograms2);   
   
   
      
      /* TASK #5 ---------------------------------------------------------------------------------
         Use streams and the reduce method to find the student with the longuest last name and the highest
         GPA among students all having the longuest lastnames.
      */
      Optional<Student> theOne =
         students .stream().reduce((s1,s2) -> s1.getLastName().length()>=s2.getLastName().length()?s1:s2).reduce((g1,g2) -> g1.getGPA()>=g2.getGPA()?g1:g2)
                  //...
                  ;
      System.out.print("\nTASK #5 - The ONE student =  ");
      theOne.ifPresent(System.out::println);
   }                        
}



class Student {

   private String firstName; 
   private String lastName; 
   private String program;
   private double gpa;
   
   public Student(String first, String last, String program){
      this.firstName = first;
      this.lastName = last;
      this.program = program;
      this.gpa = (new Random()).nextFloat()*(double)4.0;
      this.gpa = (double)((int)(this.gpa *100)/100.0);
   }
   
   public String getProgram(){ 
      return program;
   }
      
   public double getGPA(){ 
      return gpa;
   }
      
   public String getLastName(){
      return lastName;
   }
      
   public String getFirstName(){
      return firstName;
   }
   
   public String toString(){
      return firstName + " " + lastName + " @ " + program + "(" + gpa + ")";
   }
}