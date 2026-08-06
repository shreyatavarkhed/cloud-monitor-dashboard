package com.example.cloudmonitor.repository;

import com.example.cloudmonitor.model.ServiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceStatusRepository extends JpaRepository<ServiceStatus, Long> {
}
