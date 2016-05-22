package estoque2;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCasesRemove_06{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCasesRemove_06.class);
	}
	
	@Test
	public void test1()
	{
		Material oTestObject = new Material();
		assertEquals(true, (oTestObject.state == State.Idle));
		oTestObject.handleEvent("deleteEvent");
		assertEquals(true, (oTestObject.state == State.Input));
		assertEquals(true, (oTestObject.registerStatus.booleanValue() == false));
		oTestObject.handleEvent("okEvent");
		assertEquals(true, (oTestObject.state == State.Idle));
		oTestObject.handleEvent("deleteEvent");
		assertEquals(true, (oTestObject.state == State.Input));
		assertEquals(true, (oTestObject.registerStatus.booleanValue() == true));
		oTestObject.handleEvent("okEvent");
		assertEquals(true, (oTestObject.state == State.Deleting));
		oTestObject.handleEvent("confirmEvent");
		
	}
	
	@Test
	public void test2()
	{
		Material oTestObject = new Material();
		assertEquals(true, (oTestObject.state == State.Idle));
		oTestObject.handleEvent("deleteEvent");
		assertEquals(true, (oTestObject.state == State.Input));
		assertEquals(true, (oTestObject.registerStatus.booleanValue() == false));
		oTestObject.handleEvent("okEvent");
		assertEquals(true, (oTestObject.state == State.Idle));
		oTestObject.handleEvent("deleteEvent");
		assertEquals(true, (oTestObject.state == State.Input));
		assertEquals(true, (oTestObject.registerStatus.booleanValue() == true));
		oTestObject.handleEvent("okEvent");
		assertEquals(true, (oTestObject.state == State.Deleting));
		oTestObject.handleEvent("cancelEvent");
		
	}
	
}