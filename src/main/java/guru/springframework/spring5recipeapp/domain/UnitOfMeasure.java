package guru.springframework.spring5recipeapp.domain;

import javax.persistence.*;

/**
 * @author NH 2021-09-17
 */
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long uoaId) {
        this.id = uoaId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String uon) {
        this.description = uon;
    }
}
