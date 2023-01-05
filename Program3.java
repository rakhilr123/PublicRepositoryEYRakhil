package com.selenium.programs2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\MH389ED\\OneDrive - EY\\Desktop\\Projects\\Training\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching the url
        driver.get("https://www.google.com/");
        
        driver.findElement(By.name("q")).sendKeys("amazon");
        driver.findElement(By.xpath("//img[@class='lnXdpd']")).click();
        		
        boolean display = driver.findElement(By.name("btnK")).isDisplayed();
        boolean enable = driver.findElement(By.name("btnK")).isEnabled();
        if(display==true && enable ==true)
        {
        	 driver.findElement(By.name("btnK")).click();
             
        }
        
    	String title= driver.getTitle();
	 	System.out.println(title);;
	 	String curr_url= driver.getCurrentUrl();
	 	System.out.println(curr_url);
	 	if(title=="Google" )
	 	{
	 		System.out.println("Title of the page is "+title+ " and equal to google");
	 	}
	 	else
	 	{
	 		System.out.println("Title of the page is "+title+ " and not equal to google");
	 	}  
       
        driver.close();
        
        
	}

}
