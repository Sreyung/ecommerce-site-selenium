package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import static utils.utils.attachScreenshot;
import static utils.utils.captureScreenshot;


public class AllureTestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        // Capture screenshot on test failure
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
        if (driver != null) {
            byte[] screenshot = captureScreenshot(driver);
            attachScreenshot(screenshot, "Failure Screenshot");
            System.out.println("Inside failure screenshot method");
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Capture screenshot on test success (optional)
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
        if (driver != null) {
            byte[] screenshot = captureScreenshot(driver);
            attachScreenshot(screenshot, "Success Screenshot");
            System.out.println("Inside success screenshot method");
        }
    }

}
