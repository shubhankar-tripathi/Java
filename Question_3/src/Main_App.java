

public class Main_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table<Integer, String> table = new Table<Integer, String>();
		table.put(0, "Aston Martin", table);
		table.put(1, "BMW", table);
		table.put(2, "Volvo", table);
		table.put(3, "VW", table);
		System.out.println(table);
		table.gett(2, table);
		table.removee(1, table);
		System.out.println(table);
	}

}
