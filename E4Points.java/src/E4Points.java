import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
public class E4Points {
static Point[] list = new Point[100];
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			Point point = new Point();
			point.x= Math.random();
			point.y= Math.random();
			list[i]= point;
		}
		Arrays.sort(list);
		System.out.println("Increasing order of x-coordinate");
		for(int k=0; k<list.length; k++) {
			System.out.println(list[k].x+", "+list[k].y);
		}
		
		CompareY compy = new CompareY();
		Arrays.sort(list, compy);
		System.out.println("Increasing order of y-coordinate");
		for(int j=0; j<list.length; j++) {
			System.out.println(list[j].x+ ", " + list[j].y);
		}
		
	}

}

class Point implements Comparable<Point> {
	double x;
	double y;

	@Override
	public int compareTo(Point arg0) {
		// TODO Auto-generated method stub
		if (Double.compare(x, arg0.x)!=0) {
			return Double.compare(y, arg0.y);
		}
		return Double.compare(x, arg0.x);
	}
}

class CompareY implements Comparator<Point> {

	@Override
	public int compare(Point arg0, Point arg1) {
		// TODO Auto-generated method stub
		if(arg0.y==arg1.y) {
			return (int)(arg0.x-arg1.x);
		}
		return (int)(arg0.y-arg0.y);
	}

}
