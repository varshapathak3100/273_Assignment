import java.util.ArrayList;
import java.util.Scanner;

public class queue_v1 {
	 static Scanner s = new Scanner(System.in);
	static	ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true){
			
			System.out.println("Choose an option");
			System.out.println("1. Make a reservation");
			System.out.println("2. Delete a reservation");
			System.out.println("3. View reservation list");
			int option = s.nextInt();
			if(option == 1){
				makeReservation	(names);	
				}
			else if(option == 2){
				delReservation(names);	
				}
			else if(option == 3){
				displayReservation(names);
			}
			else{
				invalidQuestion();
			}
		}
	}
	
	private static void invalidQuestion() {
		// TODO Auto-generated method stub
		System.out.println("Enter a valid option");
	}

	static void displayReservation( ArrayList<String> names) {
		// TODO Auto-generated method stub
		if(!names.isEmpty()){
 
		System.out.println("\n"+"Please find order of Seating below");
		System.out.println(names);
	}
		else{
			System.out.println("No reservations made yet!");
		}
	}
	static void delReservation( ArrayList<String> names) {
		// TODO Auto-generated method stub
		if(!names.isEmpty()){
		System.out.println("Enter your name's position number to Delete the reservation");
		System.out.println(names);
		System.out.println("Enter number - ");
		int number=s.nextInt();
		if(names.get(number)== null){
			System.out.println("Invalid reservation number");
		}
		else{
			names.remove(number-1);			
		}

	}
		else{
			System.out.println("No reservations made yet");
		}
	}

	private static void makeReservation(ArrayList<String> names) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name to make a reservation");
		names.add(s.next());
	}

	
}
