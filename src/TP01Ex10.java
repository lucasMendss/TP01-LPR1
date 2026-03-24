//Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
//exibir sua temperatura equivalente em Fahrenheit.
public class TP01Ex10 extends Exercicio {

    public static void celsiusParaFahrenheit() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Exercício 10: Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Digite uma temperatura em graus Celsius: ");
        float temperaturaCelsius = scanner.nextFloat();
        
        float temperaturaFahrenheit = (temperaturaCelsius * 1.8f) + 32;

        System.out.printf("%.2fºC é equivalente a %.2f°F \n", temperaturaCelsius, temperaturaFahrenheit);
    }
}