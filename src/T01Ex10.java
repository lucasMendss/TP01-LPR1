


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class T01Ex10 extends Exercicio {  
    public static void celsiusParaFahrenheit() {
        
        System.out.println("Informe o grau Celsius: ");
        float celsius = scanner.nextFloat();
        
        double fahrenheit = (celsius * 1.8) + 32;
        
        System.out.printf("O valor de Celsius em Fahrenheit é : %.2fF° ", fahrenheit);
        
    
 }
}