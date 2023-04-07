package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class C04_Mouse_Hovering extends C00_Base {


    @Test
    public void eBay_hover() {
        driver.get("https://www.ebay.com/");

        WebElement MyeBay = driver.findElement(By.xpath("//a[@href=\"https://www.ebay.com/mys/home?source=GBH\"]"));
        List <WebElement> listMyeBay = driver.findElements(By.xpath("//ul[@id=\"gh-ul-nav\"]/li"));

        Actions hover = new Actions(driver);
        hover.moveToElement(MyeBay).perform();

        int count = listMyeBay.size();

        int min = 0; // Minimum value of range
        int max = count-2; // Maximum value of range
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

        listMyeBay.get(random_int).click();


    }


}
