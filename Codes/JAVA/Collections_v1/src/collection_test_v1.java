import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Scanner;

import org.junit.Test;

public class collection_test_v1 {
	LinkedHashMap records = new LinkedHashMap();
	Scanner s = new Scanner(System.in);

	@Test
	public void test_1() {
		collection_v1.displayRecord(records);
	}
	
	@Test
	public void test_2(){
		collection_v1.createRecord(s,records,"651d537517535");
	}
}
