package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.domain.Recipe;
import guru.springframework.spring5recipeapp.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {

   RecipeServiceImpl recipeService;

   @Mock
   RecipeRepository recipeRepository;

   @Before
   public void setUp() throws Exception {
      MockitoAnnotations.openMocks(this);

      recipeService = new RecipeServiceImpl(recipeRepository);
   }

   @Test
   public void getRecipes() {

      Recipe recipeOne = new Recipe();
      HashSet recipesData = new HashSet();
      recipesData.add(recipeOne);

      when(recipeRepository.findAll()).thenReturn(recipesData);

      Set<Recipe> recipes = recipeService.getRecipes();

      assertEquals(recipes.size(), 1);
      verify(recipeRepository, times(1)).findAll();
   }
}