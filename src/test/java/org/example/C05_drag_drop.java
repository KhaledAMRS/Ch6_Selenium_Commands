package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class C05_drag_drop extends C00_Base{


    @Test()
    public void dragDrop() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Thread.sleep(Duration.ofSeconds(2));

        WebElement source = driver.findElement(By.cssSelector("#column-a header"));
        WebElement target = driver.findElement(By.cssSelector("#column-b header"));

        Actions dragDrop = new Actions(driver);
        dragDrop.clickAndHold(source).moveByOffset(200,200).release().perform();

    }


    @Test
    public void usingActionClass()
    {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement source = driver.findElement(By.xpath("//div[@id=\"column-a\"]"));
        WebElement target = driver.findElement(By.xpath("//div[@id=\"column-b\"]"));

 Actions usingActionClass = new Actions(driver);
 Action draganddrop = usingActionClass.clickAndHold(source).moveToElement(target).release(target).build();
 draganddrop.perform();
    }
}
