package com.sadproject.demo.service;

import com.sadproject.demo.dto.DetailsDTO;
import com.sadproject.demo.dto.EventDTO;
import com.sadproject.demo.entity.Details;
import com.sadproject.demo.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sadproject.demo.service.EventDal;
import com.sadproject.demo.service.Detailsdal;

import java.util.Optional;

@Service
public class EventManager implements EventImp {


    @Autowired
    private final Detailsdal detailsdal;

    @Autowired
    private final EventDal eventDal;

    public EventManager(Detailsdal detailsdal, EventDal eventDal) {
        this.detailsdal = detailsdal;
        this.eventDal = eventDal;
    }


    @Override
    public Event createEvent(EventDTO eventDTO) {
        Event event = dtoToEntityEvent(eventDTO);
        try {
            return eventDal.save(event);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Event updateEvent(String id, EventDTO eventDTO) {

        Optional<Event> optionalExistingEvent = eventDal.findById(id);
        if (optionalExistingEvent.isEmpty()) {
            throw new RuntimeException();
        }
        Event existingEvent = optionalExistingEvent.get();

        if (eventDTO.getName() != null) {
            existingEvent.setName(eventDTO.getName());
        }
        if (eventDTO.getLocation() != null) {
            existingEvent.setLocation(eventDTO.getLocation());
        }
        if (eventDTO.getDate() != null) {
            existingEvent.setDate(eventDTO.getDate());
        }
        if (eventDTO.getPrice() != null) {
            existingEvent.setPrice(eventDTO.getPrice());
        }
        if (eventDTO.getAddress() != null) {
            existingEvent.setAddress(eventDTO.getAddress());
        }
        if (eventDTO.getImageLink() != null) {
            existingEvent.setImageLink(eventDTO.getImageLink());
        }
        if (eventDTO.getDetails() != null) {
            existingEvent.setDetails(dtoToEntityDetails(eventDTO.getDetails()));
        }

        try {
            return eventDal.save(existingEvent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Event getEvent(String id) {
        Optional<Event> optionalEvent = eventDal.findById(id);
        if (optionalEvent.isEmpty()) {
            throw new RuntimeException("Event not found");
        }
        return optionalEvent.get();
    }

    @Override
    public void deleteEvent(String id) {
        eventDal.deleteById(id);
    }

    @Override
    public Details createDetails(DetailsDTO detailsDTO) {
        Details details = dtoToEntityDetails(detailsDTO);
        try {
            return detailsdal.save(details);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Details updateDetails(String id, DetailsDTO detailsDTO) {

        Optional<Details> optionalExistingDetails = detailsdal.findById(id);
        if (optionalExistingDetails.isEmpty()) {
            throw new RuntimeException();
        }
        Details existingDetails = optionalExistingDetails.get();

        if (detailsDTO.getDescription() != null) {
            existingDetails.setDescription(detailsDTO.getDescription());
        }
        if (detailsDTO.getArtists() != null) {
            existingDetails.setArtists(detailsDTO.getArtists());
        }
        if (detailsDTO.getGenre() != null) {
            existingDetails.setGenre(detailsDTO.getGenre());
        }
        if (detailsDTO.getType() != null) {
            existingDetails.setType(detailsDTO.getType());
        }

        try {
            return detailsdal.save(existingDetails);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Details getDetails(String id) {
        Optional<Details> optionalDetails = detailsdal.findById(id);
        if (optionalDetails.isEmpty()) {
            throw new RuntimeException("Details not found");
        }
        return optionalDetails.get();
    }

    @Override
    public void deleteDetails(String id) {
        detailsdal.deleteById(id);
    }

    public Event dtoToEntityEvent(EventDTO eventDTO) {
        Event event = new Event();

        if (eventDTO.getName() != null) {
            event.setName(eventDTO.getName());
        }
        if (eventDTO.getLocation() != null) {
            event.setLocation(eventDTO.getLocation());
        }
        if (eventDTO.getDate() != null) {
            event.setDate(eventDTO.getDate());
        }
        if (eventDTO.getPrice() != null) {
            event.setPrice(eventDTO.getPrice());
        }
        if (eventDTO.getAddress() != null) {
            event.setAddress(eventDTO.getAddress());
        }
        if (eventDTO.getImageLink() != null) {
            event.setImageLink(eventDTO.getImageLink());
        }
        if (eventDTO.getDetails() != null) {
            event.setDetails(dtoToEntityDetails(eventDTO.getDetails()));
        }

        return event;
    }

    public Details dtoToEntityDetails(DetailsDTO detailsDTO) {
        Details details = new Details();

        if (detailsDTO.getDescription() != null) {
            details.setDescription(detailsDTO.getDescription());
        }
        if (detailsDTO.getArtists() != null) {
            details.setArtists(detailsDTO.getArtists());
        }
        if (detailsDTO.getGenre() != null) {
            details.setGenre(detailsDTO.getGenre());
        }
        if (detailsDTO.getType() != null) {
            details.setType(detailsDTO.getType());
        }
        if (detailsDTO.getTicketInfo() != null) {
            details.setTicketInfo(detailsDTO.getTicketInfo());
        }

        return details;
    }
}
