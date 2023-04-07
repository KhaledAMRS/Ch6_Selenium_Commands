package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class C00_Base {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        Map<String, Object> pf = new HashMap<String,Object>();
        pf.put("profile.default_content_setting_values.notifications", 2);
        //object of ChromeOptions
        ChromeOptions p = new ChromeOptions();
        p.setExperimentalOption("prefs", pf);


        driver = new ChromeDriver(p);

        //maximize window
        driver.manage().window().maximize();

        //set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

    }

    @AfterMethod
    public void quitDriver() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3));
        driver.quit();
    }

}
