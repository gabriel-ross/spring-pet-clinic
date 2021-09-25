package projects.gabeross.springpetclinic.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Visit extends BaseEntity {

    private LocalDateTime dateTime;
    private String description;

    private Integer petId;
    private Pet pet;


    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
