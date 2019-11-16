package test.mustapha;

public class UniqueObj_alt1 {
	// create : lazy => instance à l'appel 
	private static UniqueObj_alt1 instance;
	private static int nbreAppel = 0;

	// Constructeur private : on ne peut pas créer des instances de cette classe
	private UniqueObj_alt1() {
	}

	// accés au seul objet existant
	public static UniqueObj_alt1 getInstance() {
		if (instance == null) {
			instance = new UniqueObj_alt1();
		}
		nbreAppel++;
		return instance;
	}

	public void showCounter() {
		System.out.println("Alt1 : Vous m'avez appelé : " +nbreAppel + " fois");
	}
}
