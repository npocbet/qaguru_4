package guru.qa;


import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class SelenidePageOnGithubTests {

    @Test
    void SelenideWikiTest(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $$("#wiki-body a").filterBy(text("Soft assertions")).first().click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
