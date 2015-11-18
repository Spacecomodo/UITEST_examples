package viseven.Territory;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import viseven.LoginHelper;

public class TerritoryABDel {
  private WebDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTerritoryABDel() throws Exception {
	driver.get(LoginHelper.baseUrl + "/Account/Login?ReturnUrl=%2f");
	LoginHelper.login(driver);
    try {
    	Thread.sleep(2000);
    } catch (InterruptedException x) {
    }
    driver.findElement(By.id("tileTerritoryModule")).click();
    driver.findElement(By.id("gridSearchKey")).click();
    driver.findElement(By.id("gridSearchKey")).clear();
    driver.findElement(By.id("gridSearchKey")).sendKeys("AutotestA");
    try {
    	Thread.sleep(2000);
    } catch (InterruptedException x) {
    }
    driver.findElement(By.linkText("AutotestA")).click();
    driver.findElement(By.id("buttonDeleteObject")).click();
    driver.findElement(By.cssSelector("form > input.button.bg-color-visBlueDark")).click();
    driver.findElement(By.id("gridSearchKey")).click();
    driver.findElement(By.id("gridSearchKey")).clear();
    driver.findElement(By.id("gridSearchKey")).sendKeys("AutotestB");
    try {
    	Thread.sleep(2000);
    } catch (InterruptedException x) {
    }
    driver.findElement(By.linkText("AutotestB")).click();
    driver.findElement(By.id("buttonDeleteObject")).click();
    driver.findElement(By.cssSelector("form > input.button.bg-color-visBlueDark")).click();
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