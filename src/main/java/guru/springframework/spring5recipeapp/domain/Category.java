package guru.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author NH 2021-09-17
 */

@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String description;

   @ManyToMany(mappedBy = "categories", fetch = FetchType.EAGER)
   private Set<Recipe> recipes = new HashSet<>();
}
