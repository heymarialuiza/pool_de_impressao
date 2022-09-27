package pool_de_impressao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pool_de_impressao.*;

public class Main {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		Integer R; // Probabilidade do documento ser encaminhado para impressão
		Integer M; // Tamanho do buffer
		Integer T; // Tempo de impressão
		
		System.out.println("Informe a probabilidade do documento ser impresso: ");
		R = scanner.nextInt();
		System.out.println("Informe o tamanho do buffer: ");
		M = scanner.nextInt();
		System.out.println("Informe o tempo de impressão: ");
		T = scanner.nextInt();

		// Processos
		Processos p1 = new Processos();
		Processos p2 = new Processos();
		Processos p3 = new Processos();
		Processos p4 = new Processos();
		
		// Impressoras
		Impressoras i1 = new Impressoras();
		Impressoras i2 = new Impressoras();
		
		// Buffer
		
	}

}
