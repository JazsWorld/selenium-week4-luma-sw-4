package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends TestBase {
    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        //Mouse Hover on Tops
        homePage.mouseHoverOntopMenu();
        //Click on Jackets
        homePage.clickOnJacketLink();
        List<String> actualText = womenPage.storeProductNamesInAscendingOrder();
        womenPage.selectFilterSortByNames();
        Thread.sleep(2000);
        List<String> expextedText = womenPage.storeProductNamesAfterFilterName();
        Assert.assertEquals(actualText, expextedText);
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {

            //Mouse Hover on Women Menu
            homePage.mouseHoverOnWomenMenu();
            //Mouse Hover on Tops
            homePage.mouseHoverOntopMenu();
            //Click on Jackets
            homePage.clickOnJacketLink();
            List<Double> actualText = womenPage.storeProductsNamesByPriceInAscendingOrder();
            womenPage.selectFilterSortByPriceLowToHigh();
            Thread.sleep(2000);
            List<Double> expextedText = womenPage.storeProductsNamesByPriceAfterFilterPriceLowToHigh();
            Assert.assertEquals(actualText, expextedText);
        }
    }
