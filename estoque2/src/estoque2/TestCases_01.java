package estoque2;

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
		assertEquals(true, (oTestObject.state == State.Idle));
		oTestObject.handleEvent("registerEvent");
		assertEquals(true, (oTestObject.state == State.Registering));
		oTestObject.handleEvent("validEvent");
		assertEquals(true, (oTestObject.state == State.Registered));
		oTestObject.handleEvent("addRegisterEvent");
		assertEquals(true, (oTestObject.state == State.Idle));
		
	}
	
	@Test
	public void test2()
	{
		Material oTestObject = new Material();
		assertEquals(true, (oTestObject.state == State.Idle));
		oTestObject.handleEvent("registerEvent");
		assertEquals(true, (oTestObject.state == State.Registering));
		oTestObject.handleEvent("validEvent");
		
	}
	
}