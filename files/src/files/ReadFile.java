package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		List<Person> persons = new ArrayList<Person>();

		FileInputStream dataInput = new FileInputStream(
				"C:\\Users\\wylta\\git\\repository2\\files\\src\\files\\file.txt");
		
		Scanner row = new Scanner(dataInput, "UTF-8");
		
		while(row.hasNext()) {
			
			String readLine = row.nextLine();
			
			if(readLine != null && !readLine.isEmpty()) {
				
				String[] data = readLine.split("\\;");
				
				Person person = new Person();
				person.setName(data[0]);
				person.setEmail(data[1]);
				person.setAge(Integer.valueOf(data[2]));
				
				persons.add(person);
			}
				
		}
		
		for (Person person : persons) {
			System.out.println(person);
		}
	}

}
