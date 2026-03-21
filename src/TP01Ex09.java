/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class TP01Ex09 extends Exercicio { 
    public static void calculoVolts() {
        
        System.out.println("Informe o valor dos amperes: ");
        float amper = scanner.nextFloat();
        
        System.out.println("Informe o valor dos Ohm: ");
        float ohm = scanner.nextFloat();
        
        float volts = amper * ohm;
        System.out.printf("O valor de Volts é: %.2fV ", volts);
        
        
        
    
 }
}