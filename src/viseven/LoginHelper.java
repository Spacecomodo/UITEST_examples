package viseven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHelper {
	public static String baseUrl = "http://viseven.feature.com.ua/";
	
	public static void login(WebDriver driver) {
		driver.findElement(By.id("UserName")).clear();
		driver.findElement(By.id("UserName")).sendKeys("art@qapint.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("pass4test");
		driver.findElement(By.id("btnLogin")).click();
	}
}
