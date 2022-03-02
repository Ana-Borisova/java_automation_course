package ru.stqa.java_automation_course.addressbook;

import org.testng.annotations.Test;
import ru.stqa.java_automation_course.addressbook.tests.TestBase;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.gotoGroupPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    returnToGrouPage();
  }

  private void returnToGrouPage() {
    app.returnToGroupPage();
  }

}