package com.demo.service.impl;


import com.demo.entity.DiaChi;
import com.demo.entity.PhieuGiaoHang;
import com.demo.repository.PhieuGiaoHangRepo;
import com.demo.service.PhieuGiaoHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PhieuGiaoHangServiceImpl implements PhieuGiaoHangService {

    @Autowired
    PhieuGiaoHangRepo phieuGiaoHangRepo;

    @Override
    public Page<PhieuGiaoHang> getAll(Pageable pageable) {
        return phieuGiaoHangRepo.findAll(pageable);
    }

    @Override
    public PhieuGiaoHang getOne(UUID maPhieuGiao) {
        return phieuGiaoHangRepo.findById(maPhieuGiao).get();
    }

    @Override
    public void save(PhieuGiaoHang phieuGiaoHang) {
        phieuGiaoHangRepo.save(phieuGiaoHang);
    }

    @Override
    public void delete(UUID maPhieuGiao) {
        phieuGiaoHangRepo.deleteById(maPhieuGiao);
    }

    @Override
    public Page<PhieuGiaoHang> search(String tuNgay, String denNgay, DiaChi diaChi, Pageable pageable) {
        return phieuGiaoHangRepo.search(tuNgay,denNgay,diaChi,pageable);
    }

    @Override
    public Page<PhieuGiaoHang> searchCBB(DiaChi diaChi, Pageable pageable) {
        return phieuGiaoHangRepo.searchCBB(diaChi,pageable);
    }
}
