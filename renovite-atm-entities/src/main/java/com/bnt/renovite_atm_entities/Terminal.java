package com.bnt.renovite_atm_entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "terminals")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Terminal {

    @Id
    @Column(name = "terminal_id")
    private Long terminalId; 

    @Column(nullable = false)
    private String location;

    @Column(name = "terminal_model", nullable = false)
    private String terminalModel;

    @Column(nullable = false)
    private String institution;

    @Column(name = "institution_group")
    private String institutionGroup;

    @Column(name = "terminal_code", unique = true)
    private String terminalCode;

    @Column(columnDefinition = "TEXT")
    private String description;
}
