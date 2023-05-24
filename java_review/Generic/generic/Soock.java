package generic;

public class Soock extends Material{
	private String name;
	
	public void setSoock(String name) {
		this.name = name;
	}
	
	public Soock(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "떡안에 든 것은 " + this.name + "입니다.";
	}

	@Override
	public void taste() {
		System.out.println("쓴맛!");	
	}
}
