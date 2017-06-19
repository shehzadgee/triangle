/**
 * 
 */
package com.coding.shape.triangle;

/**
 * @author kshah
 *
 */
public class TriangleScalene extends Triangle {
	
	public TriangleScalene(double a,double b, double c) throws TriangleException
	{
		super(a,b,c);
	}
	
	/* (non-Javadoc)
	 * @see com.coding.shaped.triangle.Triangle#getType()
	 */
	public TriangleType getType() {
		// TODO Auto-generated method stub
		return TriangleType.SCALENE;
	}

}
