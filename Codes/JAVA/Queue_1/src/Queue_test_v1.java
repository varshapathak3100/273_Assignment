import static org.junit.Assert.*;

import org.junit.Test;

public class Queue_test_v1 {

	queue_v1 test_1 = new queue_v1();
	@Test
	public void test1() {
		queue_v1.delReservation(test_1.names);
	}
	@Test
	public void test2(){
		queue_v1.displayReservation(test_1.names);
	}
}
