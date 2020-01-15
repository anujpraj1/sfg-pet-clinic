package com.springframework.udemy.sfgpetclinic.services;

import com.springframework.udemy.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
