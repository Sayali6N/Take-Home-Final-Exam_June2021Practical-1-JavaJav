package practical_1;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		//Practical 1: Generate 500 random numbers and print the nth smallest number in a programming language of your choice. 
		//(Ask user for the Nth smallest number)
		Scanner sc = new Scanner(System.in);
		System.out.println("Given Nth Smallest Number is:-");
		int smallestNumber = sc.nextInt();
		
		Random randomNumber = new Random();
	 
		for(int i=0; i<=500 ; i++) {
			
		System.out.println(ThreadLocalRandom.current().nextInt(smallestNumber,1000));//range from smallest number to 1000
	
			
		}
		
			System.out.println("Nth Smallest Number is: " + smallestNumber);
		}
			
		

}
