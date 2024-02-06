package test_cases.men;

import base_tests.BaseBrowserTest;
import org.testng.annotations.Test;
import page_objects.main_page.MainPage;
import page_objects.mens.mens_tops.MensTopsPage;
import page_objects.mens.mens_tops.mens_tops_hoodies_sweatshirts.MensTopsHoodiesAndSweatshirts;

public class VerifyFunctionalityOfNavigatingToMensTopsHoodiesAndSweatshirtsPage extends BaseBrowserTest {

    @Test
    public void verifyNavigationFunctionalityToMensTopsHoodiesAndSweatshirts() {
        MainPage mainPage = new MainPage(driver);
        mainPage.moveToMensDropDown();
        MensTopsPage mensTopsPage = new MensTopsPage(driver);
        mensTopsPage.hoverToMensTopsOption();
        MensTopsHoodiesAndSweatshirts mensTopsHoodiesAndSweatshirts = new MensTopsHoodiesAndSweatshirts(driver);
        mensTopsHoodiesAndSweatshirts.clickMensTopsJackets();
        mensTopsHoodiesAndSweatshirts.confirmMensJacketsPageIsVisible();
    }
}
