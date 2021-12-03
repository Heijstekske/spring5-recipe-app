package guru.springframework.spring5recipeapp.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * @author NH 2021-09-17
 */
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String description;

    @ManyToMany(mappedBy = "categories")

    private Set<Recipe> recipes;


    //getters & setters
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}
