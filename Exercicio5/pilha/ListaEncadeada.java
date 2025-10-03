package pilha;


public class ListaEncadeada<T> {
    private NoLista<T> primeiro;
    private NoLista<T> ultimo;

    public ListaEncadeada() {
        setPrimeiro(null);
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoLista<T> primeiro) {
        this.primeiro = primeiro;
    }

    public NoLista<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(NoLista<T> ultimo) {
        this.ultimo = ultimo;
    }

    public void inserir(T info) {
        NoLista<T> novo = new NoLista<T>();
        novo.setInfo(info);
        novo.setProximo(primeiro);

        if (estaVazia()) {
            setUltimo(novo);
        }
        ;

        setPrimeiro(novo);
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public NoLista<T> buscar(T info) {

        NoLista<T> p = primeiro;

        while (p != null) {

            if (p.getInfo().equals(info)) {
                return p;
            } else {
                p = p.getProximo();
            }
        }

        return null;
    }

    public void retirar(T info) {

        NoLista<T> p = primeiro;
        NoLista<T> anterior = null;
        // Procura o nó
        while (p != null && !p.getInfo().equals(info)) {
            anterior = p;
            p = p.getProximo();
        }

        // Se Achou o nó o retira da lista
        if (p != null) {
            if (p == primeiro) {
                setPrimeiro((p.getProximo()));
            } else {
                anterior.setProximo(p.getProximo());
            }
            if (p == getUltimo()) {
                setUltimo(anterior);
            }
        }

    }

    public int obterComprimento() {
        NoLista<T> p = primeiro;

        int comprimento = 0;

        while (p != null) {
            comprimento++;
            p = p.getProximo();
        }

        return comprimento;
    }

    public NoLista<T> obterNo(int idx) throws java.lang.IndexOutOfBoundsException {
        if (idx < 0) {
            throw new IndexOutOfBoundsException();
        }

        NoLista<T> p = getPrimeiro();

        while (p != null && idx > 0) {
            idx--;
            p = p.getProximo();
        }

        if (p == null) {
            throw new IndexOutOfBoundsException();
        }

        return p;
    }

    public String toString() {
        NoLista<T> p = getPrimeiro();

        String str = "";

        while (p != null) {
            if (p != primeiro) {
                str += ", ";

            }

            str += p.getInfo().toString();
            p = p.getProximo();
        }

        return str;
    }

    public static void main(String[] args) {
        
        ListaEncadeada<Integer> num = new ListaEncadeada<>();

        num.inserir(10);
        num.inserir(20);
        num.inserir(30);
        num.inserir(10);
        num.inserir(40);
        num.inserir(50);
       num.retirar(10);
       System.out.println(num.toString());
    }
}
