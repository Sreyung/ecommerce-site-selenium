package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.AllureTestListener;

import java.io.File;
import java.io.IOException;

@Listeners(AllureTestListener.class)
public class searchTest extends HomePage {


    @Test
    public  void runSearchTest() throws InterruptedException {
        clickOnSearch("mobile");
        int resultsCount = getSearchResult();
        Assert.assertEquals(resultsCount, 22);

    }



}
