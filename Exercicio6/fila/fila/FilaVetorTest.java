package fila;

public class FilaVetorTest {

    public static void main(String[] args) {
        teste1();
        teste2();
        teste3();
        teste4();
        teste5();
        teste6();
        teste7();
        teste8();

    }

    public static void teste1() {

        FilaVetor<Integer> inteiros = new FilaVetor<>(0);
        System.out.println("TESTE 1");
        System.out.println(inteiros.estaVazia());
        System.out.println();
    }

    public static void teste2() {

        FilaVetor<Integer> inteiros = new FilaVetor<>(5);
        inteiros.inserir(10);
        System.out.println("TESTE 2");
        System.out.println(inteiros.estaVazia());
        System.out.println();

    }

    public static void teste3() {

        FilaVetor<Integer> inteiros = new FilaVetor<>(10);
        inteiros.inserir(10);
        inteiros.inserir(20);
        inteiros.inserir(30);
        System.out.println("TESTE 3");
        System.out.println(inteiros.toString());
       System.err.println(inteiros.retirar());
       System.err.println(inteiros.retirar());
       System.err.println(inteiros.retirar());
        System.out.println(inteiros.estaVazia());
        System.out.println();

    }

    public static void teste4() {
        FilaVetor<Integer> inteiros = new FilaVetor<>(3);

        System.out.println("TESTE 4");
        try {
            inteiros.inserir(10);
            inteiros.inserir(20);
            inteiros.inserir(30);
            inteiros.inserir(40);
        } catch (FilaCheiaException e) {
            System.out.println("Exceção capturada:");
        }
        System.out.println();
    }

    public static void teste5() {
        FilaVetor<Integer> inteiros = new FilaVetor<>(5);
        System.out.println("TESTE 5");
        try {
            inteiros.retirar(); 
        } catch (FilaVaziaExcepion e) {
            System.out.println("Exceção capturada");
            System.out.println();
        }

    }

    public static void teste6() {
        FilaVetor<Integer> inteiros = new FilaVetor<>(5);
        inteiros.inserir(10);
        inteiros.inserir(20);
        inteiros.inserir(30);
        System.out.println("TESTE 6");
        System.out.println(inteiros.toString());
        System.out.println();
        System.out.println(inteiros.peek());
        System.out.println(inteiros.retirar());
        System.out.println();

    }

    public static void teste7() {

        FilaVetor<Integer> inteiros = new FilaVetor<>(5);
        inteiros.inserir(10);
        inteiros.inserir(20);
        inteiros.inserir(30);
        System.out.println("TESTE 7");
        System.out.println(inteiros.toString());
        inteiros.liberar();
        System.out.println(inteiros.estaVazia());
        System.out.println();

    }

    public static void teste8() {

        try {
            FilaVetor<Integer> inteiros = new FilaVetor<>(5);
            inteiros.inserir(10);
            inteiros.inserir(20);
            inteiros.inserir(30);

            FilaVetor<Integer> inteiros2 = new FilaVetor<>(5);
            inteiros2.inserir(40);
            inteiros2.inserir(50);

            FilaVetor<Integer> filaConcatenada = inteiros.criarFilaConcatenada(inteiros2);
             System.out.println("TESTE 8");
            System.out.println("Fila 1: " + inteiros.toString()); 
            System.out.println("Fila 2: " + inteiros2.toString()); 
            System.out.println("Fila concatenada: " + filaConcatenada.toString());

        } catch (FilaCheiaException e) {
            System.out.println("Erro");
        } catch (FilaVaziaExcepion e) {
            System.out.println("Erro");
        }

    }
}
