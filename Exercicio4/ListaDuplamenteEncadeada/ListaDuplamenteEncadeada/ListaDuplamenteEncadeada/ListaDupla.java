package ListaDuplamenteEncadeada;

public class ListaDupla<T> {
    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        this.primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoListaDupla<T> novoNo = new NoListaDupla<>();
        novoNo.setInfo(valor);
        novoNo.setProximo(primeiro);
        if (primeiro != null) {
            primeiro.setAnterior(novoNo);
        }
        primeiro = novoNo;
    }

    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> atual = primeiro;
        while (atual != null) {
            if (atual.getInfo().equals(valor)) {
                return atual;
            }
            atual = atual.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoListaDupla<T> no = buscar(valor);
        if (no != null) {
            if (no == primeiro) {
                primeiro = primeiro.getProximo(); // CORRIGIDO
                if (primeiro != null) {
                    primeiro.setAnterior(null);
                }
            } else {
                no.getAnterior().setProximo(no.getProximo());
                if (no.getProximo() != null) {
                    no.getProximo().setAnterior(no.getAnterior());
                }
            }
        }
    }

    public void exibirOrdemInversa() {
        if (primeiro == null) {
            System.out.println("Lista vazia.");
            return;
        }

        // 1. Encontrar o último nó
        NoListaDupla<T> atual = primeiro;
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }

        // 2. Percorrer de trás para frente exibindo os valores
        while (atual != null) {
            System.out.print(atual.getInfo() + " ");
            atual = atual.getAnterior();
        }
        System.out.println();
    }

    public void liberar() {
        NoListaDupla<T> atual = primeiro;
        while (atual != null) {
            NoListaDupla<T> proximo = atual.getProximo();
            atual.setProximo(null);
            atual.setAnterior(null);
            atual = proximo;
        }
        primeiro = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoListaDupla<T> atual = primeiro;
        while (atual != null) {
            sb.append(atual.getInfo());
            if (atual.getProximo() != null) {
                sb.append(", ");
            }
            atual = atual.getProximo();
        }
        return sb.toString();
    }
}