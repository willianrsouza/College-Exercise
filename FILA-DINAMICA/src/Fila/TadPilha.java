package Fila;

class TadPilha {
  TadCelula topo;
  TadCelula fundo;
  int tamanho;
  int capacidade;

  public TadPilha(int capacidade) {
  
    TadCelula cabeca = new TadCelula();
    this.topo = cabeca;
    this.fundo = cabeca;
    this.tamanho = 0;
    this.capacidade = capacidade;
  }
  
  public int obterTopo() {
    if(estahVazia()) {
      return -1;
    }
    else {
      // o valor da c�lula que vem depois da c�lula cabe�a // 
      return topo.prox.valor; 
    }
  }

  public boolean estahCheia() {
    return tamanho == capacidade;
  }

  public boolean empilhar(int chave) {
    if (estahCheia()) {
      System.out.println("\nPilha est� CHEIA!\n");
      return false;
    }

    TadCelula nova = new TadCelula();
    topo.valor = chave;
    nova.prox = topo;
    topo = nova;
    tamanho ++;

    return true;
  }

  public void exibir() {
    System.out.println("\n\nTAD Pilha: ");
    System.out.println(String.format("Tamanho/Capacidade: %d/%d\n", tamanho, capacidade));
    TadCelula aux = topo.prox;
    System.out.print("TOPO: ");
    while (aux != null) {
      System.out.print(aux);
      aux = aux.prox;
    }
    System.out.println(" FUNDO\n");
  }

  public boolean estahVazia() {
    return topo == fundo;
  }

  public int desempilhar() {
    if (estahVazia()) {
      System.out.println("Pilha est� VAZIA!");
      return -1; // sem desempilhamento
    }

    TadCelula aux = topo.prox;
    topo = topo.prox;
    tamanho --;

    return aux.valor; // valor desemp�lhado
  }
  public boolean pesquisar(int chave){
    
    TadCelula aux = topo.prox;

   while (aux != null && aux.valor != chave) {
       // System.out.println(aux);
       aux = aux.prox;
       }
       if (aux == null){
         return false;
       }
       else {
         return true;
       }
  }

  public boolean inverter(){
    TadPilha temp = new TadPilha(capacidade);
    if (estahVazia()){
      System.out.println("N�o foi possivel, pilha vazia!");
      return false;
    }
    
    if (tamanho == 1){
      System.out.println("Pilha possui somente 1 elemento!");
      return false;
    }
    while(!this.estahVazia()){
      temp.empilhar(this.desempilhar());
    }
      this.topo = temp.topo;
      this.fundo = temp.fundo;
      this.tamanho = temp.tamanho;
      return true;
  }

}