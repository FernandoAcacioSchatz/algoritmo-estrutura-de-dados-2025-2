package fila;

public class FilaListaTest {

    public static void main(String[] args) {
        teste1();
        teste2();
        teste3();
        teste4();
        teste5();
    }

    public static void teste1() {
        FilaLista<Integer> fila = new FilaLista<>();
        System.out.println("TESTE 1");
        System.out.println(fila.estaVazia());
        System.out.println();
    }

    public static void teste2() {
        FilaLista<Integer> fila = new FilaLista<>();
        fila.inserir(10);
        System.out.println("TESTE 2");
        System.out.println(fila.estaVazia());
        System.out.println();

    }

    public static void teste3() {
        System.out.println("TESTE 3");
        FilaLista<Integer> fila = new FilaLista<>();
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        System.out.println(fila.toString());
        System.out.println();
        System.out.println(fila.retirar());
        System.out.println(fila.retirar());
        System.out.println(fila.retirar());
        System.out.println(fila.estaVazia());
        System.out.println();

    }

    public static void teste4() {
        System.out.println("TESTE 4");
        FilaLista<Integer> fila = new FilaLista<>();
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        System.out.println(fila.toString());
        System.out.println(fila.retirar());
        System.out.println();

    }

    public static void teste5() {
        System.out.println("TESTE 5");
        FilaLista<Integer> fila = new FilaLista<>();
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.liberar();
        System.out.println(fila.estaVazia());

    }

}
