/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polacainv;

/**
 *
 * @author massimo
 */
public class ArbolBinario {

    private NodoA Root;

    public NodoA getRoot() {
        return Root;
    }

    //CONSTRUCTOR 1
    public ArbolBinario() {
        this.Root = null;
    }

    //CONSTRUCTOR 2
    public ArbolBinario(NodoA raiz) {
        Root = raiz;

    }

    public void InsertarRoot(Object dato) {
        Root = new NodoA(dato);

    }

    public boolean EsVacio(NodoA node) {
        return Root == null;

    }

//    public void InsertarIzq(int padre, int valor) {
//
//        NodoA temp = Buscar(Root, padre);
//        NodoA hijoIzq = new NodoA(valor);
//        temp.setHijoIzq(hijoIzq);
//
//    }
//
//    public void InsertarDer(int padre, int valor) {
//        NodoA temp = Buscar(Root, padre);
//        NodoA hijoDer = new NodoA(valor);
//        temp.setHijoDer(hijoDer);
//
//    }
    public void InsertarIzq(char padre, char valor) {

        NodoA temp = Buscar(Root, padre);
        NodoA hijoIzq = new NodoA(valor);
        temp.setHijoIzq(hijoIzq);

    }

    public void InsertarIzq2(NodoA padre, NodoA valor) {

        padre.setHijoIzq(valor);

    }

    public void InsertarDer2(NodoA padre, NodoA valor) {

        padre.setHijoDer(valor);

    }

    public void InsertarDer(char padre, char valor) {
        NodoA temp = Buscar(Root, padre);
        NodoA hijoDer = new NodoA(valor);
        temp.setHijoDer(hijoDer);

    }

    public void Preorden(NodoA root) {
        if (root != null) {
            System.out.println(root.getDato() + " ");
            Preorden(root.getHijoIzq());
            Preorden(root.getHijoDer());

        }
    }

    public void Preorden3(NodoA root) {
        if (root != null) {

            System.out.println(root.getDato() + " ");
            Preorden(root.getHijoIzq());
            Preorden(root.getHijoDer());

        }
    }

    public Lista Preorden2(NodoA root) {
        Lista lista = new Lista();

        if (root != null) {
            lista.agregarFinal(root.getDato());

            Preorden(root.getHijoIzq());
            Preorden(root.getHijoDer());

        }
        return lista;
    }

    public void Posorden(NodoA root) {
        if (root != null) {

            Posorden(root.getHijoIzq());
            Posorden(root.getHijoDer());
            System.out.println(root.getDato() + " ");

        }
    }

    public void Inorden(NodoA root) {
        if (root != null) {

            Inorden(root.getHijoIzq());
            System.out.println(root.getDato() + " ");
            Inorden(root.getHijoDer());

        }
    }

////Busca un Nodo por recorrido preorden
//    public NodoA Buscar(NodoA mynode, int valor) {
//        NodoA buscado = null;
//        if (mynode != null && EsVacio(Root) == false) {
//            if ((int) mynode.getDato() == valor) {
//                return mynode;
//            }
//            if (mynode.getHijoIzq() != null) {
//                buscado = Buscar(mynode.getHijoIzq(), valor);
//
//            }
//            if (buscado == null) {
//                buscado = Buscar(mynode.getHijoDer(), valor);
//
//            }
//            return buscado;
//
//        } else {
//            System.out.println("No se encontro");
//            return null;
//        }
//    }
    //Busca un Nodo por recorrido preorden
    public NodoA Buscar(NodoA mynode, char valor) {
        NodoA buscado = null;
        if (mynode != null && EsVacio(Root) == false) {
            if ((char) mynode.getDato() == valor) {
                return mynode;
            }
            if (mynode.getHijoIzq() != null) {
                buscado = Buscar(mynode.getHijoIzq(), valor);

            }
            if (buscado == null) {
                buscado = Buscar(mynode.getHijoDer(), valor);

            }
            return buscado;

        } else {
            System.out.println("No se encontro");
            return null;
        }
    }

