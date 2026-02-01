package com.example.sd20303.repository;


import com.example.sd20303.model.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChucVuRepo extends JpaRepository<ChucVu, Integer> {

}