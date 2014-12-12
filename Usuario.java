
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
    //indica la cantidad total de proteinas que ha ingerido el usuario
    private float proteinas;
    //indica la cantidad total de carbohidratos que ha ingerido el usuario
    private float carbohidratos;
    //indica la cantidad total de grasas que ha ingerido el usuario
    private float grasas;
    //indica la cantidad total de calorias que ha ingerido el usuario
    private float calorias;
    //indica la cantidad total en gramos de macronutrientes ingeridos
    private float totalMacro;
    

    /**
     * Constructor que indica el nombre del usuaruo y la cantidad inicial de proteinas
     * carbohidratos,grasas y calorias de inicio
     */
    public Usuario(String nombreUsuario)
    {
        this.nombreUsuario = nombreUsuario;
        proteinas=0;
        carbohidratos=0;
        grasas=0;
        calorias=0;
        totalMacro=0;
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
        totalMacro = proteinas + carbohidratos + grasas;
    } 
    
    /**
     * Metodo que muestra por pantalla el nombre del usuario,la cantidad de proteinas
     * carbohidratos,grasas y calorias que ha ingerido el usuario
     */
    public void mostrarDatos()
    {
        System.out.println("Nombre :" + nombreUsuario);
        System.out.println("Gramos de proteinas ingeridos: " + proteinas+"(" + proteinas*100/totalMacro + "% )");
        System.out.println("Gramos de carbohidratos ingeridos: " + carbohidratos+ "(" + carbohidratos*100/totalMacro + "%)"); 
        System.out.println("Gramos de grasas ingeridos: " + grasas+ "(" + grasas*100/totalMacro + "%)"); 
        System.out.println("Gramos de calorias ingeridos: " + calorias); 
    } 
    
    
}