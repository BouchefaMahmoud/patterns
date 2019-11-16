package test.mustapha;

public class DemoObserver {

	public static void main(String[] args) {

		PlaceFinaleNBA place = new PlaceFinaleNBA();

		new PrixEuro(place);
		new PrixLivreS(place);

		//System.out.println("\nOn fixe le prix � 100 $");
		place.setTarif(100);
		
		//System.out.println("\nOn change le prix � 250 $ ");
		place.setTarif(250);

		//System.out.println("\nLe prix s'envole � 750 $ ");
		place.setTarif(750);

	}

}
