package viseven.Territory;

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

public class TerritoryOrganizationUnassigne {
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
	public void testTerritoryOrganizationUnassigne() throws Exception {
		try {
			driver.get(LoginHelper.baseUrl + "/Account/Login?ReturnUrl=%2f");
			LoginHelper.login(driver);
			Thread.sleep(2000);
		    driver.findElement(By.cssSelector("#tileTerritoryModule > div.tile-content > img")).click();
		    driver.findElement(By.linkText("AutotestA")).click();
		    driver.findElement(By.linkText("Изменить")).click();
		    driver.findElement(By.linkText("Организации")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector("td > label.input-control.checkbox > span.helper")).click();
		    driver.findElement(By.id("unassignButton")).click();
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