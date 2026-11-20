package com.abalajon.courtbook.models;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "book")
public class book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    private String BookedBy;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
}
