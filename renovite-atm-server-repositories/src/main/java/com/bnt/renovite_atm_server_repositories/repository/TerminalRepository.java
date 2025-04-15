package com.bnt.renovite_atm_server_repositories.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bnt.renovite_atm_entities.Terminal;

public interface TerminalRepository extends JpaRepository<Long,Terminal> {

}
