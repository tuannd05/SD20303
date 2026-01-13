package com.example.sd20303.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    // ten thuoc tinh phai cung ten voi cac parameter trong file html (name)
    private String username;
    private String password;
}
