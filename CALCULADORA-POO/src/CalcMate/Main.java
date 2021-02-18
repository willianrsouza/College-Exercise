package CalcMate;

import java.util.Scanner;

class Main {
  static void menuP(){
    System.out.println
    ("==================================");
    System.out.println("Hello - ");
    System.out.println(" 1 - Somar");
    System.out.println(" 2 - Mutiplicar");
    System.out.println(" 3 - Subtrair");
    System.out.println(" 4 - Dividir");
    System.out.println(" 5 - Fatorial ");
    System.out.println(" 9 - Sair");

    
    System.out.println
    ("==================================");
  }

  public static void main(String[] args) {
  
  Scanner ler = new Scanner(System.in);
  
  int op = 0;
  
  int a1 = 0;
  int a2 = 0;
  double f = 0;
  
  while(op != 9){
   
  menuP();
  op = ler.nextInt();

  
  switch(op){
  
  case 1: 

  System.out.println("Digite Primeiro Número");
  a1 = ler.nextInt();
  System.out.println("Digite Segundo Número");
  a2 = ler.nextInt();
  
  System.out.println("Resultado: ");
  operCalc.soma(a1,a2);
  break;
 
  
  case 2:
	  
   System.out.println("Multiplicar");
   
   System.out.println("Digite o Primeiro Número");
   a1 = ler.nextInt();
   System.out.println("Digite o Segundo Número");
   a2 = ler.nextInt();
   
   System.out.println("Resultado: ");
   operCalc.multi(a1,a2);

 break;
   
 
  case 3:
	  
  System.out.println("Subtrair"); 
  
  System.out.println("Digite o Primeiro Número");
  a1  = ler.nextInt();
  System.out.println("Digite o Segundo Número");
  a2 = ler.nextInt();
  
  System.out.println("Resultado: ");
  operCalc.sub(a1, a2);
  break;
  
  
  case 4: 
  System.out.println("Dividir");
  
  System.out.println("Digite o Primeiro Número");
  a1  = ler.nextInt();
  System.out.println("Digite o Segundo Número");
  a2 = ler.nextInt();
  
  System.out.println("Resultado: ");
  operCalc.dividir(a1, a2);
  break;
  
  case 5:
  System.out.println("Fatorial");
  
  System.out.println("Digite o Número para Fatorar");
  f = ler.nextInt();
  
  System.out.println("Resultado: ");
  operCalc.fator(f,0);
  break;
  
  case 9:
  System.out.println("Off...");
  break;
  
   
    }
   }
  }
}