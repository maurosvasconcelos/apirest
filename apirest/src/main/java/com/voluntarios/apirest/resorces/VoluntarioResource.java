package com.voluntarios.apirest.resorces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Voluntários")
@RestController
@RequestMapping(value = "/api")
public class VoluntarioResource {

	@Autowired
	VoluntarioRepository voluntarioRepository;

	@ApiOperation(value = "Retorna uma lista de Voluntários cadastrados.")
	@GetMapping("/voluntarios")
	public List<Voluntario> listaVoluntarios() {
		return voluntarioRepository.findAll();
	}

	@ApiOperation(value = "Consulta por Id o Voluntário cadastrado.")
	@GetMapping("/voluntario/{id}")
	public Voluntario consultarVoluntarioPorId(@PathVariable(value = "id") long id) {
		return voluntarioRepository.findById(id);
	}

	@ApiOperation(value = "Inclui um novo Voluntário.")
	@PostMapping("/voluntario")
	public Voluntario salvarVoluntario(@RequestBody Voluntario voluntario) {
		return voluntarioRepository.save(voluntario);
	}

	@ApiOperation(value = "Delete um Voluntário.")
	@DeleteMapping("/voluntario")
	public void deletaVoluntario(@RequestBody Voluntario voluntario) {
		voluntarioRepository.delete(voluntario);
	}

	@ApiOperation(value = "Atualiza os dados de um Voluntário.")
	@PutMapping("/voluntario")
	public Voluntario atualizarVoluntario(@RequestBody Voluntario voluntario) {
		return voluntarioRepository.save(voluntario);
	}

	@ApiOperation(value = "Consulta por id o Voluntário teste JDBC.")
	@GetMapping("/consultarVoluntarioPorIdNovo/{id}")
	public Voluntario consultarVoluntarioPorIdNovo(@PathVariable(value = "id") long id) {
		VoluntarioJpaDAO vol = new VoluntarioJpaDAO();
		return vol.consultaPorId(id);
	}

}
