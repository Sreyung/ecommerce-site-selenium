package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import utils.AllureTestListener;

import static pages.CheckoutPage.proceedToCheckout;
import static pages.ProductPage.clickOnAddToCart;
import static pages.SearchListPage.clickOnSearchResult;

@Listeners(AllureTestListener.class)
public class AddToCartTest extends HomePage {


    @Test
    public   void runAddToCart()  {
        clickOnSearch("Puma Unisex Smashic Sneaker");
        clickOnSearchResult("Unisex Smash v2 Buck Sneaker");
        clickOnAddToCart();
        proceedToCheckout();


    }
}
