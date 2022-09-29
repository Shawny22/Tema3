public class Main {
    public static void main(String[] args) {

        suma(1,2,3);

        Coche miCoche=new Coche();
        miCoche.sumarPuerta();
        System.out.println("el número de puertas es: "+miCoche.puertas);
    }
    public static void suma(int a,int b,int c){  //funcion que suma 3 numeros
        int suma;
        suma=a+b+c;
        System.out.println("La suma total es: "+suma);
    }


}
class Coche{  //clase coche
    public int puertas=0;

    public void sumarPuerta(){   //Suma una puerta
        this.puertas++;
    }


}