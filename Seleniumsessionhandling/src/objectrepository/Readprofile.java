package objectrepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Readprofile {
	static WebDriver driver;
// 1 . create config.properties file
	
	public static void main(String[] args) throws IOException {
		//we have to create obj to read the properties file
	Properties prop = new Properties();
	//creat obj of fileinputstram class
	FileInputStream ip = new FileInputStream("C:/Users/unit2a/Desktop/workspace/Seleniumsessionhandling/src/objectrepository/config.properties");
	//Prop use to load ip obj
	prop.load(ip);
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("age"));
	String url =prop.getProperty("URL");
	System.out.println(url);
	String browserName = (prop.getProperty("browser"));
	System.out.println(browserName);
	if(browserName.equals("chrome")){
	 System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
		 driver = new ChromeDriver();  
		driver.manage().window().maximize();
	
	}else if(browserName.equals("ff")){
		 System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");
			 driver = new FirefoxDriver(); 
	}else if(browserName.equals("IE")){
		 System.setProperty("webdriver.chrome.driver","E:\\anto\\seleniumchrom\\chromedriver.exe");
			 driver = new InternetExplorerDriver(); 
	}
 driver.get(url);

	driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
	driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
	driver.findElement(By.xpath(prop.getProperty("city_xpath"))).sendKeys(prop.getProperty("city"));
	
	}
}
