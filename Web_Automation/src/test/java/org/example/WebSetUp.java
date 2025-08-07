package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class WebSetUp {
    WebDriver browser;


// open a browser

    @BeforeSuite
    public void openBrowser(){
        browser = new ChromeDriver();
    }

//Close browser

    @AfterSuite
    public void CloseBrwser(){
        browser.close();
    }
}
