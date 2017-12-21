import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E4Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> disp = 	gen(1,2,3,4).limit(5).collect(Collectors.toList());
	System.out.println(disp);
	}
	static Stream<Integer> gen(Integer a, Integer c, Integer m, Integer seed) {
		return Stream.iterate(seed,	n	->	((a*n)+c)%m); 
	}

}
