package view;

import controller.Matriz;

public class Principal {

	public static void main(String[] args) {
		int matriz[][] = new int[3][5];
		
	
	
	 for(int i = 0; i < 3; i++) {
	 	   for(int j = 0; j < 5; j++) {
	       matriz [i][j] = (int) ((Math.random()*10)+10);
			 System.out.print(matriz[i][j]+ " ");
			 
}
	 	   System.out.println(".");

 }
	 for (int n = 0; n < 3; n++) {
		 Thread t = new Matriz(n,matriz);
		 t.start();
	 }
}
}