package guru.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author NH 2021-09-17
 */
@Data
@Entity
public class UnitOfMeasure {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String description;
}
