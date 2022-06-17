package com.appium.cucumber.pagefactory.elements;

import com.appium.cucumber.pagefactory.pages.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;

@Data
public class TaskDetailsElements extends BasePage {

    @iOSXCUITFindBy(accessibility = "apple_title_view")
    @AndroidFindBy(id = "com.example.nimitarora.todoapp:id/titleView")
    public MobileElement title;

    @iOSXCUITFindBy(accessibility = "apple_description_view")
    @AndroidFindBy(id = "com.example.nimitarora.todoapp:id/descpriction")
    public MobileElement description;
}
