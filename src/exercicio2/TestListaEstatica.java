package exercicio2;

class ListaEstaticaTest {

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
    }

    public static void test1() {

        ListaEstatica<Integer> lista = new ListaEstatica<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        System.out.println("TESTE 1");
        System.out.println(lista.toString());
        System.out.println();

    }

    public static void test2() {

        System.out.println("TESTE 2");

        System.out.println();
    }

    public static void test3() {

        System.out.println("TESTE 3");

        System.out.println();
    }

    public static void test4() {
        System.out.println("TESTE 4");

        System.out.println();

    }

    public static void test5() {

        System.out.println("TESTE 5");

        System.out.println();
    }

    public static void test6() {
        System.out.println("TESTE 6");

        System.out.println();

    }

    public static void test7() {
        System.out.println("TESTE 7");

        System.out.println();

    }

    public static void test8() {
        System.out.println("TESTE 8");

        System.out.println();

    }

    public static void test9() {
        System.out.println("TESTE 9");

        System.out.println();

    }

    public static void test10() {
        System.out.println("TESTE 10");

        ListaEstatica<Integer> lista = new ListaEstatica<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.inverter();

        System.out.println(lista.toString());
        System.out.println();

    }

    public static void test11() {
        System.out.println("TESTE 11");

        System.out.println();

    }

}
