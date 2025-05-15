import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        // ***************************** IMPORTANTE **************************

        //PARA RODAR O PROGRAMA CRIE SUA CHAVE API NO SITE https://www.exchangerate-api.com/
        //COLOQUE A SUA CHAVE DENTRO DAS ASPAS DUPLA DA STRING key QUE ESTÁ NA CLASSE ARMAZENAMENTO

        Scanner leitura = new Scanner(System.in);
        //Objetos criados para pegar informações das classes
        DolarParaReal conversao1 = new DolarParaReal();
        DolarParaEuro conversao2 = new DolarParaEuro();
        RealParaDolar conversao3 = new RealParaDolar();
        RealParaEuro conversao4 = new RealParaEuro();
        EuroParaDolar conversao5 = new EuroParaDolar();
        EuroParaReal conversao6 = new EuroParaReal();

        //Inicializa a variável opcaoDigitada como "vazia" para inicializar o loop do menu
        String opcaoDigitada = "";

        //Loop do menu de opções
        //Verifica se a variável do tipo String opcaoDigitada é diferente de "sair"
        //Enquanto a variável opcaoDigitada for diferente de sair, vai continuar rodando o código
        while (!opcaoDigitada.equalsIgnoreCase("7")) {
            System.out.println("*********************************************************");
            System.out.println("*        Seja bem vindo/a ao Conversor de Moedas        *");
            System.out.println("*********************************************************");
            System.out.println("1 - Dólar para Real brasileiro");
            System.out.println("2 - Dólar para Euro");
            System.out.println("3 - Real brasileiro para Dólar");
            System.out.println("4 - Real brasileiro para Euro");
            System.out.println("5 - Euro para Dólar");
            System.out.println("6 - Euro para Real brasileiro");
            System.out.println("7 - Sair");
            System.out.println("* Escolha uma opção válida: ");

            // Armazena na variável opcaoDigitada a leitura do que for digitado no terminal
            opcaoDigitada = leitura.nextLine();

            // Condição para encerrar o programa
            if (opcaoDigitada.equalsIgnoreCase("7")) {
                System.out.println("Programa finalizado!");
                break;
            }

            // Condição para converter USD em BRL
            if (opcaoDigitada.equalsIgnoreCase("1")) {
                System.out.println("* Digite o valor em Dólar para converter em Real brasileiro:");
                double dolar = leitura.nextDouble();
                double converte = dolar * conversao1.transformacao1.getTaxaConversao();
                conversao1.transformacao1.setResultadoConversao(converte);
                System.out.println(conversao1.transformacao1);
            }

            // Condição para converter USD para EUR
            if (opcaoDigitada.equalsIgnoreCase("2")) {
                System.out.println("* Digite o valor em Dólar para converter em Euro:");
                double dolar = leitura.nextDouble();
                double converte = dolar * conversao2.transformacao2.getTaxaConversao();
                conversao2.transformacao2.setResultadoConversao(converte);
                System.out.println(conversao2.transformacao2);
            }

            // Condição para converter BRL para USD
            if (opcaoDigitada.equalsIgnoreCase("3")) {
                System.out.println("* Digite o valor em Real brasileiro para converter em Dólar:");
                double dolar = leitura.nextDouble();
                double converte = dolar * conversao3.transformacao3.getTaxaConversao();
                conversao3.transformacao3.setResultadoConversao(converte);
                System.out.println(conversao3.transformacao3);
            }

            // Condição para converter BRL para EUR
            if (opcaoDigitada.equalsIgnoreCase("4")) {
                System.out.println("* Digite o valor em Real brasileiro para converter em Euro:");
                double dolar = leitura.nextDouble();
                double converte = dolar * conversao4.transformacao4.getTaxaConversao();
                conversao4.transformacao4.setResultadoConversao(converte);
                System.out.println(conversao4.transformacao4);
            }

            // Condição para converter EUR para USD
            if (opcaoDigitada.equalsIgnoreCase("5")) {
                System.out.println("* Digite o valor em Euro para converter em Dólar:");
                double dolar = leitura.nextDouble();
                double converte = dolar * conversao5.transformacao5.getTaxaConversao();
                conversao5.transformacao5.setResultadoConversao(converte);
                System.out.println(conversao5.transformacao5);
            }

            // Condição para converter EUR para BRL
            if (opcaoDigitada.equalsIgnoreCase("6")) {
                System.out.println("* Digite o valor em Euro para converter em Real brasileiro:");
                double dolar = leitura.nextDouble();
                double converte = dolar * conversao6.transformacao6.getTaxaConversao();
                conversao6.transformacao6.setResultadoConversao(converte);
                System.out.println(conversao6.transformacao6);
            }
        }

        System.out.println("*******************************************************");
        leitura.close();
    }
}
