package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato();
		Livros livro = new Livros();
		System.out.println(gato);
		System.out.println(livro);
		System.out.println("Teste de altera��o git");
	}

}

class Livros {
	private String nome;
	private Integer npag;
}