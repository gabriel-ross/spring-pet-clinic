package projects.gabeross.springpetclinic.services;

import projects.gabeross.springpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
