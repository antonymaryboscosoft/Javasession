package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Handlessbrowsertesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(2000);
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys("antonymary");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("antonymary");
		
		WebElement Signup_button = driver.findElement(By.xpath("//input[@type='submit']"));
		Signup_button.click();
		Thread.sleep(2000);
		
		System.out.println("After login title is = " +driver.getTitle());
		
		

	}
}
