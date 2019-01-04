package calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

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
		
		String date = "20-December-2018";
		String dateArr[]= date.split("-"); //(20,december,2018)
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		Select select= new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		Select select1= new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		
		//*[@id='crmcalender']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id='crmcalender']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		//*[@id='crmcalender']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]
		
		String beforeXpath="//*[@id='crmcalender']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath = "]/td[";
		
		final int totalWeekDays = 7;
		//2-1 2-2 2-3 2-4 2-5 2-6 2-7
		//3-1 3-2 3-3 3-4 3-5 3-6 3-7
		boolean flag = false; //if the value not 18
		for (int rowNum=2; rowNum<=7; rowNum++){
			for(int colNum=1; colNum<=totalWeekDays; colNum++){
			String dayVal=	driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
			System.out.println(dayVal);
			if(dayVal.equals(day)){ // day = 18 
				driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();	
			flag = true; //if value is 18
				break ;
			}
			}
			if (flag){
				break ;
			}
		}
	}
}
