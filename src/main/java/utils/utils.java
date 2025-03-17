package utils;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.example.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class utils extends BasePage {

    public static void waitForElementToBeClickable(WebElement locator) {
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
        wt.until(ExpectedConditions.elementToBeClickable(locator));
    }

  public static  void   switchWindow() {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String string : windowHandles) {
            System.out.println(string);
        }
        List<String> switchWindow = new ArrayList<String>(windowHandles);
        String window = switchWindow.get(1);
        driver.switchTo().window(window);
    }

    public  byte[] captureScreenshot(WebDriver driver) {
        if (driver instanceof TakesScreenshot) {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        }
        return new byte[0]; // Return empty byte array if driver does not support screenshots
    }

    @Attachment(value = "{name}", type = "image/png")
    public  byte[] attachScreenshot(byte[] screenshot, String name) {
        return screenshot;
    }


//    public void captureScreenshotAndAttachToAllure(ITestResult result) {
//        if (driver != null) {
//            String screenshotName = result.getName() + "_" + System.currentTimeMillis();
//            String screenshotPath = ScreenshotUtils.captureScreenshot(driver, screenshotName);
//
//            // Attach screenshot to Allure report
//            if (screenshotPath != null) {
//                AllureAttachmentUtils.attachScreenshotToAllure(driver, screenshotName);
//            }
//        }
//
//
//    public static String captureScreenshot(WebDriver driver, String screenshotName) {
//        try {
//            // Create a directory for screenshots if it doesn't exist
//            Path screenshotDir = Paths.get("screenshots");
//            if (!Files.exiiles.exists(screenshotDsts(screenshotDir)) {
//                Files.createDirectories(screenshotDir);
//            }
//
//            // Capture screenshot and save it to a file
//            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            String screenshotPath = screenshotDir.resolve(screenshotName + ".png").toString();
//            Files.copy(screenshotFile.toPath(), Paths.get(screenshotPath));
//
//            return screenshotPath;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//}
}



