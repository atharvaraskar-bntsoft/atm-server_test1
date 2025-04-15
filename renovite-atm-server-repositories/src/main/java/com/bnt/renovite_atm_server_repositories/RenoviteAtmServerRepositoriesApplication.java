package com.bnt.renovite_atm_server_repositories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.bnt.renovite.atm.entities")
@EnableJpaRepositories(basePackages = "com.renovite.atm.server.repositories.repository")
public class RenoviteAtmServerRepositoriesApplication {
    public static void main(String[] args) {
        SpringApplication.run(RenoviteAtmServerRepositoriesApplication.class, args);
    }

}
