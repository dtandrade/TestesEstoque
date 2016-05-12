package estoque2;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases_11{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases_11.class);
	}
	
	@Test
	public void test1()
	{
		Material oTestObject = new Material();
		Integer sku3 = 494916;
		Integer unit3 = -547063;
		assertEquals(true, (oTestObject.state == State.Idle));
		oTestObject.handleEvent("registerEvent");
		assertEquals(true, (oTestObject.state == State.Registering));
		oTestObject.handleEvent("validEvent", sku3, unit3);
		oTestObject.handleEvent("saveEvent");
		assertEquals(true, (oTestObject.state == State.Registered));
		oTestObject.handleEvent("finaliseEvent");
		
	}
	
}