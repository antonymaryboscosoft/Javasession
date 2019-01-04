package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlighanddrowborder {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@1233");
//		own xpath creation
		WebElement loginBtn= driver.findElement(By.xpath("//input[@type='submit']"));
		flash(loginBtn,driver);//highlight the element
		Thread.sleep(5000);
		drowBorder(loginBtn,driver); //outterborder the element use to mark the defect.
		//generateAlert(driver,"this is on issues with login button");
		clickElemtByJS(loginBtn,driver); //use to click the elemt us javascript if pws is incorrect
		System.out.println(getTitleByJS(driver)); //get title using java script
		System.out.println(getPageInnerText(driver)); //get the page inner text
		
		//scrollPageDown(driver); //scroll the page
		
		WebElement forgotpwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]")); //scroll the until the find text
		scrollIntoView(forgotpwdLink, driver);
}
public static void flash(WebElement element, WebDriver driver){
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	String bgcolor = element.getCssValue("backgroundColor");
	for(int i=0; i<10; i++){
		changeColor("rgb(0,200,0)", element, driver);
		changeColor(bgcolor, element,driver);
	}
}
public static void changeColor(String color, WebElement element, WebDriver driver){
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].style.backgroundColor= '"+color+"'", element);
	try{
		Thread.sleep(20);
	}catch (InterruptedException e){
		
	}
}
public static void drowBorder(WebElement element, WebDriver driver){
	
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].style.border='3px solid red'", element);
}

public static void generateAlert(WebDriver driver, String message){
JavascriptExecutor js = ((JavascriptExecutor) driver);
js.executeScript("alert('"+message+"')"); 
	
}
public static void clickElemtByJS(WebElement element, WebDriver driver){ 
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].click();", element);
}
public static String getTitleByJS( WebDriver driver){ 
JavascriptExecutor js = ((JavascriptExecutor)driver);
 String title =js.executeScript("return document.title").toString();
 return title;
}
public static String getPageInnerText(WebDriver driver){
	JavascriptExecutor js= ((JavascriptExecutor )driver);
	String pagetext = js.executeScript("return document.documentElement.innerText;").toString();
	return pagetext;
}
public static void scrollPageDown(WebDriver driver){
	JavascriptExecutor js= ((JavascriptExecutor )driver);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
public  static void scrollIntoView(WebElement element, WebDriver driver){
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView(true);", element);
}
}
