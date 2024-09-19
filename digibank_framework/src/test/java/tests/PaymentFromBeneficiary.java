package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class PaymentFromBeneficiary extends BaseClass{

	public void Test1() throws InterruptedException{
		
		WebElement login = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
        login.click();
        Thread.sleep(1000);

        WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username\"]"));
        username.sendKeys("AbdulHaseeb11");

        WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]"));
        password.sendKeys("1234@!a5678");

        WebElement loginbtn = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
        loginbtn.click();
        Thread.sleep(1000);
        
        WebElement beneficiary = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Beneficiary\"]"));
        beneficiary.click();
        Thread.sleep(1000);
		
        WebElement openBeneficiary = driver.findElement(By.xpath("//android.widget.TextView[@text=\"5GD1uY8wW9TahlxSzpVlcPNVS40uX2XpU+wP3xR4Hw6eNKW6RV0bp4vctikRfEa0xYyCehGLXRtoUwU=\"]"));
        openBeneficiary.click();
        Thread.sleep(1000);
        
        WebElement enterAmount = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\"]"));
        enterAmount.sendKeys("500");
       
        
//        WebElement enterAmount = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\"]"));
//        String amount = "1000"; // Example amount
//        enterAmount.sendKeys(amount);
//
//        String enteredAmount = enterAmount.getText();
//        if (isAmountValid(enteredAmount)) {
//            System.out.println("Amount " + enteredAmount + " is within the valid range.");
//        } else {
//            System.out.println("Amount " + enteredAmount + " is out of the valid range.");
//            
//        }
        
        WebElement scrollViewForBtn = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup"));
        
        WebElement selectPurposeDD = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]"));
        selectPurposeDD.click();
        
        WebElement selectItem = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Transfer to own account\"]"));
        selectItem.click();
        
        WebElement nextBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Next\"]"));
        nextBtn.click();
        
        
//        OPTION 1
//        // Define screen dimensions
//        int screenHeight = driver.manage().window().getSize().getHeight();
//        int screenWidth = driver.manage().window().getSize().getWidth();
//
//        // Define swipe points
//        PointOption startPoint = new PointOption().withCoordinates(screenWidth / 2, screenHeight * 3 / 4);
//        PointOption endPoint = new PointOption().withCoordinates(screenWidth / 2, screenHeight / 4);
//
//        // Perform the swipe action
//        TouchAction action = new TouchAction(driver);
//        action.press(startPoint)
//              .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//              .moveTo(endPoint)
//              .release()
//              .perform();
        
        
//        OPTION 2
//        WebElement scrollViewForBtn2 = driver.findElementByAndroidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Desired Button Text\"))");
        
        
        
        WebElement scrollViewForBtn2 = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup"));

        WebElement payNowBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Pay Now\"]"));
        payNowBtn.click();
       
	}
       
//        public static boolean isAmountValid(String amountStr) {
//            try {
//                double amount = Double.parseDouble(amountStr.replace(",", ""));
//                return amount >= 1 && amount <= 5000000;
//            } catch (NumberFormatException e) {
//                return false;
//            }	
//        }
        
  
		
}
