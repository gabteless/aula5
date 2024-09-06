package aula5;

import java.util.Scanner;

public class BalancoTrimestral {
public static void main(String[] args) {
	//Declaração de variáveis
	Scanner leitor = new Scanner(System.in);
	int gastosJaneiro = 0;
	int gastosFevereiro = 0;
	int gastosMarco = 0;
	int gastosTrimestre = 0;
	
	//Entrada de dados
	System.out.println("Insira os gastos de janeiro ");
	gastosJaneiro= leitor.nextInt();
	System.out.println("Insira os gastos de fevereiro ");
	gastosFevereiro= leitor.nextInt();
	System.out.println("Insira os gastos de março");
	gastosMarco= leitor.nextInt();
	
	leitor.close();
	
	///Processamento
	gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);
	
	//Saída de dados
	System.out.println("Seus gastos trimestrais foram de " + gastosTrimestre);
}
}
