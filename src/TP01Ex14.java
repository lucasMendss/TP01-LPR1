//Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
//“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r“ e “a” serão
//digitados.
public class TP01Ex14 extends Exercicio {

    public static void calcularVolumeAmbiente(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Exercício 14: Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio “r” inscrita ");
        System.out.println("em um cubo perfeito de aresta “a”. Os valores de “r“ e “a” serão digitados.");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        //volume livre = volume do cubo - volume da esfera

        System.out.println("Digite o valor do raio da esfera em cm: ");
        double raioEsfera = scanner.nextDouble();

        System.out.println("Digite o valor da aresta do cubo em cm: ");
        double arestaCubo = scanner.nextDouble();

        double volumeEsfera = (4 * Math.PI * Math.pow(raioEsfera, 3)) / 3;
        double volumeCubo = Math.pow(arestaCubo, 3);
        double volumeLivre = volumeCubo - volumeEsfera;

        if(volumeEsfera > volumeCubo){
            System.out.println("A esfera não pode ser inscrita no cubo, pois seu volume é maior que o volume do cubo.");
        }
        else{
            System.out.printf("O volume livre do ambiente é de %.2fcm³ \n", volumeLivre);
        }
    }
}

