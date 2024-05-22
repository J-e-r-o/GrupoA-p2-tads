package uy.edu.um.adt.hashCerrado;

public class PruebasDeHash {
    //The code computes a polynomial function of 37 by use of Horner’s rule.    


    public static void main(String[] args) {

    hash<Integer,String> h= new hash<>();
    h.put(5,"Hola" );
    h.put(6,"qer");
    h.put(55, "Otra");
    h.put(8,"Saltador");
    h.put(10,"Algo");
    System.out.println(h.ShowHash());
    h.put(4,"EEEEEEEEE");    
    h.put(7, "SQL");
    h.put(81,"H");    
    h.put(33,"Jero");

    
    System.out.println(h.ShowHash());    
    }


}
