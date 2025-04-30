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
     // Getter and Setter for salary
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Getter and Setter for ovr
    public int getOvr() {
        return ovr;
    }

    public void setOvr(int ovr) {
        this.ovr = ovr;
    }

    // Getter and Setter for position
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString method
    @Override
    public String toString(){
        return "Player Name: " + name + "\nPosition: " + position + "\nOverall: " + ovr + "\nSalary: $" + salary;
    }
    
}