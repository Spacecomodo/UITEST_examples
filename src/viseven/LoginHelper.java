package viseven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHelper {
	public static String baseUrl = "http://xxxxx.feature.com.ua/";
	
	public static void login(WebDriver driver) {
		driver.findElement(By.id("UserName")).clear();
		driver.findElement(By.id("UserName")).sendKeys("xxxxxx@qapint.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("xxxxxx");
		driver.findElement(By.id("btnLogin")).click();
	}
}
