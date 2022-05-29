package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import utils.PropertyReader;


public class HomePage extends BasePage {
    private final String pageURL = PropertyReader.BASEURL;

    public HomePage(WebDriver driver) {
        super(driver);
        checkOnPage();
    }
    public HomePage checkOnPage() {
        Assertions.assertEquals("My Store", driver.getTitle(), "This is not Home Page" +
                " current page is: " + driver.getCurrentUrl());
        return this;
    }
}