package com.sadproject.demo.service;

import com.sadproject.demo.dto.DetailsDTO;
import com.sadproject.demo.dto.EventDTO;
import com.sadproject.demo.entity.Details;
import com.sadproject.demo.entity.Event;
import org.springframework.stereotype.Repository;

public interface EventImp{

    public Event createEvent(EventDTO eventDTO);

    public Event updateEvent(String id, EventDTO eventDTO);

    public Event getEvent(String id);

    public void deleteEvent(String id);

    public Details createDetails(DetailsDTO detailsDTO);

    public Details updateDetails(String id, DetailsDTO detailsDTO);

    public Details getDetails(String id);

    public void deleteDetails(String id);
}
