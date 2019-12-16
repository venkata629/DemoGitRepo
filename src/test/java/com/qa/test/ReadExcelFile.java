package com.qa.test;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//File src = new File("C:\\Users\\ChagantiRamam\\Desktop\\Selenium_Docs\\TestData.xlsx");
		FileInputStream ip = new FileInputStream("C:\\Users\\ChagantiRamam\\Desktop\\Selenium_Docs\\TestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Data from Excel sheet1:"+data0);

	}

}
