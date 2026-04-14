package exercicio9;

import java.time.LocalDate;

public class TestMapaDispersao {

    public static void main(String[] args) {

        testarInsercaoUnica();

        testarInsercaoMultipla();

        testarInsercaoComColisoes();
    }

    public static void testarInsercaoUnica() {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);
        Aluno obj1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1));
        mapa.inserir(obj1.getMatricula(), obj1);
        Aluno resultado = mapa.buscar(12000);

        boolean ok = true;
        ok &= (resultado == obj1);

        System.out.println("Teste 1");
        System.out.println(ok);
        System.out.println();
    }

    public static void testarInsercaoMultipla() {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);
        Aluno obj1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1));
        Aluno obj2 = new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20));
        Aluno obj3 = new Aluno(12500, "Marta", LocalDate.of(2001, 2, 18));
        Aluno obj4 = new Aluno(13000, "Lucas", LocalDate.of(1998, 11, 25));

        mapa.inserir(obj1.getMatricula(), obj1);
        mapa.inserir(obj2.getMatricula(), obj2);
        mapa.inserir(obj3.getMatricula(), obj3);
        mapa.inserir(obj4.getMatricula(), obj4);

        boolean ok = true;
        ok &= (mapa.buscar(12000) == obj1);
        ok &= (mapa.buscar(14000) == obj2);
        ok &= (mapa.buscar(12500) == obj3);
        ok &= (mapa.buscar(13000) == obj4);

        System.out.println("Teste 2");

        System.out.println(ok);
        System.out.println();
    }

    public static void testarInsercaoComColisoes() {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);
        Aluno obj1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1));
        Aluno obj2 = new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20));
        Aluno obj3 = new Aluno(14226, "Marta", LocalDate.of(2001, 2, 18));
        Aluno obj4 = new Aluno(17180, "Lucas", LocalDate.of(1998, 11, 25));

        mapa.inserir(obj1.getMatricula(), obj1);
        mapa.inserir(obj2.getMatricula(), obj2);
        mapa.inserir(obj3.getMatricula(), obj3);
        mapa.inserir(obj4.getMatricula(), obj4);

        boolean ok = true;
        ok &= (mapa.buscar(12000) == obj1);
        ok &= (mapa.buscar(14000) == obj2);
        ok &= (mapa.buscar(14226) == obj3);
        ok &= (mapa.buscar(17180) == obj4);

        System.out.println("Teste 3");

        System.out.println(ok);
    }
}
