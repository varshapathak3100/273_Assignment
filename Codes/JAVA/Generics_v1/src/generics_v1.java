import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class generics_v1 {
	static Scanner s = new Scanner(System.in);
	static ArrayList<String> Item_list = new ArrayList<>();
	static ArrayList<String> Price_list = new ArrayList<>();
	static	int item;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item_list.add("Black tea");
		Item_list.add("Jasmine tea");
		Item_list.add("Green tea");
		Item_list.add("Dark Tea");
		Item_list.add("Oolong tea");
		Price_list.add("$5");
		Price_list.add("$10");
		Price_list.add("$6");
		Price_list.add("$7");
		Price_list.add("$8");
		
		System.out.println("Tea Available");
		for(int i =0;i<5;i++){
			System.out.println((i+1) + ". " + Item_list.get(i) + "      " + Price_list.get(i));
		}
		UserChoice();
		Displaybill(item);
		}

	static void Displaybill(int item) {
		// TODO Auto-generated method stub
		if(item>0 && item<6){
			System.out.println("Your bill is " + Price_list.get(item-1)) ;	
		}
		else{
			System.out.println("Not a valid choice");
		}

	}

	private static void UserChoice() {
		// TODO Auto-generated method stub
		System.out.println("Enter the item number you want");
		item = s.nextInt();
	}
}
