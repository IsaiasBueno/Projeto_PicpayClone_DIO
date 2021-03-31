package br.com.isaiasbueno.dio.picpayclone.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.isaiasbueno.dio.picpayclone.enums.BandeiraCartao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsandHashCode(callsuper = false)
@Entity
@Table(name = "Usuarios")


public class CartaoCredito extends EntidadeBase{
    @column(name = "CC_NUMERO" ,nullable = false);
    private String numero;

    @Enumerated(EnumType.STRING)
    @Column(name = "CC_BANDEIRA", nullable = false);
    private BandeiraCartao bandeira;

    @Column(name = "CC_TOKEN")
    private String numeroToken;

    @ManyToOne(cascade = {cascadeType.MERGE})
    @JoinColumn(name = "CC_Usuario_ID", nullable = false);
    private Usuario usuario;

}
