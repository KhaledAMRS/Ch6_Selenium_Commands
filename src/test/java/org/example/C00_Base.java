package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class C00_Base {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser()
    {
    driver = new ChromeDriver();

    //maximize window
    driver.manage().window().maximize();

    //set implicit wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    //navigate to home page
    driver.get("https://the-internet.herokuapp.com/");

    }


    @AfterMethod
    public void quitDriver()
    {

    driver.quit();
    }

}
