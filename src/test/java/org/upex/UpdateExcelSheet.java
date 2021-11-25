package org.upex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateExcelSheet {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\vairamuthu\\eclipse-workspace\\Sample\\WorkBook\\WB-2.xlsx");

		FileInputStream fi = new FileInputStream(f);
		Workbook ws = new XSSFWorkbook(fi);

		Sheet sh = ws.getSheet("java");
		Row r = sh.getRow(0);
		Cell cel = r.getCell(0);
		String scv = cel.getStringCellValue();
		if (scv.startsWith("vairamuthu")) {
			cel.setCellValue("Divakar");

		} else {
             cel.setCellValue("Vairam");
		}

		FileOutputStream fos = new FileOutputStream(f);
		ws.write(fos);
		System.out.println(fos);
		System.out.println("done");
	}
}
