package viseven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {
	private final WebDriver driver;
	public Helper(WebDriver driver) {
		this.driver = driver;
	}
	/*
	 */
	public WebElement findByCssAndLinkText(String css,String text) { //MarketingCycleProductScenarioDel, UserEventsEdit
		List<WebElement> links = driver.findElements(By.cssSelector(css));
		for (WebElement link : links) {
			if (text.equals(link.getText())) {
				return link;
			}
		}
		return null;
	}
	
	public void fillTextFieldByCss(String css,String text) { //TerritoryUserAssigne
		WebElement el = driver.findElement(By.cssSelector(css));
		//el.click();
		el.clear();
		el.sendKeys(text);
	}
}
