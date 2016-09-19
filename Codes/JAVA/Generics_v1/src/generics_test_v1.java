import static org.junit.Assert.*;

import org.junit.Test;

public class generics_test_v1 {

	generics_v1 gen_v1 = new generics_v1();
	
	@Test
	public void test() {
		generics_v1.Displaybill(7);
	}
	@Test
	public void test_2() {
		generics_v1.Displaybill(0);
	}
}
