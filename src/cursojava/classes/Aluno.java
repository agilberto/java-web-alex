package cursojava.classes;

public class Aluno {
	
	//Esses s�o os atributos do Aluno
	String nome;
	int idade;
	String dataNascimento;
	String registroGral;
	String cpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscolaa;
	String serieMatriculado;
	
	public Aluno() {
	}
	
	public Aluno(String nomePadrao) {//Cria os dados memoria - sendo padr�o do Java
		this.nome=nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		this.nome=nomePadrao;
		this.idade=idadePadrao;
	}
	
	
	

}
