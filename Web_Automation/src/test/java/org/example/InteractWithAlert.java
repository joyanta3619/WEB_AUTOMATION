package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InteractWithAlert extends WebSetUp{

    @Test
    public void interactWithAlert () throws InterruptedException {
        browser.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(2000);

        browser.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert alert = browser.switchTo().alert();
        Thread.sleep(2000);

        String   text = alert.getText();
        System.out.println(text);

        alert.accept();
        Thread.sleep(2000);

        String   AlertResult = browser.findElement(By.id("result")).getText();
        System.out.println("After clicked Alert Page Says:"+AlertResult);



        // second alert  cancel

        browser.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

        Thread.sleep(2000);

         text = alert.getText();
        System.out.println(text);

        alert.dismiss();
        Thread.sleep(2000);

        String secondAlertresult =  browser.findElement(By.xpath("(//p[@id='result'])[1]")).getText();
        System.out.println(secondAlertresult);



//        Third alert

        browser.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.sendKeys("akash");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(2000);

    }
}
