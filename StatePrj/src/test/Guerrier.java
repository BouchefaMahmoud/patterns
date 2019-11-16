package test.mustapha;


public class Guerrier { 
	   private EtatGuerrier etat; 
	 
	   public Guerrier(){ 
	      etat = null; 
	   } 
	 
	   public void leveToi(){ 
		      this.etat = new EtatDebout();   
	   }
	   
	   public void allongeToi() {
		   this.etat = new EtatAuSol();
	   }

	   public void avance () {
		   etat.avancer();
	   }

	} 