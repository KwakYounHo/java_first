package person;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println(String.format("안녕하세요. 저는 '%s'입니다. 이름은 %d입니다.", name, age));
	}
}