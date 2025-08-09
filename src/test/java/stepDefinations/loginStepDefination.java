package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Hooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class loginStepDefination {

    WebDriver driver = BaseClass.driver;
    LoginPage loginPage = new LoginPage(driver);

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
       loginPage.clickLoginView();
    }

    @When("the user enters valid email {string}")
    public void the_user_enters_valid_email(String email) {
        loginPage.setEmail(email);
    }

    @When("the user enters valid password {string}")
    public void the_user_enters_valid_password(String password) {
        loginPage.setPassword(password);
    }

    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        loginPage.clickSubmit();
    }

    @Then("the user should be redirected to the account\\/dashboard page")
    public void the_user_should_be_redirected_to_the_account_dashboard_page() {
        // Adjust this as per your actual dashboard/account URL or some page indicator
        Assert.assertTrue(driver.getCurrentUrl().contains("/account") || driver.getCurrentUrl().contains("/dashboard"),
                "User is not redirected to the dashboard.");
    }

    @When("the user enters invalid password {string}")
    public void the_user_enters_invalid_password(String password) {
        loginPage.setPassword(password);
    }

    @Then("the user should stay on the login page")
    public void the_user_should_stay_on_the_login_page() {
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"), "User was not supposed to leave login page.");
    }

    @When("the user enters invalid email {string}")
    public void the_user_enters_invalid_email(String email) {
        loginPage.setEmail(email);
    }

    @When("the user leaves the email and password fields empty")
    public void the_user_leaves_the_email_and_password_fields_empty() {
        loginPage.setEmail("");
        loginPage.setPassword("");
    }

    @When("the user enters unregistered email {string}")
    public void the_user_enters_unregistered_email(String email) {
        loginPage.setEmail(email);
    }
}
