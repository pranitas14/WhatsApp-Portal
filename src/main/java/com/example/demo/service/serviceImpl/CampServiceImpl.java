package com.example.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Campaign;
import com.example.demo.repo.CampRepo;
import com.example.demo.service.CampService;

@Service
public class CampServiceImpl implements CampService {

    @Autowired
    private CampRepo campRepo;

    @Override
    public Campaign createCamping(Campaign campaign) {
        return campRepo.save(campaign);
    }
}
