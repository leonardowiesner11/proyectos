
 package calculodearea;
  import java.util.Scanner;
 public class CalculoDeArea {
        
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
          int lado,area,perimetro;
          
            System.out.println("ingrese el valor de un lado del cuadrado");
             lado= in.nextInt();     
             System.out.println("El valor que usted ingreso es "+lado);
              area= lado*2;
               System.out.println("El valor del area es "+area);
                perimetro=lado*4;
                System.out.println("El valor del perimetro es "+perimetro);
    }
    
}

