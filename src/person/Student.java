package person;

public class Student extends Person {
	String major;
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.println(String.format("전공은 %s니다.", major));
	}
}