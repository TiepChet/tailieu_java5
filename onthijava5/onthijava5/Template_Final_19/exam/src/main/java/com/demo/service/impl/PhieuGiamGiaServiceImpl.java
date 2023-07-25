package com.demo.service.impl;

import com.demo.entity.KhachHang;
import com.demo.entity.PhieuGiamGia;
import com.demo.repository.PhieuGiamGiaRepo;
import com.demo.service.PhieuGiamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PhieuGiamGiaServiceImpl implements PhieuGiamGiaService {

    @Autowired
    PhieuGiamGiaRepo phieuGiamGiaRepo;

    @Override
    public Page<PhieuGiamGia> getAll(Pageable pageable) {
        return phieuGiamGiaRepo.findAll(pageable);
    }

    @Override
    public PhieuGiamGia getOne(String maPhieu) {
        return phieuGiamGiaRepo.findById(maPhieu).get();
    }

    @Override
    public void save(PhieuGiamGia phieuGiamGia) {
        phieuGiamGiaRepo.save(phieuGiamGia);
    }

    @Override
    public void delete(String maPhieu) {
        phieuGiamGiaRepo.deleteById(maPhieu);
    }

    @Override
    public Page<PhieuGiamGia> searchAll(String ngayBatDau, String ngayKetThuc, KhachHang khachHang, Pageable pageable) {
        return phieuGiamGiaRepo.searchAll(ngayBatDau , ngayKetThuc, khachHang, pageable);
    }

    @Override
    public Page<PhieuGiamGia> searchCBB(KhachHang khachHang, Pageable pageable) {
        return phieuGiamGiaRepo.searchCBB(khachHang, pageable);
    }
}
