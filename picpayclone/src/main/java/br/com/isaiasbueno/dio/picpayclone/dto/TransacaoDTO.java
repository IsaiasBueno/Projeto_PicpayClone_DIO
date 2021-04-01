package br.com.isaiasbueno.dio.picpayclone.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@JsonInclude(Include.NON_NULL)
public class TransacaoDTO {

    @NotBlank
    private String codigo;

    @NotNull
    private UsuarioDTO origem;

    @NotNull
    private UsuarioDTO destino;

    @NotNull
    private LocalDateTime dataHora;

    @NotNull
    private Double valor;

    private CartaoCreditoDTO cartaoCredito;

    private Boolean isCartaoCredito = false;

}
