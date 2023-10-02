package pages;

import org.openqa.selenium.By;

public class EmployeeProductOrderPage {

    public static By productNameId = By.name("prodId");

    public static By productOrderDate = By.xpath("//input[@name='ordDate']");

    public static By productOrderButton = By.xpath("//button[text()='Order Product']");
}
