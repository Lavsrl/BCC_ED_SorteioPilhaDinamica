package pilhasDinamicasAtividade;

import java.util.Random;

public class Atividade {

    public static void main(String[] args) {
        Random numeros = new Random();
        StackDinamica pilha1 = new StackDinamica();
        StackDinamica pilha2 = new StackDinamica();
        StackDinamica pilha3 = new StackDinamica();

        for (int i = 0; i < 100; i++) {
            int numero = numeros.nextInt(9) + 1;
            if (numero >= 1 && numero <= 3) {
                pilha1.push(Integer.toString(numero));
            } else if (numero >= 4 && numero <= 6) {
                pilha2.push(Integer.toString(numero));
            } else {
                pilha3.push(Integer.toString(numero));
            }
        }

        while (!pilha1.isEmpty() && !pilha2.isEmpty() && !pilha3.isEmpty()) {
            int numeroPilha = numeros.nextInt(3) + 1;
            if (numeroPilha == 1) {
                if (!pilha2.isEmpty() && !pilha3.isEmpty()) {
                    System.out.println("Empilhando os números " + pilha2.top().getDado() + " e " + pilha3.top().getDado() + " na pilha 1");
                    pilha1.push(pilha2.top().getDado());
                    pilha2.pop();
                    pilha1.push(pilha3.top().getDado());
                    pilha3.pop();
                    System.out.println("Pilha 1:");
                    pilha1.imprimir();
                    System.out.println("Pilha 2:");
                    pilha2.imprimir();
                    System.out.println("Pilha 3:");
                    pilha3.imprimir();
                    System.out.println("==============");
                }
            } else if (numeroPilha == 2) {
                if (!pilha1.isEmpty() && !pilha3.isEmpty()) {
                    System.out.println("Empilhando os números " + pilha1.top().getDado() + " e " + pilha3.top().getDado() + " na pilha 2");
                    pilha2.push(pilha1.top().getDado());
                    pilha1.pop();
                    pilha2.push(pilha3.top().getDado());
                    pilha3.pop();
                    System.out.println("Pilha 1:");
                    pilha1.imprimir();
                    System.out.println("Pilha 2:");
                    pilha2.imprimir();
                    System.out.println("Pilha 3:");
                    pilha3.imprimir();
                    System.out.println("==============");
                }
            } else {
                if (!pilha1.isEmpty() && !pilha2.isEmpty()) {
                    System.out.println("Empilhando os números " + pilha1.top().getDado() + " e " + pilha2.top().getDado() + " na pilha 3");
                    pilha3.push(pilha1.top().getDado());
                    pilha1.pop();
                    pilha3.push(pilha2.top().getDado());
                    pilha2.pop();
                    System.out.println("Pilha 1:");
                    pilha1.imprimir();
                    System.out.println("Pilha 2:");
                    pilha2.imprimir();
                    System.out.println("Pilha 3:");
                    pilha3.imprimir();
                    System.out.println("==============");
                }
            }
        }
        if(pilha1.isEmpty()) {
        	System.out.println("O programa foi encerrado porque a pilha 1 está vazia.");
        } else if (pilha2.isEmpty()) {
        	System.out.println("O programa foi encerrado porque a pilha 2 está vazia.");
        } else {
        	System.out.println("O programa foi encerrado porque a pilha 3 está vazia.");
        }

        System.out.println("Pilha 1:");
        pilha1.imprimir();
        System.out.println("Pilha 2:");
        pilha2.imprimir();
        System.out.println("Pilha 3:");
        pilha3.imprimir();
    }
}
