package pages;

import base.Base;
import org.openqa.selenium.By;

public class EmployeeLoginPage extends Base {

    //Locators
    public static By munuEmployeeLogin = By.partialLinkText("Employee");

    public static By menuCustomerLogin = By.partialLinkText("Customer");
    public static By textEmployeeId = By.name("mailuid");
    public static By textEmployeePassword = By.name("pwd");

    public static By employeeLoginButton = By.name("login-submit");



    //Actions
    public static void loginAsEmployee(){

        sendKeys(EmployeeLoginPage.textEmployeeId,"testpilot@gmail.com");

        sendKeys(EmployeeLoginPage.textEmployeePassword,"1234");

        click(EmployeeLoginPage.employeeLoginButton);

    }



}
