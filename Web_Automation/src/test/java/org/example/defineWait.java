package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class defineWait extends WebSetUp{
    @Test
    public void  testDelayElement() {

        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));           //Thread.sleep er jajigai aita hobe akjaigai leklei hbe


        browser.get("https://qavbox.github.io/demo/delay/");

        browser.findElement(By.xpath("//input[@name='commit1']")).click();
       WebElement afterClickTryme = browser.findElement(By.xpath("//h2[@id='delay']"));
        System.out.println(afterClickTryme.getText());



        browser.findElement(By.xpath("//input[@name='commit']")).click();
        WebElement  clickMe = browser.findElement(By.xpath("//h2[@id='two']"));
        WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(10));                             //Explict wait
        wait.until(ExpectedConditions.textToBePresentInElement(clickMe,"I am here!"));
        System.out.println(clickMe.getText());



        browser.findElement(By.xpath("//input[@id='loaderStart']")).click();
        WebElement start = browser.findElement(By.xpath("//h2[@id='loaderdelay']"));
        System.out.println(start.getText());


    }
}
