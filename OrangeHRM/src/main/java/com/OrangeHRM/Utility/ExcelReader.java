package com.OrangeHRM.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	
	
	public static ArrayList<Object[]> getdata(String sheetname)
	{
		FileInputStream fis;
		XSSFWorkbook wb;
		String path="C:\\Users\\rohranja\\eclipse-workspace\\OrangeHRM\\TestData\\TestData.xlsx";
		ArrayList<Object[]> listData=new ArrayList<>();
		File file=new File(path);
		
		try 
		{
			
			fis=new FileInputStream(file);
			wb=new XSSFWorkbook(fis);
			XSSFSheet ws=wb.getSheet(sheetname);
			int rowcount=ws.getLastRowNum();
			for(int i=1;i<=rowcount;i++)
			{
				
				String username=ws.getRow(i).getCell(0).getStringCellValue();
				String password=ws.getRow(i).getCell(1).getStringCellValue();
				listData.add(new Object[] {username.trim(),password.trim()});
				
			}
			
			
		} catch (Exception e)
		{

			System.out.println("File Not Found :: " + e.getMessage());
			
		}
		
		return listData;
	}
	
	
	
	
	
}
