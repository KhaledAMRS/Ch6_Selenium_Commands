package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class C07_uploadFile extends C00_Base {

    @Test
    public void uploadFileUsingSendKeys() throws InterruptedException {

    driver.get("https://the-internet.herokuapp.com/upload");

    driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Khaled Ashraf\\Desktop\\New Microsoft Excel Worksheet.xlsx");

    driver.findElement(By.id("file-submit")).click();

    }


}