package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class HandleWebBrowser extends WebSetUp{

    @Test
    public void handleBrowser() throws InterruptedException {

        browser.get("https://www.google.com/");                                   //Google website.
        Thread.sleep(2000);
        System.out.println(browser.getCurrentUrl());
        System.out.println(browser.getTitle());


        browser.navigate().to("https://e-valy.com/");                          //Evaly
        Thread.sleep(2000);

        browser.navigate().back();                                                 // Back to Google
        Thread.sleep(2000);

        browser.navigate().forward();                                               // Back to Evaly
        Thread.sleep(2000);

        browser.navigate().refresh();
        Thread.sleep(2000);                                                    //Browser Refresh er jonno

        browser.manage().window().maximize();
        Thread.sleep(2000);

        browser.manage().window().fullscreen();
        Thread.sleep(2000);

        browser.manage().window().minimize();
        Thread.sleep(2000);

        browser.manage().window().maximize();
        Thread.sleep(2000);

        browser.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        browser.navigate().to("https://www.youtube.com/");
        Thread.sleep(2000);

        browser.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);
        browser.navigate().to("https://www.w3schools.com/");
        Thread.sleep(2000);

        String CurrentwindowHandle = browser.getWindowHandle();
        System.out.println(CurrentwindowHandle);

        browser.switchTo().newWindow(WindowType.TAB);
        browser.navigate().to("https://www.daraz.com.bd/");
        Thread.sleep(2000);

        browser.switchTo().window(CurrentwindowHandle);                             //switch kore ager window te jabe
        Thread.sleep(2000);

        List<String> HandlesAllBrowser = new ArrayList<String>(browser.getWindowHandles());

        for(String handle:HandlesAllBrowser){
            browser.switchTo().window(handle);
            System.out.println(handle);
            System.out.println("We are cyrrently at :"+browser.getTitle() +"Page");
        }
    }
}


