package com.example.sd20303.controller;

import com.example.sd20303.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("account")
public class AccountController {
    // mo trang login
    @GetMapping("login")
    public String login() {
        return "login.html";
    }
    // xu ly login
    @PostMapping("login")
    public String login(
            Account account, Model model
    ){
//     co the dung: @RequestParam("username") String user => de khai bao du lieu tu form
//        System.out.println(user);
//        System.out.println(pass);
        if(account.getUsername().equals("ph58439") && account.getPassword().equals("123")) {
            model.addAttribute("message", "Login thanh cong");
        } else {
            model.addAttribute("message", "Login that bai");
        }
        return "result.html";
    }

    // vi du ve forward va redirect

    @GetMapping("url1")
    public String url1(){
        return "result.html";
    }

    @GetMapping("url2")
    public String url2(
//            Model model
            RedirectAttributes params
    ){
        params.addAttribute("message", "hello ban");
        return "redirect:/account/url1";
    }
}
