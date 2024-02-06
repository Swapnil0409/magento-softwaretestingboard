package page_objects.main_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.El;

public class MainPage extends BasePage {

    private final El MENS_DROPDOWN = new El(By.id("ui-id-5"), "'Mens' dropdown");


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void moveToMensDropDown() {
        moveToElementWithActions(MENS_DROPDOWN);
    }
}
