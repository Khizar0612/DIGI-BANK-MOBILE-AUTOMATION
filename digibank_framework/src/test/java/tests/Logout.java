package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Logout extends BaseClass{
	
	@Test
	public void test1() {
		
		WebElement login = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
		login.click();
		
		WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username\"]"));
		username.sendKeys("AbdulHaseeb11");
		
		WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]"));
		password.sendKeys("1234@!a5678");
		
		WebElement loginbtn = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
        loginbtn.click();
		
		WebElement hamBurgerClick = driver.findElement(By.xpath("//android.widget.TextView[@text=\"\"]"));
		hamBurgerClick.click();
		
		WebElement logoutClick = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Logout\"]"));
		logoutClick.click();
		
	}

}
