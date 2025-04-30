public class Manager{
    private int budget;
    private String name;
    //constructor
    public Manager(String name, int budget){
        this.name = name;
        this.budget = budget;
    }
    // Getter for budget
    public int getBudget() {
        return budget;
    }

    // Setter for budget
    public void setBudget(int budget) {
        this.budget = budget;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    //toString
    public String toString() {
        return "Manager name: " + name + "\nCurrent Budget: " + budget;
    }

    //private signPlayer(Player name){
        //implementation not finished
        //Selects person from freeagent arraylist and puts them into team arraylist
    //}
    //private boostMoral()
//{
    //Uses budget to boost team morale
//}    
//private fire(Player name){
//Removes player from arraylist
//}


}