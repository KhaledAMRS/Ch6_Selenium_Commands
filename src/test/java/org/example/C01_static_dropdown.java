package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_static_dropdown extends C00_Base{


    @Test(priority = 1)
    public void StaticDropDown() throws InterruptedException {
    //static dropdown list using class Select in selenium

        WebElement parentList = driver.findElement(By.id("dropdown"));
        Select select = new Select(parentList);
    /*
        select.selectByIndex(1);

        Thread.sleep(Duration.ofSeconds(2));

        select.selectByIndex(2);

        Thread.sleep(Duration.ofSeconds(2));

        select.selectByIndex(0);
*/

    /*
        select.selectByValue("1");
        Thread.sleep(Duration.ofSeconds(2));

        select.selectByValue("2");
    */

    select.selectByVisibleText("Option 1");
    Thread.sleep(Duration.ofSeconds(2));

    select.selectByVisibleText("Option 2");



    }



}
