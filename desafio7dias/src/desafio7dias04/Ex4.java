package desafio7dias04;

import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		   int[] lista = {16,54,34,87,65,67,43};
		   
		   int remove = 3;

		   for(int i = remove; i < lista.length -3; i++){
		        lista[i] = lista[i +1];
		      }
		
		    System.out.println("lista com o elemento removido: "+Arrays.toString(lista));
		 }
		 }

