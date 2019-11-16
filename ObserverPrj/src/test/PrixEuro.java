package test.mustapha;

public class PrixEuro extends PrixDevise{
	
	private final double us_to_euro = 0.91;
	
	public PrixEuro(PlaceFinaleNBA place){ 
	      this.place = place; 
	      this.place.attach(this); 
	   } 
	 
	 
	@Override
	public void update() {

		System.out.println("Le prix en $ a changé, voici le nouveau prix en € " + (this.place.getTarif() *us_to_euro));
	}

}
