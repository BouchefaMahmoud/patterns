package test.mustapha;

public class DemoState2 {

	public static void main(String[] args) {

		Guerrier2 loki = new Guerrier2();
				
		loki.setEtat(new EtatDebout());
		loki.avance();
		loki.avance();
		loki.avance();
		
		loki.setEtat(new EtatAuSol());
		loki.avance();
		loki.avance();
		
		loki.setEtat(new EtatDebout());
		loki.avance();
		loki.avance();
	}

}
