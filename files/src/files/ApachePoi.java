package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File file = new File("C:\\Users\\wylta\\git\\repository2\\files\\src\\files\\file_excel.xls");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		Person person1 = new Person();
		person1.setName("Wyltamar Douglas de Sousa Oliveira");
		person1.setEmail("wyltamar@hotmail.com");
		person1.setAge(38);
		
		Person person2 = new Person();
		person2.setName("Amanda Goncalves de Almeida");
		person2.setEmail("amaga.jerico@hotmail.com");
		person2.setAge(34);
		
		Person person3 = new Person();
		person3.setName("Pedro Lucas Almeida de Oliveira");
		person3.setEmail("pedro123@gmail.com");
		person3.setAge(11);
		
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		
		
		HSSFWorkbook hsssfworkbook = new HSSFWorkbook(); // will be used to write the spreadsheet
		HSSFSheet personLines = hsssfworkbook.createSheet("Persons spreadsheet JDev Treiners"); //create the spreadsheet
		
		int numberLine = 0;
		
		for(Person person : persons) {
			
			Row line = personLines.createRow(numberLine ++); //created the line in the spreadsheet
			
			int numberCell = 0;
			
			Cell cellName = line.createCell(numberCell ++); // cell 1
			cellName.setCellValue(person.getName());
			
			Cell cellEmail = line.createCell(numberCell ++); //cell 2
			cellEmail.setCellValue(person.getEmail());
			
			Cell cellAge = line.createCell(numberCell); //cell 3
			cellAge.setCellValue(person.getAge());
		
		} /*Finishing install the spreadsheet*/
		
		FileOutputStream output = new FileOutputStream(file);
		hsssfworkbook.write(output); //Write the spreadsheet in file
		output.flush();
		output.close();
		
		System.out.println("Spreadsheet created!");
	}
}
