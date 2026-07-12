package com.haziq.eventmanager.service;

import com.haziq.eventmanager.entity.Event;
import com.haziq.eventmanager.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    // Get all events
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    // Get event by id
    public Optional<Event> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    // Create event
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    // Update event
    public Event updateEvent(Long id, Event eventDetails) {
        Optional<Event> existingEvent = eventRepository.findById(id);
        if (existingEvent.isPresent()) {
            Event event = existingEvent.get();
            event.setName(eventDetails.getName());
            event.setDescription(eventDetails.getDescription());
            event.setDate(eventDetails.getDate());
            event.setLocation(eventDetails.getLocation());
            event.setCapacity(eventDetails.getCapacity());
            return eventRepository.save(event);
        }
        return null;
    }

    // Delete event
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}