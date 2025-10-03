package fila;

public class FilaLista<T> implements Fila<T> {

    private ListaEncadeada<T> lista;

    public FilaLista() {
        lista = new ListaEncadeada<>();
    }

    public void inserir(T valor) {
        lista.inserirNoFinal(valor);
    }

    public boolean estaVazia() {
        return lista.estaVazia();
    }

    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaExcepion();
        }

        return lista.getPrimeiro().getInfo();
    }

    public T retirar() {
        T valor = peek();
        lista.retirar(valor);
        return valor;
    }

    public void liberar() {
        try {
            while (true) {
                retirar();
            }
        } catch (FilaVaziaExcepion l) {

        }
    }

    public String toString() {
        return lista.toString();
    }

}
