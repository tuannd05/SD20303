package com.example.sd20303.controller;

import com.example.sd20303.model.Account;
import com.example.sd20303.model.SinhVien;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sinh-vien")
public class DataBindingController {
    @GetMapping("/form")
    public String hienThi(Model model, @ModelAttribute("sinhVien") SinhVien sinhVien){
        model.addAttribute("sinhVien", new SinhVien());
        return "binding-form.html";
    }
    @PostMapping("/save")
    public String save(Model model, @ModelAttribute("sinhVien") @Valid SinhVien sinhVien, Errors errors){
        System.out.println(sinhVien.toString());
        if (errors.hasErrors()){
            model.addAttribute("message", "Save that bai");
        } else {
            model.addAttribute("message", "Save thanh cong");
        }
        return "binding-form.html";
    }

}
