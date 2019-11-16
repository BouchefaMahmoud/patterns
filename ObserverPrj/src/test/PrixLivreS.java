package test.mustapha;

public class PrixLivreS  extends PrixDevise {
	
	private final double us_to_livre = 0.78;
	
	public PrixLivreS(PlaceFinaleNBA place){ 
	      this.place = place; 
	      this.place.attach(this); 
	   } 
	 
	 
	@Override
	public void update() {

		System.out.println("Le prix en $ a chang�, voici le nouveau prix en � " + (this.place.getTarif() * us_to_livre));
	}

}
