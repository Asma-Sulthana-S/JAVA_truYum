
package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cognizant.truyum.dao.*;

public class TestConnectionHandler {


	
	@Test
	public void test() {
		
		assertNotNull(ConnectionHandler.getConnection());
		System.out.println("Inside test");
		
	}
	@Test
	public void test1()
	{
	assertSame("Hai","hai"); 
	assertSame(2,3);
	System.out.println("Inside test1");
	
	}
	@Test
	public void test2()
	{
	
		
	String str1 = "Hai";
	String str2 = "Hai";
	assertSame(str1,str2); 
	System.out.println("Inside test2");
	
	}
	@Test
	public void test3() {
		
		
		assertEquals(5,7);
	    assertEquals("hai","hello");
	    assertTrue(5 < 7);
	    System.out.println("Inside test3");
	}
	@Before
	public void test4() {
		
		
		System.out.println("Before tests");
		System.out.println("Inside test4");
	}
	
	@After
	public void test5() {
		
		
		System.out.println("After tests");
		System.out.println("Inside test5");
	}

}
