package TestWebsiteLotysShop;
import Base.ShareDataLotys;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;


public class CurencyFunctionality extends ShareDataLotys {




    @Test
    public void currency() {

        WebElement cancelPopUpElement = driver.findElement(By.cssSelector(".hustle-button-close.has-background"));
        cancelPopUpElement.click();
        WebElement acceptcookiesElement= driver.findElement(By.xpath("//button[contains(text(),'Accept cookies')]"));
        acceptcookiesElement.click();

        List<String> allCurrencies = new ArrayList<>();
        allCurrencies.add("AMD");
        allCurrencies.add("AOA");
        allCurrencies.add("AWG");
        allCurrencies.add("BSD");

        for (String currency : allCurrencies) {



            List<WebElement> currencyOptions = driver.findElements(By.cssSelector(("i.icon-down-open")));
            for (WebElement currencyOption : currencyOptions)
                if (currencyOption.isDisplayed() && currencyOption.isEnabled())
                    currencyOption.click();


            List<WebElement> currencyListOption = driver.findElements(By.cssSelector("ul.currency-list > li.dropdown-item > a"));
            for (WebElement currencyElement : currencyListOption) {
                if (currencyElement.getAttribute("data-code").equals(currency)) {
                    currencyElement.click();
                    break;
                }
            }
            List<WebElement> resultList = driver.findElements(By.cssSelector("a.current-currency"));
            for (int index = 0; index < resultList.size()/2; index++) {
                if (resultList.get(index).getAttribute("data-code").equals(currency)) {
                    Assert.assertEquals( " The currency is displayed",currency, resultList.get(index).getAttribute("data-code"));
                }
            }
//            for (WebElement result : resultList) {
//                if (result.getAttribute("data-code").equals(currency)) {
//                    Assert.assertEquals( " The currency is displayed",currency, result.getAttribute("data-code"));
//
//
//                }
//            }
        }
    }
}




















