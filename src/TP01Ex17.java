//Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
//cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
public class TP01Ex17 extends Exercicio {

    public static void calcularPotencia(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Exercício 17: Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir ");
        System.out.println("o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Digite um valor para X:");
        float x = scanner.nextFloat();

        System.out.println("Digite um valor para Y:");
        float y = scanner.nextFloat();

        System.out.println("X elevado a Y é igual a: " + Math.pow(x, y));
    }
}

