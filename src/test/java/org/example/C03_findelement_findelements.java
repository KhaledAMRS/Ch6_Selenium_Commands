package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class C03_findelement_findelements extends C00_Base {


    @Test
    public void findElement()
    {

        WebElement singleElement = driver.findElement(By.cssSelector(""));

        singleElement.click();

        //[element0, element1, element2, element3,   ....]
        List<WebElement> listElements = driver.findElements(By.cssSelector(""));

        WebElement singleElement2 = listElements.get(0);

    }

}
