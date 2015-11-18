package viseven.UserEvents;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import viseven.Helper;
import viseven.LoginHelper;

public class UserEventContactUnassigne {
	private WebDriver driver;
	private Helper helper;

	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		helper = new Helper(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testEventContactUnassigne() throws Exception {
		try {
			driver.get(LoginHelper.baseUrl + "/Account/Login?ReturnUrl=%2f");
			LoginHelper.login(driver);
			Thread.sleep(2000);
			driver.findElement(By.id("tileUserEventModule")).click();
			Thread.sleep(2000);
			helper.findByCssAndLinkText("a[href*=\"UserEvent\"]", "autotest").click();
			Thread.sleep(1000);
			driver.findElement(By.name("Поиск")).click();
		    driver.findElement(By.name("Поиск")).clear();
		    driver.findElement(By.name("Поиск")).sendKeys("AutoName");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("td > label.input-control.checkbox > span.helper")).click();
			driver.findElement(By.id("unassignButton")).click();
			Thread.sleep(5000);
		} catch (InterruptedException x) {
		}
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}

