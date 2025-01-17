package com.example.bankApp.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "conto")
public class Conto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    private List<Utente> utenti;
    @Column(nullable = false, name = "costo_annuale")
    private Integer costoAnnuale;
    @Column(nullable = false)
    private Long denaro;
    @Column(nullable = false, name = "data_sottoscrizione")
    private LocalDate dataSottoscrizione;
}
