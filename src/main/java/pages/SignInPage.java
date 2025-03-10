package pages;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static utils.utils.waitForElementToBeClickable;

public class SignInPage extends BasePage {


    public  static HomePage login() throws InterruptedException {
       // driver.findElement(By.id("ap_email")).wait(3000);

        WebElement element = driver.findElement(By.id("ap_email"));
       waitForElementToBeClickable(element);
        driver.findElement(By.id("ap_email")).click();
        driver.findElement(By.id("ap_email")).sendKeys("sachinsreyung10@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).click();
//        driver.findElement(By.id("ap_password")).sendKeys("Shyam11@!");
//        driver.findElement(By.id("signInSubmit")).click();


        return new HomePage();


    }
}
