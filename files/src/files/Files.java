package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Files {
	
	public static void main(String[] args) throws IOException {
		
		Person person1 = new Person();
		person1.setName("Wyltamar Douglas");
		person1.setEmail("wyltamar@hotmail.com");
		person1.setAge(38);
		
		Person person2 = new Person();
		person2.setName("Amanda Goncalves");
		person2.setEmail("amaga.jerico@hotmail.com");
		person2.setAge(34);
		
		Person person3 = new Person();
		person3.setName("Pedro Lucas");
		person3.setEmail("pedro123@gmail.com");
		person3.setAge(11);
		
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		
		
		// Creating an instance of File and passing pathname parameter
		File file = new File("C:\\Users\\wylta\\git\\repository2\\files\\src\\files\\file.txt");
		
		//if the file doesn't exists, create a new file
		if(!file.exists()) {
			file.createNewFile();
		}
		
		// Creating an instance of FileWriter to write on the file
		FileWriter fileWriter = new FileWriter(file);
		
		
		for (Person person : persons) {
			fileWriter.write(person.getName() + ";" + person.getEmail() + ";" + person.getAge() + "\n");
		}
		
		fileWriter.flush(); // persists the file 
		fileWriter.close(); // closed file
		
			
	}
}
	


