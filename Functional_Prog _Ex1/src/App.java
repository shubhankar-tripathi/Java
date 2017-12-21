import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		pickName(friends, "N");
		pickName(friends, "Z");
		final String str= "wOOt";
		//str.chars().forEach(chr -> System.out.println((char)chr));
		str.chars().mapToObj(ch -> Character.valueOf((char)ch)).forEach(System.out::println);
		
	}

	public static void pickName(final List<String> names, final String startingLetter) {
		final Optional<String> foundName = names.stream().filter(name -> name.startsWith(startingLetter)).findFirst();
		System.out.println(
				String.format("A name starting with %s: %s", startingLetter, foundName.orElse("No name found")));
		foundName.ifPresent(name -> System.out.println("Hello " + name));
		System.out.println("Sum of all the letters of the list : " + names.stream().mapToInt(name -> name.length()).sum());
		// joining elements using join method than the conventional for loop(NOT the stream) 
		System.out.println(String.join("||",names));
		// joining elements using streams and joining method from Collectors class
		System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.joining(",")));
		// joining elements using reduce method
		System.out.println(names.stream().reduce((n1,n2) -> (n1+"*"+n2)));
	}
}
