import java.util.Random;
/**
 *    
 */
public class PracticaBucles {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaBucles()    {
        generador = new Random();
    }

    /**
     *  El método  genera  números aleatorios  entre -1000 y 5000 (inclusive)
     *  y calcula y escribe:
     *      - la media de todos los números
     *      - la suma de los impares
     *      - el máximo de los pares
     *        
     *  El proceso termina cuando sale un 0 o bien se han escrito n nºs
     *  
     *  Los números se escriben  en filas de 5 columnas 
     *  Cada nº aleatorio se muestra en un espacio de 12 posiciones en la pantalla  
     *  y al lado de cada nº se muestra otro nº con las mismas cifras y 
     *  en el mismo orden pero sin ceros (en 5 posiciones)
     *  
     *   Utiliza solo bucles while
     */
    public void generarNumeros(int n)   {
        generador = new Random();
        int fila = 0;
        int numero = generador.nextInt(6001) - 1000;
        int numSin0 = obtenerNumeroSinCeros(numero);
        double sumario = 0;
        double contador = 0;
        int sumaI = 0;
        int maxP = 0;
        System.out.println("");
        System.out.println("Nº máximo de aleatorios a generar 42\n"
        + "o hasta que salga 0");
        System.out.println("");
        while(n > 0 && numero != 0 ){
            numero = generador.nextInt(6001) - 1000;
            numSin0 = obtenerNumeroSinCeros(numero);
            System.out.printf("%12d:%5d", numero, numSin0);
            n--;
            fila++;
            sumario += numero;
            contador ++;
            if(esImpar(numero)){
                sumaI += numero;
            }
            if(esImpar(numero) == false){
                if(numero > maxP){
                    maxP = numero;
                }
            }
            if(fila % 5 == 0){
                System.out.println();
            }
        }
        double media = sumario / contador;
        System.out.println("");
        System.out.println("");
        System.out.printf("%25s%10.2f\n", "Media:", media);
        System.out.printf("%25s%10d\n", "Suma impares:", sumaI);
        System.out.printf("%25s%10d\n", "Máximo pares:", maxP);
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        return  numero % 2 != 0;
    }

    /**
     *  Dado un nº genera y devuelve otro nuevo 
     *  con las mismas cifras y en el mismo orden pero sin 
     *  los 0
     *  Ej - si numero = 2040 devuelve  24, si numero = 1009 devuelve  19
     *  si numero = 3000 devuelve 3
     *   
     *   
     */
    public int obtenerNumeroSinCeros(int numero)   {
        int result = 0;
        int resto = 0;
        int x = 1;
        while(numero != 0){
            resto = numero % 10;
            numero = numero/ 10;
            if(resto != 0){
                result += resto * Math.pow(10, x - 1);
                x++;
            }
        }
        return result;
    }

    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla()    {
        System.out.println('\u000C');
    }

    /**
     *  
     *  Dibuja la letra N (ver figura en el enunciado)
     *  Con bucles for
     *  
     *  Hay que usar el método escribirCaracter()
     *  
     *  
     *   
     */
    public void escribirLetraN(int altura)    {
       //TODO

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        
       
    }

}
