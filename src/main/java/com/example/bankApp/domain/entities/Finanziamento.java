package com.example.bankApp.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Check;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "finanziamento")
@EntityListeners(AuditingEntityListener.class)
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
    private Double totaleFinanziamento;
    @Column(nullable = false, name = "tasso_interesse")
    @Check(constraints = "tasso_interesse >= 0")
    private Double tassoInteresse;
    @Column(nullable = false, name = "durata_finanziamento")
    @Check(constraints = "durata_finanziamento > 0", name = "durata_finanziamento")
    private Integer durataFinanziamento;
    @Column(nullable = false, name = "data_inizio")
    private LocalDate dataInizio;

    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @CreatedBy
    @Column(name = "created_by")
    private Long createdBy;
    @LastModifiedDate
    @Column(name = "last_modified_at")
    private LocalDateTime lastModifyAt;
    @LastModifiedBy
    @Column(name = "last_modified_by")
    private Long lastModifiedBy;
}
