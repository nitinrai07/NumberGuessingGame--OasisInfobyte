 import java.util.Random;
  import java.util.Scanner;
  

public class NumberGuessingGame {
	    public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	        Random random = new Random();
	        
	        int lowerBound = 1;
	        int upperBound = 100;
	        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	        
	        int attempts = 0;
	        int maxAttempts = 5; 
	        
	        System.out.println("Welcome to Guess the Number Game!");
	        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Can you guess it?");
	        
	        while (attempts < maxAttempts) {
	            System.out.print("Enter your guess: ");
	            int guess = sc.nextInt();
	            
	            attempts++;
	            
	            if (guess == randomNumber) {
	                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
	                break;
	            } else if (guess < randomNumber) {
	                System.out.println("Too low! Try again.");
	            } else {
	                System.out.println("Too high! Try again.");
	            }
	        }
	        
	        if (attempts == maxAttempts) {
	            System.out.println("Sorry, you've run out of attempts. The correct number was " + randomNumber + ".");
	        }
	        
	        sc.close();
	    }
	}



