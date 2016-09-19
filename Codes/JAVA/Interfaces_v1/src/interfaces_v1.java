import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class interfaces_v1 implements interface_support_v1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
		System.out.println("Enter two numbers");
		Scanner p = new Scanner(System.in);
		String a = p.next();
		String b = p.next();
		String regex = "\\d+";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(a);
		 Matcher matcher_2 = pattern.matcher(b);
		 if (matcher.matches() && matcher_2.matches()) {
//		 System.out.println("Number Valid");
		 interfaces_v1 s = new interfaces_v1();
			s.add(a,b);
			s.substract(a,b);
			s.multiply(a,b);
			s.divide(a,b);	
		 } else {
		 System.out.println("Incorrect Input");
		 }
	   }
	}

	@Override
	public void add(String a, String b) {
		// TODO Auto-generated method stub
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		int sum = c+d;
		System.out.println("******************************************");
		System.out.println("Sum is "+ sum );
	}

	@Override
	public void substract(String a, String b) {
		// TODO Auto-generated method stub
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		int dif = c-d;
		System.out.println("Difference is " + dif);
	}
	@Override
	public void multiply(String a, String b) {
		// TODO Auto-generated method stub
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		int product = c*d;
		System.out.println("Product is " + product);
	}
	@Override
	public void divide(String a, String b) {
		// TODO Auto-generated method stub
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		if(d==0){
			System.out.println("Invalid denominator");
		}
		else{
		int div = c/d;
		System.out.println("Division result is " + div);
		System.out.println("******************************************");
		}
	}	
}
