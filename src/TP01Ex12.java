// Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
//base que serão digitados.
public class TP01Ex12 extends Exercicio {

    public static void calcularVolumeCone(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Exercício 12: Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        System.out.print("Digite o valor da altura do cone em cm: ");
        float alturaCone = scanner.nextFloat();

        System.out.print("Digite o valor do raio da base do cone em cm: ");
        float raioBaseCone = scanner.nextFloat();

        System.out.printf("O volume do cone mede %.2fcm³ \n", (Math.PI * Math.pow(raioBaseCone, 2) * alturaCone) / 3);
    }
}

