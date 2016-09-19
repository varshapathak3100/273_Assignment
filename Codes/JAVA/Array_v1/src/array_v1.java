import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class array_v1 {
	static Scanner s = new Scanner(System.in);
	static String[] name = new String[50];
	static int[] age = new int[3];
	static String contact_number;
	static String[] contactNumber = new String[10];
	static int i,j,k;
	static int option;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
		System.out.println("Enter your choice");
		System.out.println("1.Create new Record");
		System.out.println("2.Display Record");
		
		option = s.nextInt();
		switch(option){
		case 1: createRecord();
		  break; 
		case 2: displayRecord();
		  break; 
		  default:
			  System.out.println("Invalid input");
		}
	}
	}
	static void displayRecord() {
		if(name[0]==null){
			System.out.println("No records to display");
		}
		else{
//		 TODO Auto-generated method stub
		System.out.println("********************************************");
		System.out.println("	Records					");
		System.out.println("********************************************");
		int a;
		for( a=0;a<i;a++){
				System.out.println(name[a]+ "         " + age[a]+ "         " + contactNumber[a]);
				
		}
	}
}

	private static void createRecord() {
		// TODO Auto-generated method stub
		if(i==10){
			System.out.println("Records are full");
		}
		else{
			nameEntry();

		}
	}

	private static void nameEntry() {
		// TODO Auto-generated method stub
		for ( i =0;i<10;i++){
			System.out.println("Patient's name");
			name[i] = s.next(); 
			i=i+1;
			ageEntry();
			break;
	}
}

	private static void ageEntry() {
		// TODO Auto-generated method stub
		for ( j =0;j<10;j++){
			System.out.println("Enter age");
			age[j] = s.nextInt(); 
			j=j+1;
			System.out.println("Enter contact number (XXX-XXXXXXX)");
			contact_number = s.next();
			numberEntry(contact_number);
			break;
	}
	
}

	static void numberEntry(String contact_number) {
		// TODO Auto-generated method stub
//		for ( k =0;k<10;k++){
			int[] age = new int[10];

			 String regex = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{7}$";
			 Pattern pattern = Pattern.compile(regex);
			 Matcher matcher = pattern.matcher(contact_number);
			 if (matcher.matches()) {
			 System.out.println("Phone Number Valid");
				contactNumber[k] =  contact_number;
				k=k+1;
//				break;	
			 } else {
			 System.out.println("Phone Number must be in the form XXX-XXXXXXX");
			 k=k-1;
			 }
			
//			}

		}
}