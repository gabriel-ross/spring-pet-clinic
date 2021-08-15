package projects.gabeross.springpetclinic.models;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    // recommendation of hibernate to use box types rather than primitives,
    // as box types can be null
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
