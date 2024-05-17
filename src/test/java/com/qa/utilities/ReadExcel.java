package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String getCellValue(int rowNo, int cellNo)throws IOException {
		
		//open the file in the Read Mode
			
		File objfile=new File("C:\\Users\\Rizwan\\OneDrive\\Desktop\\MySeleniumSoftware\\TestData.xlsx");
		
		//Read the file
		
		FileInputStream objfis=new FileInputStream(objfile);
		
		//Read the Sheet from Book and then Read Cell from Row of Excel
		//Apache POI Classes
		
		Workbook objbook=new XSSFWorkbook(objfis);
		
		String cellText=objbook.getSheet("Sheet1").getRow(rowNo).getCell(cellNo).toString();
		
		System.out.println(cellText);
		
		return cellText;
		
		
		
		}

}
