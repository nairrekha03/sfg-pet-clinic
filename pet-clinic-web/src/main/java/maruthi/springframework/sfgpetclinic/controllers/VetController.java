package maruthi.springframework.sfgpetclinic.controllers;

import maruthi.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets", vetService.findAll());
        System.out.println("inside VetController: " + model.asMap().size());
        return "vets/index";
    }
}
