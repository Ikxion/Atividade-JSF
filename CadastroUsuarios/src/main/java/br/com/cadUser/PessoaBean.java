package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named
@SessionScoped
public class PessoaBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Pessoa> pessoas;
	private Pessoa novaPessoa = new Pessoa();

	public PessoaBean() {
		pessoas = new ArrayList<>();
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Pessoa getNovaPessoa() {
		return novaPessoa;
	}

	public void setNovaPessoa(Pessoa novaPessoa) {
		this.novaPessoa = novaPessoa;
	}

	// Adiciona nova pessoa à lista
	public void cadastrar() {
		pessoas.add(new Pessoa(novaPessoa.getNome(), novaPessoa.getIdade(), novaPessoa.getNacionalidade()));
		novaPessoa = new Pessoa(); // limpa o formulário
	}

	// Remove pessoa da lista
	public void remover(Pessoa pessoa) {
		pessoas.remove(pessoa);
	}
}
