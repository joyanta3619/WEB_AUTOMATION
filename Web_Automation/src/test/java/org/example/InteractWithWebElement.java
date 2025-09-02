package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractWithWebElement extends WebSetUp {

    @Test

    public void interactWithElement() throws InterruptedException {


        browser.get("https://www.daraz.com.bd/");



//        WebElement ptagName =  browser.findElement(By.tagName("p"));
//        String first_tag = ptagName.getText();
//        System.out.println(first_tag);



//        WebElement clickable =   browser.findElement(By.xpath("//a[contains(@id,'20000046')]"));
//        System.out.println("Display Status:"+clickable.isDisplayed());
//        System.out.println("Is Clickable:"+clickable.isSelected());
//        Thread.sleep(2000);
//
//        clickable.click();



        WebElement autocomplete_inputbox = browser.findElement(By.xpath("//input[@id='q']"));

        autocomplete_inputbox.sendKeys("BD");
        Thread.sleep(2000);


        autocomplete_inputbox.clear();
        Thread.sleep(20000);

        autocomplete_inputbox = browser.findElement(By.xpath("//input[@id='q']"));

        autocomplete_inputbox.sendKeys("BANGLADESH");
        Thread.sleep(2000);




    }

}



//39.15