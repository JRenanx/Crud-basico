package com.renan.crud.controller;

import com.renan.crud.model.Register;
import com.renan.crud.service.RegisterService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    // Pagina de Cadastros
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listRegisters", registerService.getAllRegisters());
        return "index";
    }

    // Criação de novo cadastro
    @GetMapping("/showNewRegisterForm")
    @NotNull
    public String showNewRegisterForm(Model model){
        Register register = new Register();
        model.addAttribute("register", register);
        return "new register";
    }

    // Salvar cadastro
    @PostMapping("/saveRegister")
    public String saveRegister(@ModelAttribute("register") Register register){
    registerService.saveRegister(register);
    return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable ("id") long id, Model model){
    Register register = registerService.getRegisterById(id);
    model.addAttribute("register", register);
    return "update register";
    }

    @GetMapping("/deleteRegister/{id}")
    public String deleteRegister(@PathVariable("id") long id){
    this.registerService.deleteById(id);
    return "redirect:/";
    }


}


