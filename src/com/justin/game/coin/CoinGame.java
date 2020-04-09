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

	public static void main(String[] args) {
		
		/*App Config
		 * This will create a storage object that will hold starting values
		 */
		
		/*Initialize App
		 * This will initialize the application and make any necessary connections(For instance if a database connection was needed to show high scores)
		 * It will then store necessary information in the storage object
		 */
		
		/*Initialize Game
		 * The user is prompted with the rules
		 * 
		 * The user is prompted to select a number range
		 * The number range that they select is stored
		 * 
		 * The user is prompted to select the number of players
		 * The number of players that they select is stored
		 * 
		 * A random number is generated using the range selected by the user
		 * The random number is stored
		 */
		
		/*Start Game
		 * A message is displayed stating that the game is starting
		 */
		
		/*Make Guess
		 * The user will be prompted to make a guess
		 * 
		 * The guess counter will increase by one
		 * 
		 * If the user guess is too high/low then a correlating message is displayed
		 * 	The the make a guess prompt will display
		 * 
		 * If the user is correct then a message will display with their game information (Number of guesses)
		 * 	The user will be prompted to either play again or to shut down the application
		 * 
		 * At this point the players score would be sent to the database
		 */
		
		/*Play Again
		 * If play again is chosen then the application state will return to Initialize App
		 */
		
		/*Shutdown Application
		 * If the user selects quit then the application will shutdown
		 */

	}
	
	/**
	 * Dont forget to add Javadocs
	 */
	public static void configureApp() {
		//Create storage object. What is the correct way to do this in JAVA?
		
		
	}
	
	public static void initialieApp() {
		//Make a connection with the user Interface. What is the best way to do this in JAVA? Should this just be a System.out.println() method that spits out stored messages?
		
		
		//Make a connection with the user input device. What is he proper way to do this in JAVA? Does JAVA come with a pre-build console input system?
		
		
	}
	
	public static void initializeGame() {
		//Display welcome message
		
		
		//Display game rules
		
		
		//Prompt user for the number of players
		
		
		//Prompt user for a number range
		
		
		//Generate random number
		
		
	}
	
	public static void startGame() {
		//Display game is starting message
		
		
		//HandleGuesses
		
		
	}
	
	public static void handleGuesses() {
		//Prompt user for a guess
		
		
		//Check guess
		
		
		//Display the result of the guess and the guess number
		
		
		//If the guess is incorrect run handleGuesses
		
		
		//If the guess is correct run handleCorrectGuess
		
		
	}
	
	public static void handleCorrectGuesses() {
		//Display congratulations message with guess number
		
		
		//prompt user to either start a new game or quit
		
		
	}
	
	public static void shutdownApplication() {
		//Close application
		
		
	}

}
