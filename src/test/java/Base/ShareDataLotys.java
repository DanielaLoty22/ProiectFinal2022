package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShareDataLotys {


    //Declaram variabila webdriver cu selenium

    public WebDriver driver;

    @Before
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lotys\\OneDrive\\Desktop\\Azimut\\ChromeDriver\\chromedriver.exe");
        //Deschidem o instanta de chrome
        driver = new ChromeDriver();
        //Accesam un url
        driver.get("https://lotys-shop.com/");
        //Facem driverul in modul maximize
        driver.manage().window().maximize();

        }
        @After
    public void TearDown(){
        //driver.quit();
        }




    }

