package ConditionsElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownloadFile {
	 public static void main(String[] args) {
		 String baseUrl = "http://demo.guru99.com/test/block.html";					
			System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get(baseUrl);
	        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("C:/Users/unit2a/Desktop");

	        // check the "I accept the terms of service" check box
	        driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
	        driver.findElement(By.name("send")).click();
	        }
}
