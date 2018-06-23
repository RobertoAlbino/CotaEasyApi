package com.roberto.cotaeasy.repository;

import com.roberto.cotaeasy.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Usuario findFirstByEmail(String email);
}
