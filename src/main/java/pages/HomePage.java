package pages;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
//    product click -----------alt = Sponsored Ad - Puma Unisex Smashic Sneaker —— search for text
//    Add to cart —— add-to-cart-button—— search by id
//    Proceed to buy ————proceedToRetailCheckout - search by name

    public static void  clickOnSearch(String searchInput) {
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchInput, Keys.ENTER);
    }

    public static  int getSearchResult() throws InterruptedException {
        driver.findElement(By.xpath("//h2[text()='Results']"));
        int size = driver.findElements(By.xpath("(//h2[text()='Results']/ancestor::span)//div[@data-component-type='s-search-result']")).size();

return  size;
        //(//h2[text()='Results']/ancestor::span)//div[@data-component-type='s-search-result']
    }

    public  static  SignInPage clickOnSignIn(){
        driver.findElement(By.id("nav-link-accountList")).click();
        return new SignInPage();
    }
}
