package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_dynamic_dropdown extends C00_Base{


    @Test(priority = 1)
    public void dynamicDropDown() throws InterruptedException {
    driver.get("https://the-internet.herokuapp.com/");

//    driver.findElement(By.cssSelector("a[href=\"/checkboxes\"]")).click();

     driver.findElements(By.cssSelector("div[id=\"content\"]>ul>li")).get(0).click();



    }



}
