//Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
//exibir sua temperatura equivalente em Fahrenheit.
public class TP01Ex10 extends Exercicio {

    public static void celsiusParaFahrenheit() {
        System.out.println("Digite uma temperatura em graus Celsius: ");
        float temperaturaCelsius = scanner.nextFloat();
        
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        scanner.close();
        System.out.printf("O valor de Celsius em Fahrenheit é: %.2f°F ", temperaturaFahrenheit);
    }
}