/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polacainv;

/**
 *
 * @author massimo
 */
public class PolacaInv {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    static Pila pila = new Pila();

    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        Lista listaProductos = new Lista();

        //SE CREAN LOS DISTINTOS NODOS DE PRODUCTOS CON SU PRECIO Y PRODUCTO, TAMBIEN SE AGREGA A LA LISTA QUE CONTENDRA TODOS LOS PRODUCTOS
        Nodo producto = new Nodo();
        producto.setProducto("camisa");
        producto.setValor("8");
        listaProductos.agregarFinal(producto);

        Nodo producto2 = new Nodo();
        producto2.setProducto("pantalon");
        producto2.setValor("9");
        listaProductos.agregarFinal(producto2);

        Nodo producto3 = new Nodo();
        producto3.setProducto("pulsera");
        producto3.setValor("3");
        listaProductos.agregarFinal(producto3);

        //SE CREA EL STRING INFIJO AL CUAL SE LE AGREGARAN LOS PRECIOS DE LOS PRODUCTOS ASI COMO SU IVA 
        String inFija = "";
//        Nodo nodos = (Nodo) listaProductos.getValor(0);
        //VALOR POR EL QUE SE MULTIPLICAN LOS PRODUCTOS PARA SACAR SU VALOR FINAL

        //EL IVA ES DEL 200% PORQUE ESTAMOS EN VENEZUELA
        String IVA = "2";
//        System.out.println(((Nodo)listaProductos.getValor(0)).getValor());

        for (int i = 0; i < listaProductos.getTamanio(); i++) {
            inFija += ((Nodo) listaProductos.getValor(i)).getValor();
            inFija += "*";
            inFija += IVA;
            if (i < listaProductos.getTamanio() - 1) {
                inFija += "+";
            }

        }

        System.out.println("La expresion inFija seria la siguiente: " + inFija);

        funciones f = new funciones();

//        System.out.println(conversion.conversionPostfijo(inFija));
        String postFija = conversion.conversionPostfijo(inFija);

        System.out.println("La expresion PostFija seria la siguiente: " + postFija);

        //FUNCION CALCULA EL TOTAL CON LA ESPRESION POLACA INVERSA
        int total = (int) f.calculadora(postFija);

        for (int i = 0; i < listaProductos.getTamanio(); i++) {
           total += Integer.parseInt((String) ((Nodo) listaProductos.getValor(i)).getValor());
        }
        

        System.out.println("------FACTURA-------");
        for (int i = 0; i < listaProductos.getTamanio(); i++) {
            System.out.println("- " + ((Nodo) listaProductos.getValor(i)).getProducto() + ":     " + ((Nodo) listaProductos.getValor(i)).getValor() + "$\n");
        }

        System.out.println("IVA = 200%");
        System.out.println("\n-------------------\n");
        System.out.println("El total de la compra de: " + total + "$");

//        f.calculadora(conversion.conversionPostfijo(epa));
//        f.arbolExpresion("ae+");
//        ArbolBinario arbolito = new ArbolBinario();
//        
//        arbolito.InsertarRoot('a');
//        arbolito.InsertarIzq('a', 'b');
//        arbolito.InsertarDer('a', 'c');
//        
//        
//        ArbolBinario arbol2 = new ArbolBinario();
//        
//        arbol2.InsertarRoot('d');
//        
//        ArbolBinario arbol3 = new ArbolBinario();
//        
//        arbol3.InsertarRoot('k');
//        
//        arbol3.InsertarIzq2(arbol3.getRoot(), arbolito.getRoot());
//        
//        arbol3.InsertarDer2(arbol3.getRoot(),  arbol2.getRoot());
//        
//        arbol3.Inorden(arbol3.getRoot());
//        Lista lista = new Lista();
//        lista.agregarFinal("5");
//        lista.agregarFinal("6");
//        lista.agregarFinal("8");
//
//        for (int i = 0; i < lista.getTamanio(); i++) {
//
//        }

    }

}
