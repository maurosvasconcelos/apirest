package com.voluntarios.apirest.resorces;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voluntarios.apirest.dao.VoluntarioJpaDAO;
import com.voluntarios.apirest.models.Voluntario;
import com.voluntarios.apirest.repository.VoluntarioRepository;

@RestController
@RequestMapping(value = "/api")
public class VoluntarioResource {

	@Autowired
	VoluntarioRepository voluntarioRepository;

	@GetMapping("/voluntarios")
	public List<Voluntario> listaVoluntarios() {
		return voluntarioRepository.findAll();
	}

	@GetMapping("/voluntario/{id}")
	public Voluntario consultarVoluntarioPorId(@PathVariable(value = "id") long id) {
		return voluntarioRepository.findById(id);
	}

	@PostMapping("/voluntario")
	public Voluntario salvarVoluntario(@RequestBody Voluntario voluntario) {
		return voluntarioRepository.save(voluntario);
	}

	@DeleteMapping("/voluntario")
	public void deletaVoluntario(@RequestBody Voluntario voluntario) {
		voluntarioRepository.delete(voluntario);
	}

	@PutMapping("/voluntario")
	public Voluntario atualizarVoluntario(@RequestBody Voluntario voluntario) {
		return voluntarioRepository.save(voluntario);
	}

	@GetMapping("/consultarVoluntarioPorIdNovo/{id}")
	public Voluntario consultarVoluntarioPorIdNovo(@PathVariable(value = "id") long id) {
		VoluntarioJpaDAO vol = new VoluntarioJpaDAO();
		return vol.consultaPorId(id);
	}

}
