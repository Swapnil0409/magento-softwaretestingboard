package page_objects.mens_tops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.El;

public class MensTopsPage extends BasePage {

    private final El MENS_TOPS_DROPDOWN_OPTION = new El(By.id("ui-id-17"), "Mens 'Tops' dropdown option");

    public MensTopsPage(WebDriver driver) {
        super(driver);
    }

    public void hoverToMensTopsOption() {
        moveToElementWithActions(MENS_TOPS_DROPDOWN_OPTION);
    }
}
