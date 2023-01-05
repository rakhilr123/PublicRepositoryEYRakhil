package com.selenium.programs2;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program1 {

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
	     
	    
				XSSFSheet sheet3 = workbook.createSheet("Create_Sheet");
				  XSSFRow rowdata2 = sheet3.createRow((short)0);
				  rowdata2.createCell(0).setCellValue("Employee ID");  
				  rowdata2.createCell(1).setCellValue("Employee Name");  
				  rowdata2.createCell(2).setCellValue("Employee Role");
			
	      XSSFRow rowdata3 = sheet3.createRow((short)1);  
	      //inserting data in the first row  
	      rowdata3.createCell(0).setCellValue("10000");  
	      rowdata3.createCell(1).setCellValue("Rakhil R");  
	      rowdata3.createCell(2).setCellValue("QA Lead");  	      
	      //creating the 2nd row  
	      XSSFRow rowdata4 = sheet3.createRow((short)2);  
	      //inserting data in the second row  
	      rowdata4.createCell(0).setCellValue("20000");  
	      rowdata4.createCell(1).setCellValue("Mohab R");  
	      rowdata4.createCell(2).setCellValue("QA");    
	      	
	      FileOutputStream fileOut = new FileOutputStream("C:\\Users\\MH389ED\\OneDrive - EY\\Desktop\\Projects\\Training\\SeleniumProgram\\Screenshots\\ReadData.xlsx");  
	      workbook.write(fileOut);  
	     	      
	         //prints the message on the console  
	      System.out.println("Sheet created successfully.");  
	      }   
	    

	      	  


}
