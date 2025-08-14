package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocateWebElement extends WebSetUp{

    @Test
    public void TestlocateElement() throws InterruptedException {

        browser.get("https://www.daraz.com.bd/");

         WebElement SearchInputBox;

//      SearchInputBox = browser.findElement(By.id("q"));

//      SearchInputBox =browser.findElement(By.name("q"));

//        SearchInputBox = browser.findElement(By.className("search-box__input--O34g"));

//        SearchInputBox = browser.findElement(By.tagName("input"));

//        SearchInputBox.sendKeys("Candle Mold");                  //Candle likhe search korbe
//        Thread.sleep(2000);


        browser.findElement(By.className("cart-icon-daraz")).click();
        Thread.sleep(2000);

        browser.findElement(By.xpath("//span[text()='Save More on App']")).click();

        Thread.sleep(2000);
    }

}


////27 min/////