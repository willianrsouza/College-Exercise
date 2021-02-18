package Fila;

public class TadFila {

    public static final int VAZIO = -1;

    TadCelula frente;
    TadCelula tras;
    int tamanho;
    int capacidade;
    
    public TadFila(int capacidade) {
        TadCelula cabeca = new TadCelula();
        this.frente = cabeca;
        this.tras = cabeca;
        this.tamanho = 0;
        this.capacidade = capacidade;

    }

    public void exibir() { 
        System.out.println("\n\nTAD Fila: ");
        System.out.println(String.format("Tamanho/Capacidade: %d/%d\n", tamanho, capacidade));

        TadCelula aux = frente.prox; 

        System.out.print("FRENTE: ");
        while (aux != null) {  
            System.out.print(aux);
            aux = aux.prox;
        }

        System.out.println(" TRÁS\n");
    }

    public boolean estahVazia() {
        return frente == tras;
    }

    public boolean estahCheia() {
        return tamanho == capacidade;
    }

    public boolean enfileirar(int chave) {
  
    if (estahCheia()) {
      System.out.println("FILA está cheia!");
      return false; 
    }
    
    TadCelula nova = new TadCelula(chave);
    this.tras.prox = nova;
    this.tras = nova;
    this.tamanho++;
    
    return true;
  }

    public int desenfileirar() {

        if (estahVazia()) {
            System.out.println("A Fila está VAZIA!");
            return -1;
        }

        TadCelula aux = this.frente.prox;
        this.frente = frente.prox;
        this.tamanho--;

        return aux.valor;
    }

    public boolean pesquisar(int chave) {
    
    TadCelula aux = this.frente.prox;
    
    while (aux != null && aux.valor != chave){
      aux = aux.prox;
    }
     if (aux == null){
       return false;
     }
     else {
       return true;
     }
  }

    public int obterFrente() {

        if (estahVazia()) {
            System.out.println("A Fila está VAZIA!");
            return -1;
        }

        return this.frente.prox.valor;
    }

    public int obterTras() {

        if (estahVazia()) {
            System.out.println("A Fila está VAZIA!");
            return -1;
        }
        else {
           return this.tras.valor;
        }
    }

   public boolean alterarValor(int original, int nova) {
       TadCelula aux = this.frente.prox;

       while(aux != null && aux.valor != original){
         aux = aux.prox;

       }
       if (aux == null){
        
         return false;
       }
      else{
          aux.valor = nova;
          return true;
      }
             
    }

    public boolean jogarFrenteParaTras(){
    
    if(estahVazia()){
      System.out.println("Fila Vazia!!");
      return false;
    }
    TadCelula aux = this.frente.prox;
    int valor = aux.valor;
    desenfileirar();
    enfileirar(valor);
    exibir();

    return true;

    }

    public boolean jogarTrasParaFrente() {
      TadFila aux = new TadFila(this.capacidade);

      int tras = this.obterTras();
      aux.enfileirar(tras);

      TadCelula aux2 = frente.prox;
      System.out.println("Frente: ");
      while (aux2.valor != tras) {
        aux.enfileirar(aux2.valor);
      }
      //int aux = this.tras.valor;
      //filaAux.enfileirar(val);
      //filaAux.exibir();
      return true;
      }

    public boolean furarFila(int chave) {
      if (estahCheia()) {
        System.out.println("Fila está cheia!!");
        return false;
      }
      else {
        TadCelula nova = new TadCelula();
        TadCelula aux = frente.prox;
        frente.prox = nova;
        nova.prox = aux;
        ++ tamanho;

        return true;
      }
      //Prof, se possível comenta no código o que erramos na implementação do inverter fila
    }
     public boolean inverterFila(){

        TadPilha temp = new TadPilha(capacidade);
        TadCelula aux = new TadCelula();

        if(estahVazia()){
          System.out.println("Fila Vazia!!");
          return false;
        }
        if (tamanho == 1){
          System.out.println("Possui Somente 1 Elemento");
          return false;
        }

        aux = this.frente.prox;
        System.out.println("FRENTE: ");

        while(aux != null) {
          temp.empilhar(aux.valor);
          aux = aux.prox;
          this.tamanho --;
          
        }
        System.out.println
        ("==========================================");
        temp.exibir();
        
        this.frente = temp.topo;
        this.tras = temp.fundo;
        this.exibir();

        return true;
        
        
         
         
       // while(!this.estahVazia){
       //    temp.empilhar(this.desenfileirar());
       // }
       // while(!temp.estahVazia){
       //     
       //   temp.desempilhar(this.enfileirar());
       // }
       //  this.fila.exibir();
       // return true;
      }
    }















