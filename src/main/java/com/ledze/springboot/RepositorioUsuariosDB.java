package com.ledze.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

/**
 * Código generado por Gerado Pucheta Figueroa
 * Twitter: @ledzedev
 * http://ledze.mx
 * 09/Dec/2016.
 */
@RepositoryRestResource
public interface RepositorioUsuariosDB extends JpaRepository<Usuario, Long> {
    Collection<Usuario> findByEmail(@Param("m") String email);
}
