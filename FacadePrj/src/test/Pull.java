package test.mustapha;

public class Pull implements Article{

	@Override
	public void num() {
		System.out.print("1001 ");
		
	}

	@Override
	public void pTva() {
		// recherche dans une BD MYSQL
		System.out.print("25 ");
		
	}

	@Override
	public void nom() {
		System.out.println("pull rose en laine.");
		
	}

	@Override
	public void image() {
		// TODO Auto-generated method stub
		
	}

}
