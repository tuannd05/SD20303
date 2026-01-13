package com.example.sd20303.controller;

import com.example.sd20303.service.HomeService;
import com.example.sd20303.service.Impl.Home1ServiceImpl;
import com.example.sd20303.service.Impl.HomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//    Tien to chung
@RequestMapping("/home")
public class HomeController {
//    @Autowired
//    HomeService homeService;
    HomeService homeService = new HomeServiceImpl();//goi tu service
    HomeService homeService1 = new Home1ServiceImpl();
//  C1: @RequestMapping(value = {"/home/list"}, method = {RequestMethod.GET})
    // Goi ra mot duong dan cu the
    // Mac dinh khong ghi phuong thuc la method get
//  C2: @GetMapping, @PostMapping
    // @GetMapping("url") => co duong dan la url va phuong thuc la get
    // @PostMapping("url") => co duong dan la url va phuong thuc la post
    // GET: hien thi
    // POST: xu ly
    @GetMapping("/list")
    public String list(Model  model) {
//        model.addAttribute("message", "Nguyen Dang Tuan");
//        return ve file html (neu co trong thu muc thi /thu muc/ten file)
        return homeService.hienThi();// co the viet them duoi html
    }
    @GetMapping("/list1")
    public String list1(){
        return homeService1.hienThi();
    }
}
