package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import pages.ContactUsPage;
import pages.HomePage;
import utils.PropertyReader;
import utils.WebDriverUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class OpenContactUsPage extends WebDriverFactory {

    @AfterEach
    public void allureAttachments() {
        File screenShot = WebDriverUtils.doScreenshot(driver);
        try {
            Allure.addAttachment("contact us page opening test screenshot", Files.newInputStream(screenShot.toPath()));
        } catch (IOException e) {
            System.err.println("screenshot couldn't be attached");
        }
    }

    @Epic("Website store")
    @Feature("User actions on website")
    @Story("Opening contacts")
    @Issue("JRE-2")
    @Description("Open contact us page")
    @Test
    public void moveToContactPage() {
        driver.get(PropertyReader.BASEURL);
        HomePage homePage = new HomePage(driver).waitOnPage();
        homePage.checkOnPage();
        ContactUsPage contactUsPage = homePage.clickContactUsButton();
        contactUsPage.checkOnPage();
    }
}