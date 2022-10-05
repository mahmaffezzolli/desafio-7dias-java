package desafio7dias;

public class Ex1 {

	//2. Escreva um programa Java para somar valores de um array.
	
	public static void main(String[] args) {
		
		int somanumeros[] = {12,13,6,3,8,45,9,2};
		int soma = 0;

		for (int i : somanumeros) {
			 soma += i;
		}

        System.out.println("o valor total é:  " + soma);
    }
}

