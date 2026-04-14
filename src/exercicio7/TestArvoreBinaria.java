package exercicio7;

public class TestArvoreBinaria {

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
        System.out.println("TESTE 1");
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        System.out.println(arvore.estaVazia());
        System.out.println();
    }

    public static void teste2() {
        System.out.println("TESTE 2");
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        NoArvoreBinaria<Integer> no = new NoArvoreBinaria<Integer>(5);
        arvore.setRaiz(no);
        System.out.println(arvore.estaVazia());
        System.out.println();
    }

    public static void teste3() {
        System.out.println("TESTE 3");
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2, null, no4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3, no5, no6);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1, no2, no3);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no1);
        System.out.println(arvore.toString());
        System.out.println();
    }

    public static void teste4() {
        System.out.println("TESTE 4");
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2, null, no4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3, no5, no6);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1, no2, no3);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no1);
        System.out.println(arvore.pertence(1));
        System.out.println();
    }

    public static void teste5() {
        System.out.println("TESTE 5");
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2, null, no4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3, no5, no6);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1, no2, no3);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no1);
        System.out.println(arvore.pertence(3));
        System.out.println();
    }

    public static void teste6() {
        System.out.println("TESTE 6");
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2, null, no4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3, no5, no6);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1, no2, no3);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no1);
        System.out.println(arvore.pertence(6));
        System.out.println();
    }

    public static void teste7() {
        System.out.println("TESTE 7");
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2, null, no4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3, no5, no6);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1, no2, no3);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no1);
        System.out.println(arvore.pertence(10));
        System.out.println();
    }

    public static void teste8() {
        System.out.println("TESTE 8");
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2, null, no4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3, no5, no6);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1, no2, no3);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no1);
        System.out.println(arvore.contarNos());
        System.out.println();
    }
}
