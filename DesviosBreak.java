/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Davi
 */
public class DesviosBreak {
    
    public static void main(String[]args){
    //se a variável for igual a 6 sai da estrutura de repetição.
        for (int cont=1; cont<=500; cont++){
         System.out.println("nr: "+cont);
         if (cont==6)
             break;
        }
    
    }
    
    
}
