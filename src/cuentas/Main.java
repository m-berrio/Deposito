/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author Manuel Berrio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void operativa_cuenta(float cantidad){
        CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual=cuenta1.estado();
        System.out.println("El saldo actual es "+saldoActual);
        try{
            cuenta1.retirar(2300);
        }catch(Exception e){
            System.out.println("Fallo al retirar");
        }
        try{
            System.out.println("Ingresar en cuenta");
            cuenta1.ingresar(695);
        }catch(Exception e){
            System.out.println("Fallo al ingresar");
        }
    }
    
}
