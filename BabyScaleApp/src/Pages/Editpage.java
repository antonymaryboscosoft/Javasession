package Pages;

import io.appium.java_client.TouchAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import Basepackage.AppOpen;

public class Editpage extends AppOpen{
	 Dimension size; 

	 public void editPage() throws InterruptedException{
	 		
	 		driver.findElementById("com.ozeri.babyscale:id/nav_grth").click();
	 		Thread.sleep(2000);
	 	//Scroll the page

	 		WebElement fromElement=driver.findElementById("com.ozeri.babyscale:id/chartTab");
	 		WebElement toElement= driver.findElement(By.xpath("//android.widget.TextView[@text='List']"));
	 		TouchAction tAction=new TouchAction(driver);
	 		tAction.press(fromElement).moveTo(toElement).release().perform();

	 		
	 		WebElement fromElement1=driver.findElement(By.xpath("//android.widget.LinearLayout[ @index='0']"));
	 		WebElement toElement1= driver.findElement(By.xpath("//android.widget.TextView[@text='Graph']"));
	 		TouchAction tAction1=new TouchAction(driver);
	 		tAction1.press(fromElement1).moveTo(toElement1).release().perform();

	 		
	 		
	 		
	 		
	 		
	 		//Scroll the page right to left

	 		size = driver.manage().window().getSize();
	 		  System.out.println(size);
	 		//Find start x point which is at right side of screen.
	 		  int startx = (int) (size.width * 0.70);	
	 		  
	 		//Find endx point which is a t left side of screen.
	 		  int endx = (int) (size.width * 0.30);
	 		//Find vertical point where you wants to swipe. It is in middle of screen height.
	 		  int starty = size.height / 2;
	 		  System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);
	 		
	 		  //Swipe from Right to Left.
	 		  driver.swipe(startx, starty, endx, starty, 3000);
	 		  Thread.sleep(2000);
	 		  
	 		  driver.findElementById("com.ozeri.babyscale:id/txtEdit").click();
	 			Thread.sleep(1000);
	 			
	 			
	 		//Enter weight
	 			
	 			driver.findElementById("com.ozeri.babyscale:id/edtWeight1").clear();
	 			driver.findElementById("com.ozeri.babyscale:id/edtWeight1").sendKeys("15");
	 			Thread.sleep(1000);
	 		
	 		//Enter Height
	 			driver.findElementById("com.ozeri.babyscale:id/edtHeight2").clear();
	 			driver.findElementById("com.ozeri.babyscale:id/edtHeight2").sendKeys("65");
	 			Thread.sleep(1000);
	 		
	 		//Enter Head size
	 			driver.findElementById("com.ozeri.babyscale:id/edtHead2").clear();
	 			driver.findElementById("com.ozeri.babyscale:id/edtHead2").sendKeys("43");
	 			Thread.sleep(1000);
	 		
	 		//save value
	 			driver.findElementById("com.ozeri.babyscale:id/img_tick").click();
	 			driver.findElementById("android:id/button1").click();
	 		
	 }
}
