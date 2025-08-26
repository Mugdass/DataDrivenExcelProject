package excelATM.excelATM;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class lol2 {

	public static void main(String[] args) throws IOException {
		

		String p = "data/siandien.xml";
		
		FileOutputStream s = new FileOutputStream(p);
		
		Workbook ww = new HSSFWorkbook();
		
		Sheet Sh1 = ww.createSheet("s1");
		
		

		
		Row R1 = Sh1.createRow(1);
		
		Cell Cell22 = R1.createCell(0);
		
		Cell Cell00 = R1.createCell(2);
		
		
		Cell22.setCellValue("Total (Savings)");
		
		Cell00.setCellValue("Every Month (Savings)");
		
		
		Cell C66 = R1.createCell(6);
				
		C66.setCellValue("Time Period (months)");
		
		
		
		
		
		
		
		
		
Row R3 = Sh1.createRow(3);
		
		Cell C0 = R3.createCell(0);
		
		 int v1 = 200;
		 
		 int v2 = 50;
		 
		 
		 C0.setCellValue(v1);
		
		Cell C2 = R3.createCell(2);
		
		C2.setCellValue(v2);
		
		Cell C6 = R3.createCell(6);
		
		C6.setCellValue(" = " + v1 / v2);
		
		
		
		
		
		ww.write(s);
		
		
		
		
		
		ww.close();
		
		s.close();

	}

}
