package com.Test;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Poi 
{

	public static void main(String[] args) throws IOException 
	{
		
	
		FileInputStream fi=new FileInputStream("‪‪E:\\1\\test.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Test");
		XSSFRow row=ws.getRow(0);
		XSSFCell cell=row.getCell(0);
		String data=cell.getStringCellValue();
		
		System.out.println(data);
		wb.close();

	}

}
