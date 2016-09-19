import java.util.Scanner;
import java.util.Stack;

public class stack_v1 {

	static void stackPrint(Stack stack) {
		// TODO Auto-generated method stub
		if(stack.empty()){
			System.out.println("Stack is empty yet!");

		}
		else
		{
			while(!stack.empty()){
				System.out.println(stack.pop());
				
				}	
		}

	}

	static void stackFill(Stack stack) {
		// TODO Auto-generated method stub
		System.out.println("Enter name");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		for(int i=0;i<=name.length();i++){
			String names = name.substring(0, i);
			stack.push(names);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stackFill(stack);
		stackPrint(stack);
		
}	
}