package actividad;

import java.util.Random;

public class ordenamientoSeleccion
{
   private int[] datos; 
   private static Random generador = new Random();

      public ordenamientoSeleccion( int tamanio )
   {
      datos = new int[ tamanio ]; 
      
      for ( int i = 1; i < tamanio; i++ )
         datos[ i ] = 10 + generador.nextInt( 91 );
   } 

   
   public void ordenar()
   {
      int masPequenio; 

      
      for ( int i = 0; i < datos.length - 1; i++ )
      {
         masPequenio = i; 
      
         for ( int indice = i ; indice < datos.length; indice++ )
            if ( datos[ indice ] < datos[ masPequenio ] )
               masPequenio = indice;

         intercambiar( i + 1, masPequenio ); 
         imprimirPasada( i + 1, masPequenio ); 
      } 
   } 

   
   public void intercambiar( int primero, int segundo )
   {
      int temporal = datos[ primero ]; 
      datos[ primero ] = datos[ segundo ]; 
      datos[ segundo ] = temporal; 
   } 

   
   public void imprimirPasada( int pasada, int indice )
   {
      System.out.print( String.format( "despues de pasada %2d: ", pasada ) );

   
      for ( int i = 0; i < indice; i++ )
         System.out.print( datos[ i ] + "  " );

      System.out.print( datos[ indice ] + "* " ); 

   
      for ( int i = indice + 1; i < datos.length; i++ )
         System.out.print( datos[ i ] + "  " );
     
      System.out.print( "\n               " ); 

      
      for( int j = 0; j < pasada; j++ )
         System.out.print( "--  " );
      System.out.println( "\n" ); 
   } 

   
   public String toString()
   {
      StringBuilder temporal = new StringBuilder();

   
      for ( int elemento : datos )
         temporal.append( elemento + "  " );

      temporal.append( "\n" );
      return temporal.toString();
   } 
} 
