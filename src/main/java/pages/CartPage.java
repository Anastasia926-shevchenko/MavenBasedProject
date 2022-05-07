package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private final WebDriver driver;

    private By totalAmount = By.id("total_price");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkTotalAmount() {
        WebElement amount = driver.findElement(totalAmount);
        Assertions.assertEquals("$55.00", amount.getText());
    }
}