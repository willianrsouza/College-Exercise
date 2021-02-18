package NotasClass;

import java.util.Scanner;

class Main{
	
 public static void main(String[] args){
   
   float soma = 0;
   float media = 0;

   Scanner input = new Scanner(System.in);
   
   //INICIALIZANDO VETOR

   float [] valuesStudent = new float [10];

   for (int i = 0; i < valuesStudent.length; ++i){
	   
    System.out.println("DIGITE A NOTA DO " + (i+1) + "  ALUNO DA CLASSE: ");
    valuesStudent[i] = input.nextFloat();   
   
    soma = soma + valuesStudent[i];
    media = soma / valuesStudent[i];

  }
   
   System.out.println("SOMA:  "  + soma);
   
   System.out.println("MÉDIA:  "  + media);
   
   float Nmenor = valuesStudent [0];
   float Nmaior = valuesStudent [0];
   
   //PERCORRER VETOR/COMPARAR
  
   for (int i = 0;i < valuesStudent.length; ++i)
   {
    if (valuesStudent[i] > Nmaior)
    {
      Nmaior = valuesStudent[i];
    }
    else if (valuesStudent[i]< Nmenor){
      Nmenor = valuesStudent[i];
    }
   }

   //PRINT VALORES
     
      System.out.println("MAIOR VALOR: " + Nmaior);
      System.out.println("MENOR VALOR: " + Nmenor);
  }
}


