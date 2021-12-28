package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author NH 2021-12-03
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

   Optional<Category> findByDescription(String description);
}
