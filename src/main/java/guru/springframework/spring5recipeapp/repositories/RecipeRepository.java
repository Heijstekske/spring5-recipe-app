package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author NH 2021-12-03
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
