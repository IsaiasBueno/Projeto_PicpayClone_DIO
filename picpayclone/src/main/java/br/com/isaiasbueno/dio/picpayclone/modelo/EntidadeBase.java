package br.com.isaiasbueno.dio.picpayclone.modelo;

import javax.persistence.MappedSuperclass;

@MappedSuperClass

public class EntidadeBase {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
