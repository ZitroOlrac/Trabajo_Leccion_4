import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        System.out.println("1ra Pregunta");
        ValidarNumero(0);
        System.out.println("2da Pregunta");
        IncrementarNumero(0);
        System.out.println("3da Pregunta");
        IncrementarNumeroDoWhile(2);
        System.out.println("4ta Pregunta");
        bucleFor();
        System.out.println("5ta Pregunta");
        Estaciones(0);
    }
    public static void ValidarNumero(int numero){
        if(numero <=0){
            System.out.println("El numero " + numero + " es negativo");
        } else if (numero>=0) {
            System.out.println("El numero " + numero + " es positivo");
        }else{
            System.out.println("El numero " + numero + " es igual a 0");
        }
    }
    public  static  void IncrementarNumero(int numeroWhile){
        while (numeroWhile <3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }
    public static void  IncrementarNumeroDoWhile(int numeroDoWhle){
        do {
            System.out.println(numeroDoWhle);
            numeroDoWhle++;
        }while (numeroDoWhle<3);
    }
    public  static void bucleFor(){
        for (int numeroFor = 0; numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
    }
    public  static void Estaciones(int numeroEstacion){
        switch (numeroEstacion){
            case 0 :
                System.out.println("Primavera");
                return;
            case 1 :
                System.out.println("Verano");
                return;
            case 2 :
                System.out.println("Otoño");
                return;
            case 3 :
                System.out.println("Invierno");
                return;
            default:
                System.out.println("Valor fuera del rango 0-3");
                return;
        }
    }
}
