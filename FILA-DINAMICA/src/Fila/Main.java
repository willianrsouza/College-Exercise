package Fila;

import java.util.Scanner;

class Main {
      
      static void exibirMenu(){
       
        System.out.println("======================================");
        System.out.println("*TadFila*");

        System.out.println("1.  Criar uma fila vazia - ok");
        System.out.println("2.  Enfileirar itens na fila  - ok ");
        System.out.println("3.  Desenfileira itens na fila  - ok ");
        System.out.println("4.  Exibir a Fila  - ok ");
        System.out.println("5.  Está Cheia?  - ok ");
        System.out.println("6.  Está Vazia?  - ok ");
        System.out.println("7.  Exibir o Elemento na frente  - ok ");
        System.out.println("8.  Exibir Elemento de trás  - ok ");
        System.out.println("9.  Pesquisar por uma chave na fila  - ok ");
        System.out.println("10. Inverter uma fila ");
        System.out.println("11. Frente para trás - ok");
        System.out.println("12. Trás para frente - ? ");
        System.out.println("13. Inserir fura-fila  - ok  ");
        System.out.println("14. Alterar valor na fila  - ok ");
        System.out.println("15. Sair - ok  ");
         
        System.out.println("Escolha uma das opções acima (1-15)");
      
      }

      public static void main(String[] args){
        
        TadFila fila = null;
        
        Scanner read = new Scanner(System.in);
        int op = 0;
        int numeroUser;
        
        while (op != 15){
          
          exibirMenu();
         
         op = read.nextInt();

         switch(op){
           case 1:

          System.out.println("Insira a Capacidade Desejada");

          int capacidade =  read.nextInt();
          fila = new TadFila(capacidade);

           break;

           case 2:
               System.out.println("===================================");
               System.out.println("Digite o Número a ser enfileirado: ");

               int chave  = read.nextInt();
               fila.enfileirar(chave);

               fila.exibir();

               System.out.println("=================================== ");

           break;
           
           case 3:

           System.out.println("=================================== ");
           fila.desenfileirar();
           fila.exibir();
           

           break;

           case 4:

           System.out.println("======================================");
           fila.exibir();
           
          
           break;

           case 5:

           System.out.println("======================================");
           
           boolean cheia = fila.estahCheia();
           if (cheia){
             System.out.println("True");
           }
           else
             System.out.println("False");

           break;

           case 6:

           System.out.println("======================================");

           boolean vazia = fila.estahVazia();
           if(vazia){
             System.out.println("True");
           }
           else
             System.out.println("False");

           
          
           break;

           case 7:

           System.out.println("Primeiro elemento da Fila: ");
           fila.obterFrente();
           
           break;
           
           case 8:

           System.out.println("======================================");

           System.out.println("Ultimo elemento da Fila: ");
           fila.obterTras();

           break;

           case 9:

          System.out.println("======================================");

          System.out.println("Entre com número a ser pesquisado: ");
          numeroUser = read.nextInt();
         
          boolean pesq = fila.pesquisar(numeroUser);
          if (pesq){
          System.out.println("Encontrado");
         }

         else {
          System.out.println("Não Encontrado");
         }
           break;
           
           case 10:
          
          boolean invert = fila.inverterFila();

          if(invert){
              System.out.println(false);
          }
          else {
            System.out.println(true);
          }

           break;

           case 11:
           
          boolean jogarFrent = fila.jogarFrenteParaTras();
          if(jogarFrent){
            System.out.println("Fila Vazia");
          } 
          else
            System.out.println("Fila Atualizada");
          

           break;

           case 12:
           boolean jogartras = fila.jogarTrasParaFrente();
           
           if(jogartras) {
             System.out.println(false);
           }
           else {
             System.out.println(true);
           }
           
           
           break;

           case 13:
           
           System.out.println
           ("======================================");
           numeroUser = read.nextInt();
           boolean furador = fila.furarFila(numeroUser); 
           


            if (furador) {
              System.out.println(false);
            }
            else {
               System.out.println(true);
            }
           break;

           case 14:
           
           System.out.println("======================================");

           boolean alterVal = fila.alterarValor(9,4);
           if(alterVal){
             System.out.println("Atualizado");
             fila.exibir();
           }
           else
              System.out.println("Não Atualizado");
            

           break;

           case 15:
           
           System.out.println("======================================");
           System.out.println("Exit");

           break;
         }

      }
       read.close();
       
  }
}