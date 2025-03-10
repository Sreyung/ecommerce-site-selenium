package pages;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class SearchListPage extends BasePage {

    public  static  ProductPage clickOnSearchResult(String productName){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//span[contains(text(), '" + productName +"')]")).click();
        return new ProductPage();
    }

    //span[contains(text(),'Brohpm-14B-Po3')]
}
