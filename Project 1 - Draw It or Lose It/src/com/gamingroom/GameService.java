package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/**
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	/**
	 * Holds the single gameService instance
	 */
	private static GameService gameService = null;

	/**
	 * Private constructor for singleton pattern
	 */
	private GameService() {

	}

	/*
	Singleton Pattern Purpose and Characteristics

	The purpose of the singleton design pattern is to ensure that only one instance of a class
	can be created and used during the life of the program.  Here the singleton pattern is used
	by making the GameService constructor private.  The only way to get an instance of GameService
	is through the public getGameService static method.  That method in turn checks to see if the
	static field of gameService has been initialized yet.  If it has, then return that already
	created instance.  If it hasn't, then create a new instance for use for the life of the program.
	 */
	/**
	 * Checks if gameService has been initialized
	 * If it has, return that instance
	 * Otherwise, create a new instance of GameService
	 *
	 * @return the single gameService instance
	 */
	public static GameService getGameService() {
		// if not found, make a new GameService instance
		if (gameService == null) {
			gameService = new GameService();
		}

		// return the new/existing gameService instance to the caller
		return gameService;
	}

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		/*
		Iterator Pattern Purpose and Characteristics

		The purpose of the iterator pattern is to be able to go through each element of a list.
		In this case, a for loop is being used basically saying, for each existingGame in  the
		list games,	execute the code inside the loop.
		 */
		// if found, simply return the existing instance
		for (Game existingGame : games) {
			if (existingGame.getName().equals(name)) {
				game = existingGame;
			}
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// if found, simply assign that instance to the local variable
		for (Game existingGame : games) {
			if (existingGame.getId() == id) {
				game = existingGame;
			}
		}

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// if found, simply assign that instance to the local variable
		for (Game existingGame : games) {
			if (existingGame.getName().equals(name)) {
				game = existingGame;
			}
		}

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}
