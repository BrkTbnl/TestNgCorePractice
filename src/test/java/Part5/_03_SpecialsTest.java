package Part5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverClass;

import java.util.List;

public class _03_SpecialsTest extends DriverClass {


    /**
     * Go to "https://opencart.abstracta.us/index.php?route=account/login"
     * Log in
     * Click on Specials
     * Check if all products are on sale and new price is lower than the first price
     * Run this test with 2 different browsers in parallel
     **/

    @Test
    void specialTest(){

        WebElement SpecialsButton = driver.findElement(By.xpath("(//ul[@class=\"list-unstyled\"]//li)[50]"));
        SpecialsButton.click();


        List<WebElement> OldPrices = driver.findElements(By.xpath("//span[@class=\"price-old\"]"));


        List<WebElement> NewPrices = driver.findElements(By.xpath("//span[@class=\"price-new\"]"));


        Assert.assertEquals(OldPrices.size(), NewPrices.size());


        for (int i = 0; i < OldPrices.size(); i++) {

            Assert.assertEquals(OldPrices.get(i).getText().replaceAll("[^0-9.]",""),
                    NewPrices.get(i).getText().replaceAll("[^0-9.]",""),"something went wrong... variables not equal");
        }



    }

}
