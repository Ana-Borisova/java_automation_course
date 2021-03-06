package ru.stqa.java_automation_course.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import ru.stqa.java_automation_course.addressbook.model.GroupData;
import ru.stqa.java_automation_course.addressbook.tests.TestBase;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    app.getGroupHelper().wd.findElement(By.linkText("Logout")).click();
  }

}
