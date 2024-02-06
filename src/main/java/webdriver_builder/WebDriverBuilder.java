package webdriver_builder;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverBuilder {

    public WebDriver getDriver() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-extensions");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--log-level=3");
        options.addArguments("--disable-site-isolation-trials");
        options.addArguments("--disable-print-preview");
        options.addArguments("--disable-allow-origins=*");
        options.addArguments("--disabale-gpu");
        options.addArguments("--disable-automation-extension");
        options.addArguments("--disable-password-manager-reauthentication");
        options.addArguments("--user-agent=browser-tests");
        options.addArguments("--window-size=1600,1000");

        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        return new ChromeDriver();
    }
}
