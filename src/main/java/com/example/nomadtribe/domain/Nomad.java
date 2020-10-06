package com.example.nomadtribe.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "NOMAD")
public class Nomad {
    @Id
    @GeneratedValue
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "ID")
    private int id;

    @OneToOne
    @Column(name = "USER")
    private User user;

    @OneToMany
    @Column(name = "LOCATION_PREFERENCES")
    private List<Location> locationPreferences;

    public Nomad() {
    }

    public Nomad(User user, List<Location> locationPreferences) {
        this.user = user;
        this.locationPreferences = locationPreferences;
    }

    public int getId() {
        return id;
    }

    public List<Location> getLocationPreferences() {
        return locationPreferences;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocationPreferences(List<Location> locationPreferences) {
        this.locationPreferences = locationPreferences;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
