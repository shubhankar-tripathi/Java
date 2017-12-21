import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class E4Reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = new ArrayList<>();
		data.add("Tesla");
		data.add("Acura");
		data.add("Mercedes");
		data.add("Subaru");
		data.add("BMW");
		
		String single = data.stream().skip(1).reduce("T",(a,b) -> a+b.toCharArray()[0]);
		System.out.println(single);
	}

}
