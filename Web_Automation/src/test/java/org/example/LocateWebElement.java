package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

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



//        browser.findElement(By.id("anonSignup")).click();                   //SignupTest
//        Thread.sleep(2000);

 //        SearchInputBox = browser.findElement(By.cssSelector("input[placeholder=\"Please enter your phone number\"]"));        //CSS Locator

//        SearchInputBox = browser.findElement(By.xpath("//input[@placeholder=\"Please enter your phone number\"]"));               //xpath




//        SearchInputBox = browser.findElement(By.cssSelector(".search-box__input--O34g"));


//        SearchInputBox = browser.findElement(By.cssSelector("input[class=\"search-box__input--O34g\"][name=\"q\"]"));         //multiple data

//        SearchInputBox = browser.findElement(By.xpath("//div[@class=\"search-box__bar--29h6\"] /input[1]"));      //parent er multiple child thakle   xpath

        SearchInputBox = browser.findElement(By.cssSelector("div.search-box__bar--29h6 > input:nth-of-type(1)"));     //parent er multiple child thakle   css selector



        Thread.sleep(2000);
        SearchInputBox.sendKeys("1614618216");
        Thread.sleep(2000);


       List<WebElement> AllLinks = browser.findElements(By.xpath("//a"));             // findElements er jnno

       for(WebElement link_element:AllLinks){
           String text = link_element.getText();
           System.out.println(text);
       }

    }

    
}


//// 1.18- min/////