package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author NH 2021-12-03
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

   Optional<UnitOfMeasure> findByDescription(String description);
}
