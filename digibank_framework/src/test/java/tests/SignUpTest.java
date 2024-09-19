package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Jdbc.Jdbc;

public class SignUpTest extends BaseClass{

	@Test
	public void test1() throws InterruptedException {
	    	
    		WebElement getStarted = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get Started\"]"));
    		getStarted.click();

            Thread.sleep(1000);

            WebElement cnic = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your CNIC\"]"));
            cnic.sendKeys("4210151824677");

            WebElement mobNum = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your mobile number\"]"));
            mobNum.sendKeys("03352962177");
            
            WebElement accNum = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter 14 digits Acc No.\"]"));
            accNum.sendKeys("zanbeel-ab2a930");

            WebElement next = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Next\"]"));
            next.click();

            Thread.sleep(1000);   
            
            WebElement next2 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Next\"]"));
            next2.click();	
            
//            Jdbc.JdbcConnection();
            
            String otp = Jdbc.JdbcConnection();
            String[] otpDigits = OTPUtil.extractDigits(otp);
            
            if(otpDigits.length == 4) {
            
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
            }
            
            else {
            	System.out.println("Invalid OTP length");
            }
            
            
            WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter a username\"]"));
            username.sendKeys("Basit890");

            WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter a password\"]"));
            password.sendKeys("Oop@34567");
            
            WebElement confirmPassword = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Confirm your password\"]"));
            confirmPassword.sendKeys("Oop@34567");
            
            WebElement createBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Create\"]"));
            createBtn.click();
            
            WebElement text = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]"));
            String actualText = text.getText();
            String expectedText = "Customer Registered successfully";
            Assert.assertEquals(actualText, expectedText);
            Thread.sleep(2000);
                     
	}

}
