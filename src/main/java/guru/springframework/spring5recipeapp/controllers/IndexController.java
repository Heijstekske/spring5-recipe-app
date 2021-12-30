package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.domain.Category;
import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;
import guru.springframework.spring5recipeapp.repositories.CategoryRepository;
import guru.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import guru.springframework.spring5recipeapp.services.RecipeService;
import guru.springframework.spring5recipeapp.services.RecipeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author NH 2021-09-14
 */
@Slf4j
@Controller
public class IndexController {

   private final RecipeServiceImpl recipeService;

   public IndexController(RecipeServiceImpl recipeService) {
      this.recipeService = recipeService;
   }

   @RequestMapping({"", "/", "/index"})
   public String getIndexPage(Model model) {
      log.debug("Getting Index Page");

      model.addAttribute("recipes", recipeService.getRecipes());

      return "index";
   }
}
