package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {

    public void userIsOnLoginPage(){
        driver.get("https://demo.invapay.com/content/n/login.jsp");

    }

    public void userEnterValidCredentiala(){
        typeText(By.id("userName"), "cinvapay1111");
        typeText(By.id("password"), "J4cy+YnD");
        clickOnElement(By.id("buttonSubmitLogin"));

    }

    public void userClickOnSigninButton(){
        clickOnElement(By.id("buttonSubmitLogin"));
    }
}
