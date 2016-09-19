import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class collection_v1 {
	static String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		LinkedHashMap records = new LinkedHashMap();
	    while(true){
	    	System.out.println("********************************************");
	    	System.out.println("Choose an option");
	    	System.out.println("1.Create an entry");
	    	System.out.println("2.View Records");
	    	int option=s.nextInt();
//	    	System.out.println(option);
	    	if (option == 1){
	    		System.out.println("Enter name");
	        	name=s.next();
	        	System.out.println("Enter SSN number in the form XXX-XX-XXXX");
	        	String ssn = s.next();
	    		createRecord(s,records,ssn);
	    	}
	    	else if(option==2){
	    	    displayRecord(records);
	    	}
	    	else{
	    		System.out.println("Enter a valid option");
	    		}
	    	}
	    
	   }
	static void displayRecord(LinkedHashMap records) {
		// TODO Auto-generated method stub
		if(!records.isEmpty()){
	    System.out.println(records);
		}
		else
		{
			System.out.println("No records to display");
		}
	}
	static void createRecord(Scanner s,LinkedHashMap records,String ssn) {
		// TODO Auto-generated method stub
		
    	
    	String regex = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(ssn);
		 if (matcher.matches()) {
				records.put(name,ssn);	
		 } else {
		 System.out.println("Invalid Entry");
		 }
	}
}
