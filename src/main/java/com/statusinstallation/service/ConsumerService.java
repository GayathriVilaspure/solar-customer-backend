package com.statusinstallation.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.statusinstallation.entity.ConsumerEntity;
import com.statusinstallation.repository.ConsumerRepo;

@Service
public class ConsumerService {
    @Autowired
    ConsumerRepo Repo;
    
    public ConsumerEntity saveData(ConsumerEntity CE) {
        return Repo.save(CE);
    }
    
    public ConsumerEntity updateData(ConsumerEntity CE) {
        if (Repo.existsById(CE.getId())) {
            return Repo.save(CE);
        }
        throw new RuntimeException("Consumer not found with id: " + CE.getId());
    }
    
    public List<ConsumerEntity> getData() {
        return Repo.findAll();
    }
    
    public ConsumerEntity getById(Long id) {
        return Repo.findById(id)
            .orElseThrow(() -> new RuntimeException("Consumer not found with id: " + id));
    }
    
    public void deleteById(Long id) {
        if (Repo.existsById(id)) {
            Repo.deleteById(id);
        } else {
            throw new RuntimeException("Consumer not found with id: " + id);
        }
    }
}