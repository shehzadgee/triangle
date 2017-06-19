/**
 * 
 */
package com.coding.shape.triangle;

import org.junit.Assert;
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
	
	@Test
	public void testCreateTriangleWithEqualSides() throws TriangleException{
		Triangle triangle = triangleFactory.createTriangle(2D, 2D, 2D);
		Assert.assertEquals(TriangleType.EQUILATERAL, triangle.getType());
	}
	
	@Test
	public void testCreateTriangleWithTwoEqualSidesOnly() throws TriangleException{
		Triangle triangle = triangleFactory.createTriangle(2D, 2D, 3D);
		Assert.assertEquals(TriangleType.ISOSCELES, triangle.getType());
	}
	
	@Test
	public void testCreateTriangleWithDifferentSides() throws TriangleException{
		Triangle triangle = triangleFactory.createTriangle(2D, 3D, 4D);
		Assert.assertEquals(TriangleType.SCALENE, triangle.getType());
	}
	
	@Test(expected=TriangleException.class)
	public void testCreateTriangleWithInvalidLength() throws TriangleException{
		Triangle triangle = triangleFactory.createTriangle(0, 3D, 4D);
	}
	
	
	
	
	

}
