package ru.stqa.java_automation_course.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import ru.stqa.java_automation_course.addressbook.model.GroupData;
import ru.stqa.java_automation_course.addressbook.tests.TestBase;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
    app.wd.findElement(By.linkText("Logout")).click();
  }

}
