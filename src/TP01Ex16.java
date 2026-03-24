//Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
//seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
//Lembre-se que uma função trigonométrica trabalha em radianos.
public class TP01Ex16 extends Exercicio {

    public static void calcularFuncoesTrigonometricas(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Exercício 16: Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as seguintes funções trigonométricas: ");
        System.out.println("seno, cosseno, tangente e secante deste ângulo. Lembre-se que uma função trigonométrica trabalha em radianos.");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Digite o valor de um ângulo em graus (º):");
        double anguloEmGraus = scanner.nextDouble();

        double anguloEmRad = Math.toRadians(anguloEmGraus);
        double senoAngulo = Math.sin(anguloEmRad);
        double cossenoAngulo = Math.cos(anguloEmRad);
        double tangenteAngulo = Math.tan(anguloEmRad);
        double secanteAngulo = 1 / cossenoAngulo;

        System.out.printf("O seno de %.2fº mede %.3f \n", anguloEmGraus, senoAngulo);
        System.out.printf("O cosseno de %.2fº mede %.3f \n", anguloEmGraus, cossenoAngulo);
        System.out.printf("A tangente de %.2fº mede %.3f \n", anguloEmGraus, tangenteAngulo);
        System.out.printf("A secante de %.2fº mede %.3f \n", anguloEmGraus, secanteAngulo);
    }
}

