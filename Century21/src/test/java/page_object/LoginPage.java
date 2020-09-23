package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    WebDriver driver = null;

//@FindBy(how = How.CSS,using ="div[class='user hidden-md-down']")
//@FindBy(how = How.XPATH,using = "/html/body/div[1]/header/div[2]/div/div/div[2]/div[1]/div[3]/div[2]")
//@FindBy(how = How.CSS,using = "a[href^=\"https://www.c21stores.com/login\"]+Log In/Register")
//@FindBy(how = How.CSS,using = "span#user-id ")
// @FindBy(how = How.LINK_TEXT,using = "Log In/Register")
// FindBy(how = How.XPATH,using = "/html/body[@class='device-desktop']/div[@class='page']//div[@class='header']//div[@class='menu']/div[1]//a[@href='https://www.c21stores.com/login']//span[@class='user-message']")
//@FindBy(how = How.CSS,using = ".hidden-md-down.user > .user-message")


    @FindBy(how = How.XPATH,using = "/html/body[@class='device-desktop']/div[@class='page']//div[@class='header']//div[@class='menu']/div[1]//a[@href='https://www.c21stores.com/login']//span[@class='user-message']")
    //@FindBy(how = How.CLASS_NAME,using = "device-desktop")
    WebElement Loginbutton;


  public void getlogin(){
      Loginbutton.click();
    //  driver.get("https://www.c21stores.com/login");
     // Loginbutton.click();
    //Loginbutton.getLocation();
//driver.findElement(By.id("#user-id")).click();
//driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div[1]/div[3]/div[2]/a")).click();
driver.findElement(By.cssSelector("a[href$=\"https://www.c21stores.com/login\"]")).click();

  }

}
