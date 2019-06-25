package com.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils
{

	XSSFWorkbook wb;
	XSSFSheet ws;
	
	public XLUtils(String path) 
	{
		try 
		{
			File src=new File(path);
			FileInputStream fi=new FileInputStream(src);
			wb=new XSSFWorkbook(fi);
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public String getData(int sheetnumber, int row, int cell)
	{
		ws=wb.getSheetAt(sheetnumber);
		String data=ws.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	
	
	
}
