package org.generation.blogPessoal.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;

	@NotBlank(message = "não pode ficar vazio ou conter só espaços")
	@Size(min = 3, max = 50, message = "A quantidade miníma de caracteres para o nome é de 3 e de no maxímo 50")
	private String nome;

	@NotBlank(message = "não pode ficar vazio ou conter só espaços")
	@Size(min = 3, max = 50, message = "A quantidade miníma de caracteres para o usuario é de 3 e de no maxímo 50")
	private String usuario;

	@NotNull(message = "não pode ficar vazio")
	@Size(min = 6, message = "A quantidade miníma de caracteres para o senha é de 6 e de no maxímo 50")
	private String senha;

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
