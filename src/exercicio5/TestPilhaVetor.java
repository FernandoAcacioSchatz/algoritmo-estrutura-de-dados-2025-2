package exercicio5;

public class TestPilhaVetor {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
    }

    static void test1() {
        System.out.println("TESTE 1");
        PilhaVetor<Integer> inteiros = new PilhaVetor<>(5);
        System.out.println(inteiros.estaVazia());
        System.out.println();
    }

    static void test2() {
        System.out.println("TESTE 2");
        PilhaVetor<Integer> inteiros = new PilhaVetor<>(5);
        inteiros.push(10);
        System.out.println(inteiros.estaVazia());
        System.out.println();
    }

    static void test3() {
        System.out.println("TESTE 3");
        PilhaVetor<Integer> inteiros = new PilhaVetor<>(5);
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
        PilhaVetor<Integer> inteiros = new PilhaVetor<>(3);
        inteiros.push(10);
        inteiros.push(20);
        inteiros.push(30);
        try {
            inteiros.push(40);
            System.out.println("Teste falhou");
        } catch (PilhaCheiaException e) {
            System.out.println("Teste passou");
        }
        System.out.println();
    }

    static void test5() {
        System.out.println("TESTE 5");
        PilhaVetor<Integer> inteiros = new PilhaVetor<>(3);

        try {
            inteiros.pop();
            System.out.println("Teste falhou");
        } catch (PilhaVaziaException e) {
            System.out.println("Teste passou");
        }
        System.out.println();
    }

    static void test6() {
        System.out.println("TESTE 6");
        PilhaVetor<Integer> inteiros = new PilhaVetor<>(5);
        inteiros.push(10);
        inteiros.push(20);
        inteiros.push(30);

        System.out.println(inteiros.peek());
        System.out.println(inteiros.pop());
        System.out.println();
    }

    static void test7() {
        System.out.println("TESTE 7");
        PilhaVetor<Integer> inteiros = new PilhaVetor<>(5);
        inteiros.push(10);
        inteiros.push(20);
        inteiros.push(30);
        inteiros.liberar();
        System.out.println(inteiros.estaVazia());
        System.out.println();
    }

    static void test8() {
        System.out.println("TESTE 8");
        PilhaVetor<Integer> inteiros1 = new PilhaVetor<>(5);
        PilhaVetor<Integer> inteiros2 = new PilhaVetor<>(5);

        inteiros1.push(10);
        inteiros1.push(20);
        inteiros1.push(30);

        inteiros2.push(40);
        inteiros2.push(50);

        inteiros1.concatenar(inteiros2);

        System.out.println(inteiros1.toString());
        System.out.println();
    }
}
        