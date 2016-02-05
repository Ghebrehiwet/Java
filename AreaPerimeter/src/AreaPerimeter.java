 




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.text.NumberFormat;
import java.util.Scanner;

 
public class AreaPerimeter 
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Area and Perimeter Calculator\n");

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.println("Put in Width first and Length next");
            double width = getDoubleWithinRange(sc,
                "Enter Width: ", 0, 1000000);
            double length = getDoubleWithinRange(sc,
                "Enter Length: ", 0, 1000000);       

             
           double area = calculateArea(
               width, length);
           
           double perimeter = calculatePerimeter(
                   width, length);


            
            String results =
                  "Width:\t"
                      + (width) + "\n"
                + "Length:\t"
                      + (length) + "\n"
                      + "Area:\t " + area + "\n"
                      + "Perimeter: \t" + perimeter + "\n"; 
            
            
            // print the results
            System.out.println();
            System.out.println("RESULTS");
            System.out.println(results);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            sc.nextLine();  // discard any other data entered on the line
            System.out.println();
        }
    }

    public static double getDoubleWithinRange(Scanner sc, String prompt,
    double min, double max)
    {
        double d = 0.0;
        boolean isValid = false;
        while (isValid == false)
        {
            d = getDouble(sc, prompt);
            if (d <= min)
                System.out.println(
                    "Error! Number must be greater than " + min + ".");
            else if (d >= max)
                System.out.println(
                    "Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return d;
    }

    public static double getDouble(Scanner sc, String prompt)
    {
        double d = 0.0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static int getIntWithinRange(Scanner sc, String prompt,
    int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            i = getInt(sc, prompt);
            if (i <= min)
                System.out.println(
                    "Error! Number must be greater than " + min + ".");
            else if (i >= max)
                System.out.println(
                    "Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return i;
    }
	
    public static int getInt(Scanner sc, String prompt)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }
	
    public static double calculateArea(double width,
    double length)
    {
        double area = 0;
        
        area = width * length;
        
        
        return area;
    }
    
    public static double calculatePerimeter(double width,
    	    double length)
    	    {
    	        double perimeter = 0;
    	        
    	        perimeter = 2* width + 2* length;
    	        
    	        
    	        return perimeter;
    	    }
}
