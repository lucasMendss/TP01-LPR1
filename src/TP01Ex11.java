// A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
public class TP01Ex11 extends Exercicio{

    public static void calcularAreaCirculo(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Exercício 11: A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Digite o diâmetro co círculo em cm:");
        float diametroCirculo = scanner.nextFloat();

        float areaCirculo = (float) (Math.PI * Math.pow((diametroCirculo / 2), 2));
        System.out.printf("A área desse círculo mede %.2fcm² \n", areaCirculo);
    }
}
