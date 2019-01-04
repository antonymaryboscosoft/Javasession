package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleVrification {
	@Test
	public void VerifyApplicationTitle(){
		System.setProperty("webdriver.chrome.driver","E:/anto/seleniumchrom/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com/");
		//Get the Actual Page Title
		//actualTitle= driver.getTitle();
		//String title = driver.getTitle(); // get title
		String my_title=driver.getTitle();
		System.out.println("This is "+my_title); //print the title
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		 /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
		 /*if (title.equals("google")){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }*/
		
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
		/*String expected_title="Selenium Webdriver Tutorial- Free Selenium Tutorial";
		//Assert.assertEquals(my_title, expected_title);
		Assert.assertTrue(my_title.contains("Selenium Webdriver Tutorials"));
		System.out.println("Test completed");*/
		
	}
}
