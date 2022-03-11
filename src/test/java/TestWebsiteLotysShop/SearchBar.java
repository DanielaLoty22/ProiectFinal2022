package TestWebsiteLotysShop;

import Base.ShareDataLotys;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchBar extends ShareDataLotys {


    @Test
    public void SearchBarTop() {

        WebElement cancelPopUpElement = driver.findElement(By.cssSelector(".hustle-button-close.has-background"));
        cancelPopUpElement.click();
        WebElement acceptcookiesElement = driver.findElement(By.xpath("//button[contains(text(),'Accept cookies')]"));
        acceptcookiesElement.click();



        //WITH VALID DATA
        WebElement searchBarElement = driver.findElement(By.cssSelector("div.col-xl-5.d-none.d-xl-block > div > form > div > input.search-field.js-autocomplete-search"));
        searchBarElement.click();
        searchBarElement.sendKeys("sport");
        searchBarElement.sendKeys(Keys.ENTER);



    }
}
