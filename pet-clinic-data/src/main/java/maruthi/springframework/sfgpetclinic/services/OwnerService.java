package maruthi.springframework.sfgpetclinic.services;

import maruthi.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findbyLastName(String lastName);
    Owner findbyId(Long Id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
