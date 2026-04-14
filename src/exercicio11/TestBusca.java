package exercicio11;

public class TestBusca {

    public static void main(String[] args) {

        teste1();
        teste2();
        teste3();
        teste4();
    }

    public static void teste1() {

        Integer[] dados = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        BuscaLinearVetorOrdenado<Integer> busca = new BuscaLinearVetorOrdenado<>(dados);
        System.out.println("TESTE 1");
        System.out.println(busca.buscar(20));
        System.out.println();
    }

    public static void teste2() {
        Integer[] dados = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        BuscaLinearVetorOrdenado<Integer> busca = new BuscaLinearVetorOrdenado<>(dados);
        System.out.println("TESTE 2");
        System.out.println(busca.buscar(40));
        System.out.println();
    }

    public static void teste3() {
        Integer[] dados = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        BuscaBinaria<Integer> busca = new BuscaBinaria<>(dados);
        System.out.println("TESTE 3");
        System.out.println(busca.buscar(70));
        System.out.println();
    }

    public static void teste4() {
        Integer[] dados = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        BuscaBinaria<Integer> busca = new BuscaBinaria<>(dados);
        System.out.println("TESTE 4");
        System.out.println(busca.buscar(75));

    }
}
