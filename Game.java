public class Game{
    private static  int[][] goal  = new int[3][4];  
    private static String[][] goal2 = new String[3][4]; 
    private static  int i1 = 0; 
    private  static int i2 = 0;   
    private  static  boolean shooting;  
    private static boolean[] userscore = new boolean[5]; 
    private  static boolean[] npcscore = new boolean[5]; 
    
    // String multilineString = "" 
    //                               \\ o / 
    //                                  | 
    //                                 / \\     
    //                                ""; 
                    

    
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
    public static void run1(TestOutfielder plr, int a,int shot){ 
        int index = (int)((Math.random()*12)+1);  
        if(index == a){
            userscore[shot] = false;  
        } 
        else {
            userscore[shot] = true;  
        } 
        showGoal();
         

    } 
    public static void run2(TestOutfielder plr,int a, int shot){ 
        int index = (int)((Math.random()*12)+1);  
        if(index == a){
            npcscore[shot] = false; 
        }  
        else{
            npcscore[shot] = true;   
        }  
        showGoal(); 

        
         
    }
    
}