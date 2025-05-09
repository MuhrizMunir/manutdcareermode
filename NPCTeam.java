import java.util.ArrayList;
public class NPCTeam extends Team{
    protected ArrayList<Player> npcteam = new ArrayList<>();
    //set roster using for loop
    public NPCTeam(){
        npcteam.add(new Player());
    }
    public String getStats(){
        for(int i = 0; i<npcteam.size();i++){
            System.out.println(npcteam.get(i).toString());
        }
        return "";
    }
}