/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polacainv;

/**
 *
 * @author massimo
 */
public class NodoA {
    
    private Object dato;
    private NodoA hijoIzq;
    private NodoA hijoDer;
    
    public NodoA(Object dato){
        this.dato = dato;
        hijoIzq = null;
        hijoDer = null;
        
    }

    /**
     * @return the dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }

    /**
     * @return the hijoIzq
     */
    public NodoA getHijoIzq() {
        return hijoIzq;
    }

    /**
     * @param hijoIzq the hijoIzq to set
     */
    public void setHijoIzq(NodoA hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    /**
     * @return the hijoDer
     */
    public NodoA getHijoDer() {
        return hijoDer;
    }

    /**
     * @param hijoDer the hijoDer to set
     */
    public void setHijoDer(NodoA hijoDer) {
        this.hijoDer = hijoDer;
    }
    
}
