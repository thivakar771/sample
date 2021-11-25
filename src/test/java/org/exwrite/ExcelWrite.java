package org.exwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\vairamuthu\\eclipse-workspace\\Sample\\WorkBook\\WB-2.xlsx");
	
	Workbook book = new XSSFWorkbook();
	 Sheet sh = book.createSheet("java");
	 Row r = sh.createRow(0);
	 Cell cc1 = r.createCell(0);
	 Cell cc2 = r.createCell(1);
	 
	 cc1.setCellValue("Vairamuthu");
	 cc2.setCellValue("Divakar");
	 
	 FileOutputStream fos = new FileOutputStream(f);
	 book.write(fos);
	System.out.println("done");
}
}
