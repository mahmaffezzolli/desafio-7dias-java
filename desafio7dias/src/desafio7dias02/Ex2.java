package desafio7dias02;

// Escreva um programa Java para imprimir a grade a seguir- ex3 da lista
public class Ex2 {

	public static void main(String[] args) {   
		 int [][] grade = new int[10][10];    
		 for(int i = 0; i < 10; i++)
		   {
		      for(int j = 0; j < 10; j++)
		      {
		         System.out.printf(" - ", grade[i][j]);
		      }
		      System.out.println();
		   }
		}
}
