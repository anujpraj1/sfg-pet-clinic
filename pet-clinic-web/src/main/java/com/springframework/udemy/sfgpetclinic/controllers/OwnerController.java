package com.springframework.udemy.sfgpetclinic.controllers;

import com.springframework.udemy.sfgpetclinic.services.map.OwnerMapServiceMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerMapServiceMap ownerMapServiceMap;

    public OwnerController(OwnerMapServiceMap ownerMapServiceMap) {
        this.ownerMapServiceMap = ownerMapServiceMap;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerMapServiceMap.findAll());
        return "owners/index";
    }
}



