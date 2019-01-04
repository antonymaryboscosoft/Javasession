package Basepackage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

public class AppOpen {
	public static AppiumDriver driver;
	   
    
	public AppOpen() throws MalformedURLException {

		
		
		
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "TestOneAdb1");
	capabilities.setCapability(CapabilityType.PLATFORM,"Android");
	capabilities. setCapability("platformVersion","6.0");
	capabilities.setCapability("unicodeKeyboard", true);
	capabilities.setCapability("resetKeyboard", true);
	File file = new File("/Users/unit2a/Downloads", "app-debug (1).apk");
	capabilities.setCapability("app",file.getAbsolutePath());

	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	
}
}
