package tests;


import org.junit.jupiter.api.Test;
import pages.ContactUsPage;
import pages.HomePage;
import utils.PropertyReader;


public class OpenContactUsPage extends WebDriverFactory {
    @Test
    public void test(){
        driver.get(PropertyReader.BASEURL);
        HomePage homePage = new HomePage(driver).waitOnPage();
        homePage.checkOnPage();
        ContactUsPage contactUsPage = homePage.clickContactUsButton();
        contactUsPage.checkOnPage();
    }
}