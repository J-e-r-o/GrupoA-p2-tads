package uy.edu.um.adt.hashCerrado;

public class PruebasDeHash {
    //The code computes a polynomial function of 37 by use of Horner’s rule.    


    public static void main(String[] args) {

    hash<Integer,String> h= new hash<>();
    h.put(7,"Hola" );
    h.put(7,"qer");
    h.put(7, "Otra");
    h.put(7,"Saltador");
    h.put(7,"Algo");
    System.out.println(h.ShowHash());
    h.put(7,"EEEEEEEEE");    
    System.out.println(h.ShowHash());
    h.put(7, "SQL");
    System.out.println(h.ShowHash());
    h.put(81,"H");    
    System.out.println(h.ShowHash());
    h.put(33,"Jero");
    System.out.println(h.ShowHash());    
    
      
    }


}
