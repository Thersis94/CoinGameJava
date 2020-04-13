package com.justin.game.coin;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

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
				
	}
	
	
	/**
	 * Sequences App configuration and initialization
	 */
	public void process() {
		
		configureApp();
		
		initializeApp();
		
	}
	
	/**
	 * Setting the initial game values
	 */
	public void configureApp() {
		//Fill hashMap with initial messages
		
		map.put("guessNum", "0");
		
		map.put("Welcome", "Hello! And wellcome to my number guessings game.");
		map.put("getUserName", "Please enter your user name");
		map.put("gameRules", "Enter a number that is greater than 0. I will then choose a random number between 0 and the number you choose. You make a geuess and I will tell you if you guessed too high, too low, or just right! Lets get started.");		
		map.put("getNumRange", "Please enter the maximum number for our number range.");
		map.put("numRangeError", "It looks like you chose a number less than 1 please select a number greater than 0.");
		map.put("roundStarting", "Alright! We have a random number. Time to start guesing.");
		map.put("guessPrompt", "Make a guess!");
		map.put("guessedTooHigh", "You Guessed too high! Guess again.");
		map.put("guessedTooLow", "You guessed too low! Guess again.");
		map.put("guessedCorrectly", "Congratulations! You guessed correctly!");
		map.put("startOver", "Type 'start' to play again, otherwise type 'quit' to close the game.");
		map.put("numTypeError", "Please make sure you are selecting a 'number' and not a letter or symbol!");
		map.put("startError","It doesn't look we have anything that matches what you typed.");
	}
	
	/**
	 * Initializes the application and confirms that the user is able to receive and input information
	 */
	public void initializeApp() {
		
		
		display(map.get("Welcome"), false);
		
		
		//Collect the userName and store it in the hashMap
		
		String userName = display(map.get("getUserName"), true);
		map.put("userName", userName);
		
		handleStartNewGame();
		
	}
	
	/**
	 * Displays game guidelines and collects game parameters from the user
	 */
	public void initializeGame() {
		
		//Display game rules
		
		display(map.get("gameRules"), false);
		

		//Prompt user for a number for number range
		
		String numRangeString = display(map.get("getNumRange"), true);
		
		try {
		int numRangeInt = Integer.parseInt(numRangeString);
		
		if(numRangeInt <= 0) {
			
			display(map.get("numRangeError"), false);
			
			initializeGame();
			
		} else {
			
			//Generate random number
			
			Random rand = new Random();
			int randomNumber = rand.nextInt(numRangeInt);
			map.put("randomNumber", Integer.toString(randomNumber));
			
			startGame();
			
		}
		}
		catch(Exception e) {
			display(map.get("numTypeError"), false);
			initializeGame();
		}
	}
	
	/**
	 * Displays starting message and initiates the guessing portion of the game
	 */
	public void startGame() {
		
		display(map.get("roundStarting"), false);
		
		//HandleGuesses
		
		handleGuesses();
		
		
	}
	
	/**
	 * Handles prompting user for guesses and responding based on the users input. Will loop itself until the user guesses correctly
	 */
	public void handleGuesses() {
		
		//Prompt user for a guess
		String userGuess = display(map.get("guessPrompt"), true);
		
		//Guess count increase by one
		
		String guessNum = map.get("guessNum");
		guessNum = Integer.toString(Integer.parseInt(guessNum) + 1);
		map.put("guessNum", guessNum);
		
		//Check guess
		if(Integer.parseInt(userGuess) > Integer.parseInt(map.get("randomNumber"))) {
			display(map.get("guessedTooHigh") + " Guess number " + map.get("guessNum"), false);
			handleGuesses();
		} else if (Integer.parseInt(userGuess) < Integer.parseInt(map.get("randomNumber"))) {
			display(map.get("guessedTooLow") + " Guess number " + map.get("guessNum"), false);
			handleGuesses();
		} else {
			display(map.get("guessedCorrectly") + " It took you " + map.get("guessNum") + " guesses to get the right number.", false);
			handleStartNewGame();
		}
	}
	
	/**
	 * Displays a congratulations message and prompts user to either play again or quit playing
	 */
	public void handleStartNewGame() {
		//Prompt user to either start a new game or quit
		
		String replayDecision = display(map.get("startOver"), true).toLowerCase();
		
		if(replayDecision.equals("start")) {
			map.put("guessNum", "0");
			initializeGame();
		} else if (replayDecision.equals("quit")) {
			shutdownApplication();
		} else {
			display(map.get("startError"), false);
			handleStartNewGame();
		}
		
		//If user selects start a new game run initializeApp
		
		
		
		//If user select Quit run shutdownApplication
	}
	
	/**
	 * Closes the application
	 */
	public void shutdownApplication() {
		//Close application
		System.exit(0);
		
	}
	
	/**
	 * Handles the displaying of messages to the user and the collection of user input
	 * 
	 * Receives String containing the message and if applicable the userInput type
	 * @param args
	 */
	public String display(String message, boolean args2) {
		//Display message to user
		System.out.println(message);
		
		//If user input is requested then run collectUserInput
		if(args2) {
			//capture the return from collectUserInput
			return collectUserInput();
		} else {
			return null;
		}
		
		
	}
	
	/**
	 * Handles collecting information from the user
	 * 
	 * Receives String containing the expected type of user input
	 * 
	 * @param args
	 */
	public String collectUserInput() {
		//Run user input method. Scanner Class will return a string. Parse it as an integer where needed
		Scanner userInput = new Scanner(System.in);
		String inputLine = userInput.nextLine();
		return inputLine;
		
	}

}