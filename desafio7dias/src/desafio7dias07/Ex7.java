package desafio7dias07;

public class Ex7 {

	static int max;
	  static int min;

	    public static void main(String[] args) {
	    	 int[] lista = {98, 43, 56, 74, 100, 34 ,23, 74, 56};
	    	max = lista[0];
	        min = lista[0];
	        int len = lista.length;
	        for (int i = 1; i < len - 1; i = i + 2) {
	            if (i + 1 > len) {
	                if (lista[i] > max)
	                	max = lista[i];
	                if (lista[i] < min) 
	                	min = lista[i];
	            }
	            if (lista[i] > lista[i + 1]) {
	                if (lista[i] > max) 
	                	max = lista[i];
	                if (lista[i + 1] < min) 
	                	min = lista[i + 1];
	            }
	            if (lista[i] < lista[i + 1]) {
	                if (lista[i] < min) 
	                	min = lista[i];
	                if (lista[i + 1] > max) 
	                	max = lista[i + 1];
	            }
	        }
	        System.out.println(" o valor máximo= " + max);
	        System.out.println(" o valor minimo = " + min);
	    }
}
