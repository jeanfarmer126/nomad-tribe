package com.example.nomadtribe.domain;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "LOCATION")
public class Location {
    @Id
    @GeneratedValue
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @CreationTimestamp
    @Column(name="DATE_CREATED")
    private LocalDateTime createdDateTime;

    @UpdateTimestamp
    @Column(name = "DATE_UPDATED")
    private LocalDateTime updatedDateTime;

    public Location() {
    }

    public Location(String name, LocalDateTime createdDateTime, LocalDateTime updatedDateTime) {
        this.name = name;
        this.createdDateTime = createdDateTime;
        this.updatedDateTime = updatedDateTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }
}
