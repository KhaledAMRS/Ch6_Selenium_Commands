package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class C03_Add_Remove_Element extends C00_Base {

    @Test(priority = 1)
    public void addRemove()
    {
     driver.findElement(By.cssSelector("a[href=\"/add_remove_elements/\"]")).click();
    }


}
