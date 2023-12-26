package com.sadproject.demo.service;

import com.sadproject.demo.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDal extends JpaRepository<Event, String>, JpaSpecificationExecutor<Event> {

}
