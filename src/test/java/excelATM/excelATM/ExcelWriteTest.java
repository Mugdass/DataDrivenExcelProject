package excelATM.excelATM;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteTest {

    @Test
    public void testWriteAndReadBack() throws IOException {
        // Create Excel workbook and write value
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("TestSheet");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Hello Test!");

        FileOutputStream fos = new FileOutputStream("data/TestExcel.xlsx");
        workbook.write(fos);
        workbook.close();
        fos.close();

        // Read it back
        FileInputStream fis = new FileInputStream("data/TestExcel.xlsx");
        Workbook readWorkbook = WorkbookFactory.create(fis);
        String readValue = readWorkbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();

        readWorkbook.close();
        fis.close();

        Assert.assertEquals(readValue, "Hello Test!");
    }
}
