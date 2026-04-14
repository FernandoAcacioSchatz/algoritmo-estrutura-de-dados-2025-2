package exercicio11;

public class BuscaLinear<T> extends BuscaAbstract {

    public BuscaLinear(T[] info) {
        super(info);
    }
    
    public int buscar(T valor) {
        Object[] info = getInfo();
        for (int i = 0; i < info.length; i++) {
            if (info[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

}
