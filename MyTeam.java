import java.util.ArrayList;
public class MyTeam extends Team{
    private ArrayList<Player> myTeam = new ArrayList<>();
       
    public MyTeam(){
        Player onana = new Player("Onana", "Goalkeeper", 99, 1000);
        Player maguire = new Player("Maguire", "Defender", 99, 1000);
        Player yoro = new Player("Yoro", "Defender", 99, 1000);
        Player deLigt = new Player("deLigt", "Defender", 99, 1000);
        Player mazraoui = new Player("Mazraoui", "Midfielder", 99, 1000);
        Player fernandes = new Player("Fernandes", "Midfielder", 99, 1000);
        Player ugarte = new Player("Ugarte", "Midfielder", 99, 1000);
        Player dalot = new Player("Dalot", "Midfielder", 99, 1000);
        Player zirkzee = new Player("Zirkzee", "Striker", 99, 1000);
        Player garnacho = new Player("Garnacho", "Striker", 99, 1000);
        Player hojlund = new Player("Hojlund", "Striker", 99, 1000);
        
        myTeam.add(onana); 
        myTeam.add(maguire); 
        myTeam.add(yoro); 
        myTeam.add(deLigt);
        myTeam.add(mazraoui);
        myTeam.add(fernandes);
        myTeam.add(ugarte);
        myTeam.add(dalot);
        myTeam.add(zirkzee);
        myTeam.add(garnacho);
        myTeam.add(hojlund);
    }

    public String getStats(Player p){
        return p.stats();
    }
    public String toString(){
        for(int i =0; i<myTeam.size(); i++){
            System.out.println(myTeam.get(i));
        }
        return"";
    }
    
}