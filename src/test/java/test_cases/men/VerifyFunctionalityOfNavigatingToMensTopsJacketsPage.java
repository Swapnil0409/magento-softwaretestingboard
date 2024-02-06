package test_cases.men;

import base_tests.BaseBrowserTest;
import org.testng.annotations.Test;
import page_objects.main_page.MainPage;
import page_objects.mens.mens_tops.MensTopsPage;
import page_objects.mens.mens_tops.mens_tops_jackets.MensTopsJackets;

public class VerifyFunctionalityOfNavigatingToMensJacketsPage extends BaseBrowserTest {

    @Test
    public void verifyNavigationFunctionalityToMensJacketsPage() {

        MainPage mainPage = new MainPage(driver);
        mainPage.moveToMensDropDown();
        MensTopsPage mensTopsPage = new MensTopsPage(driver);
        mensTopsPage.hoverToMensTopsOption();
        MensTopsJackets mensTopsJackets = new MensTopsJackets(driver);
        mensTopsJackets.clickMensTopsJackets();
        mensTopsJackets.confirmMensJacketsPageIsVisible();
    }
}
