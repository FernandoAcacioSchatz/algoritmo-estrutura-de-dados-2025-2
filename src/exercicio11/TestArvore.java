package exercicio11;

public class TestArvore {

    public static void main(String[] args) {

        test1();
        test2();
        test3();
    }

    public static void test1() {
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(50);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(30);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(70);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(40);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(25);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(75);
        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(65);
        NoArvoreBinaria<Integer> no8 = new NoArvoreBinaria<>(35);
        NoArvoreBinaria<Integer> no9 = new NoArvoreBinaria<>(60);

        no1.setEsquerda(no2);
        no2.setEsquerda(no5);
        no2.setDireita(no4);
        no4.setEsquerda(no8);
        no1.setDireita(no3);
        no3.setEsquerda(no7);
        no7.setEsquerda(no9);
        no3.setDireita(no6);

        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
        arvore.setRaiz(no1);

        System.out.println("TESTE 1");
        System.out.println(arvore.toString());
        System.out.println();
    }

    public static void test2() {
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(50);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(30);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(40);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(25);

        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
        arvore.setRaiz(no1);
        no1.setEsquerda(no2);
        no2.setEsquerda(no4);
        no2.setDireita(no3);

        System.out.println("TESTE 2");
        System.out.println(arvore.toString());
        arvore.retirar(no3.getInfo());
        System.out.println("APOS REMOCAO DO NO 40");
        System.out.println(arvore.toString());
        System.out.println();

    }

    public static void test3() {

        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(80);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(52);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(90);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(48);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(71);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(63);
        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(67);

        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
        arvore.setRaiz(no1);
        no1.setEsquerda(no2);
        no1.setDireita(no3);
        no2.setEsquerda(no4);
        no2.setDireita(no5);
        no5.setEsquerda(no6);
        no6.setDireita(no7);

        System.out.println("TESTE 3");
        System.out.println(arvore.toString());
        arvore.retirar(no5.getInfo());
        System.out.println("APOS REMOCAO DO NO 71");
        System.out.println(arvore.toString());
        System.out.println();
    }

}
