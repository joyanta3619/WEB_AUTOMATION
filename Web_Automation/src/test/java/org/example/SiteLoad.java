package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


//public class SiteLoad {

//    public static void main(String[] args) {
//
//        // open a browser
//       WebDriver browser = new ChromeDriver();
//
//        //Load Webpage
//       browser.get("https://e-valy.com/");
//
//        //Get Web page title
//       String PageTitle = browser.getTitle();
////        System.out.println(PageTitle);
//
//
//        //Validate Title with text "Evaly"
//
//        if (PageTitle.equals("Evaly | Online shopping platform")) {
//            System.out.println("Test Pass");
//        }else{
//            System.out.println("Test Fail");
//        }
//
//        //Close browser
//        browser.close();
//
//
//    }

/// /////////////////////////////////////////////////// Main Method Chara Run////////////////////////////////////////////////////////






public class SiteLoad extends WebSetUp {


@Test
public  void testsite (){


    //Load Webpage
    browser.get("https://e-valy.com/");


    //Get Web page title
    String PageTitle = browser.getTitle();



    //Validate Title with text "Evaly"
    Assert.assertEquals(PageTitle,"Evaly | Online shopping platform");


    }


    @Test
    public void PageurlTest(){

    browser.get("https://e-valy.com/");

    String PageUrl = browser.getCurrentUrl();

    Assert.assertEquals(PageUrl,"https://e-valy.com/");

    }
}
