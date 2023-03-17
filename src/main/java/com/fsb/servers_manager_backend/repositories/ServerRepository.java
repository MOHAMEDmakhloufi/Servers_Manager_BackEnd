package com.fsb.servers_manager_backend.repositories;

import com.fsb.servers_manager_backend.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
