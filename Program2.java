package com.selenium.programs2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MH389ED\\OneDrive - EY\\Desktop\\Projects\\Training\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching the url
        driver.get("https://www.godaddy.com/en-in");
        driver.findElement(By.id("id-68aad88a-f732-425d-b4c3-d14407a0aa2a")).click();
        driver.findElement(By.xpath("//a[@href='https://sso.godaddy.com?realm=idp&app=dashboard.api&path=%2fvh-login-redirect&marketid=en-IN']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rakhilr963@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rakhil@123");
        boolean display = driver.findElement(By.id("submitBtn")).isDisplayed();
        boolean enable = driver.findElement(By.id("submitBtn")).isEnabled();
        if(display==true && enable ==true)
        {
        	 driver.findElement(By.id("submitBtn")).click();
        	 System.out.print("Sign In button is working");
             
        }
        else
        {
        	 System.out.print("Sign In button is not working");
        }
        
        Thread.sleep(3000);       
        driver.close();
        

	}

}
