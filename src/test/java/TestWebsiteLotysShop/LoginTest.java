package TestWebsiteLotysShop;

import Base.ShareDataLotys;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends ShareDataLotys {




    @Test
    public void login(){

        WebElement cancelPopUpElement = driver.findElement(By.cssSelector(".hustle-button-close.has-background"));
        cancelPopUpElement.click();
        WebElement acceptcookiesElement = driver.findElement(By.xpath("//button[contains(text(),'Accept cookies')]"));
        acceptcookiesElement.click();


        WebElement loginElement = driver.findElement(By.cssSelector("div.row.align-items-center >div:nth-child(3) >div>div>a>i"));
        loginElement.click();


        WebElement emailElement = driver.findElement(By.id("username"));
        String emailvalue = "danieladrm17@yahoo.com";
        emailElement.sendKeys(emailvalue);

        WebElement passwordElement = driver.findElement(By.cssSelector("input[type='password']"));
        String passwordvalue = "Hachiko";
        passwordElement.sendKeys(passwordvalue);

        WebElement submitloginElement = driver.findElement(By.cssSelector("button[type='submit']"));
        submitloginElement.click();



        //driver.quit();

    }
}
