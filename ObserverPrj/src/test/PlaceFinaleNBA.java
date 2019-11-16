package test.mustapha;

import java.util.ArrayList;
import java.util.List;

public class PlaceFinaleNBA {

	private List<PrixDevise> observersList;
	private double tarif;

	public PlaceFinaleNBA() {
		observersList = new ArrayList<PrixDevise>();
	}
	
	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
		notifyAllObservers();
	}

	public void attach(PrixDevise observer) {
		observersList.add(observer);
	}

	public void notifyAllObservers() {
		for (PrixDevise observer : observersList) {
			observer.update();
		}
	}

}
