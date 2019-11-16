package test.mustapha;

public class Jupe implements Article{

	@Override
	public void num() {
		System.out.print("1007 ");
		
	}

	@Override
	public void pTva() {
		// recherche dans une BD MONGO avec des calcul complexe
		System.out.print("39 ");
		
	}

	@Override
	public void nom() {
		System.out.println("jupe plissée en soi ");
		
	}

	@Override
	public void image() {
		// TODO Auto-generated method stub
		
	}

}
