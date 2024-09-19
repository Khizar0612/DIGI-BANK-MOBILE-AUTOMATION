package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginTest extends BaseClass{
	
	@Test(priority = 1)
	public void test1() throws InterruptedException {
		
		ExtentTest test1 = extent.createTest("Test1", "This is demo testcase");	
		
		test1.log(Status.INFO, "Test1 has started");
		
		WebElement login = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
        login.click();
		test1.log(Status.PASS, "Login Clicked");

        WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username\"]"));
        username.sendKeys("AbdulHaseeb11");
		test1.log(Status.PASS, "Username Entered");

        WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]"));
        password.sendKeys("1234@!a5678");
        test1.log(Status.PASS, "Password Entered");

        WebElement loginbtn = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
        loginbtn.click();

        Thread.sleep(1000);       
	}
        
        @Test
    	public void test2() throws InterruptedException {
    	
    		WebElement login = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
            login.click();

            Thread.sleep(1000);

            WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username\"]"));
            username.sendKeys("AbdulHaseeb101");

            WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]"));
            password.sendKeys("1234@!a5678");

            WebElement loginbtn = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
            loginbtn.click();

            Thread.sleep(1000);     
	}
        
        @Test
    	public void test3() throws InterruptedException {
    	
    		WebElement login = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
            login.click();

            Thread.sleep(1000);

            WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username\"]"));
            username.sendKeys("AbdulHaseeb11");

            WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]"));
            password.sendKeys("1020304@!a5678");

            WebElement loginbtn = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
            loginbtn.click();

            Thread.sleep(1000);
	}
        
        @Test
    	public void test4() throws InterruptedException {
    	
    		WebElement login = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
            login.click();

            Thread.sleep(1000);

            WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username\"]"));
            username.sendKeys("AbdulHaseeb101");

            WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]"));
            password.sendKeys("1020304@!a5678");

            WebElement loginbtn = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
            loginbtn.click();

            Thread.sleep(1000);     
	}
        
        @Test
    	public void test5() throws InterruptedException {
    	
    		WebElement login = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
            login.click();

            Thread.sleep(1000);

            WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username\"]"));
            username.sendKeys("AbdulHaseeb101");

            WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]"));
            password.sendKeys("");

            WebElement loginbtn = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
            loginbtn.click();

            Thread.sleep(1000);     
	}
        
        
        /*@Test
        public void testMultipleLoginAttempts() throws InterruptedException {
        	
        	WebElement lgn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
        	WebElement usernameField = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username\"]"));
        	WebElement passwordField = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]"));
        	WebElement loginButton = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
        	
            String[] incorrectCredentials = {"user1", "user2", "user3"};	
            for (String credentials : incorrectCredentials) {
            	lgn.click();
                usernameField.clear(); // Clear previous input
                passwordField.clear(); // Clear previous input
                usernameField.sendKeys(credentials);
                passwordField.sendKeys("wr0ongP0as0sw0or0d");
                loginButton.click();

                Thread.sleep(2000);    	
          }*/
}


		
