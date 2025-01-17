package com.example.bankApp.domain.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "utente")
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cognome;
    @Column(name = "data_nascita", nullable = false)
    private LocalDate dataNascita;
    @Column(nullable = false)
    private String indirizzo;
    @ManyToOne
    @JoinColumn(name = "id_comune_FK", nullable = false)
    private Comune comune;
    @Column(name = "codice_fiscale", nullable = false, unique = true)
    private String codiceFiscale;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private Long telefono;
}
