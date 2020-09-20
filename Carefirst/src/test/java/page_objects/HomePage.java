package page_objects;

import browserdriver.BrowserDriver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage {

    WebDriver driver = null;

//    @FindBy(how = How.CLASS_NAME, using = "close-cross")
//    WebElement popUpcloseButton;

    @FindBy(how = How.ID, using = "search-toggle")
    WebElement searchButton1;

    @FindBy(how = How.ID, using = "search_button")
    WebElement searchButton2;

    @FindBy(how = How.CLASS_NAME, using = "search-bar")
    WebElement searchBox;



    public void clickSearchbutton(){
        searchButton1.click();
        searchBox.sendKeys("Contact Us");

        searchButton2.click();
//       // TestLogger.log("Click Search Box");
       // return getPageTitle();

    }





//    public String getPageTitle(){
//        String pageTitle = driver.getTitle();
//       // TestLogger.log("Page Title: "+pageTitle);
//        return pageTitle;
//    }
}
