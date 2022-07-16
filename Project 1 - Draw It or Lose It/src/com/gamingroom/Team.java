package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a team
 */
public class Team extends Entity {
	private static final List<Player> players = new ArrayList<>();

	/**
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
	}

	/**
	 * @return the player
	 */
	public Player addPlayer(String name) {
		// a local player instance
		Player player = null;

		/*
		Iterator Pattern Purpose and Characteristics

		The purpose of the iterator pattern is to be able to go through each element of a list.
		In this case, a for loop is being used basically saying, for each existingPlayer in the
		list players, execute the code inside the loop.
		 */
		// if found, simply return the existing instance
		for (Player existingPlayer : players) {
			if (existingPlayer.getName().equals(name)) {
				player = existingPlayer;
			}
		}

		// if not found, make a new player instance and add to list of players
		if (player == null) {
			player = new Player(GameService.getInstance().getNextPlayerId(), name);
			players.add(player);
		}

		// return the new/existing player instance to the caller
		return player;
	}

	@Override
	public String toString() {
		return "Team [id=" + getId() + ", name=" + getName() + "]";
	}
}
