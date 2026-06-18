package com.barbearia.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "barbeiros")

public class Barbeiro extends AuditoriaBase{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne

    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name = "percentual_comissao", nullable = false, precision = 5, scale = 2)
    private BigDecimal percentualComissaoServicos;

    @Column(name = "percentual_comissao_produtos", nullable = false, precision = 5, scale = 2)
    private BigDecimal percentualComissaoProdutos;

    @Column(nullable = false)
    private Boolean ativo = true;
}