    public NodoA SearchPadre2(NodoA root, String padre) {
        NodoA encontrado = null;
        if (root.getDato() == padre) {
            return root;
        }
        if (root.getHijoIzq() != null && encontrado == null) {
            encontrado = SearchPadre2(root.getHijoIzq(), padre);
        }
        if (root.getHijoDer() != null && encontrado == null) {
            encontrado = SearchPadre2(root.getHijoDer(), padre);

        }
        return encontrado;

    }

    public void AddNode(String hijo, String padre) {
        NodoA nodeHijo = new NodoA(hijo);
        if (this.EsVacio(this.Root)) {
            this.Root = nodeHijo;

        } else {
            NodoA nodePadre = SearchPadre2(this.Root, padre);
            if (nodePadre == null) {
                System.out.println("El padre no existe");
            } else if (nodePadre.getHijoIzq() == null) {
                nodePadre.setHijoIzq(nodeHijo);

            } else if (nodePadre.getHijoDer() == null) {
                nodePadre.setHijoDer(nodeHijo);

            } else {
                System.out.println("Ambos hijos estan llenos");
            }
        }

    }
    //ARBOLES IDENTICOS EN ESTRUCTURA

    public boolean sameStructure(NodoA root2) {
        return sameStructure(this.Root, root2);

    }

    public boolean sameStructure(NodoA root1, NodoA root2) {
        boolean same = true;
        if (root1 == null || root2 == null) {
            return false;

        }
        if ((root1.getHijoIzq() != null || root2.getHijoIzq() != null) && same) {
            same = sameStructure(root1.getHijoIzq(), root2.getHijoIzq());

        }
        if ((root1.getHijoDer() != null || root2.getHijoDer() != null) && same) {
            same = sameStructure(root1.getHijoDer(), root2.getHijoDer());
        }
        return same;

    }

    //ARBOLES IDENTICOS EN ESTRUCTURA Y VALORES
    public boolean sameValues(NodoA root2) {
        return sameValues(this.Root, root2);

    }

    public boolean sameValues(NodoA root1, NodoA root2) {
        boolean same = true;
        if (root1 == null || root2 == null || !root1.getDato().equals(root2.getDato())) {
            return false;

        }
        if ((root1.getHijoIzq() != null || root2.getHijoIzq() != null) && same) {
            same = sameValues(root1.getHijoIzq(), root2.getHijoIzq());

        }
        if ((root1.getHijoDer() != null || root2.getHijoDer() != null) && same) {
            same = sameValues(root1.getHijoDer(), root2.getHijoDer());
        }
        return same;

    }

    //MIRROR STRUCTURE sin datoas iguales
    public boolean mirrorStructure(NodoA root2) {
        return mirrorStructure(this.Root, root2);

    }

    public boolean mirrorStructure(NodoA root1, NodoA root2) {
        boolean same = true;
        if (root1 == null || root2 == null) {
            return false;

        }
        if ((root1.getHijoIzq() != null || root2.getHijoDer() != null) && same) {
            same = mirrorStructure(root1.getHijoIzq(), root2.getHijoDer());

        }
        if ((root1.getHijoDer() != null || root2.getHijoIzq() != null) && same) {
            same = mirrorStructure(root1.getHijoDer(), root2.getHijoIzq());
        }
        return same;

    }

    //MIRROR STRUCTURE CON datoas iguales ,,, espejo identicos
    public boolean mirrorValues(NodoA root2) {
        return mirrorValues(this.Root, root2);

    }

    public boolean mirrorValues(NodoA root1, NodoA root2) {
        boolean same = true;
        if (root1 == null || root2 == null || !root1.getDato().equals(root2.getDato())) {
            return false;

        }
        if ((root1.getHijoIzq() != null || root2.getHijoDer() != null) && same) {
            same = mirrorValues(root1.getHijoIzq(), root2.getHijoDer());

        }
        if ((root1.getHijoDer() != null || root2.getHijoIzq() != null) && same) {
            same = mirrorValues(root1.getHijoDer(), root2.getHijoIzq());
        }
        return same;

    }

}
