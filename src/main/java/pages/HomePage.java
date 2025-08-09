package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//li[@data-item-title='MEN']/a[@href='/collections/men']")
    private WebElement mensCollectionElement;

    @FindBy(xpath = "//li[@data-item-title='WOMEN']/a[@href='/collections/women']")
    private WebElement womenCollectionElement;

    @FindBy(xpath = "//li[@data-item-title='KIDS']/a[@href='/collections/kids']")
    private WebElement kidsCollectionElement;

    @FindBy(xpath = "//li[@data-item-title='FOOTWARE']/a[@href='/collections/footware']")
    private WebElement footwareCollectionElement;
    
    @FindBy(xpath = "//a[@href='/search'][1]")
    private WebElement searchElement;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickMensCollection() {
        mensCollectionElement.click();
    }

    public void clickWomenCollection() {
        womenCollectionElement.click();
    }

    public void clickKidsCollection() {
        kidsCollectionElement.click();
    }

    public void clickFootwareCollection() {
        footwareCollectionElement.click();
    }
    
    public void search(String query) {
    	searchElement.sendKeys(query);
    }
}
