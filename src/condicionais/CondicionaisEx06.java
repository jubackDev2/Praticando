package condicionais;

import java.util.Scanner;

public class CondicionaisEx06 {
    public static void main(String[] args) {


        /*

         Faça um programa que leia o valor do salário bruto mensal do usuário
         e calcule o IMPOSTO DE RENDA a ser pago, com base  em 5 faixas.


         * faixa 1 - abaixo de 1.903,99 = isento (não paga)

         * faixa 2 - de 1.903,99 a R$ 2.826,65 = 7,5% menos dedução de R$ 142,80
         * faixa 3 - de 2.826,66 a R$ 3.751,05 = 15% menos dedução de 354,80
         * faixa 4 - de 333.751,06 a 4.664,68 = 22,5% menos dedução de R$ 6336,133
         * faixa 5 - acima de R$ 4.664,68 = menos dedução de R$ 869,336

         O programa dece exibir como saída
         - O valor da aliquota de imposto ( são os percentuais)
         - O valor mensal do imposto a ser pago ( vai ser calculado com  base na aliquota e tbm na dedução)
         - O valor anual  do imposto a ser pago ( o valor mensal multiplacado por 12)
         */


        // declaração das variaveis

        double salario;
        double aliquota;
        double deducao;
        double impostoMensal;
        double impostoAnual;



        // obtenção dos valores (ENTRADA)

        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o salário bruto mensal: R$ ");
        salario = reader.nextDouble();

        // Calculo do imposto (Processamento)

        if (salario > 4664.68) { // faixa 5
           aliquota = 27.5;
           deducao = 869.36;

        }else if (salario <= 4664.68 && salario >= 3751.06){ // faixa 4
            aliquota = 22.5;
            deducao = 636.13;

        } else if (salario <= 3751.05 && salario >= 2826.66) { // faixa 3
           aliquota = 15;
           deducao = 354.80;

        } else if (salario <= 2826.65 && salario >= 1903.99) { // faixa 2
          aliquota = 7.5;
          deducao = 142.80;
        }else {
           aliquota = 0;
           deducao = 0;
        }
        impostoMensal = salario * (aliquota/100)- deducao;  // porque dividimos o valor da aliquota por 100? porque a aliquota está com o valor absoluto
        impostoAnual = impostoMensal * 12;

        // exibição (Saída)

        System.out.println("\nSalario: = R$"+salario);
        System.out.println("Aliquota = R$"+aliquota);
        System.out.println("imposto mensal: = R$"+impostoMensal);
        System.out.println("imposto anual: = R$"+impostoAnual);

    }
}
