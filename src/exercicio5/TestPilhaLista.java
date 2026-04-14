package exercicio5;

public class TestPilhaLista {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    static void test1() {
        System.out.println("TESTE 1");
        PilhaLista<Integer> inteiros = new PilhaLista<>();
        System.out.println(inteiros.estaVazia());
        System.out.println();
    }

    static void test2() {
        System.out.println("TESTE 2");
        PilhaLista<Integer> inteiros = new PilhaLista<>();
        inteiros.push(10);
        System.out.println(inteiros.estaVazia());
        System.out.println();
    }

    static void test3() {
        System.out.println("TESTE 3");
        PilhaLista<Integer> inteiros = new PilhaLista<>();
        inteiros.push(10);
        inteiros.push(20);
        inteiros.push(30);
        System.out.println(inteiros.pop());
        System.out.println(inteiros.pop());
        System.out.println(inteiros.pop());
        System.out.println(inteiros.estaVazia());
        System.out.println();
    }

    static void test4() {
        System.out.println("TESTE 4");
        PilhaLista<Integer> inteiros = new PilhaLista<>();
        inteiros.push(10);
        inteiros.push(20);
        inteiros.push(30);
        System.out.println(inteiros.peek());
        System.out.println(inteiros.pop());
        System.out.println();
    }

    static void test5() {
        System.out.println("TESTE 5");
        PilhaLista<Integer> inteiros = new PilhaLista<>();
        inteiros.push(10);
        inteiros.push(20);
        inteiros.push(30);
        inteiros.liberar();
        System.out.println(inteiros.estaVazia());
        System.out.println();
    }
}
