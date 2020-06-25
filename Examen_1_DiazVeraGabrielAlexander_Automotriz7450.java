
package examen_1_diazveragabrielalexander_automotriz.pkg7450;

/**
 *
 * @author User
 */
class Libro_Fisica {

        //Atributo
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;

        //Constructor
    public Libro_Fisica(int pCodigo, String pTitulo, String pAutor, int pAnio_Edicion){

        codigo=pCodigo;
        titulo=pTitulo;
        autor=pAutor;
        anio_edicion=pAnio_Edicion;
    }
        //Metodos
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getAutor(){
        return autor;
    }
     public void setAutor(String autor){
        this.autor=autor;
    }
    public int getAnio_Edicion(){
        return anio_edicion;
    }
    public void setAnio_Edicion(int anio_edicion){
        this.anio_edicion=anio_edicion;
    }
    @Override
    public String toString(){
        return "El libro de Fisica con el codigo " +codigo+": El libro se llama " +titulo+ ", el autor " +autor+ "con anio de edicion "+anio_edicion+ ".";
    }
}

public class Examen_1_DiazVeraGabrielAlexander_Automotriz7450 {

    /**
     * @param args the command line arguments
     */

     public static void main(String[] args) {
    //3 OBJETOS
    Libro_Fisica libro1=new Libro_Fisica(123, "El universo elegante", "Brian Greene", 2010 );
    Libro_Fisica libro2=new Libro_Fisica(456, "Física universitaria", "Hugh Young", 1949 );
    Libro_Fisica libro3=new Libro_Fisica(789, "Hiperespacio", "Michio Kaku", 1994 );

    //Mostrar en pantalla
    System.out.println(libro1.toString());
    System.out.println(libro2.toString());
    System.out.println(libro3.toString());

    }
}
