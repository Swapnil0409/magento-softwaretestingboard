package test_cases.men;

import base_tests.BaseBrowserTest;
import org.testng.annotations.Test;
import page_objects.main_page.MainPage;
import page_objects.mens.mens_tops.MensTopsPage;
import page_objects.mens.mens_tops.mens_tops_tanks.MensTopsTanks;

public class VerifyFunctionalityOfNavigatingToMensTopsTanksPage extends BaseBrowserTest {

    @Test
    public void verifyNavigationFunctionalityToMensTopsTanks() {

        MainPage mainPage = new MainPage(driver);
        mainPage.moveToMensDropDown();
        MensTopsPage mensTopsPage = new MensTopsPage(driver);
        mensTopsPage.hoverToMensTopsOption();
        MensTopsTanks mensTopsTanks = new MensTopsTanks(driver);
        mensTopsTanks.clickMensTopsTanks();
        mensTopsTanks.confirmMensTanksPageIsVisible();
    }
}
