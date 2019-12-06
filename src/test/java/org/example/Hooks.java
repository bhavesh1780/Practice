package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BasePage {
    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://demo.invapay.com/content/n/login.jsp");
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}