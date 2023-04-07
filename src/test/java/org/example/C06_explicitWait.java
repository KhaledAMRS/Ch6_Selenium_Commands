package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class C06_explicitWait extends C00_Base {
    WebDriverWait explicit;

    @Test
    public void explicitNoOfWindows() {
        driver.get("https://the-internet.herokuapp.com/login");

        explicit = new WebDriverWait(driver, Duration.ofSeconds(7));

        WebElement elementalSele = driver.findElement(By.xpath("//a[@href=\"http://elementalselenium.com/\"]"));
        elementalSele.click();

        // wait until number of tabs, windows equal 2
        explicit.until(ExpectedConditions.numberOfWindowsToBe(2));

    }


    @Test
    public void explicitInvisible() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        explicit = new WebDriverWait(driver, Duration.ofSeconds(7));

        WebElement addElement = driver.findElement(By.xpath("//div[@id=\"content\"]//button[@onclick=\"addElement()\"]"));
        addElement.click();

        Thread.sleep(Duration.ofSeconds(2));

        WebElement deleteElement = driver.findElement(By.xpath("//div[@id=\"content\"]//button[@onclick=\"deleteElement()\"]"));
        deleteElement.click();


        explicit.until(ExpectedConditions.invisibilityOf(deleteElement));

    }

    @Test
    public void explicitJSAlert() throws InterruptedException {
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();

    explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
    explicit.until(ExpectedConditions.alertIsPresent()).accept();

    String Msg = driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();

    Assert.assertEquals(Msg,"You successfully clicked an alert");


    driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
    Thread.sleep(2000);
    explicit.until(ExpectedConditions.alertIsPresent()).sendKeys("Automation course");
    Thread.sleep(2000);
    explicit.until(ExpectedConditions.alertIsPresent()).accept();

    }

    @Test
    public void explicitelementnotclickable()
    {
    driver.get("https://www.facebook.com/");

    explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
//    driver.findElement(By.xpath("//a[contains(@id,\"u_0_0_\")]")).click();

    explicit.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("email"))));

    }

    //element not clickable

}