public class Game{
    private static  int[][] goal  = new int[3][4];  
    private static String[][] goal2 = { 
       
        

    };
    private static  int i1 = 0; 
    private  static int i2 = 0;   
    private  static  boolean shooting;  
    public static boolean[] userscore = new boolean[5];  
    public  static String[] uservisual = {"*","*","*","*","*"};  
    public  static String[] npcvisual =  {"*","*","*","*","*"};

    public   static boolean[] npcscore = new boolean[5]; 
    
    //  String gkr = " \\ o / \n     |  \n   / \\ "; 

     

    
// games 

    public static  void showGoal(){  
        int count = 0; 
        for(int r=0;r<goal.length;r++){ 
            for(int c =0;c<goal[0].length;c++){ 
               System.out.print("["+ count + "] ");  
               count++;   
            } 
            System.out.println(); 
        } 
    }  
    public static void showGoal2(){ 
        for(int r=0;r<goal.length;r++){ 
            for(int c =0;c<goal[0].length;c++){ 
                  
            } 
            System.out.println(); 
        } 
    }
    public static boolean run1( int a,int shot){ 
        int index = (int)((Math.random()*5));   
        if(index == 1){ 
            index =a; 
        }
        if(index == a){
            userscore[shot] = false;  
            uservisual[shot] = "❌"; 
            return false;  
        } 
        else {
            userscore[shot] = true;  
            uservisual[shot] = "✅"; 
             return true; 
        } 
        

    } 
    public static boolean run2(int a, int shot){ 
        int index = (int)((Math.random()*5)); 
        if(index == 1){ 
            index =a; 
        }  
        if(index == a){
            npcscore[shot] = false; 
            npcvisual[shot] = "❌"; 
            return false; 
        }  
        else{
            npcscore[shot] = true;  
            npcvisual[shot] = "✅";
            return true;    
        }   

      
         
    }   
    public static void showBoth(){ 
        for(int i =0;i<5;i++){ 
            System.out.print("["+uservisual[i]+"]");
        } 
        System.out.println(); 
        for(int i =0;i<5;i++){ 
            System.out.print("["+npcvisual[i]+"]");
        } 
    } 
    

    public static void resetGoal() {
        for (int i = 0; i < uservisual.length; i++) { 
            uservisual[i]="*"; 
            npcvisual[i]="*";  
            userscore[i]= false; 
            npcscore[i] = false; 
            
        }
    }
        
    

  
    
    
}