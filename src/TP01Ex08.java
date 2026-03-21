
public class TP01Ex08 extends Exercicio{
    public static void converterMilhasParaQuilometros(){
        System.out.println("Informe um valor em milhas: ");
        float milhas = scanner.nextFloat();
        
        System.out.printf("%.3f milhas equivalem a %.3f Km", milhas, milhas * 1.852);
    }
}
