import java.util.ArrayList;
public class Player{
    ArrayList<Player> freeAgents = new ArrayList<>();
    private int salary;
    private int ovr;
    private String position;
    private String name;
    String[] positions = {"Goalkeeper", "Defender", "Midfielder", "Striker"};
    String randomPosition;
    //private action(){
        //show stats?, as the other classes will override eventually
    //}     protected String  name;  

     public Player(){ 
        randomPosition = positions[(int)(Math.random()*3)];
        name = "genericPlayer";
        position = randomPosition; 
        ovr = (int)(Math.random()*51)+50;
        salary =(int)(Math.random()*501)+500;
     } 
     public Player(String a, String p, int o, int s){ 
        name = a; 
        position = p;
        ovr = o;
        salary = s;
     }
     public String stats(){
         return "Player Name: " + name + "\nPosition: " + position + "\nOverall: " + ovr + "\nSalary: $" + salary;
     }
     public String toString(){
         return name;
     }
    
}