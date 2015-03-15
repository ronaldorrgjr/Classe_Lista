package Metodologia;

import java.util.Scanner;

public class Inicio {
	
	public static void printMenu() {
		System.out.println("Menu:");
		System.out.println("\texit para sair");
		System.out.println("\tlist para imprimir a lista");
		System.out.println("\tfind para buscar um produto");
		System.out.println("\tadd para adicionar um item na lista");
		System.out.println("\tadd+ para adicionar um produto na escolha de posição");
		System.out.println("\tremove para remover o ultimo item da lista");
		System.out.println("\tremove+ para remover item na lista na escolha de posição");
		System.out.println("\ttotal calcular o valor total da lista");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Lista l = new Lista();
		
		printMenu();		
		
		for (;true;) {
			
			System.out.print(":");
			// leitura do comando
			// trim() remove os espaços antes e depois da string
			// toLowerCase() deixa tudo em minúsculo
			String line = read.nextLine().trim().toLowerCase();
			
			if (line.equals("")) {// se nao digitou nada

				printMenu();

			}
			
			if (line.equals("exit")) {
				
				break;
			}else if (line.equals("list")){
				l.listar(l.contatos);
				
			}else if (line.equals("add")){	
				Contato c = new Contato();
				System.out.println("Nome: ");
				c.setNome(read.nextLine().trim());
				System.out.println("Telefone: ");
				c.setTelefone(read.nextLine().trim());
				
				l.inserir(c);
				
    		}else if (line.equals("add+")){
				System.out.println("Nome: ");
				Contato c = new Contato();
				c.setNome(read.nextLine().trim());
				System.out.println("Telefone: ");
				c.setTelefone(read.nextLine().trim());
				System.out.println("Qual a posição na lista: ");
				int pos = read.nextInt();read.nextLine().trim();
				
				l.inserir(c, pos);
			}else if (line.equals("remove")){
				
				l.remover();				
			}else if (line.equals("remove+")){
				System.out.println("Qual a posição na lista que deseja remover: ");
				int pos = read.nextInt();read.nextLine().trim();
				l.remover(pos);
			}
			
		}
		
				
		read.close();
	}

}
