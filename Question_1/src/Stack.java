import java.util.ArrayList;

public class Stack<E> extends ArrayList {
	public <E> void push(E e, Stack<E> stack){
		stack.add(e);
	}
	
	public <E> void pop(Stack<E> stack){
		if(!stack.isEmpty()) {
			stack.remove(stack.size()-1);
		}
	}
	
	public <E> boolean isEmpty(ArrayList<E> stack) {
		return stack.isEmpty();
	}

}
