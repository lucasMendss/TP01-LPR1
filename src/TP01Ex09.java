//Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
//valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
public class TP01Ex09 extends Exercicio {

    public static void calculoVolts() {
        System.out.println("Digite um valor em Amperes: ");
        float amper = scanner.nextFloat();
        
        System.out.println("Digite um valor em Ohm: ");
        float ohm = scanner.nextFloat();

        scanner.close();
        System.out.printf("O valor em Volts é: %.2fV ", amper * ohm);
    }
}