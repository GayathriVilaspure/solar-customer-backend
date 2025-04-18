package com.statusinstallation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.statusinstallation.entity.ConsumerEntity;


@Repository
public interface ConsumerRepo  extends JpaRepository<ConsumerEntity,Long>{

}
