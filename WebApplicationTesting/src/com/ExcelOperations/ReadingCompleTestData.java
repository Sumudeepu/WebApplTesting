package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingCompleTestData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Sumudeepu\\Desktop\\TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		for(int i=0;i<=RowCount;i++) // Row
		{
			Row r=sheet.getRow(i);
			int ColCount=r.getLastCellNum();
		
			for(int k=0;k<ColCount;k++)// CEll
			{
				Cell c=r.getCell(k);
				String data=c.getStringCellValue();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		

	}

}
