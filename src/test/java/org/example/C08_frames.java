package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class C08_frames extends C00_Base{
    @Test
    public void frameHandling() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");


        driver.switchTo().frame(0);
        Thread.sleep(Duration.ofSeconds(1));

        driver.findElement(By.id("tinymce")).clear();
        Thread.sleep(Duration.ofSeconds(1));

        driver.switchTo().parentFrame();

        driver.findElement(By.cssSelector("button[aria-label=\"Bold\"]")).click();
        Thread.sleep(Duration.ofSeconds(1));

        driver.switchTo().frame(0);

        driver.findElement(By.id("tinymce")).sendKeys("This is automation test");



     }
}
