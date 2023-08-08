package packageexam;

import java.util.HashMap;
import java.util.ArrayList;
public class day36exam {

	public static void main(String[] args) {
	// program 1	
HashMap <String, Integer> names = new HashMap<>();
 names.put("satya", 35);
 names.put("shiva", 35);
 names.put("madhu", 35);
 names.put("jagan", 35);
 System.out.println(names);
 for(int value: names.values()) {
	 System.out.println(value);
 }
for(String key: names.keySet()) {
	System.out.println(names);
}
// program 2
ArrayList<String> students = new ArrayList<>();

students.add("neelima");
students.add("kavitha");
students.add("nalini");
students.add("jaya");
students.add("santosh");
System.out.println(students);

for(String s: students) {
	System.out.println(s);
}

	}

}
