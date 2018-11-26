/**
 * 
 */
package StackAndQueue;

/**
 * Class to show a real example usage for the 
 * Stack and Queue methods.
 * @author Arnaldo Quintero Segura
 *
 */
public class Examples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object temp = null;
		
		// Queue
		System.out.println("---------------------------------");
		System.out.println("--- Pruebas para el TAD Queue ---");
		System.out.println("---------------------------------");

		System.out.println("--Creación de una cola vacia:");
		Queue q = new Queue();
		System.out.println(q + " Cantidad de elementos: " + q.getCount());
		System.out.println();

		System.out.println("--Encolar elemento: 1");
		q.enqueue(1);
		System.out.println(q + "Cantidad de elementos: " + q.getCount());
		System.out.println();
		
		System.out.println("--Ver elemento en el tope:");
		temp = q.peek();
		System.out.println("Cola: " + q + "; Elemento tope: " + temp);
		System.out.println();

		System.out.println("--Encolar elemento: 2");
		q.enqueue(2);
		System.out.println(q + "Cantidad de elementos: " + q.getCount());
		System.out.println();
		
		System.out.println("--Ver elemento en el tope:");
		temp = q.peek();
		System.out.println("Cola: " + q + "; Elemento tope: " + temp);
		System.out.println();
		
		System.out.println("--Buscar elemento existente: 1");
		System.out.println("Cola: " + q + "; Posicion: " + q.search(1));
		System.out.println();
		
		System.out.println("--Buscar elemento existente: 2");
		System.out.println("Cola: " + q + "; Posicion: " + q.search(2));
		System.out.println();
		
		System.out.println("--Buscar elemento inexistente: 0");
		System.out.println("Cola: " + q + "; Posicion: " + q.search(0));
		System.out.println();
		
		System.out.println("--Desencolar elemento: 1");
		temp = q.dequeue();
		System.out.println("Cola: " + q + "; Elemento desencolado: " + temp);
		System.out.println();
		
		System.out.println("--Ver elemento en el tope:");
		temp = q.peek();
		System.out.println("Cola: " + q + "; Elemento tope: " + temp);
		System.out.println();
		
		System.out.println("--Desencolar elemento: 2");
		temp = q.dequeue();
		System.out.println("Cola: " + q + "; Elemento desencolado: " + temp);
		System.out.println();
		
		System.out.println("--Ver elemento en el tope:");
		temp = q.peek();
		System.out.println("Cola: " + q + "; Elemento tope: " + temp);
		System.out.println();
		
		System.out.println("--Desencolar elemento: null");
		temp = q.dequeue();
		System.out.println("Cola: " + q + "; Elemento desencolado: " + temp);
		System.out.println();
		
		// Stack
		System.out.println("---------------------------------");
		System.out.println("--- Pruebas para el TAD Stack ---");
		System.out.println("---------------------------------");

		System.out.println("--Creación de una pila vacia:");
		Stack s = new Stack();
		System.out.println(s + " Cantidad de elementos: " + s.getCount());
		System.out.println();

		System.out.println("--Apilar elemento: 1");
		s.push(1);
		System.out.println(s + "Cantidad de elementos: " + s.getCount());
		System.out.println();
		
		System.out.println("--Ver elemento en el tope:");
		temp = s.peek();
		System.out.println("Pila: " + s + "; Elemento tope: " + temp);
		System.out.println();

		System.out.println("--Apilar elemento: 2");
		s.push(2);
		System.out.println(s + "Cantidad de elementos: " + s.getCount());
		System.out.println();
		
		System.out.println("--Ver elemento en el tope:");
		temp = s.peek();
		System.out.println("Pila: " + s + "; Elemento tope: " + temp);
		System.out.println();
		
		System.out.println("--Buscar elemento existente: 1");
		System.out.println("Pila: " + s + "; Posicion: " + s.search(1));
		System.out.println();
		
		System.out.println("--Buscar elemento existente: 2");
		System.out.println("Pila: " + s + "; Posicion: " + s.search(2));
		System.out.println();
		
		System.out.println("--Buscar elemento inexistente: 0");
		System.out.println("Pila: " + s + "; Posicion: " + s.search(0));
		System.out.println();
		
		System.out.println("--Desapilar elemento: 2");
		temp = s.pop();
		System.out.println("Pila: " + s + "; Elemento desapilado: " + temp);
		System.out.println();
		
		System.out.println("--Ver elemento en el tope:");
		temp = s.peek();
		System.out.println("Pila: " + s + "; Elemento tope: " + temp);
		System.out.println();
		
		System.out.println("--Desapilar elemento: 1");
		temp = s.pop();
		System.out.println("Pila: " + s + "; Elemento desapilado: " + temp);
		System.out.println();
		
		System.out.println("--Ver elemento en el tope:");
		temp = s.peek();
		System.out.println("Pila: " + s + "; Elemento tope: " + temp);
		System.out.println();
		
		System.out.println("--Desapilar elemento: null");
		temp = s.pop();
		System.out.println("Pila: " + s + "; Elemento desencolado: " + temp);
		System.out.println();
	}

}
