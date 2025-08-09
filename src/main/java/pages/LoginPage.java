package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//li[@class='login']/a[@href='/account/login']")
    private WebElement loginViewElement;

    @FindBy(xpath = "//div[@class='flex__']/a[@href='/account/login']")
    private WebElement loginButtonElement;

    @FindBy(xpath = "//input[@id='customer[email]']")
    private WebElement emailElement;

    @FindBy(xpath = "//input[@id='customer[password]']")
    private WebElement passwordElement;

    @FindBy(xpath = "//button[@type='submit' and @is='loader-button']")
    private WebElement submitButtonElement;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Clicks the login view icon or button (from homepage or menu)
    public void clickLoginView() {
        loginViewElement.click();
    }

    // Clicks the actual login button inside the login page
    public void clickLoginButton() {
        loginButtonElement.click();
    }

    // Enters email into the email input
    public void setEmail(String email) {
        emailElement.clear();
        emailElement.sendKeys(email);
    }

    // Enters password into the password input
    public void setPassword(String password) {
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }

    // Clicks the submit button to log in
    public void clickSubmit() {
        submitButtonElement.click();
    }

    // Complete login method (optional helper)
    public void login(String email, String password) {
        setEmail(email);
        setPassword(password);
        clickSubmit();
    }
}
