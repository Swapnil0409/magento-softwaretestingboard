package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.El;
import wait_times.WaitTimes;

import java.time.Duration;

import static utils.Matcher.fail;

public class BasePage {

    public WebDriver driver;
    public WaitTimes waitTimes = new WaitTimes();
    public Duration defaultWait = waitTimes.LONG_WAIT;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Finds the given element, and returns it as a {@code WebElement}. {@Code getElement()} should only be used to
     * get a {@Code WebElement} object of the element. To only assert on the visibility of the element.
     * use {@link #confirmElementIsVisible(El) confirmElementIsVisible}.
     *
     * @param el The El object that is searched for.
     * @return The {@code WebElement} that is found.
     */
    protected WebElement getElement(El el) {
        return getElement(el, defaultWait, "find the " + el.description);
    }

    /**
     * Finds the given element, and returns it as a {@code WebElement}. {@Code getElement()} should only be used to
     * get a {@Code WebElement} object of the element. To only assert on the visibility of the element.
     * use {@link #confirmElementIsVisible(El, Duration) confirmElementIsVisible}.
     *
     * @param el       The El object that is searched for.
     * @param waitTime The amount of time to searched for the element.
     * @return The {@code WebElement} that is found.
     */
    protected WebElement getElement(El el, Duration waitTime) {
        return getElement(el, waitTime, "find the " + el.description);
    }

    /**
     * Finds the given element, and returns it as a {@code WebElement}. {@Code getElement()} should only be used to
     * get a {@Code WebElement} object of the element. To only assert on the visibility of the element.
     * use {@link #confirmElementIsVisible(El, Duration, String) confirmElementIsVisible}.
     *
     * @param el           The El object that is searched for.
     * @param waitTime     The amount of time to searched for the element.
     * @param customAction The description of the action being taken.
     * @return The {@code WebElement} that is found.
     */
    protected WebElement getElement(El el, Duration waitTime, String customAction) {
        WebElement webElement = null;
        try {
            webElement = new WebDriverWait(driver, waitTime).until(ExpectedConditions.visibilityOfElementLocated(el.selector));
        } catch (Exception exception) {
            exception.printStackTrace();
            fail("Failed to " + customAction + " within " + waitTime.getSeconds() + " seconds!");
        }
        return webElement;
    }

    /**
     * Clicks on the center coordinator of the given element.
     *
     * @param el The El object that is searched for.
     */
    protected void clickElement(El el) {
        clickElement(el, defaultWait, "click on the " + el.description);
    }

    /**
     * Clicks on the center coordinator of the given element.
     *
     * @param el The El object that is searched for.
     * @param waitTime The amount of time to searched for the element.
     */
    protected void clickElement(El el, Duration waitTime) {
        clickElement(el, waitTime, "click on the " + el.description);
    }

    /**
     * Clicks on the center coordinator of the given element.
     *
     * @param el The El object that is searched for.
     * @param waitTime The amount of time to searched for the element.
     * @param customAction The description of the action being taken.
     */
    protected void clickElement(El el, Duration waitTime, String customAction) {
        try {
            WebElement webElement = getElement(el, waitTime);
            webElement.click();
        } catch (Exception exception) {
            exception.printStackTrace();
            fail("Failed to " + customAction + " within " + waitTime.getSeconds() + " seconds!");
        }
    }

    /**
     * Clicks on the center coordinator of the given element is that is enabled.
     *
     * @param el The El object that is searched for.
     */
    protected void clickIfEnabled(El el) {
        clickIfEnabled(el, defaultWait, "determine if the " + el.description + " is enabled");
    }

    /**
     * Clicks on the center coordinator of the given element is that is enabled.
     *
     * @param el The El object that is searched for.
     * @param waitTime The amount of time to searched for the element.
     */
    protected void clickIfEnabled(El el, Duration waitTime) {
        clickIfEnabled(el, waitTime, "determine if the " + el.description + " is enabled");
    }

    /**
     * Clicks on the center coordinator of the given element is that is enabled.
     *
     * @param el The El object that is searched for.
     * @param waitTime The amount of time to searched for the element.
     * @param customAction The description of the action being taken.
     */
    protected void clickIfEnabled(El el, Duration waitTime, String customAction) {
        try {
            WebElement webElement = getElement(el, waitTime);
            if (webElement.isEnabled()) {
                webElement.click();
            } else {
                throw new Exception("Button is disabled. Cannot Click");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            fail("Failed to " + customAction + " within " + waitTime.getSeconds() + " seconds!");
        }
    }

    /**
     * Inputs the given {@Code keys} into the given element.
     *
     * @param el The El object that is searched for.
     * @param keys The text to be sent to the given input.
     */
    protected void sendKeysToElement(El el, String keys) {
        sendKeysToElement(el, keys, defaultWait, "input " + keys + " into the " + el.description);
    }

    /**
     * Inputs the given {@Code keys} into the given element.
     *
     * @param el The El object that is searched for.
     * @param keys The text to be sent to the given input.
     * @param waitTime The amount of time to searched for the element.
     */
    protected void sendKeysToElement(El el, String keys, Duration waitTime) {
        sendKeysToElement(el, keys, waitTime, "input " + keys + " into the " + el.description);
    }

    /**
     * Inputs the given {@Code keys} into the given element.
     *
     * @param el The El object that is searched for.
     * @param keys The text to be sent to the given input.
     * @param waitTime The amount of time to searched for the element.
     * @param customAction The description of the action being taken.
     */
    protected void sendKeysToElement(El el, String keys, Duration waitTime, String customAction) {
        try {
            WebElement webElement = getElement(el, waitTime);
            webElement.sendKeys(keys);
        } catch (Exception exception) {
            exception.printStackTrace();
            fail("Failed to " + customAction + " within " + waitTime.getSeconds() + " seconds!");
        }
    }

    /**
     * First briefly waits for the element to be visible, before asserting that it is not visible on the page.
     * Only this method if the element being used is also being asserted on elsewhere, to avoid false positives.
     *
     * @param el The El object that is searched for.
     */
    protected void waitForElementToNoLongerBeVisible(El el) {
        waitForElementToNoLongerBeVisible(el, defaultWait, "not find the " + el.description + ". It should no longer be visible");
    }

    /**
     * First briefly waits for the element to be visible, before asserting that it is not visible on the page.
     * Only this method if the element being used is also being asserted on elsewhere, to avoid false positives.
     *
     * @param el The El object that is searched for.
     * @param waitTime The amount of time to searched for the element.
     */
    protected void waitForElementToNoLongerBeVisible(El el, Duration waitTime) {
        waitForElementToNoLongerBeVisible(el, waitTime, "not find the " + el.description + ". It should no longer be visible");
    }

    /**
     * First briefly waits for the element to be visible, before asserting that it is not visible on the page.
     * Only this method if the element being used is also being asserted on elsewhere, to avoid false positives.
     *
     * @param el The El object that is searched for.
     * @param waitTime The amount of time to searched for the element.
     * @param customAction The description of the action being taken.
     */
    protected void waitForElementToNoLongerBeVisible(El el, Duration waitTime, String customAction) {
        try {
            new WebDriverWait(driver, waitTimes.BRIEF_WAIT).until(ExpectedConditions.visibilityOfElementLocated(el.selector));
        } catch (Exception exception) {
            //Do nothing
        }
        try {
            new WebDriverWait(driver, waitTime).until(ExpectedConditions.invisibilityOfElementLocated(el.selector));
        } catch (Exception exception) {
            exception.printStackTrace();
            fail("Failed to " + customAction + " within " + waitTime.getSeconds() + " seconds!");
        }
    }

    /**
     * Asserts that the given element is visible in the window. Throws a {@code fail()} which ends the test execution if the
     * element is not visible within the waitTime.
     * To get the element as a {@code WelElement}, use {@link #getElement(El)} getElement}
     *
     * @param el The El object that is searched for.
     */
    protected void confirmElementIsVisible(El el) {
        confirmElementIsVisible(el, defaultWait, "find the " + el.description);
    }

    /**
     * Asserts that the given element is visible in the window. Throws a {@code fail()} which ends the test execution if the
     * element is not visible within the waitTime.
     * To get the element as a {@code WelElement}, use {@link #getElement(El)} getElement}
     *
     * @param el The El object that is searched for.
     * @param waitTime The amount of time to searched for the element.
     */
    protected void confirmElementIsVisible(El el, Duration waitTime) {
        confirmElementIsVisible(el, waitTime, "find the " + el.description);
    }

    /**
     * Asserts that the given element is visible in the window. Throws a {@code fail()} which ends the test execution if the
     * element is not visible within the waitTime.
     * To get the element as a {@code WelElement}, use {@link #getElement(El)} getElement}
     *
     * @param el The El object that is searched for.
     * @param waitTime The amount of time to searched for the element.
     * @param customAction The description of the action being taken.
     */
    protected void confirmElementIsVisible(El el, Duration waitTime, String customAction) {
        try {
            new WebDriverWait(driver, waitTime).until(ExpectedConditions.visibilityOfElementLocated(el.selector));
        } catch (Exception exception) {
            exception.printStackTrace();
            fail("Failed to " + customAction + " within " + waitTime.getSeconds() + " seconds!");
        }
    }

    //Element Interactions with Actions Methods
    public void moveToElementWithActions(El el) {
        moveToElementWithActions(el, defaultWait, "move the cursor to the " + el.description);
    }

    public void moveToElementWithActions(El el, Duration waitTime) {
        moveToElementWithActions(el, waitTime, "move the cursor to the " + el.description);
    }

    public void moveToElementWithActions(El el, Duration waitTime, String customAction) {
        try {
            WebElement webElement = getElement(el, waitTime);
            new Actions(driver).moveToElement(webElement).perform();
        } catch (Exception exception) {
            exception.printStackTrace();
            fail("Failed to " + customAction + " within " + waitTime.getSeconds() + " seconds!");
        }
    }

}
