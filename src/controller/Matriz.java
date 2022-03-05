package controller;

public class Matriz extends Thread {
	private int n;
	private int matriz[][];
	
	public Matriz (int n, int matriz[][]) {
	  this.n =n;
	  this.matriz = matriz;
	}
	
	public void run() {
		Mostrar();
	}
	
	public void Mostrar() {
		int soma = 0;
		for (int c = 0; c < 5; c++) {
			soma += matriz[n][c];
		}
		
	System.out.println("Soma da linha" + (n + 1) + " da matriz = " +soma);
	
		}
		
	}
			
	
	
