import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E4Meta{

public static List<String> getFieldsList(String name){

// TODO - write this method
	List<String> listFields = new ArrayList<>();
	Field[] fields = null;
	try {
		fields = Class.forName(name).getFields();
	} catch (SecurityException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(Field obj: fields) {
		listFields.add(obj.getName());
	}
	return listFields;

}

public static void main(String[] args){

// Do not modify the main method

System.out.println("Enter name of a class in E4Meta.java");
Scanner scanner = new Scanner(System.in);
String name = scanner.next();

System.out.println("Fetching class for " + name + "...");

List<String> fields = getFieldsList(name);

for(String s : fields) System.out.println("\t" + s);

}

}


class Something {

public int data1; 
public int data2;
public int data3;

}

class SomethingElse extends Something {

public int data4;
public int data5;

}