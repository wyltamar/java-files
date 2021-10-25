package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
	
	public static void main(String[] args) throws IOException {
		
		// Creating an instance of File and passing pathname parameter
		File file = new File("C:\\Users\\wylta\\git\\repository2\\files\\src\\files\\file.txt");
		
		//if the file doesn't exists, create a new file
		if(!file.exists()) {
			file.createNewFile();
		}
		
		// Creating an instance of FileWriter to write on the file
		FileWriter fileWriter = new FileWriter(file);
		
		
		for(int i = 1; i <= 20; i++) {
			
			fileWriter.write("My text of row "+i+" \n"); //to write in the file 
		}
		
		fileWriter.flush(); // persists the file 
		fileWriter.close(); // closed file
		
			
	}
}
	


