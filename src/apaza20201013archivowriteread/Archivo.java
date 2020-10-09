package apaza20201013archivowriteread;
import java.io.*;
public class Archivo {
    private int stock;
    private String producto;
    private float precio;
    //private String Archivo;
    
    /*public Archivo(String Archivo) {
        this.Archivo = Archivo;
    }*/

    public Archivo(int stock, String producto, float precio) {
        this.stock = stock;
        this.producto = producto;
        this.precio = precio;
    }
    
    /*public void setArchivo(String Archivo) {
        this.Archivo = Archivo;
    }*/
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    /*public String getArchivo() {
        return Archivo;
    }*/
    public String getProducto() {
        return producto;
    }
    public int getStock() {
        return stock;
    }
    public float getPrecio() {
        return precio;
    }
    
    
    //File f = new File(Archivo + ".txt");
    public void escribirArchivo(){
        try{
            File f = new File("empresa.txt");
//con el parametro TRUE el archivo puede seguir recibiendo datos sin que se pise lo que se lleno anteriormente
            FileWriter fw = new FileWriter(f, true);    
            PrintWriter pw = new PrintWriter(fw);
            pw.println(stock + " || " + producto + " || " + "$" + precio);
            fw.close();
        }
        catch(IOException e){
            System.out.println("ERROR de escritura");
            System.out.println(e);
        }
    }
    
    public void leerArchivo(){
        try{
            File f = new File("empresa.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader (fr);
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            fr.close();
        }
        catch(IOException e){
            System.out.println("ERROR de lectura");
            System.out.println(e);
        }
    }
}
