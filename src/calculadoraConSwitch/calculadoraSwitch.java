package calculadoraConSwitch;
import java.util.Scanner;

public class calculadoraSwitch {

   
    public static void main (String[]args) {
        Scanner s=  new Scanner (System.in);
        System.out.println(" ***  Menu de opciones *** ");
        System.out.println(" 1-    Sumar ");  
        System.out.println(" 2-    Restar ");
        System.out.println(" 3-    Dividir ");
        System.out.println(" 4-    Multiplicar ");
        System.out.println(" 5-    Resto de una división "); 
        System.out.println(" 6-    Salir ");        
                
        int n1,n2;
        int resultado;
        System.out.printf(" %s  ", " Que deseas hacer ? ");
        resultado= s.nextInt();
        System.out.printf(" %s  ", "Defina su primer valor  ");
        n1= s.nextInt();
        System.out.printf(" %s  ", "Defina su segundo valor ");
        n2=s.nextInt();
        
        switch (resultado)    {
            case 1:
                    resultado= n1 + n2;
                     System.out.println(" El resultado de la suma es   "+  resultado );
                    break;
                    
            case 2:
                resultado= n1 - n2;
                 System.out.println(" El resultado de la resta es   "+ resultado );
                 break;
                 
            case 3:
                resultado= (n1 / n2);
                System.out.println( " El resultado de la division es   "+ resultado );
                      break;
                      
            case 4:
                resultado= (n1 * n2);
                System.out.println(" El resultado de la multiplicacion es "+ resultado );
                 break;
                 
            case 5:
                resultado= (n1 % n2); 
                System.out.println("El resto de esta división es "+ resultado );
                break;
                
            case 6:
                System.out.println(" Bye " );
                     
               while(resultado!= 6)
                System.out.println(" ESTA NO ES UNA OPCION \n  BYE!!! ");
        }
    }
}