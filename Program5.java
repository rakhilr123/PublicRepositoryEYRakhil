package com.selenium.programs2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MH389ED\\OneDrive - EY\\Desktop\\Projects\\Training\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices/bse/bankex");		 	
		 //count the number of rows in the table in app.
	      List<WebElement> countrows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	      System.out.println("The number of Rows in the Table  :"+countrows.size()); 
	      String companyname = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[1]")).getText();
	      String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[3]")).getText();
	      	
	      System.out.println("Company Name = "+companyname);
	      System.out.println("Prev Close (Rs) = "+value);
	}

}
