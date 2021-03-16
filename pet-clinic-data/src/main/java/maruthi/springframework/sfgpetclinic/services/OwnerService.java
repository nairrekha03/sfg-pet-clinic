package maruthi.springframework.sfgpetclinic.services;

import maruthi.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findbyLastName(String lastName);

}
