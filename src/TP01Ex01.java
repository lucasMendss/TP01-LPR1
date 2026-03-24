//Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
//área.
public class TP01Ex01 extends Exercicio{
    
    public static void calcularAreaRetangulo(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Exercício 1: Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Digite a base do retângulo em cm: ");
        float baseRetangulo = scanner.nextFloat();
        
        System.out.println("Digite a altura do retângulo em cm: ");
        float alturaRetangulo = scanner.nextFloat();

        float areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.printf("A área do retângulo é %.2fcm² \n", areaRetangulo);
    }
}
