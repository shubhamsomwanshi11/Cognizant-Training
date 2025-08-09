package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.WebDriverUtilities;

public class RegisterPage {

    @FindBy(xpath = "//li[@class='login']/a[@href='/account/login']")
    private WebElement loginButtonElement;

    @FindBy(xpath = "//div[@class='flex__']/a[@href='/account/register']")
    private WebElement signUpElement;

    @FindBy(xpath = "//input[@id='customer[first_name]']")
    private WebElement firstNameElement;

    @FindBy(xpath = "//input[@id='customer[last_name]']")
    private WebElement lastNameElement;

    @FindBy(xpath = "//input[@id='dob']")
    private WebElement dobElement;

    @FindBy(xpath = "//input[@id='customer[email]']")
    private WebElement emailElement;

    @FindBy(xpath = "//input[@id='phone']")
    private WebElement phoneElement;

    @FindBy(xpath = "//input[@id='customer[password]']")
    private WebElement passwordElement;

    @FindBy(xpath = "//select[@id='gender']")
    private WebElement genederElement;

    @FindBy(xpath = "//*[@id=\"submit-button\"]")
    private WebElement submitButtonElement;

    WebDriverUtilities utilities = new WebDriverUtilities();

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Action methods
    public void clickLogin() {
        loginButtonElement.click();
    }

    public void clickSignIn() {
        signUpElement.click();
    }

    public void setFirstName(String firstName) {
        firstNameElement.clear();
        firstNameElement.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        lastNameElement.clear();
        lastNameElement.sendKeys(lastName);
    }

    public void setDOB(String dob) {
        dobElement.clear();
        dobElement.sendKeys(dob);
    }

    public void setEmail(String email) {
        emailElement.clear();
        emailElement.sendKeys(email);
    }

    public void setPhone(String phone) {
        phoneElement.clear();
        phoneElement.sendKeys(phone);
    }

    public void setPassword(String password) {
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }

    public void selectGender(String gender) {
        utilities.dropDown(genederElement, gender);
    }

    public void clickSubmit() {
        submitButtonElement.click();
    }
}
