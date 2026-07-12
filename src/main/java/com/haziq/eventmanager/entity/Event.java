package com.haziq.eventmanager.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private LocalDateTime date;

    @Column
    private String location;

    @Column
    private Integer capacity;
}
