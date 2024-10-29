package condicionais;

public class CondicionaisEx02 {
    // mais de duas possibilidades

    public static void main(String[] args) {
        int hora = 12;

        if (hora <=  12){ // menor que 12 ou igual a 12 ja se encaixa aqui
            System.out.println("BOM DIA");

        }else if (hora < 18){
            System.out.
                    println("BOA TARDE");
        }else {
            System.out.println("BOA NOITE");
        }
    }

}
