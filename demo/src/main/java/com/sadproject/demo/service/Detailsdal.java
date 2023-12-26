package com.sadproject.demo.service;

import com.sadproject.demo.entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface Detailsdal extends JpaRepository<Details, String>, JpaSpecificationExecutor<Details> {
}
