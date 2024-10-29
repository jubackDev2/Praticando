package condicionais;

import java.util.Scanner;

public class CondicionaisEx03 {

    public static void main(String[] args) {
        /*
         Fazer  um programa  para  ler tres numeros   inteiros. Em seguida, mostrar  qual o menor dentre  os tres numeros lidos;
         Em caso de empate, mostrar  apenas uma vez
         */

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 10
        int b = sc.nextInt(); // 10
        int c = sc.nextInt(); // 20


       if(a < b && a < c){
           System.out.println("O MENOR É"+a);
       } else if (b < a && b < c) {
           System.out.println("O MENOR É:"+ b);
       } else if (a <= b && a <= c) {
           System.out.println("O MENOR É:"+ a);
       }else {
           System.out.println(" O MENOR É "+ c);
       }
    }
}
