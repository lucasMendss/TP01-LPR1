//A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
public class TP01Ex04 extends  Exercicio {

    public static void calcularAreaTriangulo(){
        System.out.println("Digite a base do triângulo em cm: ");
        float baseTriangulo = scanner.nextFloat();

        System.out.println("Digite a altura do triângulo em cm: ");
        float alturaTriangulo = scanner.nextFloat();

        scanner.close();

        System.out.printf("A área do triângulo é %.2fcm² \n", (baseTriangulo * alturaTriangulo) / 2);
    }
}
