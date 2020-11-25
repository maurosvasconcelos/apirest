package com.voluntarios.apirest.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APP_TESTE")
public class Voluntario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPessoa;

	private String nome;
	private String cpf;
	private Date dt_nascimento;
	private String num_celular;
	private Date data_cadastro;
	private String hora_cadastro;
	private String num_fixo;
	private String email;
	private String sexo;
	private String is_atualizado;

	public Long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public String getNum_celular() {
		return num_celular;
	}

	public void setNum_celular(String num_celular) {
		this.num_celular = num_celular;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public String getHora_cadastro() {
		return hora_cadastro;
	}

	public void setHora_cadastro(String hora_cadastro) {
		this.hora_cadastro = hora_cadastro;
	}

	public String getNum_fixo() {
		return num_fixo;
	}

	public void setNum_fixo(String num_fixo) {
		this.num_fixo = num_fixo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getIs_atualizado() {
		return is_atualizado;
	}

	public void setIs_atualizado(String is_atualizado) {
		this.is_atualizado = is_atualizado;
	}

}
