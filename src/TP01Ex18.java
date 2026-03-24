//Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
//valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
//que deverá ser devolvido.
public class TP01Ex18 extends Exercicio {

    public static void calcularSomatoriaETroco(){
        System.out.println("----------------------------------------");
        System.out.println("Exercício 18: Entrar via teclado com o valor de cinco produtos. Após as entradas, ");
        System.out.println("digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.");
        System.out.println("----------------------------------------");

        float total = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o valor do " + (i+1) + "° produto em R$: ");
            float valor = scanner.nextFloat();
            total += valor;
        }

        System.out.println("Digite o valor do pagamento em R$: ");
        float valorPagamento = scanner.nextFloat();

        if(valorPagamento < total){
            System.out.printf("Valor de pagamento insuficiente. O total da compra é de R$%.2f \n ", total);
        }
        else{
            System.out.printf("O valor do troco é de R$%.2f \n ", (valorPagamento - total));
        }
    }
}

