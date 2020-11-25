package com.voluntarios.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voluntarios.apirest.models.Voluntario;

public interface VoluntarioRepository extends JpaRepository<Voluntario, Long> {

	Voluntario findById(long id);

}
