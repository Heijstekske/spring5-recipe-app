package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.services.RecipeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class IndexControllerTest {

   @Mock
   RecipeServiceImpl recipeService;
   @Mock
   Model model;

   IndexController controller;

   @Before
   public void setUp() throws Exception {
      MockitoAnnotations.openMocks(this);

      controller = new IndexController(recipeService);
   }

   @Test
   public void getIndexPage() {

      String viewName = controller.getIndexPage(model);

      assertEquals("index", viewName);
      verify(recipeService, times(1)).getRecipes();
      verify(model, times(1)).addAttribute(eq("recipes"), anySet());
   }
}