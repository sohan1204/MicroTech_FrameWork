package stepDefinition;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

import static org.junit.Assert.assertEquals;

//used whole Employee login functionality after HomePage
public class EmployeeLoginFunctionality extends Base {


    @Given("I See Landing Page")
    public void i_see_landing_page() {
        navigate("http://it.microtechlimited.com");
    }

    @Then("I Press on Login Menu")
    public void i_press_on_login_menu() {
        click(LandingPage.menuLoginMenu);
    }

    @Then("I click Employee Login Menu")
    public void i_click_employee_login_menu() {
        click(EmployeeLoginPage.munuEmployeeLogin);
    }
    @Then("I Enter Employee User Id")
    public void i_enter_employee_user_id() {
       sendKeys(EmployeeLoginPage.textEmployeeId,"testpilot@gmail.com");
    }
    @Then("I Enter Employee Password")
    public void i_enter_employee_password() {
       sendKeys(EmployeeLoginPage.textEmployeePassword,"1234");
    }
    @When("I click on Employee Login Button")
    public void i_click_on_employee_login_button() {
     click(EmployeeLoginPage.employeeLoginButton);
    }


    @Then("Verify I am In Employee Home Page")
    public void verify_i_am_in_employee_home_page() {
        String welcomeMsg = getText(EmployeeHomePage.welcomeMsg);
        assertEquals("Welcome Test", welcomeMsg);


    }
}
