package br.com.isaiasbueno.dio.picpayclone.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@JsonInclude(Include.NON_NULL)
public class UsuarioDTO {

    @NotBlank
    private String login;

    private String senha;

    private String email;

    private String nomeCompleto;

    private String cpf;

    private LocalDate dataNascimento;

    private String numeroTelefone;

    private Double saldo;

}
