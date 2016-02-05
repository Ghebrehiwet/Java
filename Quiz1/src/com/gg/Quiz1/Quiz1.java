package com.gg.Quiz1;

import java.util.Random;

public class Quiz1 {

	public static void main(String[] args) {
		Random random = new Random();
		int arrayToLoop = random.nextInt(20);
		System.out.println("The random number is " + arrayToLoop);
		if (arrayToLoop > 10) {
			System.out.println(arrayToLoop);
		}
		
//		for (int i = 0; i < arrayToLoop; i++) {
//			if(arrayToLoop > 10)
//			System.out.println(arrayToLoop);
//		}

	}

}
