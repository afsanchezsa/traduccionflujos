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
public class traduccionprofesor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0,resultado=0;
        int numero=0;
        Scanner in=new Scanner(System.in);
           System.out.println("ingrese numero");
        numero=in.nextInt();
        if(numero>0){
        for(i=0;i<=numero;i++){
            System.out.println(i);
            
        }}else{
        resultado=funcion(numero);
        }
        
                    }
    public static int funcion(int entrada){
    int proceso=0,salida=0;
    proceso=entrada*-1;
    salida=proceso;
    return salida;
    }
    
}
