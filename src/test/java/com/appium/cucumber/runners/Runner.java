package com.appium.cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/appium/cucumber/features",
        glue = "com/appium/cucumber/steps",
        tags = "@tasks",
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm", "pretty", "json:target/cucumber-report/report.json" },
        monochrome = true
)
public class Runner {
}
