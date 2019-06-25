package com.Test;

import java.io.IOException;

import com.Utils.XLUtils;

public class TestXL
{

	public static void main(String[] args) throws IOException 
	{
		
		XLUtils xl=new XLUtils();
		int count=xl.getRowCount("‪F:\\test.xlsx", "Test");
		System.out.println(count);

	}

}
