package com.example.bankApp.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Check;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "transazione")
@EntityListeners(AuditingEntityListener.class)
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
    @Check(constraints = "denaro_trasferito > 0", name = "check_amount_positive") //vincolo direttamente nel codice senza farlo nel db
    private Long denaroTrasferito;
    @Column(nullable = false,name = "data_transazione")
    private LocalDateTime dataTransazione;
    @ManyToOne(optional = false)
    @JoinColumn(name = "utente_id")
    private Utente utente;
    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @CreatedBy
    @Column(name = "created_by")
    private Long createdBy;
}
