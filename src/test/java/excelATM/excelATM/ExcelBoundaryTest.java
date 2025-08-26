package excelATM.excelATM;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;

public class ExcelBoundaryTest {

    @Test
    public void testRowCount() throws IOException {
        FileInputStream fis = new FileInputStream("data/ListOfReg.xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getPhysicalNumberOfRows();
        Assert.assertTrue(rowCount > 0, "Excel file should contain at least one row");

        workbook.close();
        fis.close();
    }

    @Test
    public void testCellBoundary() throws IOException {
        FileInputStream fis = new FileInputStream("data/ListOfReg.xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheetAt(0);

        // Try to access a cell in first row safely
        Row row = sheet.getRow(0);
        Assert.assertNotNull(row, "First row must exist");
        Assert.assertNotNull(row.getCell(0), "First cell must exist");

        workbook.close();
        fis.close();
    }
}
