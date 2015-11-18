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

public class UserEventsAdd {
	private WebDriver driver;
	private Helper helper;

	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		helper = new Helper(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUserEventsAdd() throws Exception {
		try {
			driver.get(LoginHelper.baseUrl + "/Account/Login?ReturnUrl=%2f");
			LoginHelper.login(driver);
			Thread.sleep(2000);
			driver.findElement(By.id("tileUserEventModule")).click();
			driver.findElement(By.linkText("Добавить новый")).click();
			driver.findElement(By.id("Name")).clear();
			driver.findElement(By.id("Name")).sendKeys("autotest");
			new Select(driver.findElement(By.id("TypeId"))).selectByVisibleText("autotest");
		    driver.findElement(By.id("Duration")).click();
		    driver.findElement(By.id("Duration")).clear();
		    driver.findElement(By.id("Duration")).sendKeys("3");
		    driver.findElement(By.id("Date")).clear();
		    driver.findElement(By.id("Date")).sendKeys("28.01.2015");
		    driver.findElement(By.cssSelector("input.button.bg-color-visBlueDark")).click();
		    Thread.sleep(3000);
		    helper.findByCssAndLinkText("a[href*=\"UserEvent\"]", "autotest").click();
		    Thread.sleep(3000);
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
