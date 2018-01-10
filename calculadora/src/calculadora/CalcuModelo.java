
package calculadora;
import java.util.Scanner;
public class CalcuModelo {

   
         public static void main(String[] args) {
        int opcion;
        double n1, n2, r;
        
        Scanner leer =new Scanner(System.in);
        CalcuControl MAD=new CalcuControl();
     
        System.out.println("ESCRIBA EL PRIMER NUMERO");
        n1 = leer.nextInt();
         System.out.println(" escriba el segundo numero ");
         n2 = leer.nextInt();
        System.out.println(" ELIJA LA OPERACION QUE QUIERE REALIZAR ");
         System.out.println(" 1.****SUMA***");
         System.out.println(" 2.*** RESTA***  ");
         System.out.println(" 3.***MULTIPLICACION***  ");
         System.out.println("4. ****DIVISION***** ");
         opcion = leer.nextInt();
         switch(opcion){
         case 1:
         MAD.suma(n1, n2);
         break;
         case 2:
         MAD.resta(n1, n2);
         break;
        case 3:
        MAD.multiplicacion(n1, n2);
        break;
        case 4:
        MAD.division(n1, n2);
        break;
         }
      }
    
}

