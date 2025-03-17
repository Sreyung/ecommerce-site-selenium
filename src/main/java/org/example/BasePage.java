package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;

    @BeforeMethod
    public static void initilizeDriver(ITestContext context) throws MalformedURLException {
        // Define the BrowserStack URL
        //URL hubUrl = new URL("https://<username>:<access-key>@hub-cloud.browserstack.com/wd/hub");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // Set the WebDriver in the test context
        context.setAttribute("driver", driver);

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*
        String url = ("http://localhost:4444/wd/hub");

        // Define DesiredCapabilities for BrowserStack
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "latest");
      capabilities.setCapability("os", "Windows");
      capabilities.setCapability("os_version", "10");
      capabilities.setCapability("name", "BrowserStack Sample Test");

        driver = new RemoteWebDriver(new URL(url), capabilities);
        context.setAttribute("driver", driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        */


        driver.get("https://www.amazon.in/");
    }

    @AfterMethod
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
