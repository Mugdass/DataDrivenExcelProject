package excelATM.excelATM;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class another_excel_example_TimesTable {

	public static void main(String[] args) throws IOException {
		
String file = "data/TimesTable.xml";

FileOutputStream stream1 = new FileOutputStream(file);

Workbook workingbook = new HSSFWorkbook();


Sheet MainSheet = workingbook.createSheet("Times Table");

Row ZeroRow = MainSheet.createRow(0);

Cell xCell = ZeroRow.createCell(0);
Cell Cell1 = ZeroRow.createCell(1);
Cell Cell2 = ZeroRow.createCell(2);
Cell Cell3 = ZeroRow.createCell(3);
Cell Cell4 = ZeroRow.createCell(4);
Cell Cell5 = ZeroRow.createCell(5);
Cell Cell6 = ZeroRow.createCell(6);
Cell Cell7 = ZeroRow.createCell(7);
Cell Cell8 = ZeroRow.createCell(8);
Cell Cell9 = ZeroRow.createCell(9);
Cell Cell10 = ZeroRow.createCell(10);
Cell Cell11 = ZeroRow.createCell(11);
Cell Cell12 = ZeroRow.createCell(12);


xCell.setCellValue("       X ");
Cell1.setCellValue("       "+1+" ");
Cell2.setCellValue("       "+2+" ");
Cell3.setCellValue("       "+3+" ");
Cell4.setCellValue("       "+4+" ");
Cell5.setCellValue("       "+5+" ");
Cell6.setCellValue("       "+6+" ");
Cell7.setCellValue("       "+7+" ");
Cell8.setCellValue("       "+8+" ");
Cell9.setCellValue("       "+9+" ");
Cell10.setCellValue("       "+10+" ");
Cell11.setCellValue("       "+11+" ");
Cell12.setCellValue("       "+12+" ");






Row Row1 = MainSheet.createRow(1);
Cell Cell0 = Row1.createCell(0);
Cell0.setCellValue("       "+1+" ");
Cell acell1 = Row1.createCell(1);
acell1.setCellValue("       "+(1*1)+" ");
Cell acell2 = Row1.createCell(2);
acell2.setCellValue("       "+(1*2)+" ");
Cell acell3 = Row1.createCell(3);
acell3.setCellValue("       "+(1*3)+" ");
Cell acell4 = Row1.createCell(4);
acell4.setCellValue("       "+(1*4)+" ");
Cell acell5 = Row1.createCell(5);
acell5.setCellValue("       "+(1*5)+" ");
Cell acell6 = Row1.createCell(6);
acell6.setCellValue("       "+(1*6)+" ");
Cell acell7 = Row1.createCell(7);
acell7.setCellValue("       "+(1*7)+" ");
Cell acell8 = Row1.createCell(8);
acell8.setCellValue("       "+(1*8)+" ");
Cell acell9 = Row1.createCell(9);
acell9.setCellValue("       "+(1*9)+" ");
Cell acell10 = Row1.createCell(10);
acell10.setCellValue("       "+(1*10)+" ");
Cell acell11 = Row1.createCell(11);
acell11.setCellValue("       "+(1*11)+" ");
Cell acell12 = Row1.createCell(12);
acell12.setCellValue("       "+(1*12)+" ");








Row Row2 = MainSheet.createRow(2);
Cell Cell01 = Row2.createCell(0);
Cell01.setCellValue("       "+2+" ");

Cell bcell1 = Row2.createCell(1);
bcell1.setCellValue("       "+(2*1)+" ");
Cell bcell2 = Row2.createCell(2);
bcell2.setCellValue("       "+(2*2)+" ");
Cell bcell3 = Row2.createCell(3);
bcell3.setCellValue("       "+(2*3)+" ");
Cell bcell4 = Row2.createCell(4);
bcell4.setCellValue("       "+(2*4)+" ");
Cell bcell5 = Row2.createCell(5);
bcell5.setCellValue("       "+(2*5)+" ");
Cell bcell6 = Row2.createCell(6);
bcell6.setCellValue("       "+(2*6)+" ");
Cell bcell7 = Row2.createCell(7);
bcell7.setCellValue("       "+(2*7)+" ");
Cell bcell8 = Row2.createCell(8);
bcell8.setCellValue("       "+(2*8)+" ");
Cell bcell9 = Row2.createCell(9);
bcell9.setCellValue("       "+(2*9)+" ");
Cell bcell10 = Row2.createCell(10);
bcell10.setCellValue("       "+(2*10)+" ");
Cell bcell11 = Row2.createCell(11);
bcell11.setCellValue("       "+(2*11)+" ");
Cell bcell12 = Row2.createCell(12);
bcell12.setCellValue("       "+(2*12)+" ");







Row Row3 = MainSheet.createRow(3);
Cell Cell03 = Row3.createCell(0);
Cell03.setCellValue("       "+3+" ");

Cell ccell1 = Row3.createCell(1);
ccell1.setCellValue("       "+(3*1)+" ");
Cell ccell2 = Row3.createCell(2);
ccell2.setCellValue("       "+(3*2)+" ");
Cell ccell3 = Row3.createCell(3);
ccell3.setCellValue("       "+(3*3)+" ");
Cell ccell4 = Row3.createCell(4);
ccell4.setCellValue("       "+(3*4)+" ");
Cell ccell5 = Row3.createCell(5);
ccell5.setCellValue("       "+(3*5)+" ");
Cell ccell6 = Row3.createCell(6);
ccell6.setCellValue("       "+(3*6)+" ");
Cell ccell7 = Row3.createCell(7);
ccell7.setCellValue("       "+(3*7)+" ");
Cell ccell8 = Row3.createCell(8);
ccell8.setCellValue("       "+(3*8)+" ");
Cell ccell9 = Row3.createCell(9);
ccell9.setCellValue("       "+(3*9)+" ");
Cell ccell10 = Row3.createCell(10);
ccell10.setCellValue("       "+(3*10)+" ");
Cell ccell11 = Row3.createCell(11);
ccell11.setCellValue("       "+(3*11)+" ");
Cell ccell12 = Row3.createCell(12);
ccell12.setCellValue("       "+(3*12)+" ");







Row Row4 = MainSheet.createRow(4);
Cell Cell04 = Row4.createCell(0);
Cell04.setCellValue("       "+4+" ");

Cell dcell1 = Row4.createCell(1);
dcell1.setCellValue("       "+(4*1)+" ");
Cell dcell2 = Row4.createCell(2);
dcell2.setCellValue("       "+(4*2)+" ");
Cell dcell3 = Row4.createCell(3);
dcell3.setCellValue("       "+(4*3)+" ");
Cell dcell4 = Row4.createCell(4);
dcell4.setCellValue("       "+(4*4)+" ");
Cell dcell5 = Row4.createCell(5);
dcell5.setCellValue("       "+(4*5)+" ");
Cell dcell6 = Row4.createCell(6);
dcell6.setCellValue("       "+(4*6)+" ");
Cell dcell7 = Row4.createCell(7);
dcell7.setCellValue("       "+(4*7)+" ");
Cell dcell8 = Row4.createCell(8);
dcell8.setCellValue("       "+(4*8)+" ");
Cell dcell9 = Row4.createCell(9);
dcell9.setCellValue("       "+(4*9)+" ");
Cell dcell10 = Row4.createCell(10);
dcell10.setCellValue("       "+(4*10)+" ");
Cell dcell11 = Row4.createCell(11);
dcell11.setCellValue("       "+(4*11)+" ");
Cell dcell12 = Row4.createCell(12);
dcell12.setCellValue("       "+(4*12)+" ");







Row Row5 = MainSheet.createRow(5);
Cell Cell05 = Row5.createCell(0);
Cell05.setCellValue("       "+5+" ");

Cell ecell1 = Row5.createCell(1);
ecell1.setCellValue("       "+(5*1)+" ");
Cell ecell2 = Row5.createCell(2);
ecell2.setCellValue("       "+(5*2)+" ");
Cell ecell3 = Row5.createCell(3);
ecell3.setCellValue("       "+(5*3)+" ");
Cell ecell4 = Row5.createCell(4);
ecell4.setCellValue("       "+(5*4)+" ");
Cell ecell5 = Row5.createCell(5);
ecell5.setCellValue("       "+(5*5)+" ");
Cell ecell6 = Row5.createCell(6);
ecell6.setCellValue("       "+(5*6)+" ");
Cell ecell7 = Row5.createCell(7);
ecell7.setCellValue("       "+(5*7)+" ");
Cell ecell8 = Row5.createCell(8);
ecell8.setCellValue("       "+(5*8)+" ");
Cell ecell9 = Row5.createCell(9);
ecell9.setCellValue("       "+(5*9)+" ");
Cell ecell10 = Row5.createCell(10);
ecell10.setCellValue("       "+(5*10)+" ");
Cell ecell11 = Row5.createCell(11);
ecell11.setCellValue("       "+(5*11)+" ");
Cell ecell12 = Row5.createCell(12);
ecell12.setCellValue("       "+(5*12)+" ");







Row Row6 = MainSheet.createRow(6);
Cell Cell06 = Row6.createCell(0);
Cell06.setCellValue("       "+6+" ");

Cell fcell1 = Row6.createCell(1);
fcell1.setCellValue("       "+(6*1)+" ");
Cell fcell2 = Row6.createCell(2);
fcell2.setCellValue("       "+(6*2)+" ");
Cell fcell3 = Row6.createCell(3);
fcell3.setCellValue("       "+(6*3)+" ");
Cell fcell4 = Row6.createCell(4);
fcell4.setCellValue("       "+(6*4)+" ");
Cell fcell5 = Row6.createCell(5);
fcell5.setCellValue("       "+(6*5)+" ");
Cell fcell6 = Row6.createCell(6);
fcell6.setCellValue("       "+(6*6)+" ");
Cell fcell7 = Row6.createCell(7);
fcell7.setCellValue("       "+(6*7)+" ");
Cell fcell8 = Row6.createCell(8);
fcell8.setCellValue("       "+(6*8)+" ");
Cell fcell9 = Row6.createCell(9);
fcell9.setCellValue("       "+(6*9)+" ");
Cell fcell10 = Row6.createCell(10);
fcell10.setCellValue("       "+(6*10)+" ");
Cell fcell11 = Row6.createCell(11);
fcell11.setCellValue("       "+(6*11)+" ");
Cell fcell12 = Row6.createCell(12);
fcell12.setCellValue("       "+(6*12)+" ");







Row Row7 = MainSheet.createRow(7);
Cell Cell07 = Row7.createCell(0);
Cell07.setCellValue("       "+7+" ");

Cell gcell1 = Row7.createCell(1);
gcell1.setCellValue("       "+(7*1)+" ");
Cell gcell2 = Row7.createCell(2);
gcell2.setCellValue("       "+(7*2)+" ");
Cell gcell3 = Row7.createCell(3);
gcell3.setCellValue("       "+(7*3)+" ");
Cell gcell4 = Row7.createCell(4);
gcell4.setCellValue("       "+(7*4)+" ");
Cell gcell5 = Row7.createCell(5);
gcell5.setCellValue("       "+(7*5)+" ");
Cell gcell6 = Row7.createCell(6);
gcell6.setCellValue("       "+(7*6)+" ");
Cell gcell7 = Row7.createCell(7);
gcell7.setCellValue("       "+(7*7)+" ");
Cell gcell8 = Row7.createCell(8);
gcell8.setCellValue("       "+(7*8)+" ");
Cell gcell9 = Row7.createCell(9);
gcell9.setCellValue("       "+(7*9)+" ");
Cell gcell10 = Row7.createCell(10);
gcell10.setCellValue("       "+(7*10)+" ");
Cell gcell11 = Row7.createCell(11);
gcell11.setCellValue("       "+(7*11)+" ");
Cell gcell12 = Row7.createCell(12);
gcell12.setCellValue("       "+(7*12)+" ");








Row Row8 = MainSheet.createRow(8);
Cell Cell08 = Row8.createCell(0);
Cell08.setCellValue("       "+8+" ");

Cell hcell1 = Row8.createCell(1);
hcell1.setCellValue("       "+(8*1)+" ");
Cell hcell2 = Row8.createCell(2);
hcell2.setCellValue("       "+(8*2)+" ");
Cell hcell3 = Row8.createCell(3);
hcell3.setCellValue("       "+(8*3)+" ");
Cell hcell4 = Row8.createCell(4);
hcell4.setCellValue("       "+(8*4)+" ");
Cell hcell5 = Row8.createCell(5);
hcell5.setCellValue("       "+(8*5)+" ");
Cell hcell6 = Row8.createCell(6);
hcell6.setCellValue("       "+(8*6)+" ");
Cell hcell7 = Row8.createCell(7);
hcell7.setCellValue("       "+(8*7)+" ");
Cell hcell8 = Row8.createCell(8);
hcell8.setCellValue("       "+(8*8)+" ");
Cell hcell9 = Row8.createCell(9);
hcell9.setCellValue("       "+(8*9)+" ");
Cell hcell10 = Row8.createCell(10);
hcell10.setCellValue("       "+(8*10)+" ");
Cell hcell11 = Row8.createCell(11);
hcell11.setCellValue("       "+(8*11)+" ");
Cell hcell12 = Row8.createCell(12);
hcell12.setCellValue("       "+(8*12)+" ");







Row Row9 = MainSheet.createRow(9);
Cell Cell09 = Row9.createCell(0);
Cell09.setCellValue("       "+9+" ");

Cell icell1 = Row9.createCell(1);
icell1.setCellValue("       "+(9*1)+" ");
Cell icell2 = Row9.createCell(2);
icell2.setCellValue("       "+(9*2)+" ");
Cell icell3 = Row9.createCell(3);
icell3.setCellValue("       "+(9*3)+" ");
Cell icell4 = Row9.createCell(4);
icell4.setCellValue("       "+(9*4)+" ");
Cell icell5 = Row9.createCell(5);
icell5.setCellValue("       "+(9*5)+" ");
Cell icell6 = Row9.createCell(6);
icell6.setCellValue("       "+(9*6)+" ");
Cell icell7 = Row9.createCell(7);
icell7.setCellValue("       "+(9*7)+" ");
Cell icell8 = Row9.createCell(8);
icell8.setCellValue("       "+(9*8)+" ");
Cell icell9 = Row9.createCell(9);
icell9.setCellValue("       "+(9*9)+" ");
Cell icell10 = Row9.createCell(10);
icell10.setCellValue("       "+(9*10)+" ");
Cell icell11 = Row9.createCell(11);
icell11.setCellValue("       "+(9*11)+" ");
Cell icell12 = Row9.createCell(12);
icell12.setCellValue("       "+(9*12)+" ");







Row Row10 = MainSheet.createRow(10);
Cell Cell010 = Row10.createCell(0);
Cell010.setCellValue("       "+10+" ");

Cell jcell1 = Row10.createCell(1);
jcell1.setCellValue("       "+(10*1)+" ");
Cell jcell2 = Row10.createCell(2);
jcell2.setCellValue("       "+(10*2)+" ");
Cell jcell3 = Row10.createCell(3);
jcell3.setCellValue("       "+(10*3)+" ");
Cell jcell4 = Row10.createCell(4);
jcell4.setCellValue("       "+(10*4)+" ");
Cell jcell5 = Row10.createCell(5);
jcell5.setCellValue("       "+(10*5)+" ");
Cell jcell6 = Row10.createCell(6);
jcell6.setCellValue("       "+(10*6)+" ");
Cell jcell7 = Row10.createCell(7);
jcell7.setCellValue("       "+(10*7)+" ");
Cell jcell8 = Row10.createCell(8);
jcell8.setCellValue("       "+(10*8)+" ");
Cell jcell9 = Row10.createCell(9);
jcell9.setCellValue("       "+(10*9)+" ");
Cell jcell10 = Row10.createCell(10);
jcell10.setCellValue("       "+(10*10)+" ");
Cell jcell11 = Row10.createCell(11);
jcell11.setCellValue("       "+(10*11)+" ");
Cell jcell12 = Row10.createCell(12);
jcell12.setCellValue("       "+(10*12)+" ");






Row Row11 = MainSheet.createRow(11);
Cell Cell011 = Row11.createCell(0);
Cell011.setCellValue("       "+11+" ");

Cell kcell1 = Row11.createCell(1);
kcell1.setCellValue("       "+(11*1)+" ");
Cell kcell2 = Row11.createCell(2);
kcell2.setCellValue("       "+(11*2)+" ");
Cell kcell3 = Row11.createCell(3);
kcell3.setCellValue("       "+(11*3)+" ");
Cell kcell4 = Row11.createCell(4);
kcell4.setCellValue("       "+(11*4)+" ");
Cell kcell5 = Row11.createCell(5);
kcell5.setCellValue("       "+(11*5)+" ");
Cell kcell6 = Row11.createCell(6);
kcell6.setCellValue("       "+(11*6)+" ");
Cell kcell7 = Row11.createCell(7);
kcell7.setCellValue("       "+(11*7)+" ");
Cell kcell8 = Row11.createCell(8);
kcell8.setCellValue("       "+(11*8)+" ");
Cell kcell9 = Row11.createCell(9);
kcell9.setCellValue("       "+(11*9)+" ");
Cell kcell10 = Row11.createCell(10);
kcell10.setCellValue("       "+(11*10)+" ");
Cell kcell11 = Row11.createCell(11);
kcell11.setCellValue("       "+(11*11)+" ");
Cell kcell12 = Row11.createCell(12);
kcell12.setCellValue("       "+(11*12)+" ");








Row Row12 = MainSheet.createRow(12);
Cell Cell012 = Row12.createCell(0);
Cell012.setCellValue("       "+12+" ");

Cell lcell1 = Row12.createCell(1);
lcell1.setCellValue("       "+(12*1)+" ");
Cell lcell2 = Row12.createCell(2);
lcell2.setCellValue("       "+(12*2)+" ");
Cell lcell3 = Row12.createCell(3);
lcell3.setCellValue("       "+(12*3)+" ");
Cell lcell4 = Row12.createCell(4);
lcell4.setCellValue("       "+(12*4)+" ");
Cell lcell5 = Row12.createCell(5);
lcell5.setCellValue("       "+(12*5)+" ");
Cell lcell6 = Row12.createCell(6);
lcell6.setCellValue("       "+(12*6)+" ");
Cell lcell7 = Row12.createCell(7);
lcell7.setCellValue("       "+(12*7)+" ");
Cell lcell8 = Row12.createCell(8);
lcell8.setCellValue("       "+(12*8)+" ");
Cell lcell9 = Row12.createCell(9);
lcell9.setCellValue("       "+(12*9)+" ");
Cell lcell10 = Row12.createCell(10);
lcell10.setCellValue("       "+(12*10)+" ");
Cell lcell11 = Row12.createCell(11);
lcell11.setCellValue("       "+(12*11)+" ");
Cell lcell12 = Row12.createCell(12);
lcell12.setCellValue("       "+(12*12)+" ");





































Sheet SecondSheet = workingbook.createSheet("Division Table");

Row ZeroRow2 = SecondSheet.createRow(0);

Cell xCella = ZeroRow2.createCell(0);
Cell Cell1a = ZeroRow2.createCell(1);
Cell Cell2a = ZeroRow2.createCell(2);
Cell Cell3a = ZeroRow2.createCell(3);
Cell Cell4a = ZeroRow2.createCell(4);
Cell Cell5a = ZeroRow2.createCell(5);
Cell Cell6a = ZeroRow2.createCell(6);
Cell Cell7a = ZeroRow2.createCell(7);
Cell Cell8a = ZeroRow2.createCell(8);
Cell Cell9a = ZeroRow2.createCell(9);
Cell Cell10a = ZeroRow2.createCell(10);
Cell Cell11a = ZeroRow2.createCell(11);
Cell Cell12a = ZeroRow2.createCell(12);


xCella.setCellValue("       / ");
Cell1a.setCellValue("       "+1+" ");
Cell2a.setCellValue("       "+2+" ");
Cell3a.setCellValue("       "+3+" ");
Cell4a.setCellValue("       "+4+" ");
Cell5a.setCellValue("       "+5+" ");
Cell6a.setCellValue("       "+6+" ");
Cell7a.setCellValue("       "+7+" ");
Cell8a.setCellValue("       "+8+" ");
Cell9a.setCellValue("       "+9+" ");
Cell10a.setCellValue("       "+10+" ");
Cell11a.setCellValue("       "+11+" ");
Cell12a.setCellValue("       "+12+" ");






Row Row1a = SecondSheet.createRow(1);
Cell Cell0a = Row1a.createCell(0);
Cell0a.setCellValue("       "+1+" ");
Cell acell1a = Row1a.createCell(1);
acell1a.setCellValue("       "+(1/1)+" ");
Cell acell2a = Row1a.createCell(2);
acell2a.setCellValue("       "+(1/2)+" ");
Cell acell3a = Row1a.createCell(3);
acell3a.setCellValue("       "+(1/3)+" ");
Cell acell4a = Row1a.createCell(4);
acell4a.setCellValue("       "+(1/4)+" ");
Cell acell5a = Row1a.createCell(5);
acell5a.setCellValue("       "+(1/5)+" ");
Cell acell6a = Row1a.createCell(6);
acell6a.setCellValue("       "+(1/6)+" ");
Cell acell7a = Row1a.createCell(7);
acell7a.setCellValue("       "+(1/7)+" ");
Cell acell8a = Row1a.createCell(8);
acell8a.setCellValue("       "+(1/8)+" ");
Cell acell9a = Row1a.createCell(9);
acell9a.setCellValue("       "+(1/9)+" ");
Cell acell10a = Row1a.createCell(10);
acell10a.setCellValue("       "+(1/10)+" ");
Cell acell11a = Row1a.createCell(11);
acell11a.setCellValue("       "+(1/11)+" ");
Cell acell12a = Row1a.createCell(12);
acell12a.setCellValue("       "+(1/12)+" ");








Row Row2a = SecondSheet.createRow(2);
Cell Cell01a = Row2a.createCell(0);
Cell01a.setCellValue("       "+2+" ");

Cell bcell1a = Row2a.createCell(1);
bcell1a.setCellValue("       "+(2/1)+" ");
Cell bcell2a = Row2a.createCell(2);
bcell2a.setCellValue("       "+(2/2)+" ");
Cell bcell3a = Row2a.createCell(3);
bcell3a.setCellValue("       "+(2/3)+" ");
Cell bcell4a = Row2a.createCell(4);
bcell4a.setCellValue("       "+(2/4)+" ");
Cell bcell5a = Row2a.createCell(5);
bcell5a.setCellValue("       "+(2/5)+" ");
Cell bcell6a = Row2a.createCell(6);
bcell6a.setCellValue("       "+(2/6)+" ");
Cell bcell7a = Row2a.createCell(7);
bcell7a.setCellValue("       "+(2/7)+" ");
Cell bcell8a = Row2a.createCell(8);
bcell8a.setCellValue("       "+(2/8)+" ");
Cell bcell9a = Row2a.createCell(9);
bcell9a.setCellValue("       "+(2/9)+" ");
Cell bcell10a = Row2a.createCell(10);
bcell10a.setCellValue("       "+(2/10)+" ");
Cell bcell11a = Row2a.createCell(11);
bcell11a.setCellValue("       "+(2/11)+" ");
Cell bcell12a = Row2a.createCell(12);
bcell12a.setCellValue("       "+(2/12)+" ");







Row Row3a = SecondSheet.createRow(3);
Cell Cell03a = Row3a.createCell(0);
Cell03a.setCellValue("       "+3+" ");

Cell ccell1a = Row3a.createCell(1);
ccell1a.setCellValue("       "+(3/1)+" ");
Cell ccell2a = Row3a.createCell(2);
ccell2a.setCellValue("       "+(3/2)+" ");
Cell ccell3a = Row3a.createCell(3);
ccell3a.setCellValue("       "+(3/3)+" ");
Cell ccell4a = Row3a.createCell(4);
ccell4a.setCellValue("       "+(3/4)+" ");
Cell ccell5a = Row3a.createCell(5);
ccell5a.setCellValue("       "+(3/5)+" ");
Cell ccell6a = Row3a.createCell(6);
ccell6a.setCellValue("       "+(3/6)+" ");
Cell ccell7a = Row3a.createCell(7);
ccell7a.setCellValue("       "+(3/7)+" ");
Cell ccell8a = Row3a.createCell(8);
ccell8a.setCellValue("       "+(3/8)+" ");
Cell ccell9a = Row3a.createCell(9);
ccell9a.setCellValue("       "+(3/9)+" ");
Cell ccell10a = Row3a.createCell(10);
ccell10a.setCellValue("       "+(3/10)+" ");
Cell ccell11a = Row3a.createCell(11);
ccell11a.setCellValue("       "+(3/11)+" ");
Cell ccell12a = Row3a.createCell(12);
ccell12a.setCellValue("       "+(3/12)+" ");







Row Row4a = SecondSheet.createRow(4);
Cell Cell04a = Row4a.createCell(0);
Cell04a.setCellValue("       "+4+" ");

Cell dcell1a = Row4a.createCell(1);
dcell1a.setCellValue("       "+(4/1)+" ");
Cell dcell2a = Row4a.createCell(2);
dcell2a.setCellValue("       "+(4/2)+" ");
Cell dcell3a = Row4a.createCell(3);
dcell3a.setCellValue("       "+(4/3)+" ");
Cell dcell4a = Row4a.createCell(4);
dcell4a.setCellValue("       "+(4/4)+" ");
Cell dcell5a = Row4a.createCell(5);
dcell5a.setCellValue("       "+(4/5)+" ");
Cell dcell6a = Row4a.createCell(6);
dcell6a.setCellValue("       "+(4/6)+" ");
Cell dcell7a = Row4a.createCell(7);
dcell7a.setCellValue("       "+(4/7)+" ");
Cell dcell8a = Row4a.createCell(8);
dcell8a.setCellValue("       "+(4/8)+" ");
Cell dcell9a = Row4a.createCell(9);
dcell9a.setCellValue("       "+(4/9)+" ");
Cell dcell10a = Row4a.createCell(10);
dcell10a.setCellValue("       "+(4/10)+" ");
Cell dcell11a = Row4a.createCell(11);
dcell11a.setCellValue("       "+(4/11)+" ");
Cell dcell12a = Row4a.createCell(12);
dcell12a.setCellValue("       "+(4/12)+" ");







Row Row5a = SecondSheet.createRow(5);
Cell Cell05a = Row5a.createCell(0);
Cell05a.setCellValue("       "+5+" ");

Cell ecell1a = Row5a.createCell(1);
ecell1a.setCellValue("       "+(5/1)+" ");
Cell ecell2a = Row5a.createCell(2);
ecell2a.setCellValue("       "+(5/2)+" ");
Cell ecell3a = Row5a.createCell(3);
ecell3a.setCellValue("       "+(5/3)+" ");
Cell ecell4a = Row5a.createCell(4);
ecell4a.setCellValue("       "+(5/4)+" ");
Cell ecell5a = Row5a.createCell(5);
ecell5a.setCellValue("       "+(5/5)+" ");
Cell ecell6a = Row5a.createCell(6);
ecell6a.setCellValue("       "+(5/6)+" ");
Cell ecell7a = Row5a.createCell(7);
ecell7a.setCellValue("       "+(5/7)+" ");
Cell ecell8a = Row5a.createCell(8);
ecell8a.setCellValue("       "+(5/8)+" ");
Cell ecell9a = Row5a.createCell(9);
ecell9a.setCellValue("       "+(5/9)+" ");
Cell ecell10a = Row5a.createCell(10);
ecell10a.setCellValue("       "+(5/10)+" ");
Cell ecell11a = Row5a.createCell(11);
ecell11a.setCellValue("       "+(5/11)+" ");
Cell ecell12a = Row5a.createCell(12);
ecell12a.setCellValue("       "+(5/12)+" ");







Row Row6a = SecondSheet.createRow(6);
Cell Cell06a = Row6a.createCell(0);
Cell06a.setCellValue("       "+6+" ");

Cell fcell1a = Row6a.createCell(1);
fcell1a.setCellValue("       "+(6/1)+" ");
Cell fcell2a = Row6a.createCell(2);
fcell2a.setCellValue("       "+(6/2)+" ");
Cell fcell3a = Row6a.createCell(3);
fcell3a.setCellValue("       "+(6/3)+" ");
Cell fcell4a = Row6a.createCell(4);
fcell4a.setCellValue("       "+(6/4)+" ");
Cell fcell5a = Row6a.createCell(5);
fcell5a.setCellValue("       "+(6/5)+" ");
Cell fcell6a = Row6a.createCell(6);
fcell6a.setCellValue("       "+(6/6)+" ");
Cell fcell7a = Row6a.createCell(7);
fcell7a.setCellValue("       "+(6/7)+" ");
Cell fcell8a = Row6a.createCell(8);
fcell8a.setCellValue("       "+(6/8)+" ");
Cell fcell9a = Row6a.createCell(9);
fcell9a.setCellValue("       "+(6/9)+" ");
Cell fcell10a = Row6a.createCell(10);
fcell10a.setCellValue("       "+(6/10)+" ");
Cell fcell11a = Row6a.createCell(11);
fcell11a.setCellValue("       "+(6/11)+" ");
Cell fcell12a = Row6a.createCell(12);
fcell12a.setCellValue("       "+(6/12)+" ");







Row Row7a = SecondSheet.createRow(7);
Cell Cell07a = Row7a.createCell(0);
Cell07a.setCellValue("       "+7+" ");

Cell gcell1a = Row7a.createCell(1);
gcell1a.setCellValue("       "+(7/1)+" ");
Cell gcell2a = Row7a.createCell(2);
gcell2a.setCellValue("       "+(7/2)+" ");
Cell gcell3a = Row7a.createCell(3);
gcell3a.setCellValue("       "+(7/3)+" ");
Cell gcell4a = Row7a.createCell(4);
gcell4a.setCellValue("       "+(7/4)+" ");
Cell gcell5a = Row7a.createCell(5);
gcell5a.setCellValue("       "+(7/5)+" ");
Cell gcell6a = Row7a.createCell(6);
gcell6a.setCellValue("       "+(7/6)+" ");
Cell gcell7a = Row7a.createCell(7);
gcell7a.setCellValue("       "+(7/7)+" ");
Cell gcell8a = Row7a.createCell(8);
gcell8a.setCellValue("       "+(7/8)+" ");
Cell gcell9a = Row7a.createCell(9);
gcell9a.setCellValue("       "+(7/9)+" ");
Cell gcell10a = Row7a.createCell(10);
gcell10a.setCellValue("       "+(7/10)+" ");
Cell gcell11a = Row7a.createCell(11);
gcell11a.setCellValue("       "+(7/11)+" ");
Cell gcell12a = Row7a.createCell(12);
gcell12a.setCellValue("       "+(7/12)+" ");








Row Row8a = SecondSheet.createRow(8);
Cell Cell08a = Row8a.createCell(0);
Cell08a.setCellValue("       "+8+" ");

Cell hcell1a = Row8a.createCell(1);
hcell1a.setCellValue("       "+(8/1)+" ");
Cell hcell2a = Row8a.createCell(2);
hcell2a.setCellValue("       "+(8/2)+" ");
Cell hcell3a = Row8a.createCell(3);
hcell3a.setCellValue("       "+(8/3)+" ");
Cell hcell4a = Row8a.createCell(4);
hcell4a.setCellValue("       "+(8/4)+" ");
Cell hcell5a = Row8a.createCell(5);
hcell5a.setCellValue("       "+(8/5)+" ");
Cell hcell6a = Row8a.createCell(6);
hcell6a.setCellValue("       "+(8/6)+" ");
Cell hcell7a = Row8a.createCell(7);
hcell7a.setCellValue("       "+(8/7)+" ");
Cell hcell8a = Row8a.createCell(8);
hcell8a.setCellValue("       "+(8/8)+" ");
Cell hcell9a = Row8a.createCell(9);
hcell9a.setCellValue("       "+(8/9)+" ");
Cell hcell10a = Row8a.createCell(10);
hcell10a.setCellValue("       "+(8/10)+" ");
Cell hcell11a = Row8a.createCell(11);
hcell11a.setCellValue("       "+(8/11)+" ");
Cell hcell12a = Row8a.createCell(12);
hcell12a.setCellValue("       "+(8/12)+" ");







Row Row9a = SecondSheet.createRow(9);
Cell Cell09a = Row9a.createCell(0);
Cell09a.setCellValue("       "+9+" ");

Cell icell1a = Row9a.createCell(1);
icell1a.setCellValue("       "+(9/1)+" ");
Cell icell2a = Row9a.createCell(2);
icell2a.setCellValue("       "+(9/2)+" ");
Cell icell3a = Row9a.createCell(3);
icell3a.setCellValue("       "+(9/3)+" ");
Cell icell4a = Row9a.createCell(4);
icell4a.setCellValue("       "+(9/4)+" ");
Cell icell5a = Row9a.createCell(5);
icell5a.setCellValue("       "+(9/5)+" ");
Cell icell6a = Row9a.createCell(6);
icell6a.setCellValue("       "+(9/6)+" ");
Cell icell7a = Row9a.createCell(7);
icell7a.setCellValue("       "+(9/7)+" ");
Cell icell8a = Row9a.createCell(8);
icell8a.setCellValue("       "+(9/8)+" ");
Cell icell9a = Row9a.createCell(9);
icell9a.setCellValue("       "+(9/9)+" ");
Cell icell10a = Row9a.createCell(10);
icell10a.setCellValue("       "+(9/10)+" ");
Cell icell11a = Row9a.createCell(11);
icell11a.setCellValue("       "+(9/11)+" ");
Cell icell12a = Row9a.createCell(12);
icell12a.setCellValue("       "+(9/12)+" ");







Row Row10a = SecondSheet.createRow(10);
Cell Cell010a = Row10a.createCell(0);
Cell010a.setCellValue("       "+10+" ");

Cell jcell1a = Row10a.createCell(1);
jcell1a.setCellValue("       "+(10/1)+" ");
Cell jcell2a = Row10a.createCell(2);
jcell2a.setCellValue("       "+(10/2)+" ");
Cell jcell3a = Row10a.createCell(3);
jcell3a.setCellValue("       "+(10/3)+" ");
Cell jcell4a = Row10a.createCell(4);
jcell4a.setCellValue("       "+(10/4)+" ");
Cell jcell5a = Row10a.createCell(5);
jcell5a.setCellValue("       "+(10/5)+" ");
Cell jcell6a = Row10a.createCell(6);
jcell6a.setCellValue("       "+(10/6)+" ");
Cell jcell7a = Row10a.createCell(7);
jcell7a.setCellValue("       "+(10/7)+" ");
Cell jcell8a = Row10a.createCell(8);
jcell8a.setCellValue("       "+(10/8)+" ");
Cell jcell9a = Row10a.createCell(9);
jcell9a.setCellValue("       "+(10/9)+" ");
Cell jcell10a = Row10a.createCell(10);
jcell10a.setCellValue("       "+(10/10)+" ");
Cell jcell11a = Row10a.createCell(11);
jcell11a.setCellValue("       "+(10/11)+" ");
Cell jcell12a = Row10a.createCell(12);
jcell12a.setCellValue("       "+(10/12)+" ");






Row Row11a = SecondSheet.createRow(11);
Cell Cell011a = Row11a.createCell(0);
Cell011a.setCellValue("       "+11+" ");

Cell kcell1a = Row11a.createCell(1);
kcell1a.setCellValue("       "+(11/1)+" ");
Cell kcell2a = Row11a.createCell(2);
kcell2a.setCellValue("       "+(11/2)+" ");
Cell kcell3a = Row11a.createCell(3);
kcell3a.setCellValue("       "+(11/3)+" ");
Cell kcell4a = Row11a.createCell(4);
kcell4a.setCellValue("       "+(11/4)+" ");
Cell kcell5a = Row11a.createCell(5);
kcell5a.setCellValue("       "+(11/5)+" ");
Cell kcell6a = Row11a.createCell(6);
kcell6a.setCellValue("       "+(11/6)+" ");
Cell kcell7a = Row11a.createCell(7);
kcell7a.setCellValue("       "+(11/7)+" ");
Cell kcell8a = Row11a.createCell(8);
kcell8a.setCellValue("       "+(11/8)+" ");
Cell kcell9a = Row11a.createCell(9);
kcell9a.setCellValue("       "+(11/9)+" ");
Cell kcell10a = Row11a.createCell(10);
kcell10a.setCellValue("       "+(11/10)+" ");
Cell kcell11a = Row11a.createCell(11);
kcell11a.setCellValue("       "+(11/11)+" ");
Cell kcell12a = Row11a.createCell(12);
kcell12a.setCellValue("       "+(11/12)+" ");








Row Row12a = SecondSheet.createRow(12);
Cell Cell012a = Row12a.createCell(0);
Cell012a.setCellValue("       "+12+" ");

Cell lcell1a = Row12a.createCell(1);
lcell1a.setCellValue("       "+(12/1)+" ");
Cell lcell2a = Row12a.createCell(2);
lcell2a.setCellValue("       "+(12/2)+" ");
Cell lcell3a = Row12a.createCell(3);
lcell3a.setCellValue("       "+(12/3)+" ");
Cell lcell4a = Row12a.createCell(4);
lcell4a.setCellValue("       "+(12/4)+" ");
Cell lcell5a = Row12a.createCell(5);
lcell5a.setCellValue("       "+(12/5)+" ");
Cell lcell6a = Row12a.createCell(6);
lcell6a.setCellValue("       "+(12/6)+" ");
Cell lcell7a = Row12a.createCell(7);
lcell7a.setCellValue("       "+(12/7)+" ");
Cell lcell8a = Row12a.createCell(8);
lcell8a.setCellValue("       "+(12/8)+" ");
Cell lcell9a = Row12a.createCell(9);
lcell9a.setCellValue("       "+(12/9)+" ");
Cell lcell10a = Row12a.createCell(10);
lcell10a.setCellValue("       "+(12/10)+" ");
Cell lcell11a = Row12a.createCell(11);
lcell11a.setCellValue("       "+(12/11)+" ");
Cell lcell12a = Row12a.createCell(12);
lcell12a.setCellValue("       "+(12/12)+" ");








































Sheet ThirdSheet = workingbook.createSheet("Remainder Table");

Row ZeroRow3 = ThirdSheet.createRow(0);

Cell xCellab = ZeroRow3.createCell(0);
Cell Cell1ab = ZeroRow3.createCell(1);
Cell Cell2ab = ZeroRow3.createCell(2);
Cell Cell3ab = ZeroRow3.createCell(3);
Cell Cell4ab = ZeroRow3.createCell(4);
Cell Cell5ab = ZeroRow3.createCell(5);
Cell Cell6ab = ZeroRow3.createCell(6);
Cell Cell7ab = ZeroRow3.createCell(7);
Cell Cell8ab = ZeroRow3.createCell(8);
Cell Cell9ab = ZeroRow3.createCell(9);
Cell Cell10ab = ZeroRow3.createCell(10);
Cell Cell11ab = ZeroRow3.createCell(11);
Cell Cell12ab = ZeroRow3.createCell(12);


xCellab.setCellValue("       % ");
Cell1ab.setCellValue("       "+1+" ");
Cell2ab.setCellValue("       "+2+" ");
Cell3ab.setCellValue("       "+3+" ");
Cell4ab.setCellValue("       "+4+" ");
Cell5ab.setCellValue("       "+5+" ");
Cell6ab.setCellValue("       "+6+" ");
Cell7ab.setCellValue("       "+7+" ");
Cell8ab.setCellValue("       "+8+" ");
Cell9ab.setCellValue("       "+9+" ");
Cell10ab.setCellValue("       "+10+" ");
Cell11ab.setCellValue("       "+11+" ");
Cell12ab.setCellValue("       "+12+" ");






Row Row1ab = ThirdSheet.createRow(1);
Cell Cell0ab = Row1ab.createCell(0);
Cell0ab.setCellValue("       "+1+" ");
Cell acell1ab = Row1ab.createCell(1);
acell1ab.setCellValue("       "+(1%1)+" ");
Cell acell2ab = Row1ab.createCell(2);
acell2ab.setCellValue("       "+(1%2)+" ");
Cell acell3ab = Row1ab.createCell(3);
acell3ab.setCellValue("       "+(1%3)+" ");
Cell acell4ab = Row1ab.createCell(4);
acell4ab.setCellValue("       "+(1%4)+" ");
Cell acell5ab = Row1ab.createCell(5);
acell5ab.setCellValue("       "+(1%5)+" ");
Cell acell6ab = Row1ab.createCell(6);
acell6ab.setCellValue("       "+(1%6)+" ");
Cell acell7ab = Row1ab.createCell(7);
acell7ab.setCellValue("       "+(1%7)+" ");
Cell acell8ab = Row1ab.createCell(8);
acell8ab.setCellValue("       "+(1%8)+" ");
Cell acell9ab = Row1ab.createCell(9);
acell9ab.setCellValue("       "+(1%9)+" ");
Cell acell10ab = Row1ab.createCell(10);
acell10ab.setCellValue("       "+(1%10)+" ");
Cell acell11ab = Row1ab.createCell(11);
acell11ab.setCellValue("       "+(1%11)+" ");
Cell acell12ab = Row1ab.createCell(12);
acell12ab.setCellValue("       "+(1%12)+" ");








Row Row2ab = ThirdSheet.createRow(2);
Cell Cell01ab = Row2ab.createCell(0);
Cell01ab.setCellValue("       "+2+" ");

Cell bcell1ab = Row2ab.createCell(1);
bcell1ab.setCellValue("       "+(2%1)+" ");
Cell bcell2ab = Row2ab.createCell(2);
bcell2ab.setCellValue("       "+(2%2)+" ");
Cell bcell3ab = Row2ab.createCell(3);
bcell3ab.setCellValue("       "+(2%3)+" ");
Cell bcell4ab = Row2ab.createCell(4);
bcell4ab.setCellValue("       "+(2%4)+" ");
Cell bcell5ab = Row2ab.createCell(5);
bcell5ab.setCellValue("       "+(2%5)+" ");
Cell bcell6ab = Row2ab.createCell(6);
bcell6ab.setCellValue("       "+(2%6)+" ");
Cell bcell7ab = Row2ab.createCell(7);
bcell7ab.setCellValue("       "+(2%7)+" ");
Cell bcell8ab = Row2ab.createCell(8);
bcell8ab.setCellValue("       "+(2/8)+" ");
Cell bcell9ab = Row2ab.createCell(9);
bcell9ab.setCellValue("       "+(2%9)+" ");
Cell bcell10ab = Row2ab.createCell(10);
bcell10ab.setCellValue("       "+(2%10)+" ");
Cell bcell11ab = Row2ab.createCell(11);
bcell11ab.setCellValue("       "+(2%11)+" ");
Cell bcell12ab = Row2ab.createCell(12);
bcell12ab.setCellValue("       "+(2%12)+" ");







Row Row3ab = ThirdSheet.createRow(3);
Cell Cell03ab = Row3ab.createCell(0);
Cell03ab.setCellValue("       "+3+" ");

Cell ccell1ab = Row3ab.createCell(1);
ccell1ab.setCellValue("       "+(3%1)+" ");
Cell ccell2ab = Row3ab.createCell(2);
ccell2ab.setCellValue("       "+(3%2)+" ");
Cell ccell3ab = Row3ab.createCell(3);
ccell3ab.setCellValue("       "+(3%3)+" ");
Cell ccell4ab = Row3ab.createCell(4);
ccell4ab.setCellValue("       "+(3%4)+" ");
Cell ccell5ab = Row3ab.createCell(5);
ccell5ab.setCellValue("       "+(3%5)+" ");
Cell ccell6ab = Row3ab.createCell(6);
ccell6ab.setCellValue("       "+(3%6)+" ");
Cell ccell7ab = Row3ab.createCell(7);
ccell7ab.setCellValue("       "+(3%7)+" ");
Cell ccell8ab = Row3ab.createCell(8);
ccell8ab.setCellValue("       "+(3%8)+" ");
Cell ccell9ab = Row3ab.createCell(9);
ccell9ab.setCellValue("       "+(3%9)+" ");
Cell ccell10ab = Row3ab.createCell(10);
ccell10ab.setCellValue("       "+(3%10)+" ");
Cell ccell11ab = Row3ab.createCell(11);
ccell11ab.setCellValue("       "+(3%11)+" ");
Cell ccell12ab = Row3ab.createCell(12);
ccell12ab.setCellValue("       "+(3%12)+" ");







Row Row4ab = ThirdSheet.createRow(4);
Cell Cell04ab = Row4ab.createCell(0);
Cell04ab.setCellValue("       "+4+" ");

Cell dcell1ab = Row4ab.createCell(1);
dcell1ab.setCellValue("       "+(4%1)+" ");
Cell dcell2ab = Row4ab.createCell(2);
dcell2ab.setCellValue("       "+(4%2)+" ");
Cell dcell3ab = Row4ab.createCell(3);
dcell3ab.setCellValue("       "+(4%3)+" ");
Cell dcell4ab = Row4ab.createCell(4);
dcell4ab.setCellValue("       "+(4%4)+" ");
Cell dcell5ab = Row4ab.createCell(5);
dcell5ab.setCellValue("       "+(4%5)+" ");
Cell dcell6ab = Row4ab.createCell(6);
dcell6ab.setCellValue("       "+(4%6)+" ");
Cell dcell7ab = Row4ab.createCell(7);
dcell7ab.setCellValue("       "+(4%7)+" ");
Cell dcell8ab = Row4ab.createCell(8);
dcell8ab.setCellValue("       "+(4%8)+" ");
Cell dcell9ab = Row4ab.createCell(9);
dcell9ab.setCellValue("       "+(4%9)+" ");
Cell dcell10ab = Row4ab.createCell(10);
dcell10ab.setCellValue("       "+(4%10)+" ");
Cell dcell11ab = Row4ab.createCell(11);
dcell11ab.setCellValue("       "+(4%11)+" ");
Cell dcell12ab = Row4ab.createCell(12);
dcell12ab.setCellValue("       "+(4%12)+" ");







Row Row5ab = ThirdSheet.createRow(5);
Cell Cell05ab = Row5ab.createCell(0);
Cell05ab.setCellValue("       "+5+" ");

Cell ecell1ab = Row5ab.createCell(1);
ecell1ab.setCellValue("       "+(5%1)+" ");
Cell ecell2ab = Row5ab.createCell(2);
ecell2ab.setCellValue("       "+(5%2)+" ");
Cell ecell3ab = Row5ab.createCell(3);
ecell3ab.setCellValue("       "+(5%3)+" ");
Cell ecell4ab = Row5ab.createCell(4);
ecell4ab.setCellValue("       "+(5%4)+" ");
Cell ecell5ab = Row5ab.createCell(5);
ecell5ab.setCellValue("       "+(5%5)+" ");
Cell ecell6ab = Row5ab.createCell(6);
ecell6ab.setCellValue("       "+(5%6)+" ");
Cell ecell7ab = Row5ab.createCell(7);
ecell7ab.setCellValue("       "+(5%7)+" ");
Cell ecell8ab = Row5ab.createCell(8);
ecell8ab.setCellValue("       "+(5%8)+" ");
Cell ecell9ab = Row5ab.createCell(9);
ecell9ab.setCellValue("       "+(5%9)+" ");
Cell ecell10ab = Row5ab.createCell(10);
ecell10ab.setCellValue("       "+(5%10)+" ");
Cell ecell11ab = Row5ab.createCell(11);
ecell11ab.setCellValue("       "+(5%11)+" ");
Cell ecell12ab = Row5ab.createCell(12);
ecell12ab.setCellValue("       "+(5%12)+" ");







Row Row6ab = ThirdSheet.createRow(6);
Cell Cell06ab = Row6ab.createCell(0);
Cell06ab.setCellValue("       "+6+" ");

Cell fcell1ab = Row6ab.createCell(1);
fcell1ab.setCellValue("       "+(6%1)+" ");
Cell fcell2ab = Row6ab.createCell(2);
fcell2ab.setCellValue("       "+(6%2)+" ");
Cell fcell3ab = Row6ab.createCell(3);
fcell3ab.setCellValue("       "+(6%3)+" ");
Cell fcell4ab = Row6ab.createCell(4);
fcell4ab.setCellValue("       "+(6%4)+" ");
Cell fcell5ab = Row6ab.createCell(5);
fcell5ab.setCellValue("       "+(6%5)+" ");
Cell fcell6ab = Row6ab.createCell(6);
fcell6ab.setCellValue("       "+(6%6)+" ");
Cell fcell7ab = Row6ab.createCell(7);
fcell7ab.setCellValue("       "+(6%7)+" ");
Cell fcell8ab = Row6ab.createCell(8);
fcell8ab.setCellValue("       "+(6%8)+" ");
Cell fcell9ab = Row6ab.createCell(9);
fcell9ab.setCellValue("       "+(6%9)+" ");
Cell fcell10ab = Row6ab.createCell(10);
fcell10ab.setCellValue("       "+(6%10)+" ");
Cell fcell11ab = Row6ab.createCell(11);
fcell11ab.setCellValue("       "+(6%11)+" ");
Cell fcell12ab = Row6ab.createCell(12);
fcell12ab.setCellValue("       "+(6%12)+" ");







Row Row7ab = ThirdSheet.createRow(7);
Cell Cell071ab = Row7ab.createCell(0);
Cell071ab.setCellValue("       "+7+" ");

Cell gcell1ab = Row7ab.createCell(1);
gcell1ab.setCellValue("       "+(7%1)+" ");
Cell gcell2ab = Row7ab.createCell(2);
gcell2ab.setCellValue("       "+(7%2)+" ");
Cell gcell3ab = Row7ab.createCell(3);
gcell3ab.setCellValue("       "+(7%3)+" ");
Cell gcell4ab = Row7ab.createCell(4);
gcell4ab.setCellValue("       "+(7%4)+" ");
Cell gcell5ab = Row7ab.createCell(5);
gcell5ab.setCellValue("       "+(7%5)+" ");
Cell gcell6ab = Row7ab.createCell(6);
gcell6ab.setCellValue("       "+(7%6)+" ");
Cell gcell7ab = Row7ab.createCell(7);
gcell7ab.setCellValue("       "+(7%7)+" ");
Cell gcell8ab = Row7ab.createCell(8);
gcell8ab.setCellValue("       "+(7%8)+" ");
Cell gcell9ab = Row7ab.createCell(9);
gcell9ab.setCellValue("       "+(7%9)+" ");
Cell gcell10ab = Row7ab.createCell(10);
gcell10ab.setCellValue("       "+(7%10)+" ");
Cell gcell11ab = Row7ab.createCell(11);
gcell11ab.setCellValue("       "+(7%11)+" ");
Cell gcell12ab = Row7ab.createCell(12);
gcell12ab.setCellValue("       "+(7%12)+" ");








Row Row8ab = ThirdSheet.createRow(8);
Cell Cell08ab = Row8ab.createCell(0);
Cell08ab.setCellValue("       "+8+" ");

Cell hcell1ab = Row8ab.createCell(1);
hcell1ab.setCellValue("       "+(8%1)+" ");
Cell hcell2ab = Row8ab.createCell(2);
hcell2ab.setCellValue("       "+(8%2)+" ");
Cell hcell3ab = Row8ab.createCell(3);
hcell3ab.setCellValue("       "+(8%3)+" ");
Cell hcell4ab = Row8ab.createCell(4);
hcell4ab.setCellValue("       "+(8%4)+" ");
Cell hcell5ab = Row8ab.createCell(5);
hcell5ab.setCellValue("       "+(8%5)+" ");
Cell hcell6ab = Row8ab.createCell(6);
hcell6ab.setCellValue("       "+(8%6)+" ");
Cell hcell7ab = Row8ab.createCell(7);
hcell7ab.setCellValue("       "+(8%7)+" ");
Cell hcell8ab = Row8ab.createCell(8);
hcell8ab.setCellValue("       "+(8%8)+" ");
Cell hcell9ab = Row8ab.createCell(9);
hcell9ab.setCellValue("       "+(8%9)+" ");
Cell hcell10ab = Row8ab.createCell(10);
hcell10ab.setCellValue("       "+(8%10)+" ");
Cell hcell11ab = Row8ab.createCell(11);
hcell11ab.setCellValue("       "+(8%11)+" ");
Cell hcell12ab = Row8ab.createCell(12);
hcell12ab.setCellValue("       "+(8%12)+" ");







Row Row9ab = ThirdSheet.createRow(9);
Cell Cell09ab = Row9ab.createCell(0);
Cell09ab.setCellValue("       "+9+" ");

Cell icell1ab = Row9ab.createCell(1);
icell1ab.setCellValue("       "+(9%1)+" ");
Cell icell2ab = Row9ab.createCell(2);
icell2ab.setCellValue("       "+(9%2)+" ");
Cell icell3ab = Row9ab.createCell(3);
icell3ab.setCellValue("       "+(9%3)+" ");
Cell icell4ab = Row9ab.createCell(4);
icell4ab.setCellValue("       "+(9%4)+" ");
Cell icell5ab = Row9ab.createCell(5);
icell5ab.setCellValue("       "+(9%5)+" ");
Cell icell6ab = Row9ab.createCell(6);
icell6ab.setCellValue("       "+(9%6)+" ");
Cell icell7ab = Row9ab.createCell(7);
icell7ab.setCellValue("       "+(9%7)+" ");
Cell icell8ab = Row9ab.createCell(8);
icell8ab.setCellValue("       "+(9%8)+" ");
Cell icell9ab = Row9ab.createCell(9);
icell9ab.setCellValue("       "+(9%9)+" ");
Cell icell10ab = Row9ab.createCell(10);
icell10ab.setCellValue("       "+(9%10)+" ");
Cell icell11ab = Row9ab.createCell(11);
icell11ab.setCellValue("       "+(9%11)+" ");
Cell icell12ab = Row9ab.createCell(12);
icell12ab.setCellValue("       "+(9%12)+" ");







Row Row10ab = ThirdSheet.createRow(10);
Cell Cell010ab = Row10ab.createCell(0);
Cell010ab.setCellValue("       "+10+" ");

Cell jcell1ab = Row10ab.createCell(1);
jcell1ab.setCellValue("       "+(10%1)+" ");
Cell jcell2ab = Row10ab.createCell(2);
jcell2ab.setCellValue("       "+(10%2)+" ");
Cell jcell3ab = Row10ab.createCell(3);
jcell3ab.setCellValue("       "+(10%3)+" ");
Cell jcell4ab = Row10ab.createCell(4);
jcell4ab.setCellValue("       "+(10%4)+" ");
Cell jcell5ab = Row10ab.createCell(5);
jcell5ab.setCellValue("       "+(10%5)+" ");
Cell jcell6ab = Row10ab.createCell(6);
jcell6ab.setCellValue("       "+(10%6)+" ");
Cell jcell7ab = Row10ab.createCell(7);
jcell7ab.setCellValue("       "+(10%7)+" ");
Cell jcell8ab = Row10ab.createCell(8);
jcell8ab.setCellValue("       "+(10%8)+" ");
Cell jcell9ab = Row10ab.createCell(9);
jcell9ab.setCellValue("       "+(10%9)+" ");
Cell jcell10ab = Row10ab.createCell(10);
jcell10ab.setCellValue("       "+(10%10)+" ");
Cell jcell11ab = Row10ab.createCell(11);
jcell11ab.setCellValue("       "+(10%11)+" ");
Cell jcell12ab = Row10ab.createCell(12);
jcell12ab.setCellValue("       "+(10%12)+" ");






Row Row11ab = ThirdSheet.createRow(11);
Cell Cell011ab = Row11ab.createCell(0);
Cell011ab.setCellValue("       "+11+" ");

Cell kcell1ab = Row11ab.createCell(1);
kcell1ab.setCellValue("       "+(11%1)+" ");
Cell kcell2ab = Row11ab.createCell(2);
kcell2ab.setCellValue("       "+(11%2)+" ");
Cell kcell3ab = Row11ab.createCell(3);
kcell3ab.setCellValue("       "+(11%3)+" ");
Cell kcell4ab = Row11ab.createCell(4);
kcell4ab.setCellValue("       "+(11%4)+" ");
Cell kcell5ab = Row11ab.createCell(5);
kcell5ab.setCellValue("       "+(11%5)+" ");
Cell kcell6ab = Row11ab.createCell(6);
kcell6ab.setCellValue("       "+(11%6)+" ");
Cell kcell7ab = Row11ab.createCell(7);
kcell7ab.setCellValue("       "+(11%7)+" ");
Cell kcell8ab = Row11ab.createCell(8);
kcell8ab.setCellValue("       "+(11%8)+" ");
Cell kcell9ab = Row11ab.createCell(9);
kcell9ab.setCellValue("       "+(11%9)+" ");
Cell kcell10ab = Row11ab.createCell(10);
kcell10ab.setCellValue("       "+(11%10)+" ");
Cell kcell11ab = Row11ab.createCell(11);
kcell11ab.setCellValue("       "+(11%11)+" ");
Cell kcell12ab = Row11ab.createCell(12);
kcell12ab.setCellValue("       "+(11%12)+" ");








Row Row12ab = ThirdSheet.createRow(12);
Cell Cell012ab = Row12ab.createCell(0);
Cell012ab.setCellValue("       "+12+" ");

Cell lcell1ab = Row12ab.createCell(1);
lcell1ab.setCellValue("       "+(12%1)+" ");
Cell lcell2ab = Row12ab.createCell(2);
lcell2ab.setCellValue("       "+(12%2)+" ");
Cell lcell3ab = Row12ab.createCell(3);
lcell3ab.setCellValue("       "+(12%3)+" ");
Cell lcell4ab = Row12ab.createCell(4);
lcell4ab.setCellValue("       "+(12%4)+" ");
Cell lcell5ab = Row12ab.createCell(5);
lcell5ab.setCellValue("       "+(12%5)+" ");
Cell lcell6ab = Row12ab.createCell(6);
lcell6ab.setCellValue("       "+(12%6)+" ");
Cell lcell7ab = Row12ab.createCell(7);
lcell7ab.setCellValue("       "+(12%7)+" ");
Cell lcell8ab = Row12ab.createCell(8);
lcell8ab.setCellValue("       "+(12%8)+" ");
Cell lcell9ab = Row12ab.createCell(9);
lcell9ab.setCellValue("       "+(12%9)+" ");
Cell lcell10ab = Row12ab.createCell(10);
lcell10ab.setCellValue("       "+(12%10)+" ");
Cell lcell11ab = Row12ab.createCell(11);
lcell11ab.setCellValue("       "+(12%11)+" ");
Cell lcell12ab = Row12ab.createCell(12);
lcell12ab.setCellValue("       "+(12%12)+" ");


















































Sheet FourthSheet = workingbook.createSheet("Addition Table");

Row ZeroRow4 = FourthSheet.createRow(0);

Cell xCellabc = ZeroRow4.createCell(0);
Cell Cell1abc = ZeroRow4.createCell(1);
Cell Cell2abc = ZeroRow4.createCell(2);
Cell Cell3abc = ZeroRow4.createCell(3);
Cell Cell4abc = ZeroRow4.createCell(4);
Cell Cell5abc = ZeroRow4.createCell(5);
Cell Cell6abc = ZeroRow4.createCell(6);
Cell Cell7abc = ZeroRow4.createCell(7);
Cell Cell8abc = ZeroRow4.createCell(8);
Cell Cell9abc = ZeroRow4.createCell(9);
Cell Cell10abc = ZeroRow4.createCell(10);
Cell Cell11abc = ZeroRow4.createCell(11);
Cell Cell12abc = ZeroRow4.createCell(12);


xCellabc.setCellValue("       + ");
Cell1abc.setCellValue("       "+1+" ");
Cell2abc.setCellValue("       "+2+" ");
Cell3abc.setCellValue("       "+3+" ");
Cell4abc.setCellValue("       "+4+" ");
Cell5abc.setCellValue("       "+5+" ");
Cell6abc.setCellValue("       "+6+" ");
Cell7abc.setCellValue("       "+7+" ");
Cell8abc.setCellValue("       "+8+" ");
Cell9abc.setCellValue("       "+9+" ");
Cell10abc.setCellValue("       "+10+" ");
Cell11abc.setCellValue("       "+11+" ");
Cell12abc.setCellValue("       "+12+" ");






Row Row1abc = FourthSheet.createRow(1);
Cell Cell0abc = Row1abc.createCell(0);
Cell0abc.setCellValue("       "+1+" ");
Cell acell1abc = Row1abc.createCell(1);
acell1abc.setCellValue("       "+(1+1)+" ");
Cell acell2abc = Row1abc.createCell(2);
acell2abc.setCellValue("       "+(1+2)+" ");
Cell acell3abc = Row1abc.createCell(3);
acell3abc.setCellValue("       "+(1+3)+" ");
Cell acell4abc = Row1abc.createCell(4);
acell4abc.setCellValue("       "+(1+4)+" ");
Cell acell5abc = Row1abc.createCell(5);
acell5abc.setCellValue("       "+(1+5)+" ");
Cell acell6abc = Row1abc.createCell(6);
acell6abc.setCellValue("       "+(1+6)+" ");
Cell acell7abc = Row1abc.createCell(7);
acell7abc.setCellValue("       "+(1+7)+" ");
Cell acell8abc = Row1abc.createCell(8);
acell8abc.setCellValue("       "+(1+8)+" ");
Cell acell9abc = Row1abc.createCell(9);
acell9abc.setCellValue("       "+(1+9)+" ");
Cell acell10abc = Row1abc.createCell(10);
acell10abc.setCellValue("       "+(1+10)+" ");
Cell acell11abc = Row1abc.createCell(11);
acell11abc.setCellValue("       "+(1+11)+" ");
Cell acell12abc = Row1abc.createCell(12);
acell12abc.setCellValue("       "+(1+12)+" ");








Row Row2abc = FourthSheet.createRow(2);
Cell Cell01abc = Row2abc.createCell(0);
Cell01abc.setCellValue("       "+2+" ");

Cell bcell1abc = Row2abc.createCell(1);
bcell1abc.setCellValue("       "+(2+1)+" ");
Cell bcell2abc = Row2abc.createCell(2);
bcell2abc.setCellValue("       "+(2+2)+" ");
Cell bcell3abc = Row2abc.createCell(3);
bcell3abc.setCellValue("       "+(2+3)+" ");
Cell bcell4abc = Row2abc.createCell(4);
bcell4abc.setCellValue("       "+(2+4)+" ");
Cell bcell5abc = Row2abc.createCell(5);
bcell5abc.setCellValue("       "+(2+5)+" ");
Cell bcell6abc = Row2abc.createCell(6);
bcell6abc.setCellValue("       "+(2+6)+" ");
Cell bcell7abc = Row2abc.createCell(7);
bcell7abc.setCellValue("       "+(2+7)+" ");
Cell bcell8abc = Row2abc.createCell(8);
bcell8abc.setCellValue("       "+(2+8)+" ");
Cell bcell9abc = Row2abc.createCell(9);
bcell9abc.setCellValue("       "+(2+9)+" ");
Cell bcell10abc = Row2abc.createCell(10);
bcell10abc.setCellValue("       "+(2+10)+" ");
Cell bcell11abc = Row2abc.createCell(11);
bcell11abc.setCellValue("       "+(2+11)+" ");
Cell bcell12abc = Row2abc.createCell(12);
bcell12abc.setCellValue("       "+(2+12)+" ");







Row Row3abc = FourthSheet.createRow(3);
Cell Cell03abc = Row3abc.createCell(0);
Cell03abc.setCellValue("       "+3+" ");

Cell ccell1abc = Row3abc.createCell(1);
ccell1abc.setCellValue("       "+(3+1)+" ");
Cell ccell2abc = Row3abc.createCell(2);
ccell2abc.setCellValue("       "+(3+2)+" ");
Cell ccell3abc = Row3abc.createCell(3);
ccell3abc.setCellValue("       "+(3+3)+" ");
Cell ccell4abc = Row3abc.createCell(4);
ccell4abc.setCellValue("       "+(3+4)+" ");
Cell ccell5abc = Row3abc.createCell(5);
ccell5abc.setCellValue("       "+(3+5)+" ");
Cell ccell6abc = Row3abc.createCell(6);
ccell6abc.setCellValue("       "+(3+6)+" ");
Cell ccell7abc = Row3abc.createCell(7);
ccell7abc.setCellValue("       "+(3+7)+" ");
Cell ccell8abc = Row3abc.createCell(8);
ccell8abc.setCellValue("       "+(3+8)+" ");
Cell ccell9abc = Row3abc.createCell(9);
ccell9abc.setCellValue("       "+(3+9)+" ");
Cell ccell10abc = Row3abc.createCell(10);
ccell10abc.setCellValue("       "+(3+10)+" ");
Cell ccell11abc = Row3abc.createCell(11);
ccell11abc.setCellValue("       "+(3+11)+" ");
Cell ccell12abc = Row3abc.createCell(12);
ccell12abc.setCellValue("       "+(3+12)+" ");







Row Row4abc = FourthSheet.createRow(4);
Cell Cell04abc = Row4abc.createCell(0);
Cell04abc.setCellValue("       "+4+" ");

Cell dcell1abc = Row4abc.createCell(1);
dcell1abc.setCellValue("       "+(4+1)+" ");
Cell dcell2abc = Row4abc.createCell(2);
dcell2abc.setCellValue("       "+(4+2)+" ");
Cell dcell3abc = Row4abc.createCell(3);
dcell3abc.setCellValue("       "+(4+3)+" ");
Cell dcell4abc = Row4abc.createCell(4);
dcell4abc.setCellValue("       "+(4+4)+" ");
Cell dcell5abc = Row4abc.createCell(5);
dcell5abc.setCellValue("       "+(4+5)+" ");
Cell dcell6abc = Row4abc.createCell(6);
dcell6abc.setCellValue("       "+(4+6)+" ");
Cell dcell7abc = Row4abc.createCell(7);
dcell7abc.setCellValue("       "+(4+7)+" ");
Cell dcell8abc = Row4abc.createCell(8);
dcell8abc.setCellValue("       "+(4+8)+" ");
Cell dcell9abc = Row4abc.createCell(9);
dcell9abc.setCellValue("       "+(4+9)+" ");
Cell dcell10abc = Row4abc.createCell(10);
dcell10abc.setCellValue("       "+(4+10)+" ");
Cell dcell11abc = Row4abc.createCell(11);
dcell11abc.setCellValue("       "+(4+11)+" ");
Cell dcell12abc = Row4abc.createCell(12);
dcell12abc.setCellValue("       "+(4+12)+" ");







Row Row5abc = FourthSheet.createRow(5);
Cell Cell05abc = Row5abc.createCell(0);
Cell05abc.setCellValue("       "+5+" ");

Cell ecell1abc = Row5abc.createCell(1);
ecell1abc.setCellValue("       "+(5+1)+" ");
Cell ecell2abc = Row5abc.createCell(2);
ecell2abc.setCellValue("       "+(5+2)+" ");
Cell ecell3abc = Row5abc.createCell(3);
ecell3abc.setCellValue("       "+(5+3)+" ");
Cell ecell4abc = Row5abc.createCell(4);
ecell4abc.setCellValue("       "+(5+4)+" ");
Cell ecell5abc = Row5abc.createCell(5);
ecell5abc.setCellValue("       "+(5+5)+" ");
Cell ecell6abc = Row5abc.createCell(6);
ecell6abc.setCellValue("       "+(5+6)+" ");
Cell ecell7abc = Row5abc.createCell(7);
ecell7abc.setCellValue("       "+(5+7)+" ");
Cell ecell8abc = Row5abc.createCell(8);
ecell8abc.setCellValue("       "+(5+8)+" ");
Cell ecell9abc = Row5abc.createCell(9);
ecell9abc.setCellValue("       "+(5+9)+" ");
Cell ecell10abc = Row5abc.createCell(10);
ecell10abc.setCellValue("       "+(5+10)+" ");
Cell ecell11abc = Row5abc.createCell(11);
ecell11abc.setCellValue("       "+(5+11)+" ");
Cell ecell12abc = Row5abc.createCell(12);
ecell12abc.setCellValue("       "+(5+12)+" ");







Row Row6abc = FourthSheet.createRow(6);
Cell Cell06abc = Row6abc.createCell(0);
Cell06abc.setCellValue("       "+6+" ");

Cell fcell1abc = Row6abc.createCell(1);
fcell1abc.setCellValue("       "+(6+1)+" ");
Cell fcell2abc = Row6abc.createCell(2);
fcell2abc.setCellValue("       "+(6+2)+" ");
Cell fcell3abc = Row6abc.createCell(3);
fcell3abc.setCellValue("       "+(6+3)+" ");
Cell fcell4abc = Row6abc.createCell(4);
fcell4abc.setCellValue("       "+(6+4)+" ");
Cell fcell5abc = Row6abc.createCell(5);
fcell5abc.setCellValue("       "+(6+5)+" ");
Cell fcell6abc = Row6abc.createCell(6);
fcell6abc.setCellValue("       "+(6+6)+" ");
Cell fcell7abc = Row6abc.createCell(7);
fcell7abc.setCellValue("       "+(6+7)+" ");
Cell fcell8abc = Row6abc.createCell(8);
fcell8abc.setCellValue("       "+(6+8)+" ");
Cell fcell9abc = Row6abc.createCell(9);
fcell9abc.setCellValue("       "+(6+9)+" ");
Cell fcell10abc = Row6abc.createCell(10);
fcell10abc.setCellValue("       "+(6+10)+" ");
Cell fcell11abc = Row6abc.createCell(11);
fcell11abc.setCellValue("       "+(6+11)+" ");
Cell fcell12abc = Row6abc.createCell(12);
fcell12abc.setCellValue("       "+(6+12)+" ");







Row Row7abc = FourthSheet.createRow(7);
Cell Cell071abc = Row7abc.createCell(0);
Cell071abc.setCellValue("       "+7+" ");

Cell gcell1abc = Row7abc.createCell(1);
gcell1abc.setCellValue("       "+(7+1)+" ");
Cell gcell2abc = Row7abc.createCell(2);
gcell2abc.setCellValue("       "+(7+2)+" ");
Cell gcell3abc = Row7abc.createCell(3);
gcell3abc.setCellValue("       "+(7+3)+" ");
Cell gcell4abc = Row7abc.createCell(4);
gcell4abc.setCellValue("       "+(7+4)+" ");
Cell gcell5abc = Row7abc.createCell(5);
gcell5abc.setCellValue("       "+(7+5)+" ");
Cell gcell6abc = Row7abc.createCell(6);
gcell6abc.setCellValue("       "+(7+6)+" ");
Cell gcell7abc = Row7abc.createCell(7);
gcell7abc.setCellValue("       "+(7+7)+" ");
Cell gcell8abc = Row7abc.createCell(8);
gcell8abc.setCellValue("       "+(7+8)+" ");
Cell gcell9abc = Row7abc.createCell(9);
gcell9abc.setCellValue("       "+(7+9)+" ");
Cell gcell10abc = Row7abc.createCell(10);
gcell10abc.setCellValue("       "+(7+10)+" ");
Cell gcell11abc = Row7abc.createCell(11);
gcell11abc.setCellValue("       "+(7+11)+" ");
Cell gcell12abc = Row7abc.createCell(12);
gcell12abc.setCellValue("       "+(7+12)+" ");








Row Row8abc = FourthSheet.createRow(8);
Cell Cell08abc = Row8abc.createCell(0);
Cell08abc.setCellValue("       "+8+" ");

Cell hcell1abc = Row8abc.createCell(1);
hcell1abc.setCellValue("       "+(8+1)+" ");
Cell hcell2abc = Row8abc.createCell(2);
hcell2abc.setCellValue("       "+(8+2)+" ");
Cell hcell3abc = Row8abc.createCell(3);
hcell3abc.setCellValue("       "+(8+3)+" ");
Cell hcell4abc = Row8abc.createCell(4);
hcell4abc.setCellValue("       "+(8+4)+" ");
Cell hcell5abc = Row8abc.createCell(5);
hcell5abc.setCellValue("       "+(8+5)+" ");
Cell hcell6abc = Row8abc.createCell(6);
hcell6abc.setCellValue("       "+(8+6)+" ");
Cell hcell7abc = Row8abc.createCell(7);
hcell7abc.setCellValue("       "+(8+7)+" ");
Cell hcell8abc = Row8abc.createCell(8);
hcell8abc.setCellValue("       "+(8+8)+" ");
Cell hcell9abc = Row8abc.createCell(9);
hcell9abc.setCellValue("       "+(8+9)+" ");
Cell hcell10abc = Row8abc.createCell(10);
hcell10abc.setCellValue("       "+(8+10)+" ");
Cell hcell11abc = Row8abc.createCell(11);
hcell11abc.setCellValue("       "+(8+11)+" ");
Cell hcell12abc = Row8abc.createCell(12);
hcell12abc.setCellValue("       "+(8+12)+" ");







Row Row9abc = FourthSheet.createRow(9);
Cell Cell09abc = Row9abc.createCell(0);
Cell09abc.setCellValue("       "+9+" ");

Cell icell1abc = Row9abc.createCell(1);
icell1abc.setCellValue("       "+(9+1)+" ");
Cell icell2abc = Row9abc.createCell(2);
icell2abc.setCellValue("       "+(9+2)+" ");
Cell icell3abc = Row9abc.createCell(3);
icell3abc.setCellValue("       "+(9+3)+" ");
Cell icell4abc = Row9abc.createCell(4);
icell4abc.setCellValue("       "+(9+4)+" ");
Cell icell5abc = Row9abc.createCell(5);
icell5abc.setCellValue("       "+(9+5)+" ");
Cell icell6abc = Row9abc.createCell(6);
icell6abc.setCellValue("       "+(9+6)+" ");
Cell icell7abc = Row9abc.createCell(7);
icell7abc.setCellValue("       "+(9+7)+" ");
Cell icell8abc = Row9abc.createCell(8);
icell8abc.setCellValue("       "+(9+8)+" ");
Cell icell9abc = Row9abc.createCell(9);
icell9abc.setCellValue("       "+(9+9)+" ");
Cell icell10abc = Row9abc.createCell(10);
icell10abc.setCellValue("       "+(9+10)+" ");
Cell icell11abc = Row9abc.createCell(11);
icell11abc.setCellValue("       "+(9+11)+" ");
Cell icell12abc = Row9abc.createCell(12);
icell12abc.setCellValue("       "+(9+12)+" ");







Row Row10abc = FourthSheet.createRow(10);
Cell Cell010abc = Row10abc.createCell(0);
Cell010abc.setCellValue("       "+10+" ");

Cell jcell1abc = Row10abc.createCell(1);
jcell1abc.setCellValue("       "+(10+1)+" ");
Cell jcell2abc = Row10abc.createCell(2);
jcell2abc.setCellValue("       "+(10+2)+" ");
Cell jcell3abc = Row10abc.createCell(3);
jcell3abc.setCellValue("       "+(10+3)+" ");
Cell jcell4abc = Row10abc.createCell(4);
jcell4abc.setCellValue("       "+(10+4)+" ");
Cell jcell5abc = Row10abc.createCell(5);
jcell5abc.setCellValue("       "+(10+5)+" ");
Cell jcell6abc = Row10abc.createCell(6);
jcell6abc.setCellValue("       "+(10+6)+" ");
Cell jcell7abc = Row10abc.createCell(7);
jcell7abc.setCellValue("       "+(10+7)+" ");
Cell jcell8abc = Row10abc.createCell(8);
jcell8abc.setCellValue("       "+(10%8)+" ");
Cell jcell9abc = Row10abc.createCell(9);
jcell9abc.setCellValue("       "+(10+9)+" ");
Cell jcell10abc = Row10abc.createCell(10);
jcell10abc.setCellValue("       "+(10+10)+" ");
Cell jcell11abc = Row10abc.createCell(11);
jcell11abc.setCellValue("       "+(10+11)+" ");
Cell jcell12abc = Row10abc.createCell(12);
jcell12abc.setCellValue("       "+(10+12)+" ");






Row Row11abc = FourthSheet.createRow(11);
Cell Cell011abc = Row11abc.createCell(0);
Cell011abc.setCellValue("       "+11+" ");

Cell kcell1abc = Row11abc.createCell(1);
kcell1abc.setCellValue("       "+(11+1)+" ");
Cell kcell2abc = Row11abc.createCell(2);
kcell2abc.setCellValue("       "+(11+2)+" ");
Cell kcell3abc = Row11abc.createCell(3);
kcell3abc.setCellValue("       "+(11+3)+" ");
Cell kcell4abc = Row11abc.createCell(4);
kcell4abc.setCellValue("       "+(11+4)+" ");
Cell kcell5abc = Row11abc.createCell(5);
kcell5abc.setCellValue("       "+(11+5)+" ");
Cell kcell6abc = Row11abc.createCell(6);
kcell6abc.setCellValue("       "+(11+6)+" ");
Cell kcell7abc = Row11abc.createCell(7);
kcell7abc.setCellValue("       "+(11+7)+" ");
Cell kcell8abc = Row11abc.createCell(8);
kcell8abc.setCellValue("       "+(11+8)+" ");
Cell kcell9abc = Row11abc.createCell(9);
kcell9abc.setCellValue("       "+(11+9)+" ");
Cell kcell10abc = Row11abc.createCell(10);
kcell10abc.setCellValue("       "+(11+10)+" ");
Cell kcell11abc = Row11abc.createCell(11);
kcell11abc.setCellValue("       "+(11+11)+" ");
Cell kcell12abc = Row11abc.createCell(12);
kcell12abc.setCellValue("       "+(11+12)+" ");








Row Row12abc = FourthSheet.createRow(12);
Cell Cell012abc = Row12abc.createCell(0);
Cell012abc.setCellValue("       "+12+" ");

Cell lcell1abc = Row12abc.createCell(1);
lcell1abc.setCellValue("       "+(12+1)+" ");
Cell lcell2abc = Row12abc.createCell(2);
lcell2abc.setCellValue("       "+(12+2)+" ");
Cell lcell3abc = Row12abc.createCell(3);
lcell3abc.setCellValue("       "+(12+3)+" ");
Cell lcell4abc = Row12abc.createCell(4);
lcell4abc.setCellValue("       "+(12+4)+" ");
Cell lcell5abc = Row12abc.createCell(5);
lcell5abc.setCellValue("       "+(12+5)+" ");
Cell lcell6abc = Row12abc.createCell(6);
lcell6abc.setCellValue("       "+(12+6)+" ");
Cell lcell7abc = Row12abc.createCell(7);
lcell7abc.setCellValue("       "+(12+7)+" ");
Cell lcell8abc = Row12abc.createCell(8);
lcell8abc.setCellValue("       "+(12+8)+" ");
Cell lcell9abc = Row12abc.createCell(9);
lcell9abc.setCellValue("       "+(12+9)+" ");
Cell lcell10abc = Row12abc.createCell(10);
lcell10abc.setCellValue("       "+(12+10)+" ");
Cell lcell11abc = Row12abc.createCell(11);
lcell11abc.setCellValue("       "+(12+11)+" ");
Cell lcell12abc = Row12abc.createCell(12);
lcell12abc.setCellValue("       "+(12+12)+" ");






































Sheet FifthSheet = workingbook.createSheet("Subtraction Table");

Row ZeroRow5 = FifthSheet.createRow(0);

Cell xCellabcd = ZeroRow5.createCell(0);
Cell Cell1abcd = ZeroRow5.createCell(1);
Cell Cell2abcd = ZeroRow5.createCell(2);
Cell Cell3abcd = ZeroRow5.createCell(3);
Cell Cell4abcd = ZeroRow5.createCell(4);
Cell Cell5abcd = ZeroRow5.createCell(5);
Cell Cell6abcd = ZeroRow5.createCell(6);
Cell Cell7abcd = ZeroRow5.createCell(7);
Cell Cell8abcd = ZeroRow5.createCell(8);
Cell Cell9abcd = ZeroRow5.createCell(9);
Cell Cell10abcd = ZeroRow5.createCell(10);
Cell Cell11abcd = ZeroRow5.createCell(11);
Cell Cell12abcd = ZeroRow5.createCell(12);


xCellabcd.setCellValue("       - ");
Cell1abcd.setCellValue("       "+1+" ");
Cell2abcd.setCellValue("       "+2+" ");
Cell3abcd.setCellValue("       "+3+" ");
Cell4abcd.setCellValue("       "+4+" ");
Cell5abcd.setCellValue("       "+5+" ");
Cell6abcd.setCellValue("       "+6+" ");
Cell7abcd.setCellValue("       "+7+" ");
Cell8abcd.setCellValue("       "+8+" ");
Cell9abcd.setCellValue("       "+9+" ");
Cell10abcd.setCellValue("       "+10+" ");
Cell11abcd.setCellValue("       "+11+" ");
Cell12abcd.setCellValue("       "+12+" ");






Row Row1abcd = FifthSheet.createRow(1);
Cell Cell0abcd = Row1abcd.createCell(0);
Cell0abcd.setCellValue("       "+1+" ");
Cell acell1abcd = Row1abcd.createCell(1);
acell1abcd.setCellValue("       "+(1-1)+" ");
Cell acell2abcd = Row1abcd.createCell(2);
acell2abcd.setCellValue("       "+(1-2)+" ");
Cell acell3abcd = Row1abcd.createCell(3);
acell3abcd.setCellValue("       "+(1-3)+" ");
Cell acell4abcd = Row1abcd.createCell(4);
acell4abcd.setCellValue("       "+(1-4)+" ");
Cell acell5abcd = Row1abcd.createCell(5);
acell5abcd.setCellValue("       "+(1-5)+" ");
Cell acell6abcd = Row1abcd.createCell(6);
acell6abcd.setCellValue("       "+(1-6)+" ");
Cell acell7abcd = Row1abcd.createCell(7);
acell7abcd.setCellValue("       "+(1-7)+" ");
Cell acell8abcd = Row1abcd.createCell(8);
acell8abcd.setCellValue("       "+(1-8)+" ");
Cell acell9abcd = Row1abcd.createCell(9);
acell9abcd.setCellValue("       "+(1-9)+" ");
Cell acell10abcd = Row1abcd.createCell(10);
acell10abcd.setCellValue("       "+(1-10)+" ");
Cell acell11abcd = Row1abcd.createCell(11);
acell11abcd.setCellValue("       "+(1-11)+" ");
Cell acell12abcd = Row1abcd.createCell(12);
acell12abcd.setCellValue("       "+(1-12)+" ");








Row Row2abcd = FifthSheet.createRow(2);
Cell Cell01abcd = Row2abcd.createCell(0);
Cell01abcd.setCellValue("       "+2+" ");

Cell bcell1abcd = Row2abcd.createCell(1);
bcell1abcd.setCellValue("       "+(2-1)+" ");
Cell bcell2abcd = Row2abcd.createCell(2);
bcell2abcd.setCellValue("       "+(2-2)+" ");
Cell bcell3abcd = Row2abcd.createCell(3);
bcell3abcd.setCellValue("       "+(2-3)+" ");
Cell bcell4abcd = Row2abcd.createCell(4);
bcell4abcd.setCellValue("       "+(2-4)+" ");
Cell bcell5abcd = Row2abcd.createCell(5);
bcell5abcd.setCellValue("       "+(2-5)+" ");
Cell bcell6abcd = Row2abcd.createCell(6);
bcell6abcd.setCellValue("       "+(2-6)+" ");
Cell bcell7abcd = Row2abcd.createCell(7);
bcell7abcd.setCellValue("       "+(2-7)+" ");
Cell bcell8abcd = Row2abcd.createCell(8);
bcell8abcd.setCellValue("       "+(2-8)+" ");
Cell bcell9abcd = Row2abcd.createCell(9);
bcell9abcd.setCellValue("       "+(2-9)+" ");
Cell bcell10abcd = Row2abcd.createCell(10);
bcell10abcd.setCellValue("       "+(2-10)+" ");
Cell bcell11abcd = Row2abcd.createCell(11);
bcell11abcd.setCellValue("       "+(2-11)+" ");
Cell bcell12abcd = Row2abcd.createCell(12);
bcell12abcd.setCellValue("       "+(2-12)+" ");







Row Row3abcd = FifthSheet.createRow(3);
Cell Cell03abcd = Row3abcd.createCell(0);
Cell03abcd.setCellValue("       "+3+" ");

Cell ccell1abcd = Row3abcd.createCell(1);
ccell1abcd.setCellValue("       "+(3-1)+" ");
Cell ccell2abcd = Row3abcd.createCell(2);
ccell2abcd.setCellValue("       "+(3-2)+" ");
Cell ccell3abcd = Row3abcd.createCell(3);
ccell3abcd.setCellValue("       "+(3-3)+" ");
Cell ccell4abcd = Row3abcd.createCell(4);
ccell4abcd.setCellValue("       "+(3-4)+" ");
Cell ccell5abcd = Row3abcd.createCell(5);
ccell5abcd.setCellValue("       "+(3-5)+" ");
Cell ccell6abcd = Row3abcd.createCell(6);
ccell6abcd.setCellValue("       "+(3-6)+" ");
Cell ccell7abcd = Row3abcd.createCell(7);
ccell7abcd.setCellValue("       "+(3-7)+" ");
Cell ccell8abcd = Row3abcd.createCell(8);
ccell8abcd.setCellValue("       "+(3-8)+" ");
Cell ccell9abcd = Row3abcd.createCell(9);
ccell9abcd.setCellValue("       "+(3-9)+" ");
Cell ccell10abcd = Row3abcd.createCell(10);
ccell10abcd.setCellValue("       "+(3-10)+" ");
Cell ccell11abcd = Row3abcd.createCell(11);
ccell11abcd.setCellValue("       "+(3-11)+" ");
Cell ccell12abcd = Row3abcd.createCell(12);
ccell12abcd.setCellValue("       "+(3-12)+" ");







Row Row4abcd = FifthSheet.createRow(4);
Cell Cell04abcd = Row4abcd.createCell(0);
Cell04abcd.setCellValue("       "+4+" ");

Cell dcell1abcd = Row4abcd.createCell(1);
dcell1abcd.setCellValue("       "+(4-1)+" ");
Cell dcell2abcd = Row4abcd.createCell(2);
dcell2abcd.setCellValue("       "+(4-2)+" ");
Cell dcell3abcd = Row4abcd.createCell(3);
dcell3abcd.setCellValue("       "+(4-3)+" ");
Cell dcell4abcd = Row4abcd.createCell(4);
dcell4abcd.setCellValue("       "+(4-4)+" ");
Cell dcell5abcd = Row4abcd.createCell(5);
dcell5abcd.setCellValue("       "+(4-5)+" ");
Cell dcell6abcd = Row4abcd.createCell(6);
dcell6abcd.setCellValue("       "+(4-6)+" ");
Cell dcell7abcd = Row4abcd.createCell(7);
dcell7abcd.setCellValue("       "+(4-7)+" ");
Cell dcell8abcd = Row4abcd.createCell(8);
dcell8abcd.setCellValue("       "+(4-8)+" ");
Cell dcell9abcd = Row4abcd.createCell(9);
dcell9abcd.setCellValue("       "+(4-9)+" ");
Cell dcell10abcd = Row4abcd.createCell(10);
dcell10abcd.setCellValue("       "+(4-10)+" ");
Cell dcell11abcd = Row4abcd.createCell(11);
dcell11abcd.setCellValue("       "+(4-11)+" ");
Cell dcell12abcd = Row4abcd.createCell(12);
dcell12abcd.setCellValue("       "+(4-12)+" ");







Row Row5abcd = FifthSheet.createRow(5);
Cell Cell05abcd = Row5abcd.createCell(0);
Cell05abcd.setCellValue("       "+5+" ");

Cell ecell1abcd = Row5abcd.createCell(1);
ecell1abcd.setCellValue("       "+(5-1)+" ");
Cell ecell2abcd = Row5abcd.createCell(2);
ecell2abcd.setCellValue("       "+(5-2)+" ");
Cell ecell3abcd = Row5abcd.createCell(3);
ecell3abcd.setCellValue("       "+(5-3)+" ");
Cell ecell4abcd = Row5abcd.createCell(4);
ecell4abcd.setCellValue("       "+(5-4)+" ");
Cell ecell5abcd = Row5abcd.createCell(5);
ecell5abcd.setCellValue("       "+(5-5)+" ");
Cell ecell6abcd = Row5abcd.createCell(6);
ecell6abcd.setCellValue("       "+(5-6)+" ");
Cell ecell7abcd = Row5abcd.createCell(7);
ecell7abcd.setCellValue("       "+(5-7)+" ");
Cell ecell8abcd = Row5abcd.createCell(8);
ecell8abcd.setCellValue("       "+(5-8)+" ");
Cell ecell9abcd = Row5abcd.createCell(9);
ecell9abcd.setCellValue("       "+(5-9)+" ");
Cell ecell10abcd = Row5abcd.createCell(10);
ecell10abcd.setCellValue("       "+(5-10)+" ");
Cell ecell11abcd = Row5abcd.createCell(11);
ecell11abcd.setCellValue("       "+(5-11)+" ");
Cell ecell12abcd = Row5abcd.createCell(12);
ecell12abcd.setCellValue("       "+(5-12)+" ");







Row Row6abcd = FifthSheet.createRow(6);
Cell Cell06abcd = Row6abcd.createCell(0);
Cell06abcd.setCellValue("       "+6+" ");

Cell fcell1abcd = Row6abcd.createCell(1);
fcell1abcd.setCellValue("       "+(6-1)+" ");
Cell fcell2abcd = Row6abcd.createCell(2);
fcell2abcd.setCellValue("       "+(6-2)+" ");
Cell fcell3abcd = Row6abcd.createCell(3);
fcell3abcd.setCellValue("       "+(6-3)+" ");
Cell fcell4abcd = Row6abcd.createCell(4);
fcell4abcd.setCellValue("       "+(6-4)+" ");
Cell fcell5abcd = Row6abcd.createCell(5);
fcell5abcd.setCellValue("       "+(6-5)+" ");
Cell fcell6abcd = Row6abcd.createCell(6);
fcell6abcd.setCellValue("       "+(6-6)+" ");
Cell fcell7abcd = Row6abcd.createCell(7);
fcell7abcd.setCellValue("       "+(6-7)+" ");
Cell fcell8abcd = Row6abcd.createCell(8);
fcell8abcd.setCellValue("       "+(6-8)+" ");
Cell fcell9abcd = Row6abcd.createCell(9);
fcell9abcd.setCellValue("       "+(6-9)+" ");
Cell fcell10abcd = Row6abcd.createCell(10);
fcell10abcd.setCellValue("       "+(6-10)+" ");
Cell fcell11abcd = Row6abcd.createCell(11);
fcell11abcd.setCellValue("       "+(6-11)+" ");
Cell fcell12abcd = Row6abcd.createCell(12);
fcell12abcd.setCellValue("       "+(6-12)+" ");







Row Row7abcd = FifthSheet.createRow(7);
Cell Cell071abcd = Row7abcd.createCell(0);
Cell071abcd.setCellValue("       "+7+" ");

Cell gcell1abcd = Row7abcd.createCell(1);
gcell1abcd.setCellValue("       "+(7-1)+" ");
Cell gcell2abcd = Row7abcd.createCell(2);
gcell2abcd.setCellValue("       "+(7-2)+" ");
Cell gcell3abcd = Row7abcd.createCell(3);
gcell3abcd.setCellValue("       "+(7-3)+" ");
Cell gcell4abcd = Row7abcd.createCell(4);
gcell4abcd.setCellValue("       "+(7-4)+" ");
Cell gcell5abcd = Row7abcd.createCell(5);
gcell5abcd.setCellValue("       "+(7-5)+" ");
Cell gcell6abcd = Row7abcd.createCell(6);
gcell6abcd.setCellValue("       "+(7-6)+" ");
Cell gcell7abcd = Row7abcd.createCell(7);
gcell7abcd.setCellValue("       "+(7-7)+" ");
Cell gcell8abcd = Row7abcd.createCell(8);
gcell8abcd.setCellValue("       "+(7-8)+" ");
Cell gcell9abcd = Row7abcd.createCell(9);
gcell9abcd.setCellValue("       "+(7-9)+" ");
Cell gcell10abcd = Row7abcd.createCell(10);
gcell10abcd.setCellValue("       "+(7-10)+" ");
Cell gcell11abcd = Row7abcd.createCell(11);
gcell11abcd.setCellValue("       "+(7-11)+" ");
Cell gcell12abcd = Row7abcd.createCell(12);
gcell12abcd.setCellValue("       "+(7-12)+" ");








Row Row8abcd = FifthSheet.createRow(8);
Cell Cell08abcd = Row8abcd.createCell(0);
Cell08abcd.setCellValue("       "+8+" ");

Cell hcell1abcd = Row8abcd.createCell(1);
hcell1abcd.setCellValue("       "+(8-1)+" ");
Cell hcell2abcd = Row8abcd.createCell(2);
hcell2abcd.setCellValue("       "+(8-2)+" ");
Cell hcell3abcd = Row8abcd.createCell(3);
hcell3abcd.setCellValue("       "+(8-3)+" ");
Cell hcell4abcd = Row8abcd.createCell(4);
hcell4abcd.setCellValue("       "+(8-4)+" ");
Cell hcell5abcd = Row8abcd.createCell(5);
hcell5abcd.setCellValue("       "+(8-5)+" ");
Cell hcell6abcd = Row8abcd.createCell(6);
hcell6abcd.setCellValue("       "+(8-6)+" ");
Cell hcell7abcd = Row8abcd.createCell(7);
hcell7abcd.setCellValue("       "+(8-7)+" ");
Cell hcell8abcd = Row8abcd.createCell(8);
hcell8abcd.setCellValue("       "+(8-8)+" ");
Cell hcell9abcd = Row8abcd.createCell(9);
hcell9abcd.setCellValue("       "+(8-9)+" ");
Cell hcell10abcd = Row8abcd.createCell(10);
hcell10abcd.setCellValue("       "+(8-10)+" ");
Cell hcell11abcd = Row8abcd.createCell(11);
hcell11abcd.setCellValue("       "+(8-11)+" ");
Cell hcell12abcd = Row8abcd.createCell(12);
hcell12abcd.setCellValue("       "+(8-12)+" ");







Row Row9abcd = FifthSheet.createRow(9);
Cell Cell09abcd = Row9abcd.createCell(0);
Cell09abcd.setCellValue("       "+9+" ");

Cell icell1abcd = Row9abcd.createCell(1);
icell1abcd.setCellValue("       "+(9-1)+" ");
Cell icell2abcd = Row9abcd.createCell(2);
icell2abcd.setCellValue("       "+(9-2)+" ");
Cell icell3abcd = Row9abcd.createCell(3);
icell3abcd.setCellValue("       "+(9-3)+" ");
Cell icell4abcd = Row9abcd.createCell(4);
icell4abcd.setCellValue("       "+(9-4)+" ");
Cell icell5abcd = Row9abcd.createCell(5);
icell5abcd.setCellValue("       "+(9-5)+" ");
Cell icell6abcd = Row9abcd.createCell(6);
icell6abcd.setCellValue("       "+(9-6)+" ");
Cell icell7abcd = Row9abcd.createCell(7);
icell7abcd.setCellValue("       "+(9-7)+" ");
Cell icell8abcd = Row9abcd.createCell(8);
icell8abcd.setCellValue("       "+(9-8)+" ");
Cell icell9abcd = Row9abcd.createCell(9);
icell9abcd.setCellValue("       "+(9-9)+" ");
Cell icell10abcd = Row9abcd.createCell(10);
icell10abcd.setCellValue("       "+(9-10)+" ");
Cell icell11abcd = Row9abcd.createCell(11);
icell11abcd.setCellValue("       "+(9-11)+" ");
Cell icell12abcd = Row9abcd.createCell(12);
icell12abcd.setCellValue("       "+(9-12)+" ");







Row Row10abcd = FifthSheet.createRow(10);
Cell Cell010abcd = Row10abcd.createCell(0);
Cell010abcd.setCellValue("       "+10+" ");

Cell jcell1abcd = Row10abcd.createCell(1);
jcell1abcd.setCellValue("       "+(10-1)+" ");
Cell jcell2abcd = Row10abcd.createCell(2);
jcell2abcd.setCellValue("       "+(10-2)+" ");
Cell jcell3abcd = Row10abcd.createCell(3);
jcell3abcd.setCellValue("       "+(10-3)+" ");
Cell jcell4abcd = Row10abcd.createCell(4);
jcell4abcd.setCellValue("       "+(10-4)+" ");
Cell jcell5abcd = Row10abcd.createCell(5);
jcell5abcd.setCellValue("       "+(10-5)+" ");
Cell jcell6abcd = Row10abcd.createCell(6);
jcell6abcd.setCellValue("       "+(10-6)+" ");
Cell jcell7abcd = Row10abcd.createCell(7);
jcell7abcd.setCellValue("       "+(10-7)+" ");
Cell jcell8abcd = Row10abcd.createCell(8);
jcell8abcd.setCellValue("       "+(10-8)+" ");
Cell jcell9abcd = Row10abcd.createCell(9);
jcell9abcd.setCellValue("       "+(10-9)+" ");
Cell jcell10abcd = Row10abcd.createCell(10);
jcell10abcd.setCellValue("       "+(10-10)+" ");
Cell jcell11abcd = Row10abcd.createCell(11);
jcell11abcd.setCellValue("       "+(10-11)+" ");
Cell jcell12abcd = Row10abcd.createCell(12);
jcell12abcd.setCellValue("       "+(10-12)+" ");






Row Row11abcd = FifthSheet.createRow(11);
Cell Cell011abcd = Row11abcd.createCell(0);
Cell011abcd.setCellValue("       "+11+" ");

Cell kcell1abcd = Row11abcd.createCell(1);
kcell1abcd.setCellValue("       "+(11-1)+" ");
Cell kcell2abcd = Row11abcd.createCell(2);
kcell2abcd.setCellValue("       "+(11-2)+" ");
Cell kcell3abcd = Row11abcd.createCell(3);
kcell3abcd.setCellValue("       "+(11-3)+" ");
Cell kcell4abcd = Row11abcd.createCell(4);
kcell4abcd.setCellValue("       "+(11-4)+" ");
Cell kcell5abcd = Row11abcd.createCell(5);
kcell5abcd.setCellValue("       "+(11-5)+" ");
Cell kcell6abcd = Row11abcd.createCell(6);
kcell6abcd.setCellValue("       "+(11-6)+" ");
Cell kcell7abcd = Row11abcd.createCell(7);
kcell7abcd.setCellValue("       "+(11-7)+" ");
Cell kcell8abcd = Row11abcd.createCell(8);
kcell8abcd.setCellValue("       "+(11-8)+" ");
Cell kcell9abcd = Row11abcd.createCell(9);
kcell9abcd.setCellValue("       "+(11-9)+" ");
Cell kcell10abcd = Row11abcd.createCell(10);
kcell10abcd.setCellValue("       "+(11-10)+" ");
Cell kcell11abcd = Row11abcd.createCell(11);
kcell11abcd.setCellValue("       "+(11-11)+" ");
Cell kcell12abcd = Row11abcd.createCell(12);
kcell12abcd.setCellValue("       "+(11-12)+" ");








Row Row12abcd = FifthSheet.createRow(12);
Cell Cell012abcd = Row12abcd.createCell(0);
Cell012abcd.setCellValue("       "+12+" ");

Cell lcell1abcd = Row12abcd.createCell(1);
lcell1abcd.setCellValue("       "+(12-1)+" ");
Cell lcell2abcd = Row12abcd.createCell(2);
lcell2abcd.setCellValue("       "+(12-2)+" ");
Cell lcell3abcd = Row12abcd.createCell(3);
lcell3abcd.setCellValue("       "+(12-3)+" ");
Cell lcell4abcd = Row12abcd.createCell(4);
lcell4abcd.setCellValue("       "+(12-4)+" ");
Cell lcell5abcd = Row12abcd.createCell(5);
lcell5abcd.setCellValue("       "+(12-5)+" ");
Cell lcell6abcd = Row12abcd.createCell(6);
lcell6abcd.setCellValue("       "+(12-6)+" ");
Cell lcell7abcd = Row12abcd.createCell(7);
lcell7abcd.setCellValue("       "+(12-7)+" ");
Cell lcell8abcd = Row12abcd.createCell(8);
lcell8abcd.setCellValue("       "+(12-8)+" ");
Cell lcell9abcd = Row12abcd.createCell(9);
lcell9abcd.setCellValue("       "+(12-9)+" ");
Cell lcell10abcd = Row12abcd.createCell(10);
lcell10abcd.setCellValue("       "+(12-10)+" ");
Cell lcell11abcd = Row12abcd.createCell(11);
lcell11abcd.setCellValue("       "+(12-11)+" ");
Cell lcell12abcd = Row12abcd.createCell(12);
lcell12abcd.setCellValue("       "+(12-12)+" ");








workingbook.write(stream1);



stream1.close();
workingbook.close();


	}
	


}
