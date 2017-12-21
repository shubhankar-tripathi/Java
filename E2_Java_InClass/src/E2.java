/**
 * Main class of our file; provides the main method and static methods
**/
public class E2 {

   /**
    * Main method used to test our MinMaxBag class
   **/
   public static void main(String[] args){
   
      
        /* The following code is used to test our first, non-generic,
         implementation of MinMaxBag that only store Integer fields.
         It is only provided so that the first version of this code
         compiles after you download it.
      
       //  TODO
        
	   
         
         As you start implementing the generic version, you should 
         comment out these tests as they are no longer relevant*/
      
      
      
      /*MinMaxBag bag = new MinMaxBag();
      bag.insert(3);
      bag.insert(5);
      bag.insert(9);
      bag.insert(0);
      System.out.println("First Bag \t= " + bag);     // First Bag 	= <0/9>
      */
      
      /*
         The following code is used to test our generic version of MinMaxBag.
         we create a MinMaxBag of Integer, then a MinMaxBag of String. 
   
         TODO
         Uncomment this code as soon as you are ready to test your generic
         version of MinMaxBag
      */
      
      
      MinMaxBag<Integer> bag1 = new MinMaxBag<>();
      bag1.insert(3);
      bag1.insert(5);
      bag1.insert(9);
      bag1.insert(0);
      System.out.println("Integer Bag\t= " + bag1);      // Integer Bag	= <0/9>
   
      
      MinMaxBag<String> bag2 = new MinMaxBag<>();
      bag2.insert("hi");
      bag2.insert("hello");
      bag2.insert("again");
      bag2.insert("woof");
      System.out.println("String Bag \t= " + bag2);      // String Bag 	= <again/woof>
      
      
      /*
         The following statement is used to test your displayTwoBags static method
      
         TODO
         Once you are ready to test your generic version of this method,
         uncomment the following statement
      */
   
       displayTwoBags(bag1, bag2);    // Two Bags 	= <0/9> & <again/woof>
      
      /*
         TODO - optional
         Feel free to add more tests to this main method in order to
         ensure your code meets the requirements
      */
   }
   

   /**
    * The following initial implementation of displayTwoBags is not generic.
    *
    * TODO 
    * Turn this method into a generic method that will allow us to pass two
    * MinMaxBag parameters. Use the concept of Bounded Type parameters. 
    * Please note that, as illustrated in the main, these two MinMaxBags might
    * have different Type Parameters.
   **/
   public static
   <T,S> void displayTwoBags( MinMaxBag b1, MinMaxBag b2){
      System.out.println("Two Bags \t= " + b1 + " & " + b2);
   }
}


/**
* This class allows programmer to keep calling the insert() method in order to
* add elements to it. The class does not attempt to keep all the elements that
* are inserted, but instead, only keeps the largest and smallest ones.
* 
* TODO
* The following initial implementation of the MinMaxBag class is not generic.
* Turn this class into a generic class allowing you to specify a Type Argument
* replacing the Integer type that is used right now for storing the minimal and
* maximal values. You will have to also update other aspects of this class' code.
* Also make sure that the Type Parameter allows you to use the compareTo() method
* as we are doing in the current implementation.
**/
class MinMaxBag<T extends Comparable<T>> {

   /**
   * We need two fields to store the smallest and largest elements that have been
   * inserted so far.
   * 
   * TODO
   * In our initial implementation, the fields are simple Integer because our class
   * is not generic. Modify these declarations as needed when you turn the class
   * into a generic one.
   **/
   private T minValue;
   private T maxValue; 
   
   /**
   * The constructor sets the above-fields to null.
   **/
   public <T> MinMaxBag(){
      minValue = null;
      maxValue = null;
   }

   /**
   * The insert method takes a new value and checks whether it should 
   * replace the current minValue or current maxValue.
   * To do so, you must use the compareTo method.
   * 
   * TODO
   * The implementation provided to you only works on a newValue that is an Integer.
   * Modify it, using the concept of bounded type parameter, to turn it into a generic
   * method working on any types for which we are able to use the compareTo method
   **/
   public <T extends Comparable<T>> void insert(T newValue){
      if((minValue == null) || (newValue.compareTo(minValue) < 0))
         minValue = newValue;
      if((maxValue == null) || (newValue.compareTo(maxValue) > 0))
         maxValue = newValue;
   }
   
   
   
   /**
   * Simple toString method to make displaying objects of this class easier.
   **/
   public String toString(){
      return "<" + minValue + "/" + maxValue + ">";
   }
}