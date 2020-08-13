package application;

import java.util.Locale;
import java.util.Scanner;

import ententies.Quartos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quartos[] quartos = new Quartos[10];
		
		
		for(int i=0; i<quartos.length; i++) {
			quartos[i]= new Quartos("vazio","vazio");
		}
		
		System.out.print("Digite a quantidade de estudantes que ira alugar os quartos: ");
		int quant = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<quant; i++) {
			System.out.print("Digite o nome do estudante: ");
			String nome = sc.nextLine();
			System.out.print("Digite o email do estudante: ");
			String email = sc.nextLine();
			System.out.print("Digite o numero do quarto escolhido: ");
			int numero = sc.nextInt();
			sc.nextLine();
			quartos[numero]= new Quartos(nome,email);
		}
		
		for(int i=0; i<quartos.length; i++) {
			if(quartos[i].getNome()!="vazio") {
				System.out.println("Quarto: "
						+i						
						+"; nome: "
						+quartos[i].getNome()
						+"; email: "
						+quartos[i].getEmail());
			}
		}
		
		
		sc.close();
	}

}
