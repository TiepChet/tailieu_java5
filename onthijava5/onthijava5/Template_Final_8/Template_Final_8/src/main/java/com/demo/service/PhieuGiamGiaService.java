package com.demo.service;

import com.demo.entity.KhachHang;
import com.demo.entity.PhieuGiamGia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PhieuGiamGiaService {

    Page<PhieuGiamGia> getAll(Pageable  pageable);

    PhieuGiamGia getOne(String maPhieu);

    void save(PhieuGiamGia phieuGiamGia);

    void delete(String maPhieu);

    Page<PhieuGiamGia> search(String ngayBatDau, String ngayKetThuc, KhachHang khachHang, Pageable pageable);

}
