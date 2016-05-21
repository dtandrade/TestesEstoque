package estoque2;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCasesRemove_01{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCasesRemove_01.class);
	}
	
	@Test
	public void test1()
	{
		Material oTestObject = new Material();
		oTestObject.handleEvent("removeEvent");
		oTestObject.handleEvent("okEvent");
		oTestObject.handleEvent("confirmEvent");
		oTestObject.handleEvent("finaliseEvent");
		
	}
	
	@Test
	public void test2()
	{
		Material oTestObject = new Material();
		oTestObject.handleEvent("removeEvent");
		oTestObject.handleEvent("okEvent");
		oTestObject.handleEvent("cancelEvent");
		
	}
	
}