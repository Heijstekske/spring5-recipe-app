package guru.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author NH 2021-09-17
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @OneToOne
   private Recipe recipe;

   @Lob
   private String recipeNotes;
}
