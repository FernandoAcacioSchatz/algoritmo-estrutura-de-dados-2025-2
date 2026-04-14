package exercicio4;

public class TestListaDupla {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();

    }

    static void test1() {

        System.out.println("Test 1:");

        ListaDupla<Integer> numeros = new ListaDupla<>();
        numeros.inserir(5);
        numeros.inserir(10);
        numeros.inserir(15);
        numeros.inserir(20);
        numeros.exibirOrdemInversa();
        System.out.println(numeros.toString());
        System.out.println();

    }

    static void test2() {

        System.out.println("Test 2:");

        ListaDupla<Integer> numeros = new ListaDupla<>();
        numeros.inserir(5);
        numeros.inserir(10);
        numeros.inserir(15);
        numeros.inserir(20);

        NoListaDupla<Integer> p = numeros.buscar(20);
        System.out.println(p.getInfo());
        System.out.println();

    }

    static void test3() {
        System.out.println("Test 3:");
        ListaDupla<Integer> numeros = new ListaDupla<>();
        numeros.inserir(5);
        numeros.inserir(10);
        numeros.inserir(15);
        numeros.inserir(20);
        NoListaDupla<Integer> p = numeros.buscar(10);
        System.out.println(p.getInfo());
        System.out.println();

    }

    static void test4() {
        System.out.println("Test 4:");
        ListaDupla<Integer> numeros = new ListaDupla<>();
        numeros.inserir(5);
        numeros.inserir(10);
        numeros.inserir(15);
        numeros.inserir(20);
        numeros.retirar(20);
        numeros.retirar(20);
        numeros.exibirOrdemInversa();
        System.out.println(numeros.toString());
        System.out.println();

    }

    static void test5() {
        System.out.println("Test 5:");
        ListaDupla<Integer> numeros = new ListaDupla<>();
        numeros.inserir(5);
        numeros.inserir(10);
        numeros.inserir(15);
        numeros.inserir(20);
        numeros.retirar(10);
        numeros.exibirOrdemInversa();
        System.out.println(numeros.toString());
        System.out.println();


    }

    static void test6() {
        System.out.println("Test 6:");
        ListaDupla<Integer> numeros = new ListaDupla<>();
        numeros.inserir(5);
        numeros.inserir(10);
        numeros.inserir(15);
        numeros.inserir(20);
        numeros.retirar(5);
        numeros.exibirOrdemInversa();
        System.out.println(numeros.toString());
        System.out.println();

    }

    static void test7() {
        System.out.println("Test 7:");
        ListaDupla<Integer> numeros = new ListaDupla<>();
        numeros.inserir(5);
        numeros.inserir(10);
        numeros.inserir(15);
        numeros.inserir(20);

        NoListaDupla<Integer> p5 = numeros.buscar(5);
        NoListaDupla<Integer> p10 = numeros.buscar(10);
        NoListaDupla<Integer> p15 = numeros.buscar(15);
        NoListaDupla<Integer> p20 = numeros.buscar(20);
        System.out.println(numeros.toString());
        numeros.liberar();
        System.out.println(p5.getInfo() + ", " + p10.getInfo() + ", " + p15.getInfo() + ", " + p20.getInfo());

        

    }

}
