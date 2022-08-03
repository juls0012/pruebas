package actividad;

public class ordenamiento
{
   public static void main( String[] args )
   {
      // crea objeto para realizar el ordenamiento por selección
      ordenamientoSeleccion arregloOrden = new ordenamientoSeleccion( 11 );
      
      System.out.println( "Arreglo desordenado:" );
      System.out.println( arregloOrden ); // imprime arreglo desordenado

      arregloOrden.ordenar(); // ordena el arreglo

      System.out.println( "Arreglo ordenado:" );
      System.out.println( arregloOrden ); // imprime el arreglo ordenado
   } // fin de main
} // fin de la clase PruebaOrdenamientoSeleccion