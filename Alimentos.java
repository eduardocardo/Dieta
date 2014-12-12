
/**
 * Write a description of class Alimentos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimentos
{
       
    //Indica el nombre del alimento
    private String nombre;
    //indica la cantidad en gramos de proteinas por cada 100 gramos de alimento
     private float proteinas ;
    //indica la cantidad en gramos de carbohidratos por cada 100 gramos de alimento
    private float carbohidratos;
    //indica la cantidad en gramos de grasas por cada 100 gramos de alimento
    private float grasas;
    //indica las calorias del alimento por cada 100 gramos
    private float calorias;
    

    /**
     * Constructor que inicializa el alimento con su nombre y 
     * la cantidad en gramos de proteinas,carbohidratos y grasas
     */
    public Alimentos(String nombre,float proteinas,float carbohidratos,float grasas)
    {
        // 
        this.nombre = nombre;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas=grasas;
        calorias = (4*proteinas)+(4*carbohidratos)+(9*grasas);//calculo de las calorias por cada 100 gramos
    }

    /**
     * Muestra por pantalla el nombre del alimento,la cantidad en gramos de los macronutrientes
     * por cada 100 gramos de alimento,el macronutriente mayoritario y
     * la cantidad de calorias por cada 100 gramos
     */
      
    public void muestraDatos()
    {
        System.out.println("Nombre : "+                            nombre);
        System.out.println("Proteinas por cada 100 gramos : " +    proteinas) ;
        System.out.println("Carbohidratos por cada 100 gramos : "+ carbohidratos);
        System.out.println("Grasas por cada 100 gramos : "   +     grasas);
        System.out.println("Calorias : "                     +     calorias);
        
        
    }   
    
}
