# 📊 DataDrivenExcelProject

Java + Apache POI + TestNG | Data-Driven Testing framework with Excel integration (read/write), Page Object style structure, and automated boundary/validation tests.  

---

## 📂 Project Structure  

```
DataDrivenExcelProject/
│── pom.xml                     # Maven build file
│── data/                       # Test data folder (Excel files)
│   ├── ListOfReg.xlsx
│── src/
│   ├── main/java/excelATM/     # Core framework & Excel utilities
│   │   ├── ExcelRead.java
│   │   ├── ExcelReadWithLoop.java
│   │   ├── ExcelWrite.java
│   │   ├── ExcelWriteExample.java
│   └── test/java/excelATM/     # Automated TestNG test scripts
│       ├── ExcelReadTest.java
│       ├── ExcelWriteTest.java
│       ├── ExcelBoundaryTest.java
│── .gitignore
│── README.md
```

---

## 🚀 Features  

- **Excel Read/Write** with Apache POI (`.xlsx`)  
- **Data-Driven Tests** using `TestNG`  
- **Positive, Negative, and Boundary tests**  
- Organized into **`src/main/java`** (framework) and **`src/test/java`** (automation tests)  
- Maven project → run tests with `mvn test`  

---

## 🧪 Example Test  

```java
@Test
public void testWriteAndReadBack() throws IOException {
    Workbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("TestSheet");
    Row row = sheet.createRow(0);
    Cell cell = row.createCell(0);
    cell.setCellValue("Hello Test!");

    FileOutputStream fos = new FileOutputStream("data/TestExcel.xlsx");
    workbook.write(fos);
    workbook.close();
    fos.close();

    FileInputStream fis = new FileInputStream("data/TestExcel.xlsx");
    Workbook readWorkbook = WorkbookFactory.create(fis);
    String readValue = readWorkbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
    readWorkbook.close();
    fis.close();

    Assert.assertEquals(readValue, "Hello Test!");
}
```

---

## ⚡ How to Run  

1. Clone repo  
   ```bash
   git clone https://github.com/YOUR_USERNAME/DataDrivenExcelProject.git
   cd DataDrivenExcelProject
   ```
2. Run tests with Maven  
   ```bash
   mvn test
   ```

--- 
