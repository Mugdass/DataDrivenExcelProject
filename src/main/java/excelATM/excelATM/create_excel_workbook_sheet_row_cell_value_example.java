package excelATM.excelATM;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class create_excel_workbook_sheet_row_cell_value_example {

	public static void main(String[] args) throws IOException {
		

		String locateXMLFile = "data/FirstExample.xml";
		
		FileOutputStream outPutStream1 = new FileOutputStream(locateXMLFile);
		
		Workbook workbook1 = new HSSFWorkbook();
		

		
		Sheet Sheet1 = workbook1.createSheet("Sheet #1");
		
		Row Row0 = Sheet1.createRow(0);
		
		Cell Cell0 = Row0.createCell(0);
		
		Cell0.setCellValue("2*2 = "+(2*2));
		
		//multiply
		
		
		Cell Cell9 = Row0.createCell(9);
		
		Cell9.setCellValue("2/2 = " +(2/2));
		
		//divide
		
		
		
		//add
		
		Cell Cell3 = Row0.createCell(3);
		
		Cell3.setCellValue("2 + 2 = "+(2+2));
		
		
		//minus
		
		Cell Cell6 = Row0.createCell(6);
		
		Cell6.setCellValue("2 - 2 = "+(2-2));
		
		
		
		
		
		
		
		Cell Cell11 = Row0.createCell(11);
		Cell11.setCellValue("2 % 2 = " + (2%2));
		
		
		//remainder
		
		
		workbook1.write(outPutStream1);
		
		
		
		
		
		outPutStream1.close();
		
		workbook1.close();
		
	}

}
