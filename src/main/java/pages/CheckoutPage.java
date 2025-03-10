package pages;

import org.example.BasePage;
import org.openqa.selenium.By;

public class CheckoutPage extends BasePage {

    public   static  void proceedToCheckout(){
        driver.findElement(By.name("proceedToRetailCheckout")).isDisplayed();

    }

    public  static  int getTotalProductPrice(){
        String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();

        String actualPrice = price.replaceAll("[^0-9]", "");

        return   Integer.parseInt(actualPrice);
    }


}
