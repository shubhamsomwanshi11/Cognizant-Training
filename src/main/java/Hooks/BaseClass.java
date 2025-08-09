package Hooks;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import genericLibrary.ReadingDataPropertyFile;
import genericLibrary.WebDriverUtilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	public WebDriverUtilities utilities = new WebDriverUtilities();
	public static WebDriver driver;
	public ReadingDataPropertyFile propertyFile = new ReadingDataPropertyFile();
	@Before
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(propertyFile.getData("baseUrl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}
}
