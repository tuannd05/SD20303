package com.example.sd20303.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TaiKhoan")
public class TaiKhoan {

    @Id
    @Column(name = "Matk")
    private String matk;

    @Column(name = "Tentk")
    private String tentk;

  @ManyToOne
  @JoinColumn(name = "ChucVuId", referencedColumnName = "id")
  private ChucVu chucVu;

    @Column(name = "Ho")
    private String ho;

    @Column(name = "TenDem")
    private String tenDem;

    @Column(name = "Ten")
    private String ten;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "NgaySinh")
    private Date ngaySinh;

    @Column(name = "TrangThai")
    private Boolean trangThai;


}