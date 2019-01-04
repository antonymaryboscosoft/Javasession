package basicselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicgooglesearch {
	public static void main(String[] args ){
		System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
		
		//1.create own xpath
		//2.when enter list ->enter findelements (to list all element
		//3.descendent use to list all child element
		 List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs-c']"));
		System.out.println("total number of search box:::===>"+list.size());
	
	for(int i=0; i<list.size(); i++){
		System.out.println(list.get(i).getText()); //to get all text
		if(list.get(i).getText().contains("java tutorials")){
			list.get(i).click();
			break;
		}
	}
	}
	}

