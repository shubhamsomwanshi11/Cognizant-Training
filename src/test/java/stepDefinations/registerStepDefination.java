package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Hooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;

public class registerStepDefination {

    WebDriver driver = BaseClass.driver;
    RegisterPage registerPage = new RegisterPage(driver);

    @Given("the user is on the registration page")
    public void the_user_is_on_the_registration_page() {
        registerPage.clickLogin();
    }

    @When("the user enters first name {string}")
    public void the_user_enters_first_name(String fname) {
        registerPage.setFirstName(fname);
    }

    @When("the user enters last name {string}")
    public void the_user_enters_last_name(String lname) {
        registerPage.setLastName(lname);
    }

    @When("the user enters date of birth {string}")
    public void the_user_enters_date_of_birth(String dob) {
        registerPage.setDOB(dob);
    }

    @When("the user enters email {string}")
    public void the_user_enters_email(String email) {
        registerPage.setEmail(email);
    }

    @When("the user enters phone number {string}")
    public void the_user_enters_phone_number(String phone) {
        registerPage.setPhone(phone);
    }

    @When("the user selects gender {string}")
    public void the_user_selects_gender(String gender) {
        registerPage.selectGender(gender);
    }

    @When("the user enters password {string}")
    public void the_user_enters_password(String password) {
        registerPage.setPassword(password);
    }

    @When("the user clicks the register button")
    public void the_user_clicks_the_register_button() {
        registerPage.clickSubmit();
    }

    @Then("the user should be redirected to the account\\/dashboard page")
    public void the_user_should_be_redirected_to_the_account_dashboard_page() {
        Assert.assertTrue(driver.getCurrentUrl().contains("/dashboard") || driver.getCurrentUrl().contains("/account"),
                "User is not redirected to the dashboard.");
    }

    @When("the user leaves email and password fields empty")
    public void the_user_leaves_email_and_password_fields_empty() {
        registerPage.setEmail("");
        registerPage.setPassword("");
    }

    @Then("the user should stay on the registration page")
    public void the_user_should_stay_on_the_registration_page() {
        Assert.assertTrue(driver.getCurrentUrl().contains("/register"), "User was not supposed to leave registration page.");
    }

    @When("the user leaves gender unselected")
    public void the_user_leaves_gender_unselected() {
//done send anything it will be empty 
    }
}