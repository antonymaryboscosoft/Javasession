package CRUD;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty7.server.Server;

public class CRUDOperation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("antonymary");
		driver.findElement(By.name("password")).sendKeys("antonymary");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();	
		
		driver.findElement(By.linkText("New Contact")).click();
		
		// Enter the values
		Thread.sleep(2000);
		Select select = new  Select(driver.findElement(By.name("title")));
		select.selectByVisibleText("Miss");
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("alex");	
		driver.findElement(By.xpath("//*[@id='surname']")).sendKeys("Surya");	

		Thread.sleep(2000);
		Select select1 = new Select(driver.findElement(By.name("suffix")));
		select1.selectByVisibleText("MD");
		
		//click help
		driver.findElement(By.xpath("//*[@id='contactForm']/table/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[2]/input")).click();	

		//To closed Child window
			Set <String> set1 = driver.getWindowHandles();
			Iterator <String> w=set1.iterator();
			String child=w.next();
			driver.switchTo().window(child);
			
		// TO upload file
			driver.findElement(By.id("image_file")).click();
			WebElement uploadElement = driver.findElement(By.id("image_file"));

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("C:/Users/unit2a/Desktop/RUNNING.txt");

	        // check the "I accept the terms of service" check box
	        //driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
	       // driver.findElement(By.name("send")).click();
				
				
				
				
				
		
		driver.findElement(By.xpath("//*[@id='extendedSearchLayer']/table/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[2]/input")).sendKeys("Bosco");	
		driver.findElement(By.xpath("//*[@id='extendedSearchLayer']/table/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[2]/input")).sendKeys("peterantonymary@gmail.com");	
		driver.findElement(By.xpath("//*[@id='extendedSearchLayer']/table/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[2]/input")).sendKeys("peterantonymary@gmail.com");	

		
		Select select2 = new Select(driver.findElement(By.name("cs_address_type")));
		select2.selectByVisibleText("Billing");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//*[@id='extendedSearchLayer']/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td[2]/input")).click();	
		
		
		//driver.quit();
	}
	
}
