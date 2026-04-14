package exercicio3;

class ListaEncadeadaTest {
    public static void main(String[] args) {

        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
        test11();
        test12();
        test13();
        test14();

    }

    static void test1() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 1");
        System.out.println(teste.estaVazia());
        System.out.println();
    }

    static void test2() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 2");

        teste.inserir(5);
        System.out.println(teste.estaVazia());
        System.out.println();
    }

    static void test3() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 3");
        teste.inserir(5);

        NoLista<Integer> primeiro = teste.getPrimeiro();

        System.out.println(teste.toString());
        System.out.println(primeiro.getProximo());
        System.out.println();
    }

    static void test4() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 4");

        teste.inserir(5);
        teste.inserir(10);
        teste.inserir(15);

        System.out.println(teste.toString());
        System.out.println(teste.obterComprimento());
        System.out.println();
    }

    static void test5() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 5");
        teste.inserir(5);
        teste.inserir(10);
        teste.inserir(15);
        teste.inserir(20);

        NoLista<Integer> primeiro = teste.buscar(20);
        System.out.println(primeiro.getInfo());
        System.out.println();
    }

    static void test6() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 6");
        teste.inserir(5);
        teste.inserir(10);
        teste.inserir(15);
        teste.inserir(20);

        NoLista<Integer> primeiro = teste.buscar(15);
        System.out.println(primeiro.getInfo());
        System.out.println();
    }

    static void test7() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 7");
        teste.inserir(5);
        teste.inserir(10);
        teste.inserir(15);
        teste.inserir(20);
        NoLista<Integer> primeiro = teste.buscar(50);
        System.out.println(primeiro != null ? primeiro.getInfo() : null);
        System.out.println();
    }

    static void test8() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 8");
        teste.inserir(5);
        teste.inserir(10);
        teste.inserir(15);
        teste.inserir(20);

        teste.retirar(20);
        System.out.println(teste.toString());
        System.out.println();
    }

    static void test9() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 9");
        teste.inserir(5);
        teste.inserir(10);
        teste.inserir(15);
        teste.inserir(20);

        teste.retirar(15);

        System.out.println(teste.toString());
        System.out.println();
    }

    static void test10() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 10");
        teste.inserir(5);
        teste.inserir(10);
        teste.inserir(15);
        teste.inserir(20);

        System.out.println(teste.obterNo(0).getInfo());
        System.out.println();
    }

    static void test11() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 11");
        teste.inserir(5);
        teste.inserir(10);
        teste.inserir(15);
        teste.inserir(20);

        System.out.println(teste.obterNo(3).getInfo());
        System.out.println();

    }

    static void test12() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 12");
        teste.inserir(5);
        teste.inserir(10);
        teste.inserir(15);
        teste.inserir(20);
        try {
            teste.obterNo(10); // índice inválido
            System.out.println("Erro: exceção não lançada");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exceção capturada corretamente: " + e);
        }
        System.out.println();
    }

    static void test13() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 13");
        System.out.println(teste.obterComprimento());
        System.out.println();

    }

    static void test14() {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>();
        System.out.println("TESTE 14");
        teste.inserir(5);
        teste.inserir(10);
        teste.inserir(15);
        teste.inserir(20);

        System.out.println(teste.obterComprimento());

    }

}
