package org.example;

//import com.sun.tools.javac.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class InteractWithDropdown extends WebSetUp{

    @Test
    public void interactDropdown() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(1000);


    WebElement dropDown = browser.findElement(By.id("dropdown-class-example"));

    Select select = new Select(dropDown);

    List<WebElement> options = select.getOptions();

    for(WebElement option : options){
        System.out.println(option.getText());
    }


    select.selectByContainsVisibleText("Select");
    Thread.sleep(2000);
    System.out.println(select.getFirstSelectedOption().getText());

    }

}


//26.49