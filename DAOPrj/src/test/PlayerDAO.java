package test.mustapha;

import java.util.List;

public interface PlayerDAO {

	   public List<Player> getListe(); 
	   public Player getPlayer(int num); 
	   public void updatePlayer(Player player); 
	   public void deletePlayer(Player player); 
}
