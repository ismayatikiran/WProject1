package browserdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowserDriver {


    public static WebDriver driver = null;


  @BeforeMethod
    public void setUp() {
        /**
         *
         * Here we will setup the driver
         *
         * */
        System.setProperty("webdriver.chrome.driver","C:/BATCH-OF-2020/WebAB2002/Generic/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(700, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        // Open Browser with the Home Page
        driver.get("https://individual.carefirst.com/individuals-families/home.page");
        driver.findElement(By.className("close-cross")).click();
        driver.findElement(By.className("cookie-ok-btn bttn-width"));

      }

    }


//    public static void main(String[] args) {
//        BrowserDriver browserDriver =new BrowserDriver();
//        browserDriver.setUp();
//        driver.findElement(By.className("close-cross")).click();
//    }



