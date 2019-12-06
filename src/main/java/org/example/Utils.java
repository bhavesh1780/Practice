package org.example;

import org.openqa.selenium.By;

public class Utils extends BasePage {

    public static void typeText (By by, String text){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public static void clickOnElement(By by){

        driver.findElement(by).click();
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public String getTextFromElement(By by){
        String text =  driver.findElement(by).getText();
        return text;
    }
}
