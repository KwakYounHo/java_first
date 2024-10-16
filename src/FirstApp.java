// packages
import person.Student;
import animal.Dog;
import plant.Sunflower;

// modules
import java.util.List;
import java.util.ArrayList;

import java.util.Set;
import java.util.LinkedHashSet;

import java.util.Map;
import java.util.LinkedHashMap;

@FunctionalInterface
interface Printer<T> {
	void print(T t);
}

public class FirstApp {
	public static void main(String[] args) {
		Student me = new Student("Juno", 29, "developer");
		me.introduce();
		
		Dog pet = new Dog();
		pet.sound();
		pet.sleep();
		
		Sunflower my_plant = new Sunflower("체체");
		my_plant.sunbathe();
		
		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("항상 등장하는 코드");
		}
		
		System.out.println("------------------------");
		
		List<String> names = new ArrayList<>(); 
		
		names.add("Juno");
		names.add("PaPa");
		names.add("MaMa");
		
		System.out.println(names);
		System.out.println("MaMa가 있나요? : " + names.contains("MaMa"));
		
		names.remove("PaPa");
		System.out.println("PaPa 제거" + names);
		
		System.out.println("------------------------");
		
		Set<String> id = new LinkedHashSet<>();
		
		id.add("PaPa");
		id.add("PaPa");
		id.add("MaMa");
		
		System.out.println("PaPa 두 번 삽입 : " + id);
		System.out.println("PaPa 가 있나요? :" + id.contains("PaPa"));
		System.out.println("id의 사이즈 :" + id.size());
		
		id.remove("PaPa");
		System.out.println("PaPa 삭제");
		System.out.println(id);
		
		System.out.println("------------------------");
		
		Map<String, Integer> information = new LinkedHashMap<>();
		
		information.put("Juno", 29);
		information.put("Hyun", 32);
		
		System.out.println("information 조회 : " + information);
		System.out.println("Juno 조회 : " + information.get("Juno"));
		System.out.println("Hyun이 있나요? : " + information.containsKey("Hyun"));
		
		System.out.println("------------------------");
		
		Printer<Object> printer = message -> System.out.println(message);
		printer.print("프린터 함수형 인터페이스를 통해 출력되는 메시지 입니다!");
		printer.print(String.format("위에 맵과 프린터를 조합하여 Juno의 나이는? : %d", information.get("Juno")));
		printer.print("프린터의 매개변수를 Object로 하여 모든 타입의 데이터를 받을 수 있도록 했습니다! information 조회 : " + information);
	}
}