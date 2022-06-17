package com.appium.cucumber.pagefactory.pages;

import com.appium.cucumber.pagefactory.elements.ToDoListElements;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ToDoListPage extends ToDoListElements {

    public ToDoListPage() {
        PageFactory.initElements(new AppiumFieldDecorator((getDriver()), Duration.ofSeconds(10)), this);
    }

    public void isToDoListPage() {
        visibilityOf(getToolbar());
    }

    public void clickAddTask() {
        click(getAddTask());
    }

    public void clickLastTask() {
        click(getLastTask());
    }
}
