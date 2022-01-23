package com.totdomvc.tests;


import com.totdomvc.pages.PolymerPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PolymerTest extends TestBase{

    PolymerPage polymerPage = new PolymerPage();

    @Test
    public void test1() throws InterruptedException {

        polymerPage.getTab("JavaScript").click();
        polymerPage.getLink("Polymer").click();

        polymerPage.addNewToDo("Wake Up Early at 5 : 30 am.");
        polymerPage.addNewToDo("Pray at 7 : 00 am.");

        WebElement editable = polymerPage.getEditable(1);
        int chars = editable.getText().length();
        actions.doubleClick(editable).perform();
        String newBody = "This is edited To Do.";
        polymerPage.editToDo(newBody,chars);

        Assert.assertTrue(polymerPage.addedToDo(newBody).isDisplayed());


    }

}
