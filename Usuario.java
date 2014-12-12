
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // indica el nombre del usuario
    private String nombreUsuario;
    private float proteinas;
    private float carbohidratos;
    private float grasas;
    private float calorias;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nombreUsuario)
    {
        this.nombreUsuario = nombreUsuario;
        proteinas=0;
        carbohidratos=0;
        grasas=0;
        calorias=0;
    }

    /**
     *Permite al usuario comer un alimento determinado con una cantidad medida en gramos
     */
    public void comer(Alimentos nombre,float cantidad)
    {
        proteinas    = proteinas + nombre.getProteinas();
        carbohidratos= carbohidratos + nombre.getCarbohidratos();
        grasas       = grasas + nombre.getGrasas();
        calorias     = calorias + nombre.getCalorias();
    } 
    
    /**
     * Metodo que muestra por pantalla el nombre del usuario,la cantidad de proteinas
     * carbohidratos,grasas y calorias que ha ingerido el usuario
     */
    public void mostrarDatos()
    {
        System.out.println("Nombre :" + nombreUsuario);
        System.out.println("Gramos de proteinas ingeridos: " + proteinas);
        System.out.println("Gramos de carbohidratos ingeridos: " + carbohidratos); 
        System.out.println("Gramos de grasas ingeridos: " + grasas); 
        System.out.println("Gramos de calorias ingeridos: " + calorias); 
    }   
}