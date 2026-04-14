package exercicio11;

public class BuscaBinaria<T extends Comparable<T>> extends BuscaAbstract{

    public BuscaBinaria(Object[] info) {
        super(info);
    }

    public int buscar(T valor) {
        Object[] info = getInfo();
        int esquerda = 0;
        int direita = info.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            T elementoMeio = (T) info[meio];

            int comparacao = valor.compareTo(elementoMeio);

            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                direita = meio - 1;
            } else {
                esquerda = meio + 1;
            }
        }
        return -1;
    }

}
