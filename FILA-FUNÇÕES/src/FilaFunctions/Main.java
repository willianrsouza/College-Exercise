package FilaFunctions;


public class Main {

    public static void main(String[] args) {
    	
        TadFila fila = new TadFila(6);

        int[] v = new int[] { 9, 3, 5, 1, 7, 4, 8, 2 };
        for (int i = 0; i < v.length; i++) {
            System.out.println("Enfileirando: " + v[i]);

            fila.enfileirar(v[i]);
            fila.exibir();
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("Desenfileirando . . .\n");
            int valor = fila.desenfileirar();

            if (valor == -1) {
                System.out.println("N�o foi poss�vel desenfileirar.");
            } else {
                System.out.println("Desenfileirou: " + valor);
            }

            fila.exibir();
        }

        System.out.println("\nTestando o fura-fila:\n");
        fila.enfileirar(3);
        fila.enfileirar(5);
        fila.enfileirar(2);
        fila.enfileirar(7);
        fila.enfileirar(9);

        fila.exibir();
       
        boolean resultado = fila.furarFila(4);

        if (resultado) {
            System.out.println("Esperto!");
        } else {
            System.out.println("N�o conseguiu furar fila.");
        }

        fila.exibir();

        fila.furarFila(6);
    
      
      int val = fila.obterFrente();

      if (val == -1){
        System.out.println("Vazia!!!!");
      }

      else{
        System.out.println("Frente:" + val);
      }

     int valT = fila.obterTras();

     if (valT == -1){
       System.out.println("Lista Vazia");
     }
     else {
       System.out.println("Tr�s: " + valT);
     }

     boolean pesq = fila.pesquisar(4);
      if (pesq){
        System.out.println("Encontrado");
      }

      else 
       System.out.println("N�o Encontrado");

 }
}