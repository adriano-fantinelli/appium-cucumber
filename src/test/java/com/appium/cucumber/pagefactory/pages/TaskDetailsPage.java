package com.appium.cucumber.pagefactory.pages;

import com.appium.cucumber.pagefactory.elements.TaskDetailsElements;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class TaskDetailsPage extends TaskDetailsElements {

    public TaskDetailsPage() {
        PageFactory.initElements(new AppiumFieldDecorator((getDriver()), Duration.ofSeconds(10)), this);
    }

    public String titleText() {
        return getText(getTitle());
    }

    public String descriptionText() {
        return getText(getDescription());
    }
}