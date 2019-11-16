package test.mustapha;

public class UniqueObj {
	// create : Early => instance au chargement
	private static UniqueObj instance = new UniqueObj();
	private static int nbreAppel = 0;

	// Constructeur private : on ne peut pas cr�er des instances de cette classe
	private UniqueObj() {
	}

	// acc�s au seul objet existant
	public static UniqueObj getInstance() {
		nbreAppel++;
		return instance;
	}

	public void showCounter() {
		System.out.println("Vous m'avez appel� : " +nbreAppel + " fois");
	}
}
