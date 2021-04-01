package br.com.isaiasbueno.dio.picpayclone.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsandHashCode(callsuper = false)
@Entity
@Table(name = "TRANSACOES")

public class Transacao extends EntidadeBase{

    @Column (name = "TR_CODIGO", nullable = false)
    private String codigo;

    @ManytoOne(cascade = {cascadetype = MERGE})
    @JoinColumn(name = "TR_USUARIO_ORIGEM", nullable = false)
    private Usuario origem;

    @ManytoOne(cascade = {cascadetype = MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "TR_USUARIO_DESTINO", nullable = false)
    private Usuario destino;

    @Column(name = "TR_DATA_HORA", nullable = false)
    private LocalDateTime dataHora;

    @Column(name = "TR_VALOR", nullable = false)
    private Double valor;
}
