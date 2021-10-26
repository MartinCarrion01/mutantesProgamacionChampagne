package com.mercadolibre.mutants.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mutants")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Mutant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(name = "dna")
    private String dnaPersist;

    @Transient
    private List<String> dna;

    @Column(name = "isMutant")
    private Boolean isMutant;
}