package calculoareas;
import java.util.Scanner;
    public class CalculoAreas{    
    public static void main(String[] args){
        int areaACalcular;
        do{
            System.out.println("Digite el número del área a calcular :");
            System.out.println("\n1. Área del triángulo.");
            System.out.println("\n2. Área del círculo.");
            System.out.println("\n3. Área del cuadrado.");
            System.out.println("\n4. Área del rectángulo.");
            System.out.println("\n5. Salir.");
            Scanner entradaScanner = new Scanner(System.in);
            areaACalcular= entradaScanner.nextInt();
            if (areaACalcular>5 || areaACalcular<1){
                System.out.println("No ha seleccionado una opción válida!");
            }
        }while(areaACalcular > 5 || areaACalcular < 1);        
        switch (areaACalcular){
           case 1:
               System.out.println("\nHA SELECCIONADO EL AREA DEL TRIANGULO");
               System.out.println("Ahora digite el valor de la base en metros:"); 
               Scanner entradaScanner1 = new Scanner(System.in);
               int baseTriangulo = entradaScanner1.nextInt();
               System.out.println("Digite el valor de la altura en metros: ");
               Scanner entradaScanner2 = new Scanner(System.in);
               int alturaTriangulo = entradaScanner2.nextInt();
               Triangulo areaTriangulo = new Triangulo(baseTriangulo, alturaTriangulo);
               System.out.println("El área del triángulo es: "+areaTriangulo.calcularAreaTriangulo()+" m2");               
               break;
           case 2:
               System.out.println("\nHA SELECCIONADO EL AREA DEL CIRCULO");
               System.out.println("Ahora digite el valor del radio del circulo en metros:");               
               Scanner entradaScanner3 = new Scanner(System.in);
               double radioCirculo = entradaScanner3.nextDouble();
               Circulo areaCirculo = new Circulo(radioCirculo);
               System.out.println("El área del circulo es: "+areaCirculo.calcularAreaCirculo()+" m2");               
               break;
           case 3:
               System.out.println("\nHA SELECCIONADO EL AREA DEL CUADRADO");
               System.out.println("Ahora digite el valor del lado en metros: ");
               Scanner entradaScanner4 = new Scanner(System.in);
               int ladoCuadrado = entradaScanner4.nextInt();
               Cuadrado areaCuadrado = new Cuadrado(ladoCuadrado);
               System.out.println("El área del cuadrado es: "+areaCuadrado.calcularAreaCuadrado()+" m2"); 
               break;
           case 4:
               System.out.println("\nHA SELECCIONADO EL AREA DEL RECTANGULO");
               System.out.println("Ahora digite el valor del lado uno en metros: ");
               Scanner entradaScanner5 = new Scanner(System.in);
               int ladoUnoRectangulo = entradaScanner5.nextInt();
               System.out.println("Digite el valor del lado dos en metros: ");
               Scanner entradaScanner6 = new Scanner(System.in);
               int ladoDosRectangulo = entradaScanner6.nextInt();                
               Rectangulo areaRectangulo = new Rectangulo(ladoUnoRectangulo, ladoDosRectangulo);
               System.out.println("El área del rectángulo es: "+areaRectangulo.calcularAreaRectangulo()+" m2"); 
               break;
           default:
               break;                
        }       
    }
}