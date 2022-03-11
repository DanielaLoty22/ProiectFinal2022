package TestWebsiteLotysShop;
import Base.ShareDataLotys;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class AccessoriesTest extends ShareDataLotys {

    @Test
    public void testautomatWomens(){

        WebElement cancelPopUpElement = driver.findElement(By.cssSelector(".hustle-button-close.has-background"));
        cancelPopUpElement.click();
        WebElement acceptcookiesElement= driver.findElement(By.xpath("//button[contains(text(),'Accept cookies')]"));
        acceptcookiesElement.click();


        WebElement accessoriesElement= driver.findElement(By.cssSelector("#menu-item-45487 > a"));
        Actions Action =new Actions(driver);
        Action.moveToElement(accessoriesElement).perform();

        WebElement bagsandluggageElement = driver.findElement(By.cssSelector("#menu-item-45488"));
        Actions action = new Actions(driver);
        action.moveToElement(bagsandluggageElement).perform();

        WebElement womensBagsAndLuggage = driver.findElement(By.cssSelector("#menu-item-45490"));
        womensBagsAndLuggage.click();
        driver.switchTo().defaultContent();

        WebElement accessoriesElement2 = driver.findElement(By.cssSelector("#menu-item-45487 > a"));
        Actions Action2 = new Actions(driver);
        Action.moveToElement(accessoriesElement2).perform();


        WebElement bagsandluggageElement2 = driver.findElement(By.cssSelector("#menu-item-45488"));
        Actions action2 = new Actions(driver);
        action.moveToElement(bagsandluggageElement2).perform();

        WebElement mensBagsAndLuggage = driver.findElement(By.cssSelector("#menu-item-45489"));
        mensBagsAndLuggage.click();




        }






    }





