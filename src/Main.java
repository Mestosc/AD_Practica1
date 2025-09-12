import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //System.out.println(eDirectorio("../../Descargas/PSP_Tarea01.pdf")); // Empieza en la carpeta del proyecto así que esto funciona
        //System.out.println(eFicheiro("../../Descargas"));
        //System.out.println(eDirectorio("Hola mundo"));
        //System.out.println(eDirectorio("../../Descargas")); // Empieza en la carpeta del proyecto así que esto funciona
        //System.out.println(eFicheiro("../../Descargas/PSP_Tarea01.pdf")); // Empieza en la carpeta del proyecto así que esto funciona
        //System.out.println(eDirectorio("Hola mundo"));
        //crearDirectorio("especimen");
        creaFicheiro("/home/dam/","Crar");
        modoAcceso("/home/dam/","Crar");

    }
    public static String eDirectorio(String cadea) {
        File archivo = new File(cadea);
        if (archivo.isDirectory()) {
            return "é directorio";
        } else {
            return "non é directorio";
        }
    }
    public static String eFicheiro(String cadea) {
        File archivo = new File(cadea);
        if (archivo.isFile()) {
            return "é directorio(ficheiro)";
        } else {
            return "non é directorio (ficheiro)";
        }
    }
    public static void crearDirectorio(String cadea) {
        File archivo = new File(cadea);
        if (archivo.mkdirs()) {
            System.out.println("Directorio creado");
        } else {
            System.out.println("Directorio no creado");
        }
    }
    public static void creaFicheiro(String dirName,String fileName) {
        File archivoCrear = new File(dirName+fileName);
        try {
            archivoCrear.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void modoAcceso(String dirName, String fileName) {
        File archivo = new File(dirName+fileName);
        if (archivo.canRead() && archivo.canWrite()) {
            System.out.println("lectura si");
            System.out.println("escritura si");
        } else if (!archivo.canRead() && !archivo.canWrite()) {
            System.out.println("lectura no");
            System.out.println("escritura no");
        }
        else if (archivo.canRead()) {
            System.out.println("lectura si");
        } else if (archivo.canWrite()) {
            System.out.println("Escritura si");
        } else if (!archivo.canRead()) {
            System.out.println("Lectura no");
        } else if (!archivo.canWrite()) {
            System.out.println("Escritura no");
        }
    }
}
