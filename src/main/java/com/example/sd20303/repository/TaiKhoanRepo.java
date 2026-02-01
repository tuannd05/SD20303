package com.example.sd20303.repository;


import com.example.sd20303.model.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository: Đánh dấu string bean là repo
//public interface TaiKhoanRepo extends JpaRepository<TaiKhoan, String> {
// kế thừa lại jparepo truyền vào gồm: class entity, kiểu khoá chính có thể String, Integer,...
//}
@Repository
public interface TaiKhoanRepo extends JpaRepository<TaiKhoan, String> {

}