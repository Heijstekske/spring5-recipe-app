package guru.springframework.spring5recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CategoryTest {

   Category category;

   @Before
   public void setup(){
      category = new Category();
   }

   @Test
   public void getId() {
      Long idValue = 4L;

      category.setId(idValue);

      assertEquals(idValue, category.getId());
   }

   @Test
   public void getDescription() {
      String testDescription = "Test Category";
      category.setDescription(testDescription);
      assertEquals(testDescription, category.getDescription());
   }

   @Test
   public void getRecipes() {
      Recipe recipeOne = new Recipe();
      recipeOne.setId(1L);
      Recipe recipeTwo = new Recipe();
      recipeTwo.setId(2L);
      Set<Recipe> testRecipes = new HashSet<>();
      testRecipes.add(recipeOne);
      testRecipes.add(recipeTwo);

      category.setRecipes(testRecipes);

      assert (category.getRecipes().size() == 2);
      assertEquals(testRecipes, category.getRecipes());
   }
}