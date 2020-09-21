package page_object_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object.DiscountJoinPage;

public class DiscountJoinPageTest extends BrowserDriver{

    DiscountJoinPage discountJoinPage = null;

    @BeforeMethod
    public void initializedPages (){
        discountJoinPage = PageFactory.initElements(driver, DiscountJoinPage.class);
    }

    @Test
    public void testdiscountpage(){

        discountJoinPage.discountPage();
    }


}
