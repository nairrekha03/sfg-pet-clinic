package maruthi.springframework.sfgpetclinic.services;

import maruthi.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findbyLastName(String lastName);

}
