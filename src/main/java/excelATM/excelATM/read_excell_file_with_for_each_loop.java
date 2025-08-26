package excelATM.excelATM;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class read_excell_file_with_for_each_loop {

	public static void main(String[] args) throws IOException {
	

		String locator = "data/siandien.xml";
		
		FileInputStream str = new FileInputStream(locator);
		
		Workbook w1 = new HSSFWorkbook(str);
		
		Sheet sh = w1.getSheet("s1");
		
		
		
		for(Row r: sh) {
			
			for(Cell c : r) {
				
				
				if(c.getCellType() != Cell.CELL_TYPE_STRING) {
					
				int value = (int)c.getNumericCellValue();
				
				System.out.println("\n"+value);
				
				}
				
				else {
				
				
				
				String value = c.getStringCellValue();
				
				System.out.println("\n"+value);
				
			
			
		}

		}
		
	}
	
}
	
}


