package tests;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.MobileBy;


public class AddBeneficieryTest extends BaseClass{

	@Test
	public void test1() throws InterruptedException {
		
		WebElement login = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
        login.click();
        Thread.sleep(1000);

        WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username\"]"));
        username.sendKeys("jk399999");

        WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]"));
        password.sendKeys("sassayyyyy");

        WebElement loginbtn = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
        loginbtn.click();
        Thread.sleep(1000);
        
        WebElement beneficiary = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Beneficiary\"]"));
        beneficiary.click();
        Thread.sleep(1000);
        
        WebElement addNewBene= driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Add New Beneficiary\"]"));
        addNewBene.click();
        Thread.sleep(1000);
        
        WebElement digiBank= driver.findElement(By.xpath("//android.widget.TextView[@text=\"DIGI Bank\"]"));
        digiBank.click();
        Thread.sleep(1000);
        
        WebElement accNum_IBAN = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\"]"));
        accNum_IBAN.sendKeys("zanbeel-551a876");
        
        WebElement addBtn= driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add\"]"));
        addBtn.click();
        Thread.sleep(1000);
        
        WebElement nickName = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your name here\"]"));
        nickName.sendKeys("abcbank");
        Thread.sleep(1000);
        
        //optional
        WebElement mobNum = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your mobile number\"]"));
        mobNum.sendKeys("92123456789");
        Thread.sleep(1000);
             
//        WebElement scrollToAddBtn = driver.findElement(By.xpath("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Add"));
//        scrollToAddBtn.click();
        
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//android.widget.TextView[@text=\"Add\"]")));
        
//        driver.findElement(By.id("//android.widget.TextView[@text=\"Add\"]")).click();
        
//        WebElement addBtn2 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add\"]"));
//        addBtn2.click();
//        Thread.sleep(1000);
        
//        WebElement successMessage = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]"));
//        String actualText = successMessage.getText();
//        String expectedText = "Beneficiary created successfully";
//        AssertJUnit.assertEquals(actualText, expectedText);
//        Thread.sleep(1000);
        
//        WebElement element =  driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup"));
//        element.scrollTo("Add");
//        WebElement scrollview= driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup"));
//        scrollview.sc();

     // Scroll until the element with text "ElementText" is visible
//        MobileElement element2 = (MobileElement) driver.findElement(
//        	    MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Add"));
//        	    
        	

        
        
     // Scroll to the "Add" button using UiScrollable
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" +
            "new UiSelector().text(\"Add\"))"));

        // After scrolling, find the "Add" button and click it
        driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")).click();

        
        
        
        
        
        
        
        
     // Try to find the ScrollView first
//        WebElement scrollView = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup"));
//        Thread.sleep(1000);
//        // Then find the specific button inside the ScrollView
//        WebElement addButton = scrollView.findElement(By.xpath("//android.widget.TextView[@text=\"Add\"]"));
//        addButton.click();
//        Thread.sleep(1000);

//        if (addBtn2.isDisplayed()) {
//            // Perform actions
//        	addBtn2.click();
//            String elementText = addBtn2.getText();
//            System.out.println("Text of the element: " + elementText);
//        } else {
//            System.out.println("Target element is not visible");
//        }
        		
	}
	
}
