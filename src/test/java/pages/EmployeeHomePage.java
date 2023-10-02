package pages;

import org.openqa.selenium.By;

public class EmployeeHomePage {
    public static By empApplyLeaveMenu = By.xpath("//a[@href='applyleave.php?id=102']");

    public static By employeeLeaveStatus = By.xpath("//h2[text()='Leave Satus']");

    public static By productOrderMenu = By.xpath("//a[text()='Product Order']");

    public static By employeeProfileMenu = By.xpath("//a[text()='My Profile']");
    public static By welcomeMsg = By.xpath("//div/h2[2]");

    public static By employeeIdMsg = By.xpath("//div/h2[1]");
}
