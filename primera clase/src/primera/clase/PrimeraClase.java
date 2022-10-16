package primera.clase;

public class PrimeraClase {

    public static void main(String[] args) {
        System.out.println("hola mundo");
        int n1=10;
        int n2=5;
        int total = n1+n2;
        int mul=n1*n2; 
        int div=n1/n2;
        int rest=n1-n2;
        System.out.println(total);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rest);
        if(n1<n2){
            System.out.println("n1 es menor");
        }else{
            System.out.println("n2 es menor");
        }
        int edad=0;
        if(edad <= 1){
            System.out.println("es un bebe");
        }
        else if (edad <=12){
            System.out.println("Eres un niño");        
        }
        else if (edad <= 17){
            System.out.println("es un puberto");
        }
        else if (edad <=27){
            System.out.println("es un joven");
        }
        else{
            System.out.println("es un adulto");
        }
    }  
    }
    

