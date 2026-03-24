// Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
//valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
//(em s) que serão digitados.
public class TP01Ex13 extends Exercicio {

    public static void calcularVelocidadeFinal(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Exercício 13: Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso (em s) que serão digitados.");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Digite a velocidade inicial do automóvel em m/s:");
        float velocidadeInicial = scanner.nextFloat();

        System.out.println("Digite a aceleração do automóvel em m/s²:");
        float aceleracao = scanner.nextFloat();

        System.out.println("Digite o tempo de percurso em segundos:");
        float tempoPercurso = scanner.nextFloat();

        float velocidadeFinal = velocidadeInicial + (aceleracao * tempoPercurso);
        float velocidadeFinalEmKmH = velocidadeFinal * 3.6f;

        System.out.printf("A velocidade final do automóvel é %.2fkm/h \n", velocidadeFinalEmKmH);
    }
}

