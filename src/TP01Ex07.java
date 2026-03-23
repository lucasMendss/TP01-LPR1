//Calcular e exibir a média geométrica de dois valores quaisquer que serão
//digitados.
public class TP01Ex07 extends Exercicio{

    public static void calcularMediaGeometrica(){
        System.out.println("Exercício 7: Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.");
        System.out.println("----------------------------------------");

        System.out.println("Informe o primeiro número: ");
        float num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo número: ");
        float num2 = scanner.nextFloat();
        
        scanner.close(); 
        System.out.printf("A média geométrica é: %.2f \n", Math.sqrt(num1 * num2));
    }
}
