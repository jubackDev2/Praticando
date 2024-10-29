package condicionais;

import java.util.Scanner;

public class CondicionaisEx04 {
    public static void main(String[] args) {

        System.out.println("DIGITE UM VALOR: ");
        Scanner  sc = new Scanner(System.in);


        int valor = sc.nextInt();

        if (valor  % 2 == 0){
            System.out.println("ELE é PAR!!");
        }else {
            System.out.println("Impar");
        }
    }
}
