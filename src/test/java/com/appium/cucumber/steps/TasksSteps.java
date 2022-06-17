package com.appium.cucumber.steps;

import com.appium.cucumber.pagefactory.pages.AddTaskPage;
import com.appium.cucumber.pagefactory.pages.TaskDetailsPage;
import com.appium.cucumber.pagefactory.pages.ToDoListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TasksSteps {

    ToDoListPage toDoListPage = new ToDoListPage();
    AddTaskPage addTaskPage = new AddTaskPage();
    TaskDetailsPage taskDetailsPage = new TaskDetailsPage();

    @Given("User see the To Do List")
    public void user_see_the_to_do_list() {
        toDoListPage.isToDoListPage();
    }

    @Given("User access the Add Task Screen")
    public void user_access_the_add_task_screen() {
        toDoListPage.clickAddTask();
    }

    @Given("User put title value {string}")
    public void user_put_title_value_new_task(String titleValue) {
        addTaskPage.fillFieldTitle(titleValue);
    }

    @Given("User put description value {string}")
    public void user_put_description_value_this_is_a_new_task(String descriptionValue) {
        addTaskPage.fillFieldDescription(descriptionValue);
    }

    @Given("User put due by value to tomorrow")
    public void user_put_due_by_value_to_tomorrow() {
        addTaskPage.clickBtnTomorrow();
    }

    @When("User click on add task")
    public void user_click_on_add_task() {
        addTaskPage.clickBtnAddTask();
    }

    @When("User click on the created task")
    public void user_click_on_the_created_task() {
        toDoListPage.clickLastTask();
    }

    @Then("The tasks should be created with the title value {string}")
    public void the_tasks_should_be_created_with_the_title_value(String titleValue) {
        Assert.assertEquals(taskDetailsPage.titleText(), titleValue);
    }

    @Then("The tasks should be created with the description value {string}")
    public void the_tasks_should_be_created_with_the_description_value(String descriptionValue) {
        Assert.assertEquals(taskDetailsPage.descriptionText(), descriptionValue);
    }
}