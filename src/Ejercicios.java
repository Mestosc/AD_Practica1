import java.io.File;
import java.io.IOException;


public class Ejercicios {
    public static void main(String[] args) {
        /*
            Por algun motivo hay que poner el nombre del directorio con / ya que sino no te deja
         */
        // System.out.println(eDirectorio("arquivosdir/"));
        //crearDirectorio("arquivosdir/subdir");
        //recur(new File("arquivosdir/"));
        //borraFicheiro("arquivosdir/","Products.txt");
        //mEscritura("arquivosdir","Products.txt");
        // creaFicheiro("arquivosdir/subdir","Products2.txt");
        //System.out.println(eFicheiro("arquivosdir/Products.txt"));
        //System.out.println(eDirectorio("../../Descargas/PSP_Tarea01.pdf")); // Empieza en la carpeta del proyecto así que esto funciona
        //System.out.println(eFicheiro("../../Descargas"));
        //System.out.println(eDirectorio("Hola mundo"));
        //System.out.println(eDirectorio("../../Descargas")); // Empieza en la carpeta del proyecto así que esto funciona
        //System.out.println(eFicheiro("../../Descargas/PSP_Tarea01.pdf")); // Empieza en la carpeta del proyecto así que esto funciona
        //System.out.println(eDirectorio("Hola mundo"));
        //crearDirectorio("especimen");
        //creaFicheiro("/home/dam/", "Crar");
        //modoAcceso("/home/dam/", "Crar");
        //calculaLonxitude("/home/dam/","Captura-desde-2025-09-11-12-24-08.png");
        //System.out.println(mLectura("/home/dam/","Crar"));
       // System.out.println(mEscritura("/home/dam/","Crar"));
       // borraFicheiro("/home/dam/","Crar");
       // borrarDirectorio("/home/dam/Escritorio/sdjlkf");
       // recur(new File("/home/dam/Descargas"));
//        borraFicheiro("arquivosdir/","dsf");
//        borraFicheiro("arquivosdir/subdir/","Products2.txt");
//        borraFicheiro("arquivosdir/subdir/sdfs/","sffaf");
//        borrarDirectorio("arquivosdir/subdir/sdfs/");
//        borrarDirectorio("arquivosdir/subdir/");
//        borrarDirectorio("arquivosdir/");
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

    public static void creaFicheiro(String dirName, String fileName) {
        File archivoCrear = new File(dirName + fileName);
        try {
            archivoCrear.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void modoAcceso(String dirName, String fileName) {
        File archivo = new File(dirName + fileName);
        if (archivo.canRead() && archivo.canWrite()) {
            System.out.println("lectura si");
            System.out.println("escritura si");
        } else if (!archivo.canRead() && !archivo.canWrite()) {
            System.out.println("lectura no");
            System.out.println("escritura no");
        } else if (archivo.canRead()) {
            System.out.println("lectura si");
        } else if (archivo.canWrite()) {
            System.out.println("Escritura si");
        } else if (!archivo.canRead()) {
            System.out.println("Lectura no");
        } else if (!archivo.canWrite()) {
            System.out.println("Escritura no");
        }
    }

    public static void calculaLonxitude(String dirName, String fileName) {
        File archivo = new File(dirName + fileName);
        System.out.println(archivo.length());
    }
    public static boolean mLectura(String dirName, String fileName) {
        File ar = new File(dirName+fileName);
        return ar.setReadOnly();
    }
    public static boolean mEscritura(String dirName, String fileName) {
        File ar = new File(dirName+fileName);
        return ar.setWritable(true);
    }
    public static void borraFicheiro(String dirName, String fileName) {
        File archivo = new File(dirName+fileName);
        if (archivo.exists() && archivo.isFile()) {
            archivo.delete();
        } else {
            System.out.println("Ficheiro inexistente");
        }
    }
    public static void borrarDirectorio(String dirName) {
        File ar = new File(dirName);
        if (ar.isDirectory() && ar.list() != null) { /* Ya que si la ruta es inexistente o tiene descendencia como es lo que ponia en la parte del ejercicio hago esta comprobacion
        que es más exacta para ver si la ruta es un directorio y tiene descendencia*/
            ar.delete();
        } else {
            System.out.println("Ruta inexistente o con descendencia");
        }
    }
    public static void recur(File dir) {
        if (dir.isDirectory()) {
             String[] archivos = dir.list();
             if (archivos!=null) {
                 System.out.print("|\n");
                for (String ar : archivos) {
                    System.out.print("|-");
                    System.out.println(ar);
                }
             }
        }
    }
}