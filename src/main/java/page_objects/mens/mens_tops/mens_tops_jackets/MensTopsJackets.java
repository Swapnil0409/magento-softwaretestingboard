package page_objects.mens.mens_tops.mens_tops_jackets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.El;

public class MensTopsJackets extends BasePage {

    private final El MENS_TOPS_JACKETS = new El(By.id("ui-id-19"), "Mens Tops 'Jackets'");
    private final El MENS_JACKETS_PAGE_HEADER = new El(By.xpath("//h1[@id='page-title-heading']//span[contains(text(),'Jackets')]"), "Mens Tops 'Jackets' Page Header");

    public MensTopsJackets(WebDriver driver) {
        super(driver);
    }

    public void clickMensTopsJackets() {
        clickElement(MENS_TOPS_JACKETS);
    }

    public void confirmMensJacketsPageIsVisible() {
        confirmElementIsVisible(MENS_JACKETS_PAGE_HEADER);
    }
}
