package com.springframework.udemy.sfgpetclinic.services.map;

import com.springframework.udemy.sfgpetclinic.model.Owner;
import com.springframework.udemy.sfgpetclinic.model.Pet;
import com.springframework.udemy.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetMapServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
