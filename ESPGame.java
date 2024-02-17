/*
 * Class: CMSC203 
 * Instructor: Professor Tanveer
 * Description: Color guessing game (a user guess the color selected by the program for 11 rounds and at the end of the program let the user know how many guesses they got right).
 * Due: 02/16/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: _Agabus Kuimi Tapah_
*/

import java.util.Random;
import java.util.Scanner;

public class ESPGame {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner (System.in);
		Random random = new Random();
		
		//Variables declaration
		String name, description, dueDate, guess, randomColor;
		int correct = 0;
		
		
		
		//Color list declaration
		final String COLOR_Red = "Red"; 
		final String COLOR_Green = "Green"; 
		final String COLOR_Blue = "Blue"; 
		final String COLOR_Orange = "Orange"; 
		final String COLOR_Yellow = "Yellow"; 
		final String COLOR_White = "White"; 
		final String COLOR_Black = "Black"; 
		
		System.out.print("Enter your name: ");
		name = stdin.nextLine();
	
		System.out.print("Describe yourself: ");
		description = stdin.nextLine();
		
		System.out.print("Due Date: ");
		dueDate = stdin.nextLine();
		
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		
		for (int i = 1; i <= 11; i++) {
			System.out.println("Round " + i);
			System.out.println("\nI am thinking of a color");
			System.out.println("Is it Red, Green, Blue, Orange, Yellow, White or Black?");
			System.out.println("Enter your guess: ");
			guess = stdin.nextLine();
			
			//Setting up bounderies of the acceptanle inputs
			boolean valid = guess.equalsIgnoreCase(COLOR_Red) || 
							guess.equalsIgnoreCase(COLOR_Green) ||
							guess.equalsIgnoreCase(COLOR_Blue) ||
							guess.equalsIgnoreCase(COLOR_Orange) ||
							guess.equalsIgnoreCase(COLOR_Yellow) ||
							guess.equalsIgnoreCase(COLOR_White) ||
							guess.equalsIgnoreCase(COLOR_Black);
			
			//Verifying the user input 
			while (!valid) {
				System.out.println("\nYou entered incorrect color. \nIs it Red, Green, Blue, Orange, Yellow, White or Black?");
				System.out.println("Enter your guess again: ");
				guess = stdin.nextLine();
				
				valid = guess.equalsIgnoreCase(COLOR_Red) || 
						guess.equalsIgnoreCase(COLOR_Green) ||
						guess.equalsIgnoreCase(COLOR_Blue) ||
						guess.equalsIgnoreCase(COLOR_Orange) ||
						guess.equalsIgnoreCase(COLOR_Yellow) ||
						guess.equalsIgnoreCase(COLOR_White) ||
						guess.equalsIgnoreCase(COLOR_Black);
			}
			
			/*if (guess != COLOR_Red) {
				System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, Yellow, White or Black?");
				System.out.println("Enter your guess again: ");
				guess = stdin.nextLine();
			}*/
			
			
			//Generating random number to select color
            int randomNumber = random.nextInt(7);
            randomColor = "";
            switch (randomNumber) {
                case 0:
                    randomColor = COLOR_Red;
                    break;
                case 1:
                    randomColor = COLOR_Green;
                    break;
                case 2:
                    randomColor = COLOR_Blue;
                    break;
                case 3:
                    randomColor = COLOR_Orange;
                    break;
                case 4:
                    randomColor = COLOR_Yellow;
                    break;
                case 5:
                    randomColor = COLOR_White;
                    break;
                case 6:
                    randomColor = COLOR_Black;
                    break;
                    
            }
            
            System.out.println("\nI was thinking of " + randomColor);
            if (guess.equalsIgnoreCase(randomColor)) {
            	correct++;
            }
			
			
		}
		
		
		System.out.println("\nGame Over");
		System.out.println("\n\n\nYou guessed " + correct + " out of 11 colors correctly.");
		System.out.println("Student Name: " + name);
		System.out.println("User Description: " + description);
		System.out.println("Due Date: " + dueDate);
		

	}

}
