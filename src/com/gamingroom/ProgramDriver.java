package com.gamingroom;

/**
 * Application start-up program
 *
 * @author eric.slutz@snuh.edu
 *
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		GameService service = GameService.getInstance();
		
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);

		System.out.println();

		// initialize games with some team data
		Team team1 = game1.addTeam("Team #1");
		System.out.println(team1);
		Team team2 = game1.addTeam("Team #2");
		System.out.println(team2);
		Team team3 = game2.addTeam("Team #3");
		System.out.println(team3);
		Team team4 = game2.addTeam("Team #4");
		System.out.println(team4);

		System.out.println();

		// initialize teams with some player data
		Player player1 = team1.addPlayer("Player #1");
		System.out.println(player1);
		Player player2 = team2.addPlayer("Player #2");
		System.out.println(player2);
		Player player3 = team3.addPlayer("Player #3");
		System.out.println(player3);
		Player player4 = team4.addPlayer("Player #4");
		System.out.println(player4);
		Player player5 = team1.addPlayer("Player #5");
		System.out.println(player5);
		Player player6 = team2.addPlayer("Player #6");
		System.out.println(player6);
		Player player7 = team3.addPlayer("Player #7");
		System.out.println(player7);
		Player player8 = team4.addPlayer("Player #8");
		System.out.println(player8);
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
