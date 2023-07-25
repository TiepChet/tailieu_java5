package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "khachhang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHang {

    @Id
    @Column(name = "makhachhang")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maKhachHang;

    @Column(name = "tenkhachhang")
    private String tenKhachHang;
}
