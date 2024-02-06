package test_cases.men;

import base_tests.BaseBrowserTest;
import org.testng.annotations.Test;
import page_objects.main_page.MainPage;
import page_objects.mens.mens_tops.MensTopsPage;
import page_objects.mens.mens_tops.mens_tops_tees.MensTopsTees;

public class VerifyFunctionalityOfNavigatingToMensTopsTeesPage extends BaseBrowserTest {

    @Test
    public void verifyNavigationFunctionalityToMensTopsTeesPage() {

        MainPage mainPage = new MainPage(driver);
        mainPage.moveToMensDropDown();
        MensTopsPage mensTopsPage = new MensTopsPage(driver);
        mensTopsPage.hoverToMensTopsOption();
        MensTopsTees mensTopsTees = new MensTopsTees(driver);
        mensTopsTees.clickMensTopsTees();
        mensTopsTees.confirmMensTeesPageIsVisible();
    }
}
