package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtable {

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
		
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[8]/td[2]/a
		
		String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath = "]/td[2]/a";
		 Thread.sleep(3000);
		for(int i=4; i<=8; i++){
			 String name= driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			 Thread.sleep(3000);
			 System.out.println(name);	 		
			 //*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a
//			 select check box method 1:
			 if(name.contains( "jency r")){ //click 6
				 driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[2]/a")).click();
//				 select check box method 2:
//				 driver.findElement(By.xpath("//a[contains(text(),'jency r')]/parent::td//parend-sibling::td//input[@name='contact_id']")).click();
			 }
			
		}

	}
}
