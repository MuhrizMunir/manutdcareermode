import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
		System.out.print("\033[H\033[2J");
    	System.out.flush();
		//loading screen, work on later if possible? display random msgs with delay
		// for(int i=0; i<10; i++){
		// 	String load = "loading . . .";
		// 	System.out.println(load);
		// 	System.out.print("\033[H\033[2J");
    	// 	System.out.flush();
		// }
		//end of loading screen

		System.out.println("Welcome to the game, young manager! What is your name?");
		String managerName = scanner.nextLine(); 
		System.out.print("\033[H\033[2J");
    	System.out.flush();
		System.out.println(managerName+" you will be managing the greatest team ever, Manchester United! \nBe prepared to sign and fire players, motivate your team to victory, and take actions in the game to secure us the ultimate trophy!");
		System.out.println("What actions do you want to take? Input the number corresponding to your selection.");
		System.out.println("1. \n2.\n3.\n4.\n5.\n6.\n7.");
		String action = scanner.nextLine();

		
		//uncomment later lines 33-40 and 45
		int count = 1;  
		TestPlayer[] team1 = new TestPlayer[6];  
			for(int i=0;i<team1.length-1;i++){  
				String str = count + ""; 
				team1[i] = new TestPlayer(str); 
				count++;
			} 
			TestPlayer gkpr = new TestGoalkeeper("6");  
		// //dont uncomment lines 42-44 and 46
		// // Game mygame = new Game();    
		// // Game.showGoal();  
		// // String gkr1 = " \\ o / \n   |  \n  / \\ ";
		Tools.playGame(scanner);  
		// //System.out.println(ball + save + miss + goal);
		
		
	} 
}
