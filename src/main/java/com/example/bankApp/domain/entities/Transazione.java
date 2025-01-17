package com.example.bankApp.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "transazione")
public class Transazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_conto_mittente_FK", nullable = false)
    private Conto ContoMittente;
    @ManyToOne
    @JoinColumn(name = "id_conto_destinatario_FK", nullable = false)
    private Conto ContoDestinatario;
    @Column(nullable = false, name = "denaro_trasferito")
    private Long denaroTrasferito;
    @Column(nullable = false,name = "data_transazione")
    private LocalDateTime dataTransazione;
}
