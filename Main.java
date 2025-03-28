public class Main {

	public static void  main(String[] args){

		// Game mygame = new Game();    
		// mygame.showGoal();
		Player rnd = new Player();
		System.out.println(rnd.stats());
		Player bruno = new Player("Bruno", "Midfielder", 99, 1000);
		System.out.println(bruno.stats());
		MyTeam manutd = new MyTeam();


	}
}