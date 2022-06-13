public class Main {
    public static void main(String[] args) {
        //parte 1: if.
        int numeroIf = 8;

        if (numeroIf>0){
            System.out.println("El número es positivo");
        } else if (numeroIf<0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
        //parte 2: while.
        int numeroWhile = 0;

        while(numeroWhile<3){
            numeroWhile++;
            System.out.println("El número es :"+numeroWhile);
        }
        //parte 3: do while.
        do{
            numeroWhile++;
            System.out.println("El número es :"+numeroWhile);
        }
        while(numeroWhile<3);

        //parte 4: for.
        int numeroFor = 0;
        for (int i=0; i<=3;i++){
            System.out.println("El número es :"+numeroFor);
            numeroFor++;
        }
        //parte 5: switch.

        String estacion= "otoño";

        switch (estacion){

            case "verano":
                System.out.println("La estación es :"+estacion);
                break;
            case "invierno":
                System.out.println("La estación es :"+estacion);
                break;
            case "otoño":
                System.out.println("La estación es :"+estacion);
                break;
            case "primavera":
                System.out.println("La estación es :"+estacion);
                break;
            default:
                System.out.println("La estación es :"+estacion);
                break;

        }







    }



}