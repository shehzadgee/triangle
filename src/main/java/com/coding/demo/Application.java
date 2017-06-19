/**
 * This package contains main Application.
 */
package com.coding.demo;

import java.io.Console;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import com.coding.shape.triangle.Triangle;
import com.coding.shape.triangle.TriangleException;
import com.coding.shape.triangle.TriangleFactory;
import com.coding.shape.triangle.TriangleType;

/**
 * This class demonstrate usage of features in triangles package.
 * @author kshah
 *
 */
public class Application {
	

	public static Logger LOG = Logger.getLogger(Application.class);
	
	public static String APP_USAGE = "Program expect 3 arguments defining sides of traiangle\r\n"
								+"USAGE: \r\n"
								+"java -jar triangle-0.0.1-SNAPSHOT.jar 2 2 2\r\n"
								+"Triangle is EQUILATERAL";
	/**
	 * Main application accepts three arguments i.e sides of triangle.
	 * @param args
	 */
	public static void main(String[] args) {
		
	   if (args.length<3)
		{
			System.out.println(APP_USAGE);
			return;
		}
		TriangleFactory triangleFactory = new TriangleFactory();
		try {
			
			Triangle triangle = triangleFactory.createTriangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]),Double.parseDouble(args[2]));			
			System.out.println("Triangle is " +triangle.getType().toString());
		
		} catch (NumberFormatException e) {
			System.out.println("Invalid format of input. "+e.getMessage());
			LOG.error(e.getMessage(), e);
		
		} catch (TriangleException e) {
			System.out.println(e.getMessage());
			LOG.error(e.getMessage(), e);
			
		}
		
	}

}
