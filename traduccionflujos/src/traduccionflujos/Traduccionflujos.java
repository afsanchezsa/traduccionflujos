/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traduccionflujos;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Traduccionflujos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i=0, resultado=0;
        System.out.println("ingrese numero");
        Scanner entrada=new Scanner(System.in);
       int numero =entrada.nextInt();
       if(numero>0){
       for(i=0;i<numero;i=i+1){
           System.out.println(i);
       
       }
       }else{
       resultado=funcion(numero);
       System.out.println(resultado);
       }
             
    }
    
    public static int funcion(int entrada){
    int proceso=entrada*-1;
    return proceso;
    }
}
