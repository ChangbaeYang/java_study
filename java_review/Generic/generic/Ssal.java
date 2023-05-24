package generic;

public class Ssal extends Material{
	private String name;
	
	public void setSsal(String name) {
		this.name = name;
	}
	
	public Ssal(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "떡안에 든 것은 " + this.name + "입니다.";
	}

	@Override
	public void taste() {
		System.out.println("단맛!");
	}
}

