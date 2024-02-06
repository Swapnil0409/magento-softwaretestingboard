package page_objects.mens.mens_tops.mens_tops_hoodies_sweatshirts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.El;

public class MensTopsHoodiesAndSweatshirts extends BasePage {

    private final El MENS_TOPS_HOODIES_AND_SWEATSHIRTS = new El(By.id("ui-id-20"), "Mens Tops 'Hoodies & Sweatshirts'");
    private final El MENS_HOODIES_AND_SWEATSHIRTS_PAGE_HEADER = new El(By.xpath("//h1[@id='page-title-heading']//span[contains(text(),'Hoodies & Sweatshirts')]"), "Mens Tops 'Hoodies & Sweatshirts' Page Header");

    public MensTopsHoodiesAndSweatshirts(WebDriver driver) {
        super(driver);
    }

    public void clickMensTopsJackets() {
        clickElement(MENS_TOPS_HOODIES_AND_SWEATSHIRTS);
    }

    public void confirmMensJacketsPageIsVisible() {
        confirmElementIsVisible(MENS_HOODIES_AND_SWEATSHIRTS_PAGE_HEADER);
    }
}
