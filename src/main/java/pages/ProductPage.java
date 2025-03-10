package pages;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static utils.utils.*;


public class ProductPage extends BasePage {

    public static CheckoutPage clickOnAddToCart() {


        switchWindow();
        WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
        waitForElementToBeClickable(addToCart);
        addToCart.click();
        return new CheckoutPage();
    }

    public static void changeQuantity(int quantityCount) {

        //quantity
        switchWindow();
        WebElement dd1 = driver.findElement(By.id("quantity"));
        waitForElementToBeClickable(dd1);
        // dd1.click();
        Select dropDown = new Select(dd1);
        dropDown.selectByValue(String.valueOf(quantityCount));

        driver.findElement(By.id("quantity_3")).click();
       // dd1.sendKeys(Keys.ESCAPE);

    }

    public static int getSingleProductPrice() {
        switchWindow();
        String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();
        //  String actualPrice = price.replaceAll("[0-9]", price);
        return Integer.parseInt(price);
    }

}
