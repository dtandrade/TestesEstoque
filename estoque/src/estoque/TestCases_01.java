package estoque;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases_01{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases_01.class);
	}
	
	@Test
	public void test1()
	{
		Material oTestObject = new Material();
		
	}
	
}