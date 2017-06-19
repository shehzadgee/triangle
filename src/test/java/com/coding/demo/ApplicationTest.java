/**
 * 
 */
package com.coding.demo;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.CharBuffer;

import javax.xml.transform.stream.StreamResult;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * @author kshah
 *
 */
public class ApplicationTest {
	
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		 System.setOut(new PrintStream(outContent));
		 System.setErr(new PrintStream(errContent));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		 System.setOut(null);
		 System.setErr(null);
	}

	/**
	 * Test method for {@link com.coding.demo.Application#main(java.lang.String[])}.
	 * 
	 */
	@Test
	public void testMainUsageWithOutArguments() throws IOException {
		String[] arguments = new String[0];
		Application.main(arguments);
		//Check if App shows
		Assert.assertEquals(Application.APP_USAGE+"\r\n", outContent.toString());
		
	}
	
	
	/**
	 * Test method for {@link com.coding.demo.Application#main(java.lang.String[])}.
	 * @throws IOException 
	 */
	@Test
	public void testMainUsageWithLessArguments() throws IOException {
		String[] arguments = {"2","2"};
		Application.main(arguments);
		//Check if App shows
		Assert.assertEquals(Application.APP_USAGE+"\r\n", outContent.toString());
		
	}
	
	/**
	 * Test method for {@link com.coding.demo.Application#main(java.lang.String[])}.
	 * 
	 */
	@Test
	public void testMainWithInvalidNumber() {
		String[] arguments = {"df","2" ,"2"};
		Application.main(arguments);
		//Check if App shows
		Assert.assertEquals("Invalid format of input. For input string: \"df\"\r\n", outContent.toString());
		
	}
	
	/**
	 * Test method for {@link com.coding.demo.Application#main(java.lang.String[])}.
	 * 
	 */
	@Test
	public void testMainWithZeroLengthOfTrianlge()  {
		String[] arguments = {"0","2" ,"2"};
		Application.main(arguments);
		//Check if App shows
		Assert.assertEquals("Triangle cannot have any side with 0 or negative length\r\n", outContent.toString());
		
	}
	
	/**
	 * Test method for {@link com.coding.demo.Application#main(java.lang.String[])}.
	 * 
	 */
	@Test
	public void testMainWithNegativeLengthOfTriangle() {
		String[] arguments = {"-123","2" ,"2"};
		Application.main(arguments);
		//Check if App shows
		Assert.assertEquals("Triangle cannot have any side with 0 or negative length\r\n", outContent.toString());
		
	}
	
	/**
	 * Test method for {@link com.coding.demo.Application#main(java.lang.String[])}.
	 *  
	 */
	@Test
	public void testMainWithEqualSides()  {
		String[] arguments = {"2","2" ,"2"};
		Application.main(arguments);
		//Check if App shows
		Assert.assertEquals("Triangle is EQUILATERAL\r\n", outContent.toString());
	}
	
	/**
	 * Test method for {@link com.coding.demo.Application#main(java.lang.String[])}.
	 * 
	 */
	@Test
	public void testMainWithTwoEqualSides()  {
		String[] arguments = {"2","3" ,"2"};
		Application.main(arguments);
		//Check if App shows
		Assert.assertEquals("Triangle is ISOSCELES\r\n", outContent.toString());
		
	}
	
	/**
	 * Test method for {@link com.coding.demo.Application#main(java.lang.String[])}.
	 * 
	 */
	@Test
	public void testMainWithDifferentSides()  {
		String[] arguments = {"2","3" ,"4"};
		Application.main(arguments);
		//Check if App shows
		Assert.assertEquals("Triangle is SCALENE\r\n", outContent.toString());
		
	}

}
