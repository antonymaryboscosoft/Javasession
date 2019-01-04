package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DifferentLocatoe {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterinfo");
    driver.manage().window().maximize();
    
    //1.To Xpath(address of the particular elements)
    //i)absolute xpath not used(ex:/html/body/div[1]/div[5]/div[2]/a) 
    //ii)only relative xpathe can be use(ex://*[@id='firstname'])
    driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("antony");
    driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("mary");
    
     // 2.To Id 
    driver.findElement(By.id("address1")).sendKeys("659,donbosco,yelagiri");
    driver.findElement(By.id("address1")).sendKeys("700,donbosco,yelagiri");
    
    Thread.sleep(2000);
    //3.To Name
    driver.findElement(By.name("pass")).sendKeys("Anto@123");
    driver.findElement(By.name("rpass")).sendKeys("Anto@123");
    
    //4.Link text(only for links)
    //click on signin link -> xpath -> /html/body/div[1]/div[5]/div[2]/a  
    // this xpath not recommented bcz some times position can be changed any where.
     driver.findElement(By.linkText("Sign in")).click();
    
    //5.partialLinkTest (not useful) it can be use longlinktext 
     //we can't enter full text line.
    driver.findElement(By.partialLinkText("Want to register as")).click();
     
     //6.css selector.
    //two way to create
    //If id is there.. put #(id)
    //if class is ther .... put .(class)
     driver.findElement(By.cssSelector("#dayphone4")).sendKeys("ABC");
     
     //7.class name (not use bcz class name should be duplicate)
     driver.findElement(By.className("ancAsb")).click();// singin button
	
     //Handle dropdown
     Select select= new Select(driver.findElement(By.id("state"))); 
     select.selectByVisibleText("California");
	}
	}