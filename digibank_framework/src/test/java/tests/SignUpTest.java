package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Jdbc.Jdbc;

public class SignUpTest extends BaseClass{

	@Test
	public void test1() throws InterruptedException {
			
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement getStarted = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Get Started']")));
			getStarted.click();

		
		    	
//    		WebElement getStarted = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get Started\"]"));
//    		getStarted.click();

            Thread.sleep(1000);

            WebElement cnic = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your CNIC\"]"));
            cnic.sendKeys("1834569995234");

            WebElement mobNum = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your mobile number\"]"));
            mobNum.sendKeys("03168888889");
            
            WebElement accNum = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter 14 digits Acc No.\"]"));
            accNum.sendKeys("zanbeel-06d5615");

            WebElement next = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Next\"]"));
            next.click();

            Thread.sleep(1000);   
            
        	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10000));
			WebElement next2 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"Next\"]")));
			next2.click();

           
//	        WebElement next2 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Next\"]"));
//	        next2.click();	
          

           Thread.sleep(4000);   
           
	        
	        String otp = Jdbc.JdbcConnection();
	        System.out.println("Fetched OTP: " + otp); // For debugging
	        
	        
	        try {
	            Thread.sleep(3000); // Sleep for 3000 milliseconds (3 seconds)
	        } catch (InterruptedException e) {
	            e.printStackTrace(); // Handle interruption
	        }
	        

	        if (otp != null && otp.length() == 4) {
	            String[] otpDigits = OTPUtil.extractDigits(otp);
	            
	            // Now you can proceed to send keys to the OTP fields
	            WebElement otp1 = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[1]"));
	            otp1.sendKeys(otpDigits[0]);
	            WebElement otp2 = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[2]"));
	            otp2.sendKeys(otpDigits[1]);
	            WebElement otp3 = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[3]"));
	            otp3.sendKeys(otpDigits[2]);
	            WebElement otp4 = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[4]"));
	            otp4.sendKeys(otpDigits[3]);

	            WebElement verifyButton = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Verify\"]"));
	            verifyButton.click();
	        } else {
	            System.out.println("Invalid OTP fetched: " + otp);
	        }
	        Thread.sleep(1000);  
	        
	        WebElement verifyButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Verify\"]")));
	        verifyButton.click();

	       

            Thread.sleep(1000);  
	        
           
            WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id='text-input-outlined' and @text='Enter a username']")));
            username.sendKeys("javeria1234");


            WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter a password\"]"));
            password.sendKeys("javeria12");
            
            WebElement confirmPassword = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Confirm your password\"]"));
            confirmPassword.sendKeys("javeria12");
            
            WebElement createBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Create\"]"));
            createBtn.click();
            
            
            WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='android:id/message']")));
            String actualText = text.getText();
            String expectedText = "Customer Registered successfully";
            Assert.assertEquals(actualText, expectedText);

	}

}
