package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class C09_Multiple_Windows_Handling extends C00_Base{

    @Test
    public void practiceArrayList()
    {

        ArrayList<String> tabs = new ArrayList();
        tabs.add("tab0");
        tabs.add("tab2");

        tabs.add(1,"tab1");

        System.out.println(tabs);

    }

    @Test
    public void swtich_two_windows() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.cssSelector("a[href=\"http://elementalselenium.com/\"]")).click();
        System.out.println(driver.getCurrentUrl());     //tab0  https://the-internet.herokuapp.com/login
        Thread.sleep(Duration.ofSeconds(3));

        System.out.println(driver.getCurrentUrl());     //tab0  https://the-internet.herokuapp.com/login
    //  driver.getWindowHandles() => ArrayList

        ArrayList<String> tabs = new ArrayList();


        tabs.addAll(driver.getWindowHandles());
        //[tab0, tab1, tab2, .....]
        System.out.println(driver.getCurrentUrl());     //tab0  https://the-internet.herokuapp.com/login

        driver.switchTo().window(tabs.get(1));

        System.out.println(driver.getCurrentUrl());     //tab1  http://elementalselenium.com/

        driver.findElement(By.cssSelector("a[href=\"https://saucelabs.com/\"]")).click();

    }


    @Test
    public void swtich_more_than_two_windows() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.cssSelector("a[href=\"http://elementalselenium.com/\"]")).click();

        Thread.sleep(Duration.ofSeconds(3));

        ArrayList<String> tabs = new ArrayList();
        tabs.addAll(driver.getWindowHandles());
        //[tab0, tab1]
        driver.switchTo().window(tabs.get(1));

        driver.findElement(By.cssSelector("a[href=\"https://saucelabs.com/\"]")).click();

        Thread.sleep(Duration.ofSeconds(3));
        tabs.clear();
        tabs.addAll(driver.getWindowHandles());

        System.out.println(tabs);
        System.out.println(tabs.size());

        driver.switchTo().window(tabs.get(2));

        driver.close();

        driver.switchTo().window(tabs.get(1));

        driver.close();

        driver.switchTo().window(tabs.get(0));


        driver.quit();

    }


    @Test
    public void create_new_window_or_tab()
    {
        driver.get("https://www.google.com/");

    //    driver.switchTo().newWindow(WindowType.TAB);

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.facebook.com/");


    }



}
