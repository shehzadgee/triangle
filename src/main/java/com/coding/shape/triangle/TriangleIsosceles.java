/**
 * 
 */
package com.coding.shape.triangle;

/**
 * @author kshah
 *
 */
public class TriangleIsosceles extends Triangle{
	
	public TriangleIsosceles(double sameSidesLength, double thirdSide) throws TriangleException
	{
		super(sameSidesLength,sameSidesLength,thirdSide);
	}
	
	/* (non-Javadoc)
	 * @see com.coding.shape.triangle.Triangle#getType()
	 */
	@Override
	public TriangleType getType() {
		return TriangleType.ISOSCELES;
	}

}
