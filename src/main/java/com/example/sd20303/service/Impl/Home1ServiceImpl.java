package com.example.sd20303.service.Impl;

import com.example.sd20303.service.HomeService;
import org.springframework.stereotype.Service;

@Service
public class Home1ServiceImpl implements HomeService {
    @Override
    public String hienThi() {
        return "home1-page.html";
    }
}
