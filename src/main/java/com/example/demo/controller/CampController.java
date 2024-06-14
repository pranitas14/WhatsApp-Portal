package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Campaign;
import com.example.demo.service.CampService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/camp")
public class CampController {

    @Autowired
    private CampService campService;
    
    @PostMapping("/add")
    public ResponseEntity<Campaign> createCamp(@Valid @RequestBody Campaign campaign){
        Campaign save = campService.createCamping(campaign);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }
}
