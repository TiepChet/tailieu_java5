package com.example.btvn.repository;

import com.example.btvn.entity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PhongBanRepository extends JpaRepository<PhongBan, UUID> {
}
