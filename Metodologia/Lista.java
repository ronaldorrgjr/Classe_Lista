package Metodologia;

public class Lista {
	
	int n = 0;
	Contato[] contatos = new Contato [100];
	Contato c = new Contato();
	
	public boolean isCheia(){
		return n == contatos.length;
	}
	
	public boolean isVazia(){
		return n == 0;
	}
	
	public boolean inserir(Contato contato){
		if (isCheia()){
			return false;
		}		
		contatos[n++] = contato;
		return true;
	}
	
	public boolean remover(){
		if(isVazia()){
			System.out.println("Não à dados na lista! Impossivel de remover");
			return false;
		}		
		n--;
		System.out.println("removido com sucesso");
		return true;
	}
	
	private void deslocarDireita(int pos){
		
		for (int i = n; i > pos; i--) {
			contatos[i] = contatos[i-1];
		}
	}
	
	private void deslocarEsquerda(int pos){
		for (int i = pos; i < n-1; i++) {
			contatos[i] = contatos[i+1];
		}
	}
	
	public boolean inserir(Contato contato,int pos){
		if (isCheia()){
			return false;
		}		
		
		if(pos > n){
			System.out.println("Posição da lista invalida");
			return false;
		}else{
		deslocarDireita(pos);
		contatos[pos] = contato;
		n++;
		return true;
		}		
	}
	
	public int getTamanho(){
		return n;
	}
	
	public boolean remover(int pos){
		if(isVazia()){
			System.out.println("Não à dados na lista! Impossivel de remover");
			return false;
		}
		deslocarEsquerda(pos);
		n--;
		System.out.println("removido com sucesso");
		return true;		
	}
	
	public boolean remover(Contato c){		
		for (int i = 0; i < n; i++) {
			if (contatos[i].equals(c)){
				remover(i);
				n--;
				return true;
			}
		}		
		return false;
	}
	
	public String toString(){
		String str = "";
		for (int i = 0; i < n; i++) {
			str += contatos[i].toString();
		}		
		return str;
	}
	
	
	public void listar(Contato[] contato){		
		for (int i = 0; i < n; i++) {
			Contato c = contato[i];
			System.out.println(c.toString());
		}
	}
	
	public void buscarPos(Contato[] contato, String nome){
		int cont = 0;
		for (int i = 0; i < n; i++) {			
			if (contato[i].getNome().equalsIgnoreCase(nome)){
				System.out.println("Posição:"+cont);
				System.out.println(contato[i]);
			}
			cont++;
		}		
	}
	
}

