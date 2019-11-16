package test.mustapha;

public class SingletonDemo_alt1 {

	public static void main(String[] args) {

		// illegal construct
		// UniqueObj object = new UniqueObj();

		// accés à la seule instance disponible
		UniqueObj_alt1 object1 = UniqueObj_alt1.getInstance();
		// affiche compteur
		object1.showCounter();
		UniqueObj_alt1 object2 = UniqueObj_alt1.getInstance();
		// affiche compteur
		object2.showCounter();
		System.out.println("Egalité des objets ? " + (object1 == object2));

	}

}
