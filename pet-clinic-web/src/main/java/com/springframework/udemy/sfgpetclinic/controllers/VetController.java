package com.springframework.udemy.sfgpetclinic.controllers;

import com.springframework.udemy.sfgpetclinic.services.map.VetMapServiceMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetMapServiceMap vetMapServiceMap;

    public VetController(VetMapServiceMap vetMapServiceMap) {
        this.vetMapServiceMap = vetMapServiceMap;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(Model model) {
        model.addAttribute("vets", vetMapServiceMap.findAll());
        return "vets/index";
    }
}
