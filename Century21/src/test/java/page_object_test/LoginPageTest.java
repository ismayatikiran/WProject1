package page_object_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object.LoginPage;

public class LoginPageTest extends BrowserDriver {

    WebDriver driver = null;
    LoginPage loginPage = null;

    @BeforeMethod
    public void initializedPages () {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }
     @Test
        public void testloginPage(){
            loginPage.getlogin();

        }



        }

