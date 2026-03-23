//Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
//digitado.
public class TP01Ex02 extends Exercicio{

    public static void calcularAreaQuadrado(){
        System.out.println("Exercício 2: Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.");
        System.out.println("----------------------------------------");

        System.out.println("Digite o valor da aresta do quadrado em cm: ");
    
        float arestaQuadrado = scanner.nextFloat();
        System.out.printf("O valor da área do quadrado é %.2fcm²\n ", arestaQuadrado * arestaQuadrado);
        scanner.close();
    }
}
