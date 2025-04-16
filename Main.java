import java.util.Scanner;
 public class Main {

	public static void  main(String[] args){ 
		String ball = "⚽";  
		String save = "🧤 "; 
		String miss = "❌"; 
		String goal = "✅"; 
		
		
		//System.out.println("yo");
		//System.out.println("Hello, World!");
		//System.out.println("h");  
		int count = 1;  
		TestPlayer[] team1 = new TestPlayer[6];  
			for(int i=0;i<team1.length-1;i++){  
				String str = count + ""; 
				team1[i] = new TestPlayer(str); 
				count++;
			} 
			TestPlayer gkpr = new TestGoalkeeper("6");  
			Scanner scanner = new Scanner(System.in);

		// Game mygame = new Game();    
		// Game.showGoal();  
		// String gkr1 = " \\ o / \n   |  \n  / \\ ";
		Tools.playGame(scanner);  
		//System.out.println(ball + save + miss + goal);
		
		
	} 
}
