/**
 * 
 */
package com.coding.shape.triangle;

import org.junit.Test;

/**
 * This class contains tests related to TriangleFactory.
 * @author kshah
 *
 */

public class TriangleFactoryTest {
	
	TriangleFactory triangleFactory = new TriangleFactory();
	
	@Test(expected=TriangleException.class)
	public void testCreateTriangleWithInvalidLengths() throws TriangleException{
		//As these 3 are invalid lengths so we expect exception
		triangleFactory.createTriangle(1D, 2D, 3D);
	}
	
	public void testCreateTriangleWithEqualSides() throws TriangleException{
		Triangle triangle = triangleFactory.createTriangle(2D, 2D, 2D);
		
	}
	
	
	

}
