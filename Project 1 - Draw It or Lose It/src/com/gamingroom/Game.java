package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a game
 */
public class Game extends Entity {
	private static final List<Team> teams = new ArrayList<>();

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);
	}

	/**
	 * @return the team
	 */
	public Team addTeam(String name) {
		// a local team instance
		Team team = null;

		/*
		Iterator Pattern Purpose and Characteristics

		The purpose of the iterator pattern is to be able to go through each element of a list.
		In this case, a for loop is being used basically saying, for each existingTeam in the
		list teams,	execute the code inside the loop.
		 */
		// if found, simply return the existing instance
		for (Team existingTeam : teams) {
			if (existingTeam.getName().equals(name)) {
				team = existingTeam;
			}
		}

		// if not found, make a new team instance and add to list of teams
		if (team == null) {
			team = new Team(GameService.getInstance().getNextTeamId(), name);
			teams.add(team);
		}

		// return the new/existing team instance to the caller
		return team;
	}

	@Override
	public String toString() {
		
		return "Game [id=" + getId() + ", name=" + getName() + "]";
	}

}
