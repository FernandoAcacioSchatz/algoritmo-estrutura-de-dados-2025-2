package exercicio8;

public class Arvore<T> {

    private NoArvore<T> raiz;

    public Arvore() {
        setRaiz(null);
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    private boolean pertence(NoArvore<T> no, T info) {
        if (no.getInfo().equals(info)) {
            return true;
        }
        NoArvore<T> t = no.getPrimeiro();
        while (t != null) {
            if (pertence(t, info)) {
                return true;
            }
            t = t.getProximo();
        }
        return false;
    }

    public boolean pertence(T info) {
        if (getRaiz() == null) {
            return false;
        }
        return pertence(getRaiz(), info);
    }

    private int contarNos(NoArvore<T> no) {
        int t = 1;
        NoArvore<T> i = no.getPrimeiro();

        while (i != null) {
            t += contarNos(i);
            i = i.getProximo();
        }
        return t;
    }

    public int contarNos() {
        if (getRaiz() == null) {
            return 0;
        }
        return contarNos(getRaiz());
    }

    private String obterRepesentacaoTextual(NoArvore<T> no) {
        String s = "<";
        s+=no.getInfo();
        NoArvore<T> t = no.getPrimeiro();
        while (t != null) {
            s += obterRepesentacaoTextual(t);
            t = t.getProximo();
        }
        s += ">";
        return s;
    }

    public String toString() {
        if(getRaiz() == null) {
            return "";
        }
        return obterRepesentacaoTextual(getRaiz());
    }


}
