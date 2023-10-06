import  com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcatTest {

	@Test
	public void test() {
		DailyTasks wipro = new DailyTasks();
		String output= wipro.doStringConcat("shar","uday");
		assertEquals("sharuday",output);
	}

}
		