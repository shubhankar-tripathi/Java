
public class Main_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3, stack);
		stack.push(2, stack);
		stack.push(1, stack);
		for(Object obj : stack) System.out.print(obj + ", ");
		stack.pop(stack);
		System.out.println();
		for(Object obj : stack) System.out.print(obj + ", ");
		stack.pop(stack);
		System.out.println();
		for(Object obj : stack) System.out.print(obj + ", ");
		
		
	}

}
