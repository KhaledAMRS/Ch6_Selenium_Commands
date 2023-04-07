package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class C10_Javascript_Executor extends C00_Base{

    @Test
    public void click_value_using_javascriptExecutor()
    {
     driver.get("https://the-internet.herokuapp.com/login");

     //How to create reference from JavascriptExecutor interface
    JavascriptExecutor js = (JavascriptExecutor) driver;

//    js.executeScript("document.getElementById('username').value='tomsmith';");

    WebElement username = driver.findElement(By.id("username"));
    js.executeScript("arguments[0].value='tomsmith';",username);

//    js.executeScript("document.getElementById('password').value='SuperSecretPassword!';");

    WebElement password = driver.findElement(By.id("password"));
    js.executeScript("arguments[0].value='SuperSecretPassword!';",password);


    WebElement loginBtn = driver.findElement(By.className("radius"));
    js.executeScript("arguments[0].click();",loginBtn);

    }

    @Test
    public void scroll_using_javascriptExecutor()
    {
        driver.get("https://demo.nopcommerce.com/");

        //How to get window dimensions
        Dimension dimension = driver.manage().window().getSize();   //x*y
        int height = dimension. getHeight();        //Y
        int width = dimension. getWidth();          //X

        System.out.println(dimension);
        System.out.println(height);
        System.out.println(width);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        //  https://www.browserstack.com/guide/selenium-scroll-tutorial
        // How to scroll horizontally on a web page to a specific web element using Selenium
        // additional commands using javascriptExecutor



/*
(1296, 696)
696
1296

 */


    }


}
