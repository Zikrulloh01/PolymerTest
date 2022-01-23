package com.totdomvc.pages;

import static com.totdomvc.utilities.Driver.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage(){
        PageFactory.initElements(getDriver(), this);
    }



    public WebElement getTab(String tabName){
        return getDriver().findElement(By.xpath("//div[.='" + tabName + "']"));

    }

    public WebElement getLink(String linkName){
        return getDriver().findElement(By.linkText(linkName));
    }

}
