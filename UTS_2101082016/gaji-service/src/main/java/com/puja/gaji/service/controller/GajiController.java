/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.puja.gaji.service.controller;

import com.puja.gaji.service.VO.ResponseTemplateVO;
import com.puja.gaji.service.entity.Gaji;
import com.puja.gaji.service.service.GajiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ACER
 */
@RestController
@RequestMapping("/gaji")
public class GajiController {
    @Autowired
    private GajiService gajiService;
    
    @PostMapping("/")
    public Gaji saveGaji(@RequestBody Gaji gaji){
        return gajiService.saveGaji(gaji);
    }
    
    @GetMapping("{id}")
    public ResponseTemplateVO getGaji(@PathVariable("id") Long gajiId){
        return gajiService.getGaji(gajiId);
    }
}