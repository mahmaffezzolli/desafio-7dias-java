package desafio7dias03;

public class Ex3 {

public static void main(String[] args) {
	int[] valores = new int[]{70, 54, 67, 34, 23, 12, 45, 16, 20};

    int soma = 0;
    for(int i=0; i < valores.length ; i++) {
     soma = soma + valores[i];

    }
     double media = soma/ valores.length;
     System.out.println("valor médio é : " + media); 
}
}