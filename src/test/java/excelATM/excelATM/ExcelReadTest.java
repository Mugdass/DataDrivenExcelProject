package excelATM.excelATM;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;

public class ExcelReadTest {

    @Test
    public void testReadExcelFirstCell() throws IOException {
        FileInputStream fis = new FileInputStream("data/ListOfReg.xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheetAt(0);

        // Read first cell value
        String firstCellValue = sheet.getRow(0).getCell(0).toString();
        Assert.assertNotNull(firstCellValue, "First cell should not be null");

        workbook.close();
        fis.close();
    }
}
