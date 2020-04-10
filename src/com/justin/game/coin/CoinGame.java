package com.justin.game.coin;

import java.util.HashMap;
import java.util.Scanner;

/****************************************************************************
 * <b>Title</b>: CoinGame.java
 * <b>Project</b>: CoinGameJava
 * <b>Description: </b> Number Guessing Game!
 * <b>Copyright:</b> Copyright (c) 2020
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author justinjeffrey
 * @version 3.0
 * @since Apr 8, 2020
 * @updates:
 ****************************************************************************/
public class CoinGame {
	
	HashMap<String, String> map = new HashMap<>();

	/**
	 * Main method called to allow command line processing
	 * @param args
	 */
	public static void main(String[] args) {
		CoinGame cg = new CoinGame();
				cg.process();
				
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter username");
		String userName = userInput.nextLine();
		System.out.println(userName);
	}
	
	public void process() {
		configureApp();
		
		initializeApp();
		
		initializeGame();
		
		startGame();
		
	}
	
	/**
	 * Setting the initial game values
	 */
	public void configureApp() {
		//Fill hashMap with initial messages
		
		map.put("Welcome", "Hello! And wellcome to my number guessings game.");
		
		
	}
	
	/**
	 * Initializes the application to confirm that the user is able to receive and input information
	 */
	public void initializeApp() {
		
		display("Welcome", false);
		
		//Collect the userName and store it in the hashMap
		
		//Run display method with user input and a prompt for the user to start the game
		
		
		//Put default values in HashMap
		
		
	}
	
	/**
	 * Displays game guidelines a collects game parameters from the user
	 */
	public void initializeGame() {
		//Display welcome message
		
		
		//Display game rules
		
		
		//Prompt user for the number of players
		
		//Prompt for player names
		
		
		//Prompt user for a number range
		
		
		//Generate random number
		
		
	}
	
	/**
	 * Displays starting message and initiates the guessing portion of the game
	 */
	public void startGame() {
		//Display game is starting message
		
		
		//HandleGuesses
		
		
	}
	
	/**
	 * Handles prompting user for guesses and responding based on the users input. Will loop itself until the user guesses correctly
	 */
	public void handleGuesses() {
		//Prompt user for a guess
		
		
		//Check guess
		
		
		//Guess count increase by one
		
		
		//Display the result of the guess and the guess number
		
		
		//If the guess is incorrect run handleGuesses
		
		
		//If the guess is correct run handleCorrectGuess
		
		
	}
	
	/**
	 * Displays a congratulations message and prompts user to either play again or quit playing
	 */
	public void handleCorrectGuesses() {
		//Display congratulations message with guess number
		
		
		//Prompt user to either start a new game or quit
		
		
		
		//If user selects start a new game run initializeApp
		
		
		
		//If user select Quit run shutdownApplication
	}
	
	/**
	 * Closes the application
	 */
	public void shutdownApplication() {
		//Close application
		
		
	}
	
	/**
	 * Handles the displaying of messages to the user and the collection of user input
	 * 
	 * Receives String containing the message and if applicable the userInput type
	 * @param args
	 */
	public void display(String message, boolean args2) {
		//Display message to user
		System.out.println(map.get(message));
		
		//If user input is requested then run collectUserInput
		if(args2) {
			//capture the return from collectUserInput
			collectUserInput();
		}
		
		
	}
	
	/**
	 * Handles collecting information from the user
	 * 
	 * Receives String containing the expected type of user input
	 * 
	 * @param args
	 */
	public void collectUserInput() {
		//Run user input method. Scanner Class will return a string. Parse it as an integer where needed
		
	}

}