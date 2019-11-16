package test.mustapha;

public class Player {
	
	private String name;
	private int num;	
	
	public Player(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	

	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
}
