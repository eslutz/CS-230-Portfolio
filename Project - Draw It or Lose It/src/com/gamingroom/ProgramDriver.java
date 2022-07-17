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

		// create the singleton game service
		GameService service = GameService.getInstance();
		
		System.out.println("\nAbout to test initializing game data...");

		// initialize with some game data
		System.out.println("\nAdding games to GameService");
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);

		// reusing existing games
		System.out.println("\nReusing existing games");
		Game game3 = service.addGame("Game #1");
		System.out.println(game3);
		Game game4 = service.addGame("Game #2");
		System.out.println(game4);

		// initialize games with some team data
		System.out.println("\nAdding teams to games");
		Team team1 = game1.addTeam("Team #1");
		System.out.println(game1 + " " + team1);
		Team team2 = game1.addTeam("Team #2");
		System.out.println(game1 + " " + team2);
		Team team3 = game2.addTeam("Team #3");
		System.out.println(game2 + " " + team3);
		Team team4 = game2.addTeam("Team #4");
		System.out.println(game2 + " " + team4);

		// reusing team names in same game
		System.out.println("\nReusing team names in same game");
		Team team5 = game1.addTeam("Team #1");
		System.out.println(game1 + " " + team5);
		Team team6 = game1.addTeam("Team #2");
		System.out.println(game1 + " " + team6);
		Team team7 = game2.addTeam("Team #3");
		System.out.println(game2 + " " + team7);
		Team team8 = game2.addTeam("Team #4");
		System.out.println(game2 + " " + team8);

		// reusing team names in different game
		System.out.println("\nReusing team names in different game");
		Team team9 = game1.addTeam("Team #3");
		System.out.println(game1 + " " + team9);
		Team team10 = game1.addTeam("Team #4");
		System.out.println(game1 + " " + team10);
		Team team11 = game2.addTeam("Team #1");
		System.out.println(game2 + " " + team11);
		Team team12 = game2.addTeam("Team #2");
		System.out.println(game2 + " " + team12);

		// initialize teams with some player data
		System.out.println("\nAdding players to teams");
		Player player1 = team1.addPlayer("Player #1");
		System.out.println(team1 + " " + player1);
		Player player2 = team1.addPlayer("Player #2");
		System.out.println(team1 + " " + player2);
		Player player3 = team2.addPlayer("Player #3");
		System.out.println(team2 + " " + player3);
		Player player4 = team2.addPlayer("Player #4");
		System.out.println(team2 + " " + player4);
		Player player5 = team3.addPlayer("Player #5");
		System.out.println(team3 + " " + player5);
		Player player6 = team3.addPlayer("Player #6");
		System.out.println(team3 + " " + player6);
		Player player7 = team4.addPlayer("Player #7");
		System.out.println(team4 + " " + player7);
		Player player8 = team4.addPlayer("Player #8");
		System.out.println(team4 + " " + player8);

		// reusing player names on same team
		System.out.println("\nReusing player names on same team");
		Player player9 = team1.addPlayer("Player #1");
		System.out.println(team1 + " " + player9);
		Player player10 = team1.addPlayer("Player #2");
		System.out.println(team1 + " " + player10);
		Player player11 = team2.addPlayer("Player #3");
		System.out.println(team2 + " " + player11);
		Player player12 = team2.addPlayer("Player #4");
		System.out.println(team2 + " " + player12);
		Player player13 = team3.addPlayer("Player #5");
		System.out.println(team3 + " " + player13);
		Player player14 = team3.addPlayer("Player #6");
		System.out.println(team3 + " " + player14);
		Player player15 = team4.addPlayer("Player #7");
		System.out.println(team4 + " " + player15);
		Player player16 = team4.addPlayer("Player #8");
		System.out.println(team4 + " " + player16);

		// reusing player names on different teams
		System.out.println("\nReusing player names on different team");
		Player player17 = team1.addPlayer("Player #3");
		System.out.println(team1 + " " + player17);
		Player player18 = team1.addPlayer("Player #4");
		System.out.println(team1 + " " + player18);
		Player player19 = team2.addPlayer("Player #5");
		System.out.println(team2 + " " + player19);
		Player player20 = team2.addPlayer("Player #6");
		System.out.println(team2 + " " + player20);
		Player player21 = team3.addPlayer("Player #7");
		System.out.println(team3 + " " + player21);
		Player player22 = team3.addPlayer("Player #8");
		System.out.println(team3 + " " + player22);
		Player player23 = team4.addPlayer("Player #1");
		System.out.println(team4 + " " + player23);
		Player player24 = team4.addPlayer("Player #1");
		System.out.println(team4 + " " + player24);
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
