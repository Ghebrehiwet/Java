package com.GG.MileToKiloConvertor;

import java.util.Scanner;

public class Program {
	private double miles;
	private static double kilometers;
	
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a distance in miles: ");
		double input = scan.nextDouble(); 
		mileToKilo(input);
	}

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public double getKilometers() {
		return kilometers;
	}

	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}

	public Program(double x) {
		this.kilometers = x;
	}

	public static void mileToKilo(double input) {
		  
		kilometers = input * 1.6;
		System.out.println(input + " miles is " + kilometers + "km");
		speedChecker(input);
	}

	private static void speedChecker(double input) {
		if(input >= 60){
			System.out.println("Slow Down");
		}else{
			System.out.println("Your speed is okay!!");
		}
		return;
	}

	 
}
