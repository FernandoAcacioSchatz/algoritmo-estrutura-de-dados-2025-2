package exercicio8;

public class TestArvore {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();

    }

    public static void test1() {

        Arvore<Integer> arvore = new Arvore<>();

        NoArvore<Integer> n5 = new NoArvore<Integer>(5);
        NoArvore<Integer> n6 = new NoArvore<Integer>(6);
        NoArvore<Integer> n7 = new NoArvore<Integer>(7);
        NoArvore<Integer> n8 = new NoArvore<Integer>(8);
        NoArvore<Integer> n9 = new NoArvore<Integer>(9);
        NoArvore<Integer> n10 = new NoArvore<Integer>(10);
        NoArvore<Integer> n2 = new NoArvore<Integer>(2);
        NoArvore<Integer> n3 = new NoArvore<Integer>(3);
        NoArvore<Integer> n4 = new NoArvore<Integer>(4);
        NoArvore<Integer> n1 = new NoArvore<Integer>(1);

        n2.inserirFilho(n5);
        n2.inserirFilho(n6);
        n2.inserirFilho(n7);
        n3.inserirFilho(n8);
        n4.inserirFilho(n9);
        n4.inserirFilho(n10);
        n1.inserirFilho(n2);
        n1.inserirFilho(n3);
        n1.inserirFilho(n4);

        arvore.setRaiz(n1);
        System.out.println("TESTE 1");
        System.out.println(arvore.toString());
        System.out.println();
    }

    public static void test2() {

        Arvore<Integer> arvore = new Arvore<>();

        NoArvore<Integer> n5 = new NoArvore<Integer>(5);
        NoArvore<Integer> n6 = new NoArvore<Integer>(6);
        NoArvore<Integer> n7 = new NoArvore<Integer>(7);
        NoArvore<Integer> n8 = new NoArvore<Integer>(8);
        NoArvore<Integer> n9 = new NoArvore<Integer>(9);
        NoArvore<Integer> n10 = new NoArvore<Integer>(10);
        NoArvore<Integer> n2 = new NoArvore<Integer>(2);
        NoArvore<Integer> n3 = new NoArvore<Integer>(3);
        NoArvore<Integer> n4 = new NoArvore<Integer>(4);
        NoArvore<Integer> n1 = new NoArvore<Integer>(1);

        n2.inserirFilho(n5);
        n2.inserirFilho(n6);
        n2.inserirFilho(n7);
        n3.inserirFilho(n8);
        n4.inserirFilho(n9);
        n4.inserirFilho(n10);
        n1.inserirFilho(n2);
        n1.inserirFilho(n3);
        n1.inserirFilho(n4);

        arvore.setRaiz(n1);

        System.out.println("TESTE 2");
        System.out.println(arvore.pertence(7));
        System.out.println();
    }

    public static void test3() {

        Arvore<Integer> arvore = new Arvore<>();

        NoArvore<Integer> n5 = new NoArvore<Integer>(5);
        NoArvore<Integer> n6 = new NoArvore<Integer>(6);
        NoArvore<Integer> n7 = new NoArvore<Integer>(7);
        NoArvore<Integer> n8 = new NoArvore<Integer>(8);
        NoArvore<Integer> n9 = new NoArvore<Integer>(9);
        NoArvore<Integer> n10 = new NoArvore<Integer>(10);
        NoArvore<Integer> n2 = new NoArvore<Integer>(2);
        NoArvore<Integer> n3 = new NoArvore<Integer>(3);
        NoArvore<Integer> n4 = new NoArvore<Integer>(4);
        NoArvore<Integer> n1 = new NoArvore<Integer>(1);

        n2.inserirFilho(n5);
        n2.inserirFilho(n6);
        n2.inserirFilho(n7);
        n3.inserirFilho(n8);
        n4.inserirFilho(n9);
        n4.inserirFilho(n10);
        n1.inserirFilho(n2);
        n1.inserirFilho(n3);
        n1.inserirFilho(n4);

        arvore.setRaiz(n1);

        System.out.println("TESTE 3");
        System.out.println(arvore.pertence(55));
        System.out.println();
    }

    public static void test4() {

        Arvore<Integer> arvore = new Arvore<>();

        NoArvore<Integer> n5 = new NoArvore<Integer>(5);
        NoArvore<Integer> n6 = new NoArvore<Integer>(6);
        NoArvore<Integer> n7 = new NoArvore<Integer>(7);
        NoArvore<Integer> n8 = new NoArvore<Integer>(8);
        NoArvore<Integer> n9 = new NoArvore<Integer>(9);
        NoArvore<Integer> n10 = new NoArvore<Integer>(10);
        NoArvore<Integer> n2 = new NoArvore<Integer>(2);
        NoArvore<Integer> n3 = new NoArvore<Integer>(3);
        NoArvore<Integer> n4 = new NoArvore<Integer>(4);
        NoArvore<Integer> n1 = new NoArvore<Integer>(1);

        n2.inserirFilho(n5);
        n2.inserirFilho(n6);
        n2.inserirFilho(n7);
        n3.inserirFilho(n8);
        n4.inserirFilho(n9);
        n4.inserirFilho(n10);
        n1.inserirFilho(n2);
        n1.inserirFilho(n3);
        n1.inserirFilho(n4);

        arvore.setRaiz(n1);
        System.out.println("TESTE 4");
        System.out.println(arvore.contarNos());
        System.out.println();

    }

}
