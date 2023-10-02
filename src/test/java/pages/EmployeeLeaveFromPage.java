package pages;

import org.openqa.selenium.By;

public class EmployeeLeaveFromPage {
    public static By leaveReasonLabel = By.name("reason");
    public static By enterStartDate = By.name("start");

    public static By enterEndDate = By.name("end");
    public static By submitButton = By.xpath("//button[text()='Submit']");

}
