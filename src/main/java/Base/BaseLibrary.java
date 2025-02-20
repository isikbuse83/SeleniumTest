package Base;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class BaseLibrary extends Data {

    public static WebDriver driver;

    public void sleep (int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void switchTab(int index)
    {
        List<String> Tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(index));
    }

}
