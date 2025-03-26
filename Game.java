public class Game{
    private  int[][] goal  = new int[3][4]; 
    private  int i1 = 0; 
    private   int i2 = 0;   
    private  boolean shooting;  
    private int[] userscore = new int[5]; 
    private int[] npcscore = new int[5]; 
    

    public Game(){ 

    }
// games 

    public void showGoal(){  
        int count = 0; 
        for(int r=0;r<goal.length;r++){ 
            for(int c =0;c<goal[0].length;c++){ 
               System.out.print("["+ count + "] ");  
               count++;   
            } 
            System.out.println(); 
        }
    }
    
}