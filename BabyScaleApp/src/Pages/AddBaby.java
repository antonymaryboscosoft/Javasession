package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import io.appium.java_client.MobileElement;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import Basepackage.AppOpen;

public class AddBaby extends AppOpen{
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	FileInputStream fis;
	public void g() throws IOException {
	File src = new File ("C:/Users/unit2a/Desktop/Newfolder/workspace/AppiumAndroid/src/Xlfile/Datadriven1.xlsx");
	fis = new FileInputStream(src);	
	wb = new XSSFWorkbook(fis);
	sheet = wb.getSheetAt(0);
	}
	
	public void TestMethod() throws InterruptedException{

		MobileElement loginlink = (MobileElement) driver.findElement(By.className("android.widget.TextView"));
		loginlink.click();
		Thread.sleep(1000);

		
		driver.findElementById("com.ozeri.babyscale:id/btnLetsGo").click();
		driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
		driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
		driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
		driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
		driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
		driver.findElementById("com.ozeri.babyscale:id/btn_nxt").click();
		
		//1.Add  8 babies
		//1.enter name
	for(int rowCount1=2; rowCount1<=9; rowCount1++){
		String name=reader.getCellData("Addbabies", "Name", rowCount1);
		System.out.println("Name:"+name);
			
		driver.findElementByClassName("android.widget.EditText").sendKeys(name);
		Thread.sleep(1000);
		
		//2.enter date of birth
		driver.findElementById("com.ozeri.babyscale:id/txtDob").click();
		Thread.sleep(1000);
		
		//select year
		driver.findElementById("android:id/date_picker_header_year").click();
		Thread.sleep(1000);
		driver.findElementById("android:id/text1").click();
		Thread.sleep(1000);

	for (int j=1; j<=rowCount1; j++){
			driver.findElementById("android:id/next").click();
			Thread.sleep(1000);
	}
		
		driver.findElementByXPath("//android.view.View[@text ='20' and @index='19']").click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);
		
		//select gender
		driver.findElement(By.id("com.ozeri.babyscale:id/txt_gender")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.ozeri.babyscale:id/img_add")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);
		
	if (rowCount1==2){
			driver.findElement(By.id("com.ozeri.babyscale:id/smallLabel")).click();
			Thread.sleep(2000);
	}
	if (rowCount1<9){

		driver.findElement(By.id("com.ozeri.babyscale:id/fbtn_add")).click();
		Thread.sleep(2000);
	}
	}}
}
