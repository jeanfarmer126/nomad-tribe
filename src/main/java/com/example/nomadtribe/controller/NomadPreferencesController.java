package com.example.nomadtribe.controller;

import com.example.nomadtribe.domain.Nomad;
import com.example.nomadtribe.service.NomadManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NomadPreferencesController {

    @Autowired
    private NomadManagementServiceImpl nomadManagementService;

    @RequestMapping("/")
    public String index() {
        return "Welcome Nomad";
    }

    @RequestMapping("/get")
    public List<Nomad> getNomads() {
        return nomadManagementService.getNomads();
    }
}
