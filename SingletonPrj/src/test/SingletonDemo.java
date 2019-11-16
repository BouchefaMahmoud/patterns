package test.mustapha;

public class SingletonDemo {

	public static void main(String[] args) {

		// illegal construct
		// UniqueObj object = new UniqueObj();

		// acc�s � la seule instance disponible
		UniqueObj object1 = UniqueObj.getInstance();
		// affiche compteur
		object1.showCounter();
		UniqueObj object2 = UniqueObj.getInstance();
		// affiche compteur
		object2.showCounter();
		System.out.println("Egalit� des objets ? " + (object1 == object2));

	}

}
