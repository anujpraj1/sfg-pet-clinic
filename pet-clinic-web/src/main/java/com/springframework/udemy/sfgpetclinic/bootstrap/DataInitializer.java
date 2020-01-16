package com.springframework.udemy.sfgpetclinic.bootstrap;

import com.springframework.udemy.sfgpetclinic.model.Owner;
import com.springframework.udemy.sfgpetclinic.model.Vet;
import com.springframework.udemy.sfgpetclinic.services.OwnerService;
import com.springframework.udemy.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Micheal");
        owner2.setLastName("Clark");

        ownerService.save(owner2);

        System.out.println("Saved Owners ...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Jessica");
        vet1.setLastName("Lee");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Wne");
        vet2.setLastName("Karter");

        vetService.save(vet2);

        System.out.println("Saved Vets ...");
    }
}
