import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Date;


public class CategoryTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void all_emptyAtFirst() {
    assertEquals(Category.all().size(), 0);
  }

  // @Test
  // public void equals_returnsTrueIfNamesAretheSame() {
  //   Category firstCategory = new Category("Household chores");
  //   Category secondCategory = new Category("Household chores");
  //   assertTrue(firstCategory.equals(secondCategory));
  // }
  //
  // @Test
  // public void save_savesIntoDatabase_true() {
  //   Category myCategory = new Category("Household chores");
  //   myCategory.save();
  //   assertTrue(Category.all().get(0).equals(myCategory));
  // }
  //
  // @Test
  // public void find_findCategoryInDatabase_true() {
  //   Category myCategory = new Category("Household chores");
  //   myCategory.save();
  //   Category savedCategory = Category.find(myCategory.getId());
  //   assertTrue(myCategory.equals(savedCategory));
  // }

  // @Test
  // public void getTasks_retrievesALlTasksFromDatabase_tasksList() {
  //   Category myCategory = new Category("Household chores");
  //   myCategory.save();
  //
  //   Task firstTask = new Task("Mow the lawn",'01-02-2003 00-00-00',false);
  //   firstTask.save();
  //   myCategory.addTask(firstTask);
  //
  //   Task secondTask = new Task("Do the dishes",'12-04-2001 00-00-00',false);
  //   secondTask.save();
  //   myCategory.addTask(secondTask);
  //   Task[] tasks = new Task[] { firstTask, secondTask };
  //   assertTrue(myCategory.getTasks().containsAll(Arrays.asList(tasks)));
  // }

}
