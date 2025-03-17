package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class AllureTestListener implements ITestListener {
    utils ut = new utils();
    @Override
    public void onTestFailure(ITestResult result) {
        // Capture screenshot on test failure
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
        if (driver != null) {

            byte[] screenshot =  ut.captureScreenshot(driver);
            ut.attachScreenshot(screenshot, "Failure Screenshot");
            System.out.println("Inside failure screenshot method");
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Capture screenshot on test success (optional)
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
        if (driver != null) {
            byte[] screenshot =  ut.captureScreenshot(driver);
             ut.attachScreenshot(screenshot, "Success Screenshot");
            System.out.println("Inside success screenshot method");
        }
    }

}
