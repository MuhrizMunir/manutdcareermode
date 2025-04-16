 import java.util.Scanner; 
 public class Tools { 
    String ball = "⚽";  
		String save = "🧤 "; 
		String miss = "❌"; 
		String goal = "✅"; 
    public static void playGame(Scanner scanner){ 
        for(;;){
			int c1 = 0; 
			 while(c1<5){
		
			System.out.println("Running game");  
			System.out.println("pick index");
			Game.showGoal(); 
			int sc1 = scanner.nextInt(); 
			//break; 
			if(Game.run1(sc1, c1) == true){ 
				System.out.println("✅"); 
				Game.showBoth();  
				
			}  
			else{
				System.out.println( "❌");  
				Game.showBoth();  
				
			} 
			System.out.println();  
			Game.showGoal();  
			System.out.println("pick save  index");
			int sc2 = scanner.nextInt(); 
			if(Game.run2(sc2,c1) == true){ 
				System.out.println("⚽"); 
				Game.showBoth();  
				
			}  
			else{
				System.out.println( "🧤");  
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
				System.out.println("win"); 

			else  
				System.out.println("loss"); 
				break; 
		
		
			
		}

    }
}
