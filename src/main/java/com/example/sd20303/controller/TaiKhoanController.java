package com.example.sd20303.controller;

import com.example.sd20303.model.TaiKhoan;
import com.example.sd20303.repository.ChucVuRepo;
import com.example.sd20303.repository.TaiKhoanRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tai-khoan")
public class TaiKhoanController {

    @Autowired
    private TaiKhoanRepo taiKhoanRepo;

    @Autowired
    private ChucVuRepo chucVuRepo;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("taiKhoan", new TaiKhoan());
        model.addAttribute("listTaiKhoan", taiKhoanRepo.findAll());
        model.addAttribute("listChucVu", chucVuRepo.findAll());
        return "TaiKhoan/hien-thi.html";
    }

    @PostMapping("/save")
    public String themMoi(
            Model model,
            @Valid @ModelAttribute("taiKhoan") TaiKhoan taiKhoan,
            Errors errors
    ) {
        if (errors.hasErrors()) {
            model.addAttribute("listTaiKhoan", taiKhoanRepo.findAll());
            model.addAttribute("listChucVu", chucVuRepo.findAll());
            return "TaiKhoan/hien-thi.html";
        }
        taiKhoanRepo.save(taiKhoan);
        return "redirect:/tai-khoan/hien-thi";
    }

    @GetMapping("/delete/{matk}")
    public String delete(@PathVariable String matk) {
        taiKhoanRepo.deleteById(matk);
        return "redirect:/tai-khoan/hien-thi";
    }

    @GetMapping("/edit/{matk}")
    public String edit(
            @PathVariable String matk,
            Model model
    ) {
        model.addAttribute(
                "taiKhoan",
                taiKhoanRepo.findById(matk).orElse(null)
        );
        model.addAttribute("listChucVu", chucVuRepo.findAll());
        return "TaiKhoan/chi-tiet.html";
    }


    @PostMapping("/update/{matk}")
    public String update(
            @PathVariable String matk,
            @Valid @ModelAttribute("taiKhoan") TaiKhoan taiKhoan,
            Errors errors,
            Model model
    ) {
        if (errors.hasErrors()) {
            model.addAttribute("listChucVu", chucVuRepo.findAll());
            return "TaiKhoan/chi-tiet.html";
        }
        taiKhoan.setMatk(matk);
        taiKhoanRepo.save(taiKhoan);
        return "redirect:/tai-khoan/hien-thi";
    }
}