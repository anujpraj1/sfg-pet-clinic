package com.springframework.udemy.sfgpetclinic.services.map;

import com.springframework.udemy.sfgpetclinic.model.Owner;
import com.springframework.udemy.sfgpetclinic.model.Vet;
import com.springframework.udemy.sfgpetclinic.services.CrudService;
import com.springframework.udemy.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
