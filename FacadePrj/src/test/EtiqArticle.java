package test.mustapha;

public class EtiqArticle {
	
	private Article jupe;
	private Article pull;
	private Article jean;
	public EtiqArticle() {
		this.jupe = new Jupe();
		this.pull = new Pull();
		this.jean = new Jean();
	}
	public void etiqPull() {
		pull.num();
		pull.pTva();
		pull.nom();
	}
	public void etiqJupe() {
		jupe.num();
		jupe.pTva();
		jupe.nom();
	}
	public void etiqJean() {
		jean.num();
		jean.pTva();
		jean.nom();
	}
	

}
