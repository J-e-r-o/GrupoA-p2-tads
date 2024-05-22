package uy.edu.um.adt.hashCerrado;

public class PruebasDeHash {
    //The code computes a polynomial function of 37 by use of Horner’s rule.    

    public static int hash( String key, int tableSize )
    {
     int hashVal = 0;
    
     for( int i = 0; i < key.length( ); i++ )
     hashVal = 37 * hashVal + key.charAt( i );
    
     hashVal %= tableSize;
     if( hashVal < 0 )
     hashVal += tableSize;
    
     return hashVal;
    }

    public static void main(String[] args) {
        System.out.println( hash( "Holaaa", 1007 ));
    }


}
