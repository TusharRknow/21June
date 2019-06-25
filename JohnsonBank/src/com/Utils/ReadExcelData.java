package com.Utils;

public class ReadExcelData 
{

	public static void main(String[] args) 
	{
	
		XLUtils xl=new XLUtils("F:\\test.xlsx");
		System.out.println(xl.getData(0, 0, 0));

	}

}
