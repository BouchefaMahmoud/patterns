package test.mustapha;


public class Guerrier2 { 
	   private EtatGuerrier etat; 
	 
	   public Guerrier2(){ 
	      etat = null; 
	   } 
	 
	   public void setEtat(EtatGuerrier etatG) {
		   this.etat = etatG;
	   }

	   public void avance () {
		   etat.avancer();
	   }

	} 