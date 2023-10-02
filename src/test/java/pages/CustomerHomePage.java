package pages;

import org.openqa.selenium.By;

public class CustomerHomePage {

  public static By labelTextMassage = By.xpath("//h2[2]");

  public static By customerOrderMenu = By.xpath("//a[@href='productOrder.php?id=4']");

  public static By customerProfileMenu = By.xpath("//a[text()='My Profile']");
}
