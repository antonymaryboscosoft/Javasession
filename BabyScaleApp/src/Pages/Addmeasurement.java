package Pages;

import org.openqa.selenium.By;

import Basepackage.AppOpen;

public class Addmeasurement extends AppOpen{

	public void Addreading() throws InterruptedException{
	//Add Measurement
		
		driver.findElement(By.id("com.ozeri.babyscale:id/btn_add_measurement")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.ozeri.babyscale:id/rbManualBtn")).click();
		Thread.sleep(1000);
		
		//Select date
		driver.findElementById("com.ozeri.babyscale:id/txtMeasurementDate").click();
		Thread.sleep(1000);
		
		driver.findElementById("android:id/date_picker_header_year").click();
		Thread.sleep(1000);
		driver.findElementById("android:id/text1").click();
		Thread.sleep(1000);
		driver.findElementById("android:id/next").click();
		Thread.sleep(1000);
		
		/*List<WebElement> pick = driver.findElementsById("android:id/month_view");           
		Thread.sleep(2000);
		System.out.println(pick);
	    //pick.get(0).sendKeys("2018");
	   // pick.get(1).sendKeys("Mar");
	    pick.get(19).sendKeys("20");
		System.out.println("Date Pick Sucess");*/
		
		driver.findElementByXPath("//android.view.View[@index='20']").sendKeys("21");
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);
		
		
		
		//Enter value
		driver.findElementById("com.ozeri.babyscale:id/edtWeight1").sendKeys("9");
		Thread.sleep(1000);
		
		driver.findElementById("com.ozeri.babyscale:id/edtHeight2").sendKeys("65");
		Thread.sleep(1000);
		
		driver.findElementById("com.ozeri.babyscale:id/edtHead2").sendKeys("39");
		Thread.sleep(1000);
		
		//save value
		driver.findElementById("com.ozeri.babyscale:id/img_tick").click();
		driver.findElementById("android:id/button1").click();
		Thread.sleep(1000);
	}
}
