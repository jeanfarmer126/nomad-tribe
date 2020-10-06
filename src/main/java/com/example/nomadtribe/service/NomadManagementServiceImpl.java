package com.example.nomadtribe.service;

import com.example.nomadtribe.domain.Nomad;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NomadManagementServiceImpl implements NomadManagementService {

    @Autowired
    NomadManagementService nomadManagementService;

    @Override
    public List<Nomad> getNomads() {
        return null;
    }
}