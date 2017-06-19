/**
 * 
 */
package com.coding.shape.triangle;

/**
 * This is abstract class for Triangle and holds common information.
 * 
 * @author kshah
 *
 */
public abstract class Triangle {

	/* Side a of the Triangle*/
	double a;
	/* Side b of the Triangle*/
	double b;
	/* Side a of the Triangle*/
	double c;
	
	public Triangle(double a,double b, double c) throws TriangleException
	{
		this.a = a;
		this.b = b;
		this.c = c;
		validate();
	}
	
	abstract public TriangleType getType();
	
	private void validate() throws TriangleException
	{
		//Any side is less than 0 throw exception
		if (a<=0 || b<=0 || c<=0)
			throw new TriangleException("Triangle cannot have any side with 0 or negative length");
		
		//check validity of sides
		if ((a+b)<=c || (b+c)<=a || (c+a)<=b)
			throw new TriangleException("Triangle cannot be created. Invalid length of sides.");
		
	}
}
