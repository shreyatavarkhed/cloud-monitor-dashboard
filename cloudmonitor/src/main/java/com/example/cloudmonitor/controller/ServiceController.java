package com.example.cloudmonitor.controller;

import com.example.cloudmonitor.model.ServiceStatus;
import com.example.cloudmonitor.repository.ServiceStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "*")
public class ServiceController {

    @Autowired
    private ServiceStatusRepository repository;

    // 1. Get all services
    @GetMapping
    public List<ServiceStatus> getAllServices() {
        return repository.findAll();
    }

    // 2. Add a new service
    @PostMapping
    public ServiceStatus addService(@RequestBody ServiceStatus service) {
        return repository.save(service);
    }

    // 3. Toggle status
    @PutMapping("/{id}/toggle")
    public ServiceStatus toggleStatus(@PathVariable Long id) {
        ServiceStatus service = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Service not found"));
        
        // Flip between UP and DOWN
        service.setStatus(service.getStatus().equals("UP") ? "DOWN" : "UP");
        return repository.save(service);
    }
}

