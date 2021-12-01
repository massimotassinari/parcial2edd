/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polacainv;

/**
 *
 * @author massimo
 */
public class Lista {

    //Inicio lista
    private Nodo inicio;
    // Tamaño lista
    private int tamanio;

    //COnstructor
    public void Lista() {
        inicio = null;
        tamanio = 0;
    }

    //Metodo lista vacia o no
    public boolean esVacia() {
        return inicio == null;
    }

    //Metodo taaño lista
    public int getTamanio() {
        return tamanio;
    }

    //Agrega nodo al final de la lista
    public void agregarFinal(Object valor) {

        Nodo nuevo = new Nodo();

        nuevo.setValor(valor);

        if (esVacia()) {

            inicio = nuevo;

        } else {

            Nodo aux = inicio;

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }

            aux.setSiguiente(nuevo);
        }

        tamanio++;
    }
    //Nuevo nodo al inicio lista

    public void agregarInicio(double valor) {

        Nodo nuevo = new Nodo();

        nuevo.setValor(valor);

        if (esVacia()) {

            inicio = nuevo;

        } else {

            nuevo.setSiguiente(inicio);

            inicio = nuevo;
        }

        tamanio++;
    }

    //Inserta un nodo despues del nodo al que se da referencia
    public void insertarPorReferencia(double referencia, double valor) {

        Nodo nuevo = new Nodo();

        nuevo.setValor(valor);

        if (!esVacia()) {

            if (buscar(referencia)) {

                Nodo aux = inicio;

                while ((double) aux.getValor() != referencia) {
                    aux = aux.getSiguiente();
                }

                Nodo siguiente = aux.getSiguiente();

                aux.setSiguiente(nuevo);

                nuevo.setSiguiente(siguiente);

                tamanio++;
            }
        }
    }

    //Inserta un nodo despues del nodo que se da por index
    public void insrtarPorPosicion(int posicion, double valor) {

        if (posicion >= 0 && posicion <= tamanio) {
            Nodo nuevo = new Nodo();
            nuevo.setValor(valor);

            if (posicion == 0) {

                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            } else {

                if (posicion == tamanio) {
                    Nodo aux = inicio;

                    while (aux.getSiguiente() != null) {
                        aux = aux.getSiguiente();
                    }

                    aux.setSiguiente(nuevo);
                } else {

                    Nodo aux = inicio;

                    for (int i = 0; i < (posicion - 1); i++) {
                        aux = aux.getSiguiente();
                    }

                    Nodo siguiente = aux.getSiguiente();

                    aux.setSiguiente(nuevo);

                    nuevo.setSiguiente(siguiente);
                }
            }

            tamanio++;
        }
    }
    //Busca

    public boolean buscar(double referencia) {

        Nodo aux = inicio;

        boolean encontrado = false;

        while (aux != null && encontrado != true) {

            if (referencia == (double) aux.getValor()) {

                encontrado = true;
            } else {

                aux = aux.getSiguiente();
            }
        }

        return encontrado;
    }

    //Imprime la lista
    public void imprimir() {

        if (!esVacia()) {

            Nodo aux = inicio;

            int i = 0;

            while (aux != null) {

                System.out.print("[" + i + "]" + ".( " + aux.getValor() + " )" + " =>  ");

                aux = aux.getSiguiente();

                i++;
            }
        }
    }

    //    ELIMINA AL PRINCIPIO CONNNN EL RETORNO DEL NODO QUE ELIMINO---------------------
    public Nodo deleteAtTheStart() {
        Nodo node = inicio;
        if (!esVacia()) {

            inicio = inicio.getSiguiente();
            tamanio = tamanio - 1;

        } else {
            System.out.println("");
        }

        return node;
    }
    //Obtiene valor del nodo en un index dado

    public Object getValor(int posicion) throws Exception {

        if (posicion >= 0 && posicion < tamanio) {

            if (posicion == 0) {

                return inicio.getValor();
            } else {

                Nodo aux = inicio;

                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }

                return aux.getValor();
            }

        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }
        //Eliminar un nodo de la lista dandole el index como referencia
    public void removerPorPosicion(int posicion) {

        if (posicion >= 0 && posicion < tamanio) {

            if (posicion == 0) {

                inicio = inicio.getSiguiente();
            } else {

                Nodo aux = inicio;

                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.getSiguiente();
                }

                Nodo siguiente = aux.getSiguiente();

                aux.setSiguiente(siguiente.getSiguiente());
            }

            tamanio--;
        }
    }
}
