package Metodologia;

public class Contato {
	private String nome;
	private String telefone;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString(){
		return "Nome:" + nome + "\n" + "Telefone:" + telefone + "\n";
	}
	
	public boolean equals(Contato c){
		return this.nome.equals(c.nome) && this.telefone.equals(c.telefone);		
	}
	
	
}
