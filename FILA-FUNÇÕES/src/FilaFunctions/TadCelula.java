package FilaFunctions;

public class TadCelula {
	
    int valor;
    TadCelula prox;


    public TadCelula() {

    }

    public TadCelula(int valor) {
        this.valor = valor;
    }

    public String toString() {
        return "[ " + valor + " ] -> ";
    }
}