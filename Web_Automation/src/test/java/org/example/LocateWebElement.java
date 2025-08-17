package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocateWebElement extends WebSetUp{

    @Test
    public void TestlocateElement() throws InterruptedException {

        browser.get("https://www.daraz.com.bd/");

         WebElement SearchInputBox;


//      SearchInputBox = browser.findElement(By.id("q"));
//
//      SearchInputBox =browser.findElement(By.name("q"));
//
//        SearchInputBox = browser.findElement(By.className("search-box__input--O34g"));
//
//        SearchInputBox = browser.findElement(By.tagName("input"));
//
//        SearchInputBox.sendKeys("01614618216");                  //Candle likhe search korbe
//        Thread.sleep(2000);


//        browser.findElement(By.className("cart-icon-daraz")).click();
//        Thread.sleep(2000);



//        browser.findElement(By.xpath("//span[text()='Save More on App']")).click();         //Span Tag er vitore thakle aivbe kora jai
//
//        Thread.sleep(2000);

//        browser.navigate().back();




//        browser.findElement(By.id("anonLogin")).click();                    //login test
//        Thread.sleep(2000);



        browser.findElement(By.id("anonSignup")).click();                   //SignupTest
        Thread.sleep(2000);
//
 //        SearchInputBox = browser.findElement(By.cssSelector("input[placeholder=\"Please enter your phone number\"]"));        //CSS Locator

        SearchInputBox = browser.findElement(By.xpath("//input[@placeholder=\"Please enter your phone number\"]"));


        Thread.sleep(2000);
        SearchInputBox.sendKeys("1614618216");
        Thread.sleep(2000);




//        SearchInputBox = browser.findElement(By.cssSelector("input[type=\"text\"]"));
//        SearchInputBox.sendKeys("akashshom3616@gmail.com");
//        Thread.sleep(2000);


    }




}


////38 min/////