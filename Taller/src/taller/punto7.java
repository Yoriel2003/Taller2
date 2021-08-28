import java.util.Scanner;
public class punto7 {
    public static void main(String[]args){
        System.out.println("Programa para calcular el porcentaje de utilidad de un producto");
        Scanner porcentaje=new Scanner(System.in);
        
        double Pcompra, Pventa, utilidad;
        System.out.println("Ingrese el precio de Compra: ");
        Pcompra = porcentaje.nextDouble();
        System.out.println("Ingrese el precio de Venta: ");
        Pventa= porcentaje.nextDouble();
        
        
        utilidad = (Pcompra/Pventa)*100;
        
        System.out.println("El porcentaje de utilidad del producto es: "+ utilidad );
        System.out.println("lLa ganancia del producto fue de: "+ (Pventa- Pcompra) );
        System.out.println("By Yoriel Vidal");
        
        
        
        
        
    }
    
}

