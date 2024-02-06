package page_objects.mens.mens_tops.mens_tops_tees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.El;

public class MensTopsTees extends BasePage {

    private final El MENS_TOPS_TEES = new El(By.id("ui-id-21"), "Mens Tops 'Tees'");
    private final El MENS_TEES_PAGE_HEADER = new El(By.xpath("//h1[@id='page-title-heading']//span[contains(text(),'Tees')]"), "Mens Tops 'Tees' Page Header");

    public MensTopsTees(WebDriver driver) {
        super(driver);
    }

    public void clickMensTopsTees() {
        clickElement(MENS_TOPS_TEES);
    }

    public void confirmMensTeesPageIsVisible() {
        confirmElementIsVisible(MENS_TEES_PAGE_HEADER);
    }
}
