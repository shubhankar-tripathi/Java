
public class MainClass {
	public static void main (String[] args) {
		Pair<String, Integer> p1 = new Pair<String, Integer>("spaceX", 1);
		Pair<String, Integer> p2 = new Pair<String, Integer>("blueOrigin", 2);
		//boolean print = Util.<String, Integer>compare(p1,p2); Without type Inference
		boolean print  = Util.compare(p1, p2);
		System.out.println(print);
	}

}
