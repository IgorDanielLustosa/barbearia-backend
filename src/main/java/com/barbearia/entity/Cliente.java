package com.barbearia.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "clientes")

public class Cliente extends AuditoriaBase{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    
    @Column(length = 500)
    private String observacoes;

    @Column(name = "pontos_fidelidade", nullable = false)
    private Integer pontosFidelidade = 0;

    @Column(nullable = false)
    private Boolean ativo = true;
}