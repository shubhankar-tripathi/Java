import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

	public static void main(String[] args) throws ClassNotFoundException {
		List<String> ref = new ArrayList<>(Arrays.asList("one", "two", "three"));
		Class<?> klass = null;
		System.out.println();
		
		klass = Class.forName(ref.toString());
	}

}
