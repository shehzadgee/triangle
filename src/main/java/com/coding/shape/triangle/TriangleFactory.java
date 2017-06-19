/**
 * 
 */
package com.coding.shape.triangle;

/**
 * @author kshah
 *
 */
public class TriangleFactory {
	
	public TriangleFactory(){
		
	}
	
	public Triangle createTriangle(double a,double b,double c) throws TriangleException
	{
		Triangle triangle = null;
		
		if (a==b && b==c){
			//All sides are same create Equilateral Triangle
			triangle = new TriangleEquilateral(a);
		}else if (a!=b && b!=c && a!=c)
		{
			//All sides are different create Scalene
			triangle = new TriangleScalene(a,b,c);
		}else //This means at least two sides are same
		{
			//As Scalene triangle need just two sides to be defined
			//Following conditions will identify same sides and create triangle with appropriate arguments
			if (a==b)
				triangle = new TriangleIsosceles(a,c);
			else if (b==c)
				triangle = new TriangleIsosceles(b,a);
			else if (a==c)
				triangle = new TriangleIsosceles(a,b);
		}
			
		return 	triangle;
	}
		
}

