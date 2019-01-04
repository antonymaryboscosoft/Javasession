package basicselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {
// dynamic xpath using diff approaches
	
	public static void main(String[] args ){
	System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 
	 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 
	 driver.get("https://www.ebay.com/");
	
	 //create own xpath diff method
	 // 1.method
	 //html tag -> input, then [] ,properties -> class 
	 driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("selenium");;
	 
	 //cotains we should not use = symbol
	 //2.method
	 driver.findElement(By.xpath("//input[contains(@class, 'gh-tb ui-autocomplete-input')]")).sendKeys("java");
	
	 // 3.method
	 driver.findElement(By.xpath("//input[starts-with(@class, 'gh-tb ui-autocomplete-input')]")).sendKeys("java");
	 //4. links cutom xpath all links are represented by <a> html tag.
	 //driver.findElement(By.xpath("//a[cotains(text(),'Sign in')]")).click();
	 driver.findElement(By.linkText("Sign in")).click();
	 
	 //5. get total count of the link
	 List <WebElement> linklist= driver.findElements(By.tagName("a"));
	 System.out.println(linklist.size());
	//6.get text of all links in the page
	 for (int i=0; i<linklist.size(); i++){
		 String linkText = linklist.get(i).getText();
		 System.out.println(linkText);
		 //driver.quit();
 

	 }
	 
	}
}
