package page_objects.mens.mens_tops.mens_tops_tanks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.El;

public class MensTopsTanks extends BasePage {

    private final El MENS_TOPS_TANKS = new El(By.id("ui-id-22"), "Mens Tops 'Tanks'");
    private final El MENS_TANKS_PAGE_HEADER = new El(By.xpath("//h1[@id='page-title-heading']//span[contains(text(),'Tanks')]"), "Mens Tops 'Tanks' Page Header");

    public MensTopsTanks(WebDriver driver) {
        super(driver);
    }

    public void clickMensTopsTanks() {
        clickElement(MENS_TOPS_TANKS);
    }

    public void confirmMensTanksPageIsVisible() {
        confirmElementIsVisible(MENS_TANKS_PAGE_HEADER);
    }
}
