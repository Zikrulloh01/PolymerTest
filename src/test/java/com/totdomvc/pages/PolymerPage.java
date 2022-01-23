package com.totdomvc.pages;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.totdomvc.utilities.Driver.*;
public class PolymerPage extends BasePage{


    public void addNewToDo(String toDoBody){
        getDriver().findElement(By.id("new-todo")).sendKeys(toDoBody + Keys.ENTER);
    }


    @FindBy(id = "edit")
    public WebElement editableToDo;


    public WebElement getEditable(int index){
        return getDriver().findElement(By.xpath("(//*[@is='td-item'])[" + index + "]//label"));
    }

    public void editToDo(String newBody, int editableLength){
        for (int i = 0; i < editableLength; i ++ ){
            editableToDo.sendKeys(Keys.BACK_SPACE);
        }
        editableToDo.sendKeys(newBody + Keys.ENTER);
    }

    public WebElement addedToDo(String toDoName){
        return getDriver().findElement(By.xpath("//label[.='" + toDoName + "']"));
    }


}
