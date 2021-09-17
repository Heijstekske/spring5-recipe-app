package guru.springframework.spring5recipeapp.domain;

import javax.persistence.*;

/**
 * @author NH 2021-09-17
 */
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uoaId;

    private String uomDescription;

    public Long getUoaId() {
        return uoaId;
    }

    public void setUoaId(Long uoaId) {
        this.uoaId = uoaId;
    }

    public String getUomDescription() {
        return uomDescription;
    }

    public void setUomDescription(String uon) {
        this.uomDescription = uon;
    }
}
