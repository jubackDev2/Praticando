package Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class CondicionaisEx01 {
    public static void main(String[] args) {




        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double notaFinal = nota1+ nota2;

        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        if (notaFinal < 60){
            System.out.println("SITUAÇÃO: REPROVADO. Lembre-se: cada erro é uma oportunidade de aprendizado. Não desista!");
        }






    }
}
