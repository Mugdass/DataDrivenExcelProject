package excelATM.excelATM;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class read_excell_file_with_for_loop {
		


		public static void main(String[] args) throws IOException {
			

			String locator = "data/anotherExcellExample.xml";
			
			FileInputStream str = new FileInputStream(locator);
			
			Workbook w1 = new HSSFWorkbook(str);
			
			Sheet sh = w1.getSheet("Monday");
			
			
			
			
			
			int totalRows = sh.getPhysicalNumberOfRows();
			
			System.out.println("\n The total numbers of rows:	" + totalRows);
			
			
					
			int totalColumns = sh.getRow(0).getPhysicalNumberOfCells();
			
			System.out.println("\n and the total number of collumns:	" + totalColumns);
		
					
					
			
			
			
			for(int rows1 = 0; totalRows > rows1; rows1 = rows1 + 1) {
				
				for(int collumns1 = 0; collumns1 < totalColumns; collumns1 = collumns1 + 1) {
					
					Cell ce = sh.getRow(rows1).getCell(collumns1);
					
					
					
				
				
				
					
					 if(ce.getCellType() == Cell.CELL_TYPE_STRING) {
					
					
					
					String value = ce.getStringCellValue();
					
					System.out.println("\n"+value);
					
				
				
			}
					
					
					 else {
						 
						 
						 if(ce.getNumericCellValue() %1 == 0) {
					 
						
						int value = (int)ce.getNumericCellValue();
						
						System.out.println("\n"+value);
						
						}
					
	else  {
						
						double value = ce.getNumericCellValue();
						
						System.out.println("\n"+value);
						
					}

			}
			
				}
				
			}
			
		}
		
}
		
	
		
	


