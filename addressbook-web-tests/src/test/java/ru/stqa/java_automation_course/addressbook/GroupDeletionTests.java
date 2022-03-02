package ru.stqa.java_automation_course.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGrouPage();
  }

  private void returnToGrouPage() {
    wd.findElement(By.linkText("group page")).click();
  }

}