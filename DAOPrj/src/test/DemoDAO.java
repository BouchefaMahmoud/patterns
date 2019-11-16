package test.mustapha;

public class DemoDAO {

	public static void main(String[] args) {

		PlayerDAO playerDao = new PlayerDaoImplementation();

		printAllplayers(playerDao);
		
		Player player = playerDao.getListe().get(0);
		player.setName("dios del footbol");
		playerDao.updatePlayer(player);
		Player player2 = playerDao.getListe().get(1);
		player2.setName("magique CR7");
		playerDao.updatePlayer(player2);
		
		Player player3 = playerDao.getListe().get(2);
		player3.setName("metronome");
		playerDao.updatePlayer(player3);
		
		printAllplayers(playerDao);
		Player player4 = playerDao.getListe().get(2);
		playerDao.deletePlayer(player4);
		printAllplayers(playerDao);
	}

	public static void printAllplayers(PlayerDAO playerDao) {

		int k = 0;
		for (Player player : playerDao.getListe()) {
			System.out.println("Player(" + k + "): [Num : " + player.getNum() + ", Name : " + player.getName() + " ]");
			k++;
		}
		System.out.println();
	}

}
