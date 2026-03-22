//Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
//digitado.
public class TP01Ex03 extends Exercicio {

    public static void CalcularAreaQuadradoDiagonal(){
        System.out.println("Digite a diagonal do quadrado em cm: ");
        
        float diagonal = scanner.nextFloat();
        
        System.out.printf("A area do quadrado é %.2fcm² \n", Math.pow(diagonal,2) / 2);
        scanner.close();
    }
    
    
}
