package com.selenium.programs2;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 File File_path = new File("C:\\Users\\MH389ED\\OneDrive - EY\\Desktop\\Projects\\Training\\SeleniumProgram\\Screenshots\\ReadData.xlsx");
	 	 		
		FileInputStream inputstream = new FileInputStream(File_path);
	      XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
	      XSSFSheet sheet = workbook.getSheet("Names");
	     int row_count = sheet.getLastRowNum()-sheet.getFirstRowNum();
	     System.out.println("Printing the data from each row");
	     for(int i = 0; i<=row_count; i++) {

	         int cell_count = sheet.getRow(i).getLastCellNum();
	         System.out.print("Row ["+(i+1)+"] :");
	         
	         for(int j=0;j<cell_count;j++) {
	        	 
	             System.out.print(sheet.getRow(i).getCell(j).getStringCellValue());
	             System.out.print("   ");
	             
	    	         }
	         System.out.println("");
	        
	         
	     }
	     
	     System.out.println("");
	     System.out.println("Second Question Answers");
	        	 
	             System.out.println("Vaue at 4,2 : "+sheet.getRow(3).getCell(1).getStringCellValue());
	             System.out.println("Vaue at 8,1 : "+sheet.getRow(7).getCell(0).getStringCellValue()); 
	             System.out.println("Vaue at 7,3 : "+sheet.getRow(6).getCell(2).getStringCellValue()); 
	             
	         
	         
	         
	     

   

	}

}
