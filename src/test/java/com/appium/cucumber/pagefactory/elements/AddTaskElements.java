package com.appium.cucumber.pagefactory.elements;

import com.appium.cucumber.pagefactory.pages.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;

@Data
public class AddTaskElements extends BasePage {

    @iOSXCUITFindBy(accessibility = "apple_title")
    @AndroidFindBy(id = "com.example.nimitarora.todoapp:id/task")
    public MobileElement title;

    @iOSXCUITFindBy(accessibility = "apple_description")
    @AndroidFindBy(id = "com.example.nimitarora.todoapp:id/descp")
    public MobileElement description;

    @iOSXCUITFindBy(accessibility = "apple_tomorrow")
    @AndroidFindBy(xpath = "//android.widget.NumberPicker[2]/android.widget.Button[2]")
    public MobileElement tomorrow;

    @iOSXCUITFindBy(accessibility = "apple_action_save")
    @AndroidFindBy(id = "com.example.nimitarora.todoapp:id/action_save")
    public MobileElement addTaks;
}
