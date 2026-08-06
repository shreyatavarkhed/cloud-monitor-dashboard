package com.example.cloudmonitor.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ServiceStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String serviceName;
    private String status; // "UP" or "DOWN"
    private LocalDateTime lastUpdated;

    public ServiceStatus() {}

    public ServiceStatus(String serviceName, String status) {
        this.serviceName = serviceName;
        this.status = status;
        this.lastUpdated = LocalDateTime.now();
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }
    public String getStatus() { return status; }
    public void setStatus(String status) { 
        this.status = status; 
        this.lastUpdated = LocalDateTime.now(); // Auto-update timestamp on change
    }
    public LocalDateTime getLastUpdated() { return lastUpdated; }
}

