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

public class TerritoryUserAssigne {
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
	public void testTerritoryUserAssigne() throws Exception {
		try {
			driver.get(LoginHelper.baseUrl + "/Account/Login?ReturnUrl=%2f");
			LoginHelper.login(driver);
			Thread.sleep(2000);
		    driver.findElement(By.id("tileTerritoryModule")).click();
		    driver.findElement(By.linkText("AutotestA")).click();
		    driver.findElement(By.linkText("Изменить")).click();
		    driver.findElement(By.linkText("Пользователи")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("assignButton_User")).click();
		    Thread.sleep(2000);
		    helper.fillTextFieldByCss("div.vs-dialog-common > #divRelatedListStatic > div.block-grid-search > div.input-control.text > input","autotest");
		    driver.findElement(By.cssSelector("div.vs-dialog-common > #divRelatedListStatic > div.block-grid-search > a.icon-search")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.cssSelector("input[id^=Checkbox_User_]")).click();
		    driver.findElement(By.id("btnOkDialog")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.linkText("autotest")).click();
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