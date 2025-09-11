package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class HandleFrameContent extends WebSetUp{
    @Test
    public void testFrameContent() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");


        Actions actions = new Actions(browser);
        actions.scrollByAmount(0,1200).build().perform();
        Thread.sleep(2000);


        browser.switchTo().frame("courses-iframe");

        WebElement email = browser.findElement(By.xpath("//li[normalize-space()='contact@rahulshettyacademy.com']"));
        System.out.println(email.getText());



        browser.switchTo().defaultContent();     //outside iframe tai default a switch kore nilam

        WebElement text = browser.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));
        System.out.println(text.getText());



//        browser.switchTo().frame("iframe-name");         //again switch to iframe

//        browser.switchTo().frame(0);                        //iframe index number use kore




        WebElement iFrame = browser.findElement(By.xpath("//iframe[@id='courses-iframe']"));      //iframe er webElwmwnt use kore

        browser.switchTo().frame(iFrame);


        WebElement  iFreameLogin = browser.findElement(By.xpath("//a[normalize-space()='Login']"));
        System.out.println(iFreameLogin.getText());







    }
}



//23