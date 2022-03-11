package TestWebsiteLotysShop;
import Base.ShareDataLotys;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddToCart extends ShareDataLotys {


    String actualerrormessage;
    String expectedErrorMesssage = "Your cart is currently empty.";

    @Test

    public void AddToCartProcess() throws InterruptedException {

        WebElement cancelPopUpElement = driver.findElement(By.cssSelector(".hustle-button-close.has-background"));
        cancelPopUpElement.click();
        WebElement acceptcookiesElement = driver.findElement(By.xpath("//button[contains(text(),'Accept cookies')]"));
        acceptcookiesElement.click();

        WebElement ShopNowElement = driver.findElement(By.cssSelector("div.slide.is-selected > div > div > div.slide-buttons > a"));
        ShopNowElement.click();

        WebElement powerBankElement = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div[2]/div[1]/div/div/div[1]/div[1]/a/div/div/img"));
        powerBankElement.click();
        Thread.sleep(5000);

        WebElement powerbankblackaddElement = driver.findElement(By.xpath("//*[@id='product-35947']/div/div[1]/div[1]/div[2]/form/table/tbody/tr/td[2]/div/span[1]/i/img"));
        powerbankblackaddElement.click();

        WebElement addcartproduct = driver.findElement(By.cssSelector("div.single_add_to_cart_button-group"));
        addcartproduct.click();
        Thread.sleep(6000);


        WebElement viewcartElement = driver.findElement(By.xpath("//*[@id='cart-sidebar']/div[2]/div/div[2]/a[1]"));
        viewcartElement.click();
        Thread.sleep(6000);


        WebElement removeproductElement= driver.findElement(By.cssSelector("a.remove.text-muted"));
        removeproductElement.click();
        Thread.sleep(6000);
        actualerrormessage=driver.findElement(By.cssSelector("#content > div.checkout-content.mt-px-15 > div > div > p")).getText();
        Assert.assertTrue(actualerrormessage.contains(expectedErrorMesssage));
        System.out.println("test passed the cart is empty");







    }
}