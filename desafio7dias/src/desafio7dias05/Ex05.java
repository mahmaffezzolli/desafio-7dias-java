package desafio7dias05;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args){   
	   
		int[] ordem= { 1,2,3,4,5,6,7,8,9,10};
	 
	   for(int i = 0; i < ordem.length / 2; i++){
	    int posicao = ordem[i];
	    ordem[i] = ordem[ordem.length - i - 1];
	    ordem[ordem.length - i - 1] = posicao;
	  }
	    System.out.println("ordem ao contrária : "+ Arrays.toString(ordem));
	 }
}
