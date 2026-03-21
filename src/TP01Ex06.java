/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class TP01Ex06 extends Exercicio{
    
    public static void calcularMediaAritmetica() {
        float[] numeros = new float[4];
        float soma = 0;
        
        for(int ii = 0; ii < 4; ii++){
            System.out.printf("Informe o %d° número: ", ii+1);
            numeros[ii] = scanner.nextFloat();
            soma += numeros[ii]; 
        }
        scanner.close();
        System.out.printf("A média aritmética é: %.2f", soma / 4);
    }
}
