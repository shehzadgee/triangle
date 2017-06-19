/**
 * 
 */
package com.coding.shape.triangle;

/**
 * @author kshah
 *
 */
public class TriangleEquilateral extends Triangle {
	
	
	public TriangleEquilateral(double a) throws TriangleException {
		super(a,a,a);
	}

	/* (non-Javadoc)
	 * @see com.coding.shape.triangle.Triangle#getType()
	 */
	@Override
	public TriangleType getType() {
	
		return TriangleType.EQUILATERAL;
	}

}
