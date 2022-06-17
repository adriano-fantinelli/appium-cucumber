package com.appium.cucumber.pagefactory.pages;

import com.appium.cucumber.pagefactory.elements.AddTaskElements;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class AddTaskPage extends AddTaskElements {

    public AddTaskPage() {
        PageFactory.initElements(new AppiumFieldDecorator((getDriver()), Duration.ofSeconds(10)), this);
    }

    public void fillFieldTitle(String titleValue) {
        sendKeys(getTitle(), titleValue);
    }

    public void fillFieldDescription(String descriptionValue) {
        sendKeys(getDescription(), descriptionValue);
    }

    public void clickBtnTomorrow() {
        click(getTomorrow());
    }

    public void clickBtnAddTask() {
        click(getAddTaks());
    }
}
