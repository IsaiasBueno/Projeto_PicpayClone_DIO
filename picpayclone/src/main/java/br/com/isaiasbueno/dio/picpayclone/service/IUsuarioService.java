package br.com.isaiasbueno.dio.picpayclone.service;

import br.com.isaiasbueno.dio.picpayclone.dto.UsuarioDTO;
import br.com.isaiasbueno.dio.picpayclone.modelo.Transacao;
import br.com.isaiasbueno.dio.picpayclone.modelo.Usuario;

import java.util.List;

public interface IUsuarioService {

    Usuario consultarEntidade(String login);

    UsuarioDTO consultar(String login);

    void atualizarSaldo(Transacao transacaoSalva, Boolean isCartaoCredito);

    void validar(Usuario... usuarios);

    List<UsuarioDTO> listar(String login);

}
