package FilaFunctions;

public class TadFila {
  TadCelula frente;
  TadCelula tras;
  int tamanho;
  int capacidade;

  // construtor da fila
  public TadFila(int capacidade) {
    // criar a celula cabeca
    TadCelula cabeca = new TadCelula();
    this.frente = cabeca;
    this.tras = cabeca;
    this.tamanho = 0;
    this.capacidade = capacidade;
  }

  public void exibir() {
    System.out.println("\nTAD Fila: ");
    System.out.println("Tamanho/Capacidade: " + tamanho + "/" + capacidade);

    TadCelula aux = this.frente.prox;
    System.out.print("FRENTE: ");
    while (aux != null) {
      System.out.print(aux);
      aux = aux.prox;
    }
    System.out.println(" TRÁS");
  }

  public boolean estahCheia() {
    return tamanho == capacidade;
  }

  public boolean enfileirar(int chave) {
    // verificar se estah cheia
    if (estahCheia()) {
      System.out.println("FILA está cheia!");
      return false; // nao foi enfileirado
    }

    // criar a nova célula
    TadCelula nova = new TadCelula(chave);
    this.tras.prox = nova;
    this.tras = nova;
    this.tamanho++;
    
    return true;
  }

  public boolean estahVazia() {
    return frente == tras;
  }

  public int desenfileirar() {
    // verificar se estah vazia
    if (estahVazia()) {
      System.out.println("FILA está vazia!");
      return -1; // vazio
    }

    TadCelula aux = this.frente.prox;
    this.frente = this.frente.prox;
    this.tamanho--;

    return aux.valor; // valor desenfileirado
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



  public int obterFrente(){
    if (estahVazia()){
      
      return -1;
    }

    else {
       return 
       this.frente.prox.valor;
    }

  }



  public int obterTras() {
    if (estahVazia()){
       return -1;
    }
    else {
        return
        this.tras.valor;
    }
  }

  

  public boolean furarFila(int chave) {

    if (estahCheia()) {
      System.out.println("Fila está cheia!");
      return false;
    }

    TadCelula aux = frente.prox;
    TadCelula nova = new TadCelula(chave);
    frente.prox = nova;
    nova.prox = aux;
    tamanho++;

    return true;
  }
}