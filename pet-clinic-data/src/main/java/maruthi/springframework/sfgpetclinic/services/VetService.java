package maruthi.springframework.sfgpetclinic.services;

import maruthi.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findbyId(Long Id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
