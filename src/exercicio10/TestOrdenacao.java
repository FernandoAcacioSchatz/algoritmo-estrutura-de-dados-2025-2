package exercicio10;

public class TestOrdenacao {

    public static void main(String[] args) {

        test1();
        test2();
        test3();
        test4();

    }

    public static void test1() {

        System.out.println("Test1");

        Integer[] vetor = { 70, 2, 88, 15, 90, 30 };

        OrdenacaoBolha<Integer> bolha = new OrdenacaoBolha<>();
        bolha.setInfo(vetor);
        bolha.ordenar();
        Integer[] resultado = (Integer[]) bolha.getInfo();

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");

    }

    public static void test2() {

        System.out.println("Test2");
        Integer[] vetor = { 70, 2, 88, 15, 90, 30 };

        OrdenacaoBolhaOtimizada<Integer> bolhaOtimizada = new OrdenacaoBolhaOtimizada<>();
        bolhaOtimizada.setInfo(vetor);
        bolhaOtimizada.ordenar();
        Integer[] resultado = (Integer[]) bolhaOtimizada.getInfo();

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");

    }

    public static void test3() {
        System.out.println("Test3");

        Integer[] vetor = { 70, 2, 88, 15, 90, 30 };
        OrdenacaoQuickSort<Integer> quickSort = new OrdenacaoQuickSort<>();
        quickSort.setInfo(vetor);
        quickSort.ordenar();
        Integer[] resultado = (Integer[]) quickSort.getInfo();

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }

    public static void test4() {
        System.out.println("Test4");

        Integer[] vetor = { 70, 2, 88, 15, 90, 30 };
        OrdenacaoMergeSort<Integer> mergeSort = new OrdenacaoMergeSort<>();
        mergeSort.setInfo(vetor);
        mergeSort.ordenar();
        Integer[] resultado = (Integer[]) mergeSort.getInfo();

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }
}
