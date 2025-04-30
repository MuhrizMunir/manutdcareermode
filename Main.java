import java.util.Scanner;
 public class Main {
	//clear screen method: 
		//System.out.print("\033[H\033[2J");
    	//System.out.flush();
	public static void  main(String[] args){ 
		//scanner initialization
		Scanner scanner = new Scanner(System.in);
		//emojis for different results
		String ball = "⚽";  
		String save = "🧤 "; 
		String miss = "❌"; 
		String goal = "✅";
		//empty screen
		// System.out.print("\033[H\033[2J");
    	// System.out.flush();
		
		Player mo = new Player();
		System.out.println(mo.toString());

		// Game mygame = new Game();  
		// mygame.loadingScreen();
		// //game intro
		// System.out.println("Welcome to the game, young manager! What is your name?");
		// String managerName = scanner.nextLine(); 
		// System.out.print("\033[H\033[2J");
    	// System.out.flush();
		// System.out.println(managerName+" you will be managing the greatest team ever, Manchester United! \nBe prepared to sign and fire players, motivate your team to victory, and take actions in the game to secure us the ultimate trophy!");
		// System.out.println("What actions do you want to take? Input the number corresponding to your selection.");
		// System.out.println("1. Play the final\n2. Check your lineup\n3.\n4.\n5.\n6.\n7.Quit game");
		// action = scanner.nextLine().trim();
		
		
		
		
		  
		// Game.showGoal();  
		// String gkr1 = " \\ o / \n   |  \n  / \\ ";
		// Tools.playGame(scanner);  	
		// System.out.println(ball + save + miss + goal);
		
		
	} 
}
