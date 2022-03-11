package TestWebsiteLotysShop;

import Base.ShareDataLotys;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




public class RegisterLotysShop extends ShareDataLotys {

    String actualerrormessage;
    String expectedErrorMesssage="An account is already registered with your email address.";

    @Test
    public void register() {


    //Invalid data


        WebElement cancelPopUpElement = driver.findElement(By.cssSelector(".hustle-button-close.has-background"));
        cancelPopUpElement.click();
        WebElement acceptcookiesElement= driver.findElement(By.xpath("//button[contains(text(),'Accept cookies')]"));
        acceptcookiesElement.click();


        WebElement loginElement= driver.findElement(By.cssSelector("div.row.align-items-center >div:nth-child(3)>div>div>a>i"));
        loginElement.click();

        WebElement registeremailElement = driver.findElement(By.cssSelector("#reg_email"));
        String registeremailvalue = "danieladrm17@yahoo.com";
        registeremailElement.sendKeys(registeremailvalue);

        WebElement createaccountElement= driver.findElement(By.cssSelector("button[value ='Create an Account']"));
        createaccountElement.click();
        actualerrormessage=driver.findElement(By.cssSelector("#content > div > div > div > div > div.woocommerce-notices-wrapper > ul > li")).getText();
        Assert.assertTrue(actualerrormessage.contains(expectedErrorMesssage));
        System.out.println("Adresa de mail este deja inregistrata");


        //driver.quit();




    }
}