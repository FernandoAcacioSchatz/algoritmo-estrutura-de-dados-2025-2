package exercicio11;

public class BuscaLinearVetorOrdenado<T extends Comparable<T>> extends BuscaAbstract {

    public BuscaLinearVetorOrdenado(Object[] info) {
        super(info);
    }

    public int buscar(T valor) {
        T[] info = (T[]) getInfo();
        for (int i = 0; i < info.length; i++) {
            if (info[i].compareTo(valor) == 0) {
                return i;
            } else if (info[i].compareTo(valor) > 0) {
                break;
            }
        }
        return -1;
    }

}
