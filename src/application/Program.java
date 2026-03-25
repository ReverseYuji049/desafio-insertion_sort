package application;

import entities.ListaDinamicaInsertion;

public class Program {
    static void main() {
        ListaDinamicaInsertion insertion = new ListaDinamicaInsertion();
        insertion.adicionarElemento(1);
        insertion.adicionarElemento(3);
        insertion.adicionarElemento(5);
        insertion.adicionarElemento(8);
        insertion.adicionarElemento(6); //atual
        insertion.exibir();
        System.out.println("=== INSERTION SORT ===");
        insertion.insertionSort();
        insertion.exibir();

        System.out.println("=====================================================");
        System.out.println("Lista em ordem decrescente.");
        ListaDinamicaInsertion insertion2 = new ListaDinamicaInsertion();
        insertion2.adicionarElemento(4);
        insertion2.adicionarElemento(3);
        insertion2.adicionarElemento(2);
        insertion2.exibir();
        System.out.println("=== INSERTION SORT ===");
        insertion2.insertionSort();
        insertion2.exibir();

        System.out.println("=====================================================");
        System.out.println("Teste: Verificação de lista vazia.");
        ListaDinamicaInsertion insertionVazio = new ListaDinamicaInsertion();
        insertionVazio.insertionSort();

        System.out.println("=====================================================");
        System.out.println("Teste: Verificação de um elemento na lista.");
        ListaDinamicaInsertion insertionElementoUnico = new ListaDinamicaInsertion();
        insertionElementoUnico.adicionarElemento(4);
        insertionElementoUnico.exibir();
        insertionElementoUnico.insertionSort();

        System.out.println("=====================================================");
        System.out.println("Teste: Lista já ordenada.");
        ListaDinamicaInsertion t1 = new ListaDinamicaInsertion();
        t1.adicionarElemento(1);
        t1.adicionarElemento(2);
        t1.adicionarElemento(3);
        t1.adicionarElemento(4);
        t1.exibir();
        t1.insertionSort();
        t1.exibir();

        System.out.println("=====================================================");
        System.out.println("Teste: Lista desordenada.");
        ListaDinamicaInsertion t2 = new ListaDinamicaInsertion();
        t2.adicionarElemento(5);
        t2.adicionarElemento(1);
        t2.adicionarElemento(4);
        t2.adicionarElemento(2);
        t2.adicionarElemento(3);
        t2.exibir();
        System.out.println("=== INSERTION SORT ===");
        t2.insertionSort();
        t2.exibir();

        System.out.println("=====================================================");
        System.out.println("Teste: Elementos repetidos.");
        ListaDinamicaInsertion t3 = new ListaDinamicaInsertion();
        t3.adicionarElemento(3);
        t3.adicionarElemento(1);
        t3.adicionarElemento(3);
        t3.adicionarElemento(2);
        t3.adicionarElemento(1);
        t3.exibir();
        System.out.println("=== INSERTION SORT ===");
        t3.insertionSort();
        t3.exibir();

        System.out.println("=====================================================");
        System.out.println("Teste: Números negativos.");
        ListaDinamicaInsertion t4 = new ListaDinamicaInsertion();
        t4.adicionarElemento(-3);
        t4.adicionarElemento(5);
        t4.adicionarElemento(-1);
        t4.adicionarElemento(2);
        t4.exibir();
        System.out.println("=== INSERTION SORT ===");
        t4.insertionSort();
        t4.exibir();

        System.out.println("=====================================================");
        System.out.println("Teste: Todos iguais.");
        ListaDinamicaInsertion t5 = new ListaDinamicaInsertion();
        t5.adicionarElemento(2);
        t5.adicionarElemento(2);
        t5.adicionarElemento(2);
        t5.adicionarElemento(2);
        t5.exibir();
        System.out.println("=== INSERTION SORT ===");
        t5.insertionSort();
        t5.exibir();

        System.out.println("=====================================================");
        System.out.println("Teste: Dois elementos invertidos.");
        ListaDinamicaInsertion t6 = new ListaDinamicaInsertion();
        t6.adicionarElemento(9);
        t6.adicionarElemento(1);
        t6.exibir();
        System.out.println("=== INSERTION SORT ===");
        t6.insertionSort();
        t6.exibir();
    }
}
