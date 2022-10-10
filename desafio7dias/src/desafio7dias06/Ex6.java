package desafio7dias06;

public class Ex6 {
	public static void main(String[] args) {
		

	 int[] lista1 = {16,15,35,45,65,76};
     int[] lista2 = {15,43,45,76,43,23};

       for (int i = 0; i < lista1.length; i++) {
           for (int j = 0; j < lista2.length; j++)
           {
               if(lista1[i] == (lista2[j]))
               {
                
                System.out.println("elemento comum: "+(lista1[i]));
                }
           }
       }
}
}