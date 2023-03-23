/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.primos.java;

/**
 *
 * @author roman
 */
import javax.swing.JOptionPane;
public class PrimoApp {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero=Integer.parseInt(texto);
        if (esPrimo(numero)){
            System.out.println("El numero "+numero+" es primo");
        }else{
            System.out.println("El numero "+numero+" no es primo");
        }
    }
    public static boolean esPrimo (int numero){
 
        if (numero<=1){
            return false;
        }
        int cont=0;
        for (int divisor=(int)Math.sqrt(numero);divisor>1;divisor--){
                if (numero%divisor==0){
                cont+=1;
            }
        }
        if (cont>=1){
            return false;
        }else{
            return true;
        }
    }
}