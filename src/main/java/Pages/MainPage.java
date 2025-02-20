package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MainPage extends BaseTest {

    public String getAccount() {
        return driver.findElements(By.cssSelector("[class='link-text']")).get(0).getText();
    }

    public MainPage fillSearch(String text)
    {
        driver.findElement(By.cssSelector("[data-testid=\"suggestion\"]")).sendKeys(text, Keys.ENTER);
        return this;
    }
}
