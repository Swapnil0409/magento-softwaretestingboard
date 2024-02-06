package navigation;

import org.openqa.selenium.WebDriver;

public class Navigator {

    private final WebDriver driver;

    public Navigator(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToGivenUrl(String url) {
        try {
            driver.navigate().to(url);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
