package TestWebsiteLotysShop;
import Base.ShareDataLotys;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchBarInvalidData extends ShareDataLotys {

    String actualerrormessage;
    String expectedErrorMesssage = "No products were found matching your selection";

    @Test
    public void SearchInvalidData(){


        WebElement cancelPopUpElement = driver.findElement(By.cssSelector(".hustle-button-close.has-background"));
        cancelPopUpElement.click();
        WebElement acceptcookiesElement = driver.findElement(By.xpath("//button[contains(text(),'Accept cookies')]"));
        acceptcookiesElement.click();

        //WITH INVALID DATA
        WebElement searchBarElement = driver.findElement(By.cssSelector("div.col-xl-5.d-none.d-xl-block > div > form > div > input.search-field.js-autocomplete-search"));
        searchBarElement.click();
        searchBarElement.sendKeys("chocolate");
        searchBarElement.sendKeys(Keys.ENTER);

         actualerrormessage=driver.findElement(By.cssSelector("p.woocommerce-info")).getText();
        Assert.assertTrue(actualerrormessage.contains(expectedErrorMesssage));
        System.out.println("test passed");






    }
}
