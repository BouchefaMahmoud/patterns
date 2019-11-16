package test.mustapha;

import java.util.ArrayList;
import java.util.List;

public class PlayerDaoImplementation implements PlayerDAO {
	
	List<Player> laListe; 

	public PlayerDaoImplementation() {
		laListe = new ArrayList<Player>();
		
		// on suppose que les données viennt d'une B.D....
		Player p1 = new Player("Messi",10); 
		Player p2 = new Player("Ronaldo",7);
		Player p3 = new Player("Griezman",17); 
		laListe.add(p1); 
		laListe.add(p2);		
		laListe.add(p3);
	}

	@Override
	public List<Player> getListe() {
		return laListe;
	}

	@Override
	public Player getPlayer(int num) {
		
		 return laListe.get(num); 
	}

	@Override
	public void deletePlayer(Player player) {
		int pos = laListe.indexOf(player);
		laListe.remove(pos); 
		
	}

	@Override
	public void updatePlayer(Player player) {
		
		int pos = laListe.indexOf(player);
		laListe.get(pos).setName(player.getName()); 
		
		
	}
	

}
