package pkg1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead
{
	
	public final void abc()
	{
		
	}
	public final void abc(int a)
	{
		
	}
	
	public static void main(String[] args) throws BiffException, IOException 
	{
	File f=new File("../Project_1/data.xls");	
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	int r=ws.getRows();
	int c=ws.getColumns();
	
	for(int i=0;i<r;i++)  // loop for rows
	{
		for(int j=0;j<c;j++) // loop for columns
		{
			Cell wc=ws.getCell(j, i);
			System.out.println(wc.getContents());
		}
	}
	
	}

}
