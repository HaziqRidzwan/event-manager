package com.haziq.eventmanager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Setter
    @Getter
    @Column
    private String name;

    @Setter
    @Getter
    @Column
    private String description;

    @Setter
    @Getter
    @Column
    private LocalDateTime date;

    @Setter
    @Getter
    @Column
    private String location;

    @Setter
    @Getter
    @Column
    private Integer capacity;
}
