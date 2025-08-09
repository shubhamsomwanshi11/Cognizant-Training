package genericLibrary;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	public WebDriver getWebDriver() {
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	public void dropDown(WebElement dropdown,String text) {
		Select select = new Select(dropdown);
		select.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
	}
	
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}
	
	public void rightClick(WebDriver driver,WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}
	
	public void dragAndDrop(WebDriver driver, WebElement source,WebElement dest) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, dest);
	}
	
	public void sendValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public void switchToFrame(WebDriver driver,String id) {
		driver.switchTo().frame(id);
	}
	
	public void switchBack(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	
	public void scroll(WebDriver driver) {
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("window.scrollBy(0, 500);"); 
	}

	public void scrollTo(WebDriver driver, WebElement element) {
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
