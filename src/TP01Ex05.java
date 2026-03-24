//Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
//será digitado.
public class TP01Ex05 extends Exercicio{

    public static void calcularVolumeEsfera(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Exercício 5: Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Digite o valor do diâmetro da esfera em cm: ");
        float diametroEsfera = scanner.nextFloat();

        System.out.printf("O volume da esfera é: %.2fcm³ \n", (4 * Math.PI * Math.pow(diametroEsfera / 2, 3)) / 3 );
    }
}
