package com.justin.game.coin;
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

	/**
	 * Main method called to allow command line processing
	 * @param args
	 */
	public static void main(String[] args) {
		//Run configureApp
		
		
		//Run initializeApp
		
		
		//Run inializeGame
		
		
	}
	
	/**
	 * Initializes a new instance of a HashMap for key/value storage
	 */
	public static void configureApp() {
		//Initialize a new instance of a HashMap
		
		
		
	}
	
	/**
	 * Initializes the application to confirm that the user is able to receive and input information
	 */
	public static void initialieApp() {
		//Run display method with a splash screen of some kind
		
		
		//Run display method with user input and a prompt for the user to start the game
		
		
		//Put default values in HashMap
		
		
	}
	
	/**
	 * Displays game guidelines a collects game parameters from the user
	 */
	public static void initializeGame() {
		//Display welcome message
		
		
		//Display game rules
		
		
		//Prompt user for the number of players
		
		
		//Prompt user for a number range
		
		
		//Generate random number
		
		
	}
	
	/**
	 * Displays starting message and initiates the guessing portion of the game
	 */
	public static void startGame() {
		//Display game is starting message
		
		
		//HandleGuesses
		
		
	}
	
	/**
	 * Handles prompting user for guesses and responding based on the users input. Will loop itself until the user guesses correctly
	 */
	public static void handleGuesses() {
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
	public static void handleCorrectGuesses() {
		//Display congratulations message with guess number
		
		
		//Prompt user to either start a new game or quit
		
		
		
		//If user selects start a new game run initializeApp
		
		
		
		//If user select Quit run shutdownApplication
	}
	
	/**
	 * Closes the application
	 */
	public static void shutdownApplication() {
		//Close application
		
		
	}
	
	/**
	 * Handles the displaying of messages to the user and the collection of user input
	 * 
	 * Receives String containing the message and if applicable the userInput type
	 * @param args
	 */
	public static void display(String[] args) {
		//Display message to user
		
		
		//If user input is requested then run collectUserInput
		
		
	}
	
	/**
	 * Handles collecting information from the user
	 * 
	 * Receives String containing the expected type of user input
	 * 
	 * @param args
	 */
	public static void collectUserInput(String[] args) {
		//Run user input method. Buffered Reader? Scanner Class?
		
	}

}