//Calcular e exibir a média aritmética de quatro valores quaisquer que serão
//digitados.
public class TP01Ex06 extends Exercicio{
    
    public static void calcularMediaAritmetica() {
        System.out.println("Exercício 6: Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.");
        System.out.println("----------------------------------------");

        float[] numeros = new float[4];
        float soma = 0;
        
        for(int ii = 0; ii < 4; ii++){
            System.out.printf("Informe o %d° número: ", ii+1);
            numeros[ii] = scanner.nextFloat();
            soma += numeros[ii]; 
        }
        scanner.close();
        System.out.printf("A média aritmética é: %.2f \n", soma / 4);
    }
}
