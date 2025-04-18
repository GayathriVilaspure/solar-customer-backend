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
		return  Repo.save(CE);
		
	}
	public List<ConsumerEntity> getData(){
		return Repo.findAll();
		
		
		
	}
}
