package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.AllureTestListener;

import static pages.CheckoutPage.getTotalProductPrice;
import static pages.CheckoutPage.proceedToCheckout;
import static pages.HomePage.clickOnSearch;
import static pages.ProductPage.*;
import static pages.SearchListPage.clickOnSearchResult;

@Listeners(AllureTestListener.class)
public class CalculateQuantity extends HomePage {
    public static int quantity = 4;

    @Test
    public  void verifyQuantity() throws InterruptedException {
        clickOnSearch("Hush Puppies Socks");
        clickOnSearchResult("Brohpm-14B-Po3");
        int singleProductPrice = getSingleProductPrice();
        System.out.println(singleProductPrice);
        changeQuantity(quantity);
        clickOnAddToCart();
        proceedToCheckout();
        int totalProductPrice = getTotalProductPrice();
        int expectedPrice = quantity * singleProductPrice;
        Assert.assertEquals(totalProductPrice, expectedPrice);


    }
}
