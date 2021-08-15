package projects.gabeross.springpetclinic.services;

import projects.gabeross.springpetclinic.models.Pet;
import projects.gabeross.springpetclinic.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet pet);

    Set<Vet> findAll();
}
