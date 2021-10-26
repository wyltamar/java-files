package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream dataInput = new FileInputStream(
				"C:\\Users\\wylta\\git\\repository2\\files\\src\\files\\file.txt");
		
		Scanner row = new Scanner(dataInput, "UTF-8");
		
		while(row.hasNext()) {
			
			String readLine = row.nextLine();
			
			if(readLine != null && !readLine.isEmpty())
			
			System.out.println(readLine);
		}
	}

}
