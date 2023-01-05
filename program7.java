package com.selenium.programs2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program7 {

	

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\MH389ED\\OneDrive - EY\\Desktop\\Projects\\Training\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
				
				 
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.lambdatest.com/blog/handling-browser-tabs-with-selenium/");
				Thread.sleep(5000);
				
				driver.findElement(By.linkText("login form with Selenium automation testing")).click();
				
				/*
				driver.findElement(By.xpath("//a[@href='https://www.lambdatest.com/blog/selenium-java-tutorial-how-to-test-login-process/']")).click();
				driver.findElement(By.xpath("//a[@href='https://www.lambdatest.com/blog/screenshots-with-selenium-webdriver/']")).click();
				driver.findElement(By.xpath("//a[@href='https://www.lambdatest.com/blog/locators-in-selenium-webdriver-with-examples/']")).click();
				driver.findElement(By.xpath("//a[@href='https://www.lambdatest.com/blog/selenium-grid-setup-tutorial/']")).click();
				*/
				ArrayList windows_count = new ArrayList(driver.getWindowHandles());
		        System.out.println("The Total no. windows opened : "+windows_count.size());
		        
		        for(int i = 0; i<windows_count.size();i++) {
		            System.out.println(driver.switchTo().window((String)windows_count.get(i)).getTitle());

		            

		        }

			}

		

}
