package base_tests;

import navigation.Navigator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import webdriver_builder.WebDriverBuilder;

public class BaseBrowserTest {

    public WebDriver driver;
    String loginUrl;

    public BaseBrowserTest() {
        loginUrl = "https://magento.softwaretestingboard.com/";
    }

    @BeforeClass
    public void driverSetup() {
        WebDriverBuilder wdb = new WebDriverBuilder();
        driver = wdb.getDriver();
        driver.manage().window().maximize();
        Navigator navigator = new Navigator(driver);
        navigator.navigateToGivenUrl(loginUrl);
    }

    @AfterClass
    public void driverCleanUp() {
        driver.quit();
    }

}
