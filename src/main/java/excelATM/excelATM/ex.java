package excelATM.excelATM;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ex {

	public static void main(String[] args) throws IOException {
		

		String p = "data/ListOfReg.xlsx";
		
		FileOutputStream s = new FileOutputStream(p);
		
		Workbook ww = new HSSFWorkbook();
		
		Sheet Sh1 = ww.createSheet("s1");
		
		

		
		Row R1 = Sh1.createRow(0);
		
		Cell Cell22 = R1.createCell(0);
		
		Cell Cell00 = R1.createCell(1);
		
		
		Cell22.setCellValue("FirstName");
		
		Cell00.setCellValue("LastName");
		
		
		
		
Cell Cell223 = R1.createCell(2);
		
		Cell Cell002 = R1.createCell(3);
		
		
		Cell223.setCellValue("number");
		
		Cell002.setCellValue("password");
		
		
		
Cell Cell2233 = R1.createCell(4);
		
		Cell Cell0023 = R1.createCell(5);
		
		
		Cell2233.setCellValue("month");
		
		Cell0023.setCellValue("day");
		
		
		
		
Cell Cell00235 = R1.createCell(6);
		
		
Cell00235.setCellValue("year");
		

		
		
		
		
		
		
		
		
		

		
Row R2 = Sh1.createRow(1);
		
		Cell C0 = R2.createCell(0);
		
		C0.setCellValue("Joe");
		
		
Cell C2 = R2.createCell(1);
		
		C2.setCellValue("Biden");
		
		
		
		
Cell C2x = R2.createCell(2);
		
		C2x.setCellValue("9234323481");
		
		
Cell C2xx = R2.createCell(3);
		
		C2xx.setCellValue("csd@12");
		
		
		
Cell C2xxx = R2.createCell(4);
		
		C2xxx.setCellValue("Apr");
		
		
Cell C2xxxx = R2.createCell(5);
		
		C2xxxx.setCellValue("23");
		
		
Cell C2xxxxx = R2.createCell(6);
		
		C2xxxxx.setCellValue("2019");
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
Row R3 = Sh1.createRow(2);
		
		Cell C02 = R3.createCell(0);
		
		C02.setCellValue("Kamala");
		
		
Cell C21 = R3.createCell(1);
		
		C21.setCellValue("Harris");
		
		
		
		
Cell C21z = R3.createCell(2);
		
		C21z.setCellValue("9234029481");

		
Cell C21zz = R3.createCell(3);
		
		C21zz.setCellValue("@cadscs21");
		
		
		
Cell C21zzz = R3.createCell(4);
		
		C21zzz.setCellValue("Sep");
		
	
Cell C21zzzz = R3.createCell(5);
		
		C21zzzz.setCellValue("2");
		
		
		
Cell C21zzzzz = R3.createCell(6);
		
		C21zzzzz.setCellValue("1988");
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
Row R4 = Sh1.createRow(3);
		
		Cell C021 = R4.createCell(0);
		
		C021.setCellValue("Java");
		
		
Cell C211 = R4.createCell(1);
		
		C211.setCellValue("Selenium");
		
		
Cell C211a = R4.createCell(2);
		
		C211a.setCellValue("9234312315");
		
		
Cell C211aa = R4.createCell(3);
		
		C211aa.setCellValue("2313#ww1A");
		
	
Cell C211aaa = R4.createCell(4);
		
		C211aaa.setCellValue("Dec");
		
	
Cell C211aaaa = R4.createCell(5);
		
		C211aaaa.setCellValue("19");
		
		
Cell C211aaaaa = R4.createCell(6);
		
		C211aaaaa.setCellValue("1996");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ww.write(s);
		
		
		
		
		
		ww.close();
		
		s.close();

	}

}