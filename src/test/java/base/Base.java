package base;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Base {
    public static void clear(By locator) {
        driver.findElement(locator).clear();
    }
    public static WebDriver driver;
    private static String screenshotPath;

    public static void navigate(String url){
        driver.get(url);
    }

    public static void click (By locator){
        driver.findElement( locator ).click();
    }
    public static void sendKeys (By locator, String keys) {
        driver.findElement(locator).sendKeys(keys);
    }
    public static void clickById(String id){driver.findElement(By.id(id)).click();  }

    public static String getText(By locator){
       String text = driver.findElement(locator).getText();
       return text;
    }
    public static void dropDown(By locator, String value) {
        Select select = new Select(driver.findElement(locator));
        select.selectByValue(value);
    }
    public static void takeScreenshot() throws Exception {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String rootDir = System.getProperty("user.dir");
        String screenshotDir = rootDir + File.separator + "screenShot";

        // Create the "screenShot" folder if it doesn't exist
        File screenshotFolder = new File(screenshotDir);
        if (!screenshotFolder.exists()) {
            screenshotFolder.mkdirs();
        }
        screenshotPath = screenshotDir + File.separator + "screenshot_" + timestamp + ".png";
        FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File(screenshotPath));
    }

    // Attach the screenshot to the Allure report
    public static void attachScreenshotToAllure() throws Exception {
        if (screenshotPath != null) {
            Allure.addAttachment("Screenshot", "image/png", FileUtils.openInputStream(new File(screenshotPath)), "png");
        }
    }
}