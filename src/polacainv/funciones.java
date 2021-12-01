/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polacainv;

/**
 *
 * @author massimo
 */
public class funciones {

    public int calculadora(String dato) throws Exception {

        Lista lista = new Lista();
//        lista.agregarFinal(5);
//        lista.agregarFinal(6);
//        lista.agregarFinal("+");
//        lista.imprimir();

        for (int i = 0; i < dato.length(); i++) {

            if (Character.compare(dato.charAt(i), '+') == 0) {
//                lista.imprimir();
//                System.out.println("\n");
//                System.out.println(lista.getTamanio() - 1);
                int x = (int) lista.getValor(lista.getTamanio() - 2) + (int) lista.getValor(lista.getTamanio() - 1);
                lista.removerPorPosicion(lista.getTamanio() - 1);
                lista.removerPorPosicion(lista.getTamanio() - 1);

                lista.agregarFinal(x);
//                lista.imprimir();
//                System.out.println("\n");

            } else if (Character.compare(dato.charAt(i), '-') == 0) {
                int x = (int) lista.getValor(lista.getTamanio() - 2) - (int) lista.getValor(lista.getTamanio() - 1);
                lista.removerPorPosicion(lista.getTamanio() - 1);
                lista.removerPorPosicion(lista.getTamanio() - 1);
                lista.agregarFinal(x);

            } else if (Character.compare(dato.charAt(i), '*') == 0) {
                int x = (int) lista.getValor(lista.getTamanio() - 2) * (int) lista.getValor(lista.getTamanio() - 1);
                lista.removerPorPosicion(lista.getTamanio() - 1);
                lista.removerPorPosicion(lista.getTamanio() - 1);
                lista.agregarFinal(x);

            } else if (Character.compare(dato.charAt(i), '/') == 0) {
                int x = (int) lista.getValor(lista.getTamanio() - 2) / (int) lista.getValor(lista.getTamanio() - 1);
                lista.removerPorPosicion(lista.getTamanio() - 1);
                lista.removerPorPosicion(lista.getTamanio() - 1);
                lista.agregarFinal(x);

            } else {
                lista.agregarFinal(Character.getNumericValue(dato.charAt(i)));
            }
        }

//        System.out.println(lista.getValor(0));
        return (int)lista.getValor(0);

    }

    public void arbolExpresion(String expresion) throws Exception {
        Pila pila = new Pila();
        ArbolBinario arbol = new ArbolBinario();

        for (int i = 0; i < expresion.length(); i++) {
            ArbolBinario arbolaux = new ArbolBinario();

            if (Character.compare(expresion.charAt(i), '+') == 0) {

//                System.out.println(pila.topearbol().getRoot().getDato());
//                pila.imprimir();
                arbolaux.InsertarRoot('+');
                arbolaux.InsertarDer('+', (char) pila.topearbol().getRoot().getDato());
                pila.retirar();
                arbolaux.InsertarIzq('+', (char) pila.topearbol().getRoot().getDato());
                pila.retirar();
                pila.apilar3(arbolaux);
                arbolaux.Inorden(arbolaux.getRoot());

            } else {

                arbolaux.InsertarRoot(expresion.charAt(i));
                pila.apilar3(arbolaux);

            }
        }
//        arbol.InsertarRoot("a");
//
//        pila.apilar3(arbol);
//
//        ArbolBinario arbol2 = (ArbolBinario) pila.tope();
//        arbol2.Inorden(arbol.getRoot());
//        pila.imprimir();

    }
//
//    public ArbolBinario juntar(char padre, ArbolBinario izq, ArbolBinario der) {
//        ArbolBinario arbolRes = new ArbolBinario();
//        Lista listaizq = new Lista();
//        listaizq = izq.Preorden2(izq.getRoot());
//
//        Lista listader = new Lista();
//        listader = der.Preorden2(der.getRoot());
//        
//        arbolRes.InsertarRoot(padre);
//        
//        
//
//        return arbolRes;
//
//    }

    public ArbolBinario juntar(char padre, ArbolBinario izq, ArbolBinario der) {
        ArbolBinario arbolRes = new ArbolBinario();
        
        arbolRes.InsertarRoot(padre);
//        arbolRes.InsertarIzq(padre, izq);



            

            return arbolRes;

        }

    }

//public class funciones {
//
//    public void calculadora(String dato) throws Exception {
//
//        Lista lista = new Lista();
////        lista.agregarFinal(5);
////        lista.agregarFinal(6);
////        lista.agregarFinal("+");
////        lista.imprimir();
//
//        for (int i = 0; i < dato.length(); i++) {
//
//            if (Character.compare(dato.charAt(i), '+') == 0) {
//                int x = (int) lista.getValor(0) + (int) lista.getValor(1);
//                lista.deleteAtTheStart();
//                lista.deleteAtTheStart();
//                lista.deleteAtTheStart();
//                lista.agregarFinal(x);
//
//            } else if (Character.compare(dato.charAt(i), '-') == 0) {
//                int x = (int) lista.getValor(0) - (int) lista.getValor(1);
//                lista.deleteAtTheStart();
//                lista.deleteAtTheStart();
//                lista.deleteAtTheStart();
//                lista.agregarFinal(x);
//
//            } else if (Character.compare(dato.charAt(i), '*') == 0) {
//                int x = (int) lista.getValor(0) - (int) lista.getValor(1);
//                lista.deleteAtTheStart();
//                lista.deleteAtTheStart();
//                lista.deleteAtTheStart();
//                lista.agregarFinal(x);
//
//            } else if (Character.compare(dato.charAt(i), '/') == 0) {
//                int x = (int) lista.getValor(0) / (int) lista.getValor(1);
//                lista.deleteAtTheStart();
//                lista.deleteAtTheStart();
//                lista.deleteAtTheStart();
//                lista.agregarFinal(x);
//
//            }
//            
//            else{
//                lista.agregarFinal(Character.getNumericValue(dato.charAt(i)));
//            }
//        }
//
//            System.out.println(lista.getValor(0));
//
//        }
//
//    }
