package pages;

import org.openqa.selenium.By;

public class CustomerUpdateInformation {

    public static By updateContactInfo = By.xpath("//input[@name='contact']");

    public static By updateAddressInfo = By.xpath("//input[@name='address']");

    public static By submitButton = By.xpath("//button[text()='Submit']");
}
