package dominio;
public class Matematicas {
    public static int sumaPositivos(int n){
        if(n == 0){
          return n;
        } else{
            return n + sumaPositivos(n - 1);
        }

       public static int factorialNumero(int b){
        if(b == 0){
            return 1;
        } else{
            return b * factorialNumero(b - 1);
        }
       }
    }

}
