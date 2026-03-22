//Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
//dois metros e que um quilômetro possui mil metros, fazer um programa para
//converter milhas marítimas em quilômetros.
public class TP01Ex08 extends Exercicio{

    public static void converterMilhasParaQuilometros(){
        System.out.println("Informe um valor em milhas: ");
        float milhas = scanner.nextFloat();

        scanner.close();
        System.out.printf("%.3f milhas equivalem a %.3f Km", milhas, milhas * 1.852);
    }
}
