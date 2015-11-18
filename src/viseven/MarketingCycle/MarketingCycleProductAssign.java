package viseven.MarketingCycle;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import viseven.LoginHelper;
public class MarketingCycleProductAssign {
  private WebDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMarketingCycleProductAssign() throws Exception {
	driver.get(LoginHelper.baseUrl + "/Account/Login?ReturnUrl=%2f");
	LoginHelper.login(driver);
    try {
    	Thread.sleep(2000);
    } catch (InterruptedException x) {
    }
    driver.findElement(By.id("tileMarketingCycleModule")).click();
    driver.findElement(By.id("gridSearchKey")).click();
    driver.findElement(By.id("gridSearchKey")).clear();
    driver.findElement(By.id("gridSearchKey")).sendKeys("auto");
    driver.findElement(By.id("gridSearchKey")).submit();
    try {
    	Thread.sleep(2000);
    } catch (InterruptedException x) {
    }
    driver.findElement(By.linkText("autotest")).click();
    driver.findElement(By.id("Name")).click();
    driver.findElement(By.id("modifyButton")).click();
    try {
    	Thread.sleep(2000);
    } catch (InterruptedException x) {
    }
    driver.findElement(By.id("assignButton_PromotedProducts")).click();
    driver.findElement(By.cssSelector("div.vs-dialog-common > #divRelatedListStatic > div.block-grid-search > div.input-control.text > input[name=\"Поиск\"]")).click();
    driver.findElement(By.cssSelector("div.vs-dialog-common > #divRelatedListStatic > div.block-grid-search > div.input-control.text > input[name=\"Поиск\"]")).clear();
    driver.findElement(By.cssSelector("div.vs-dialog-common > #divRelatedListStatic > div.block-grid-search > div.input-control.text > input[name=\"Поиск\"]")).sendKeys("Autotest");
    try {
    	Thread.sleep(2000);
        } catch (InterruptedException x) {
        }
    driver.findElement(By.cssSelector("div.vs-dialog-common > #divRelatedListStatic > div.block-grid-search > a.icon-search")).click();
    try {
	Thread.sleep(2000);
    } catch (InterruptedException x) {
    }
    driver.findElement(By.cssSelector("td > label.input-control.checkbox > span.helper")).click();
    driver.findElement(By.id("btnOkDialog")).click();
    driver.findElement(By.xpath("(//a[contains(@href, '/')])[3]")).click();
    try {
    	Thread.sleep(2000);
        } catch (InterruptedException x) {
        }
    driver.findElement(By.linkText("Autotest")).click();
    try {
    	Thread.sleep(2000);
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