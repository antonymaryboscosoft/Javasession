package ConditionsElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayEdenabledSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/register/");
//		1.isDisplayed method for submit button
		 boolean b1=driver.findElement(By.id("submitButton")).isDisplayed(); 
//		 output true displayed
		 System.out.println(b1);
		 
//		2. is enabled method for submit button
		  boolean b2 =driver.findElement(By.id("submitButton")).isEnabled();
//		  output false displayed bcz not submit disable mode
		  System.out.println(b2);
		  
//		  3.is select  method  take i agree check
		  driver.findElement(By.name("agreeTerms")).click();
		  boolean b3 =driver.findElement(By.id("submitButton")).isEnabled();
//		  out put true
		  System.out.println(b3);
//		  3.Isselect method only applicable for checkbox,dropdown,radiobutton
		 
		 
		

	}
}
