package org.example;

import net.bytebuddy.implementation.bytecode.Throw;
import org.testng.annotations.Test;

public class InteractWithDropdown extends WebSetUp{

    @Test
    public void interactDropdown() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(1000);

    }

}


