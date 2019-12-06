package org.example;

import org.openqa.selenium.By;
import org.junit.Assert;

public class HomePage extends Utils {

    public void userIsLoggedInSuccessfully(){
        Assert.assertTrue(isElementPresent(By.linkText("Logout")));
    }

    public void userClickOnLink(){
        driver.findElement(By.linkText("Transaction Search")).click();
    }

    public void verifyUserIsOnTransactionPage(){
        Assert.assertTrue("User not on transaction page", isElementPresent(By.xpath("//h3[contains(.,'Search')]")));
    }

    public void userEntersTransactionNo(String transactionNumber){
        typeText(By.id("transactionNoInput"), transactionNumber);
    }

    public void userClicksOnSearchButton(){
        clickOnElement(By.id("buttonSubmitSimpleSearch"));
    }

    public void verifyTransactionNoAppearsInSearchResult(String transacationNo){
        Assert.assertEquals(transacationNo, getTextFromElement(By.xpath("//tr[@id=\"highlightRow\"]/td/a")));
    }
}
