 import java.util.Scanner; 
 public class Tools { 
    String ball = "⚽";  
		String save = "🧤 "; 
		String miss = "❌"; 
		String goal = "✅"; 
    public static void playGame(Scanner scanner){ 
        for(;;){ 
			System.out.println("Your enagaged in an intense penalty shootout to win the game. Whoever scores more goals in 5 shots wins. Otherwise overtime");
			int c1 = 0; 
			 while(c1<5){
		
			System.out.println("Your turn to shoot. Your "+c1+" player is shooting");  
			System.out.println("Pick an index where you want the player to shoot the ball, be carefull though, the opposing keeper might save your shot");
			Game.showGoal(); 
			int sc1 = scanner.nextInt(); 
			//break; 
			if(Game.run1(sc1, c1) == true){ 
				System.out.println("✅");  
				System.out.println("You scored!");
				Game.showBoth();  
				
			}  
			else{
				System.out.println( "❌");  
				System.out.println("You missed"); 
				Game.showBoth();  
				
			} 
			System.out.println();  
			System.out.println("Now its time to save your oppenents shot, pick an index where you guess your opponent is going to shoot"); 
			Game.showGoal();  
			System.out.println("pick save  index");
			int sc2 = scanner.nextInt(); 
			if(Game.run2(sc2,c1) == true){ 
				System.out.println("⚽");  
				System.out.println("Your opponent scored");
				Game.showBoth();  
				
			}  
			else{
				System.out.println( "🧤");   
				System.out.println("You saved the shot, No goal"); 
				Game.showBoth();  
				
			}  
			c1++;  
			}   
			int c2 = 0;  
			int c3 = 0;   
			for(int i=0;i<5;i++){ 
				if(Game.userscore[i]==true) 
					c2++;  
				if(Game.npcscore[i] == true) 
					c3++;  
				
			} 
			if(c2 > c3) 
				System.out.println("Congradulations, you beat your opponent, on to the next round"); 

			else if(c3>c2) 
				System.out.println("You lost, how unfournate. Better luck next year");  
			else 
				Tools.overtime(scanner); 
				Game.resetGoal(); 
				break; 
		
		
			
		}

    }  

	 public static void  overtime(Scanner scanner ){  
		Game.resetGoal(); 
		System.out.println("Still Tied! Now its time for a new overtime. If you score and your opponent misses you move on. But if you miss and your opponent scores you lose. "); 
		int c1 = 0;  
		System.out.println("Running game");  
		System.out.println("pick index");
		Game.showGoal(); 
		int sc1 = scanner.nextInt(); 
		//break; 
		if(Game.run1(sc1, c1) == true){ 
			System.out.println("✅");  
			System.out.println("Great goal, now save the ball to win the game"); 
			Game.showBoth();  
			
		}  
		else{
			System.out.println( "❌");   
			System.out.println("You missed, save your opponents next shot, or you lose");
			Game.showBoth();  
			
		} 
		System.out.println();  
		Game.showGoal();  
		System.out.println("pick save  index");
		int sc2 = scanner.nextInt(); 
		if(Game.run2(sc2,c1) == true){ 
			System.out.println("⚽");  
			System.out.println("Your opponent scored");
			Game.showBoth();  
			
		}  
		else{
			System.out.println( "🧤"); 
			System.out.println("You saved it, congradulations ");  
			Game.showBoth();  
			
		}  
		if(Game.userscore[c1] == true && Game.npcscore[c1]== false) 
			System.out.println("You Won!, what an exciting overtime win");  
		else if(Game.userscore[c1] == false && Game.npcscore[c1]== true)
			System.out.println(" Unforunate , overtime losses are always the worst");  
		else 
			Tools.overtime(scanner); 
		
		
	 }

}
