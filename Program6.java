package com.selenium.programs2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MH389ED\\OneDrive - EY\\Desktop\\Projects\\Training\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String Result = "Empty";
		
	     driver.get("https://demo.guru99.com/test/drag_drop.html");
	     Actions a = new Actions(driver);
	     WebElement drag_sorce1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	        WebElement drop_target2 = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[1]"));
	       
	        
	     a.dragAndDrop(drag_sorce1, drop_target2).build().perform();
	     //driver.findElement(By.xpath("//div[@id='bal3']")).getText();
	     Result = driver.findElement(By.xpath("//div[@id='bal3']")).getText();
	     
	     if(!(Result.contentEquals("Empty")))
	     System.out.println("Drag and Drop Passed : "+Result);
	     else
	    	 System.out.println("Drag and Drop Failed");
	     
	     //Refresh the page
	     
	     driver.navigate().refresh();
	     
	     /*
	     
	     driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html"); 
	     
	  // Locate the element C by By.xpath. 
	       WebElement ValueC = driver.findElement(By.xpath("//li[text()= 'C']")); 

	       Actions actions = new Actions(driver); 
	       actions.moveToElement(ValueC);
	       actions.clickAndHold().perform(); */
	       
	       
	    } 
	

}
