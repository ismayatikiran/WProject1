package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DiscountJoinPage {

    WebDriver driver = null;


    @FindBy(how = How.CSS, using = "[autocomplete=given-name] ")
    WebDriver firstname;
@FindBy(how = How.CLASS_NAME,using = "form-group field")
WebDriver Fname;
    @FindBy(how = How.XPATH,using = "//input[#'dwfrm_newsletter_firstName']")
    WebDriver myName;
    @FindBy(how = How.CSS, using = "#dwfrm_newsletter_lastName")
    WebElement lastname;
    @FindBy(how = How.CSS, using = "#dwfrm_newsletter_postalCode")
    WebElement zipcode;
    @FindBy(how = How.ID, using = "dwfrm_newsletter_email")
    WebElement email;
    @FindBy(how = How.ID, using = "subscribe")
    WebElement joinButton;


    public void discountPage(){

//    driver.findElement(By.cssSelector("#dwfrm_newsletter_firstName ")).sendKeys("Kiran");
        lastname.sendKeys("Riki");
        zipcode.sendKeys("11426");
        email.sendKeys("ismayatkiran96@gmail.com");
        joinButton.submit();

    }
}

