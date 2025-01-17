package com.example.bankApp.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "finanziamento")
public class Finanziamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(nullable = false, name = "id_utente_FK")
    private Utente utente;
    @ManyToOne
    @JoinColumn(nullable = false, name = "id_conto_FK")
    private Conto conto;
    @Column(nullable = false, name = "totale_finanziamento")
    private Long totaleFinanziamento;
    @Column(nullable = false, name = "tasso_interesse")
    private Double tassoInteresse;
    @Column(nullable = false, name = "durata_finanziamento")
    private Integer durataFinanziamento;

}
