package com.selenium.programs2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class program4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MH389ED\\OneDrive - EY\\Desktop\\Projects\\Training\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");		
		 //driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();		  
		 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("RealMe 5 pro");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
        Thread.sleep(5000);
        ArrayList windows_count = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) windows_count.get(1));
             
        driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();    
        
        driver.findElement(By.id("ap_email")).sendKeys("9495089904");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Test@123");
        driver.findElement(By.id("continue")).click();       
         		
        
  

	}

}
