import java.util.Scanner;
 public class Main {
	//clear screen method: 
		//System.out.print("\033[H\033[2J");
    	//System.out.flush();
	public static void  main(String[] args){ 
		//notes
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
		//end notes
		MyTeam manUtd = new MyTeam();
		NPCTeam chelsea = new NPCTeam();
		Game game = new Game();  
		
		//game intro
		game.loadingScreen();
		// //game intro
		System.out.println("Welcome to the game, young manager! What is your name?");
		String managerName = scanner.nextLine(); 
		Manager name = new Manager(managerName);
		game.introScreen(managerName);
		game.optionList();
		String action = scanner.nextLine().trim();
		
		while(!(action.equals("5"))){
			if(action.equals("1")){
				System.out.print("\033[H\033[2J");
    			System.out.flush();
				Tools.playGame(scanner); 
			}
			else if(action.equals("2")){
				System.out.print("\033[H\033[2J");
    			System.out.flush();
				manUtd.toString();
			}
			else if(action.equals("3")){
				chelsea.getStats();
			}
			else if(action.equals("4")){
				System.out.println(name.toString());
			}
			game.optionList();
			action = scanner.nextLine().trim();
		}
		System.out.println("Goodbye!");
		
		
		  
		// Game.showGoal();  
		// String gkr1 = " \\ o / \n   |  \n  / \\ ";
		 	
		// System.out.println(ball + save + miss + goal);
		
		
	} 
}
