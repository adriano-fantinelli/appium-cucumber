package com.appium.cucumber.pagefactory.elements;

import com.appium.cucumber.pagefactory.pages.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;

@Data
public class ToDoListElements extends BasePage {

    @iOSXCUITFindBy(accessibility = "apple_toolbar")
    @AndroidFindBy(id = "com.example.nimitarora.todoapp:id/toolbar")
    public MobileElement toolbar;

    @iOSXCUITFindBy(accessibility = "apple_addTask")
    @AndroidFindBy(id = "com.example.nimitarora.todoapp:id/fab")
    public MobileElement addTask;

    @iOSXCUITFindBy(accessibility = "apple_last_task")
    @AndroidFindBy(xpath = "//android.widget.ListView/android.widget.FrameLayout[last()]")
    public MobileElement lastTask;
}
