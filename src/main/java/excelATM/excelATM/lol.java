package excelATM.excelATM;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class lol {

	public static void main(String[] args) throws IOException {
		

		String lol1 = "data/anotherExcellExample.xml";
		
		FileOutputStream os = new FileOutputStream(lol1);
		
		Workbook w1 = new HSSFWorkbook();
		
		Sheet S1 = w1.createSheet("Monday");
		
		Row R0 = S1.createRow(0);
		
		Cell C1 = R0.createCell(0);
		
		Cell C2 = R0.createCell(2);
		
		Cell C3 = R0.createCell(4);
		
		Cell C4 = R0.createCell(6);
		
		Cell C5 = R0.createCell(8);
		
		
		C1.setCellValue(" 20 + 12");
		
		C2.setCellValue(" 20 - 12");
		
		C3.setCellValue(" 20 * 12");
		
		C4.setCellValue(" 20 / 12");
		
		C5.setCellValue(" 20 % 12");
		
		
		
		
		
		
		Row R2 = S1.createRow(2);
		
		
		
		
Cell C6 = R2.createCell(0);
		
		Cell C7 = R2.createCell(2);
		
		Cell C8 = R2.createCell(4);
		
		Cell C9 = R2.createCell(6);
		
		Cell C10 = R2.createCell(8);
		
		
		C6.setCellValue(" = " + (20 + 12));
		
		C7.setCellValue(" = " + (20 - 12));
		
		C8.setCellValue(" = " + (20 * 12));
		
		C9.setCellValue(" = " + (20 / 12));
		
		C10.setCellValue(" = " + (20 % 12));
		
		
		
		
		
		
		Sheet S3 = w1.createSheet("Tuesday");
		
		
		
		
		
		
		
		
	Row R01 = S3.createRow(0);
		
		Cell C11 = R01.createCell(0);
		
		Cell C21 = R01.createCell(2);
		
		Cell C31 = R01.createCell(4);
		
		Cell C41 = R01.createCell(6);
		
		Cell C51 = R01.createCell(8);
		
		Cell C61 = R01.createCell(10);
		
		
		int l = 20 + 12;
		
		int l1 = l - 12;
		
		int l2 = l1 * 12;
		
		int l3 = l2 / 12;
		
		int l4 = l3 % 12;
		
		
		C11.setCellValue(" 20 + 12");
		
		C21.setCellValue(" " + l + " - 12");
		
		C31.setCellValue((l1 + " * 12"));
		
		C41.setCellValue((l2 + "  / 12"));
		
		C51.setCellValue((l3 + " % 12"));
		
		C61.setCellValue((" = " + l4));
		
		
		
		
		Row R02 = S3.createRow(2);
		
Cell C011 = R02.createCell(0);
		
		Cell C021 = R02.createCell(2);
		
		Cell C031 = R02.createCell(4);
		
		Cell C041 = R02.createCell(6);
		
		Cell C051 = R02.createCell(8);
		
		
		
		
		
		
		
C011.setCellValue(" = " + l);
		
		C021.setCellValue(" = " + l1);
		
		C031.setCellValue((" = " + l2));
		
		C041.setCellValue((" = " + l3));
		
		C051.setCellValue((" = " + l4));
		
		
		
		
		
		
		w1.write(os);
		
		
		
		
		os.close();
		
		w1.close();
		
		

	}

}
