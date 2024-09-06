package aula5;

import java.util.Scanner;

public class idade {
public static void main(String[] args) {
	//declaração de variáveis
	Scanner leitor = new Scanner(System.in);
	
	int dia = 0;
	int mes = 0;
	int ano = 0;
	int diaSemana = 0;
	
	//Entrada de dados
	System.out.println("Digite o dia aqui ");
	dia = leitor.nextInt();
	System.out.println("Digite o mes aqui ");
	mes = leitor.nextInt();
	System.out.println("Digite o ano aqui ");
	ano = leitor.nextInt();
	
	leitor.close();
	
	//Processamento
	diaSemana = (((dia) +
			(2 * mes ) +
			((3 * (mes + 1)) / 5) +
					((ano) + (ano / 4)) -
					(ano/ 100) +
					(ano / 400) +
					2) % 7);
	
	//Saída de dados
	switch (diaSemana) {
	case 0:
		System.out.println("! SÁBADO !");
		break;
	case 1:
		System.out.println("! DOMINGO !!");
		break;
	case 2:
		System.out.println("! SEGUNDA !");
		break;
	case 3:
		System.out.println("! TERÇA !");
		break;
	case 4:
		System.out.println(" ! QUARTA !");
		break;
	case 5:
		System.out.println("! QUINTA !");
		break;
	case 6:
		System.out.println ("! SEXTA !");
		break;
		
	}
	
	
}
}
