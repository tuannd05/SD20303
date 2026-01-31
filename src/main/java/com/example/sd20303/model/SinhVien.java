package com.example.sd20303.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SinhVien {

    @NotBlank(message = "Khong duoc de trong")
    private String id;

    @NotBlank(message = "Khong duoc de trong")
    private String fullName;

    @NotNull(message = "Chua chon gioi tinh")
    private Boolean gender;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @NotBlank(message = "Khong duoc de trong")
    private String photo;

    private Double mark;
}
