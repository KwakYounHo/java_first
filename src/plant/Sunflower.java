package plant;

public class Sunflower implements Plant {
	String name;
	public Sunflower(String name) {
		this.name = name;
	}
	
	@Override
	public void sunbathe() {
		System.out.println(String.format("%s 이(가) 광합성을 합니다.", name));
	}
}