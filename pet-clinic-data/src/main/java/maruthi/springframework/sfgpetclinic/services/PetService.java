package maruthi.springframework.sfgpetclinic.services;


import maruthi.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findbyId(Long Id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
