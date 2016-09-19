import static org.junit.Assert.*;

import org.junit.Test;

public class array_test_v1 {

	array_v1 array1 = new array_v1();
	
	@Test
	public void test_2(){
		array_v1.displayRecord();
	}
	
	@Test
	public void test() {
		array_v1.contact_number = "89ss89978798";
		array_v1.numberEntry(array_v1.contact_number);
		}
	


}
