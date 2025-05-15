import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        DolarParaReal conversao1 = new DolarParaReal();
        DolarParaEuro conversao2 = new DolarParaEuro();
        RealParaDolar conversao3 = new RealParaDolar();
        RealParaEuro conversao4 = new RealParaEuro();
        EuroParaDolar conversao5 = new EuroParaDolar();
        EuroParaReal conversao6 = new EuroParaReal();

        String opcaoDigitada = "";

        while (!opcaoDigitada.equalsIgnoreCase("sair")) {
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

            opcaoDigitada = leitura.nextLine();

            if (opcaoDigitada.equalsIgnoreCase("7")) {
                System.out.println("Programa finalizado!");
                break;
            }

            if (opcaoDigitada.equalsIgnoreCase("1")) {// USD para BRL
                System.out.println("* Digite o valor em Dólar para converter em Real brasileiro:");
                double dolar = leitura.nextDouble();
                double converte = dolar * conversao1.transformacao1.getTaxaConversao();
                conversao1.transformacao1.setResultadoConversao(converte);
                System.out.println(conversao1.transformacao1);
            }

            if (opcaoDigitada.equalsIgnoreCase("2")) {   // USD para EUR
                System.out.println("* Digite o valor em Dólar para converter em Euro:");
                double dolar = leitura.nextDouble();
                double converte = dolar * conversao2.transformacao2.getTaxaConversao();
                conversao2.transformacao2.setResultadoConversao(converte);
                System.out.println(conversao2.transformacao2);
            }

            if (opcaoDigitada.equalsIgnoreCase("3")) {   // BRL para USD
                System.out.println("* Digite o valor em Real brasileiro para converter em Dólar:");
                double dolar = leitura.nextDouble();
                double converte = dolar * conversao3.transformacao3.getTaxaConversao();
                conversao3.transformacao3.setResultadoConversao(converte);
                System.out.println(conversao3.transformacao3);
            }

            if (opcaoDigitada.equalsIgnoreCase("4")) {   // BRL para EUR
                System.out.println("* Digite o valor em Real brasileiro para converter em Euro:");
                double dolar = leitura.nextDouble();
                double converte = dolar * conversao4.transformacao4.getTaxaConversao();
                conversao4.transformacao4.setResultadoConversao(converte);
                System.out.println(conversao4.transformacao4);
            }

            if (opcaoDigitada.equalsIgnoreCase("5")) {   // EUR para USD
                System.out.println("* Digite o valor em Euro para converter em Dólar:");
                double dolar = leitura.nextDouble();
                double converte = dolar * conversao5.transformacao5.getTaxaConversao();
                conversao5.transformacao5.setResultadoConversao(converte);
                System.out.println(conversao5.transformacao5);
            }

            if (opcaoDigitada.equalsIgnoreCase("6")) {   // EUR para BRL
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
