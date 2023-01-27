/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.puja.gaji.service.repository;

import com.puja.gaji.service.entity.Gaji;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ACER
 */
@Repository
public interface GajiRepository extends JpaRepository<Gaji, Long> {

    public Gaji findByGajiId(Long gajiId);

    
}