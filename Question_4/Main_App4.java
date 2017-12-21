import java.util.Arrays;
import java.util.Map.Entry;

public class Main_App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table<Integer, String> table = new Table<Integer, String>();
		table.put(0, "Aston Martin", table);
		table.put(1, "BMW", table);
		table.put(2, "Volvo", table);
		table.put(3, "VW", table);
		for(Table.Entry entry : table) System.out.println(entry.toString());		
		System.out.println(table.get(2, table));
		table.remove(1, table);
		System.out.println(table);
	}

}
