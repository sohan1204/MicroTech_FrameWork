package stepDefinition;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;

import static org.junit.Assert.assertEquals;

//used whole Customer login functionality after HomePage
public class CustomerLoginFunctionality extends Base {


    @Given("I am in Landing Page")
    public void i_am_in_landing_page() {
        navigate("http://it.microtechlimited.com");
    }

    @Then("I click on Login Menu")
    public void i_click_on_login_menu() throws InterruptedException {
        click(LandingPage.menuLoginMenu);
        Thread.sleep(2000);
    }

    @And("I click on Customer Login Menu")
    public void i_click_on_customer_login_menu() throws InterruptedException {
        click(EmployeeLoginPage.menuCustomerLogin);
        Thread.sleep(2000);
    }

    @And("I Enter User Id")
    public void i_enter_user_id() throws InterruptedException {
        sendKeys(CustomerLoginPage.customerUserId, "david@gmail.com");
        Thread.sleep(2000);
    }

    @And("I Enter User Password")
    public void i_enter_user_password() throws InterruptedException {
        sendKeys(CustomerLoginPage.customerUserPassword, "1234");
        Thread.sleep(2000);
    }

    @When("I click on Login Button")
    public void i_click_on_login_button() throws InterruptedException {
        click(CustomerLoginPage.buttonCustomerLogin);
        Thread.sleep(2000);
    }

    @Then("Verify I am In Customer Home Page")
    public void verify_i_am_in_customer_home_page() throws InterruptedException {
        String welcomeMsg = getText(CustomerHomePage.labelTextMassage);
        assertEquals("Welcome David", welcomeMsg);

        Thread.sleep(2000);
    }

    @And("I take a screen shot")
    public void I_take_a_screen_shot() throws Exception {
        takeScreenshot();
        attachScreenshotToAllure();
    }

}
