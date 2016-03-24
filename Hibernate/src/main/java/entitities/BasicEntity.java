package entitities;

import javax.persistence.*;
import javax.persistence.Id;

/**
 * Created by David on 24. 3. 2016.
 */

@MappedSuperclass
public abstract class BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
