package apaza20201013archivowriteread;
import java.util.Scanner;
public class Apaza20201013ArchivoWriteRead {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stock;
        String producto, nombreArchivo = "";
        float precio;
        
        /*do{
            System.out.print("Ingrese el nombre del Archivo: ");
            nombreArchivo = input.next();    
        }while(nombreArchivo.equals(""));*/
        
        System.out.print("Ingrese el nombre del producto: ");
        producto = input.next();
        System.out.print("Ingrese el stock del producto: ");
        stock = input.nextInt();
        System.out.print("Ingrese el precio unitario del producto: ");
        precio = input.nextFloat();
        
        Archivo e1, nameFile;
        //nameFile = new Archivo(nombreArchivo);
        e1 = new Archivo(stock, producto, precio);
        
        e1.escribirArchivo();
        System.out.println("Stock || Producto || Precio");
        e1.leerArchivo();
    }
}
