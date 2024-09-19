package tests;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass extends ExtentReportsDemo {
	
	AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:deviceName", "Redmi 10C");
		cap.setCapability("appium:automationName", "UiAutomator2");
		
//		cap.setCapability("appium:newCommandTimeout", 60);
		
		cap.setCapability("appium:app", "C:\\Users\\ICA-4024\\Desktop\\APPIUM\\AppiumAPK\\application-34ad0f4f-9ad9-42c3-bd47-58c20c58c81a.apk");
//		cap.setCapability("browserName", "Chrome");
//		cap.setCapability("appium:chromedriverExecutable", "C:\\Users\\ICA-4024\\Desktop\\DB_APPIUM_FW\\digibank_framework\\drivers\\chromedriver-win64\\chromedriver.exe");
		
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
		driver = new AndroidDriver(url, cap);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		}
	
}
