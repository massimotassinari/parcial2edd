/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package polacainv;



/**
 *
 * @author massimo
 */
public class conversion {
//    
//    static String conversionPostfijo(String expresion) throws Exception{
//        
//        Stack<Character> stack = new Stack<>();
//        
//        String epostfija = "";
//        
//        
//        
//        
//        for (int i =0; i< expresion.length();i++){
//            char car = expresion.charAt(i);
//            
//            if(jerarquia(car)>0){
//                while (stack.isEmpty() == false && jerarquia(stack.peek()) >= jerarquia(car)){
//                    epostfija += stack.pop();
//                    
//                    
//                    
//                }//termina while
//                stack.push(car);
//                
//            }//TERMINA IF
//            
//            else if(car == ')'){
//                char aux =  stack.pop();
//                
//                while(aux != '('){
//                    epostfija += aux;
//                    aux = stack.pop();
//                    
//                }
//                
//                
//                
//            }
//            else if (car =='('){
//                stack.push(car);
//                
//            }
//            
//            else{
//                epostfija += car;
//            }
//        }
//        for (int i = 0; i < stack.size(); i++) {
//            epostfija += stack.pop();
//            
//            
//            
//            
//            
//        }
//        return epostfija;
//        
//    }
    
    static int jerarquia(char car){
        switch (car){
            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 2;
            case '^':
                return 3;
                
        }
        return -1;
    }
    
    
    static String conversionPostfijo(String expresion) throws Exception{
        
        Pila stack = new Pila();
        
        
        
        String epostfija = "";
        
        
        
        
        for (int i =0; i< expresion.length();i++){
            char car = expresion.charAt(i);
            
            if(jerarquia(car)>0){
                while (stack.esVacia() == false && jerarquia((char) stack.tope()) >= jerarquia(car)){
                    epostfija += stack.tope();
                    stack.retirar();
                    
                    
                    
                }//termina while
                stack.apilar2(car);
                
            }//TERMINA IF
            
            else if(car == ')'){
                char aux =  (char) stack.tope();
                stack.retirar();
                
                while(aux != '('){
                    epostfija += aux;
                    aux = (char) stack.tope();
                    stack.retirar();
                    
                }
                
                
                
            }
            else if (car =='('){
                stack.apilar2(car);
                
            }
            
            else{
                epostfija += car;
            }
        }
        for (int i = 0; i < stack.tamanio; i++) {
            epostfija += stack.tope();
            stack.retirar();
            
            
            
            
            
            
        }
        epostfija += stack.tope();
        return epostfija;
        
    }
    
}
