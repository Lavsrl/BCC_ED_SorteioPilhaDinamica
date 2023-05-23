package pilhasDinamicasAtividade;

import pilhasDinamicas.CelulaPilha;

public class StackDinamica {
	private CelulaPilha top;
	
	public void push(String nome) {
		CelulaPilha novaCelula = new CelulaPilha();
		novaCelula.setDado(nome);
		novaCelula.setAnterior(this.top);
		this.top = novaCelula;
	}
	
	public boolean isEmpty() {
		if(this.top == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			this.top = this.top.getAnterior();
		} else {
			System.out.println("Pilha vazia.");
		}
	}
	
	public int sizePilha() {
		CelulaPilha p;
		int cont = 0;
		p = this.top;
		while(p != null) {
			p = p.getAnterior();
			cont++;
		}
		return cont;
	}
	
    public void imprimir() {
        CelulaPilha p;
        p = this.top;
        if (isEmpty()) {
            System.out.println("Pilha vazia.");
        } else {
            System.out.print("[");
            while (p != null) {
                System.out.print(p.getDado());
                p = p.getAnterior();
                if (p != null) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
	
	public CelulaPilha top() {
		if(isEmpty()) {
			System.out.println("Pilha vazia.");
			return null;
		} else {
			return this.top;
		}
	}


}
