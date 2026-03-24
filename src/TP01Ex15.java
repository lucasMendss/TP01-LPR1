//Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
//dólares. Calcular e exibir o valor correspondente em Reais (R$).
public class TP01Ex15 extends Exercicio {

    public static void converterDolarParaReal(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Exercício 15: Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Digite a cotação do dólar em R$:");
        float cotacaoDolar = scanner.nextFloat();

        System.out.println("Digite uma quantia em dólares (U$):");
        float quantiaDolares = scanner.nextFloat();

        float valorEmReais = cotacaoDolar * quantiaDolares;
        System.out.printf("U$%.2f equivale a R$%.2f \n", quantiaDolares, valorEmReais);
    }
}

