package uy.edu.um.adt.hashCerrado;

public class PruebasDeHash {
    //The code computes a polynomial function of 37 by use of Horner’s rule.    


    public static void main(String[] args) {

        hash<Integer,String> h= new hash<>();
        h.put(7,"Hola" );
        h.put(8,"qer");
        //h.put(7, "Otra");
        //h.put(8,"Saltador");
        //h.put(7,"Algo");
        //System.out.println(h.ShowHash());
        //h.put(7,"EEEEEEEEE");
        //System.out.println(h.ShowHash());
        h.put(0, "SQL");
        //System.out.println(h.ShowHash());
        h.put(81,"HHHHHHHHHHH");
        //System.out.println(h.ShowHash());
        h.put(33,"Jero");
        //System.out.println(h.ShowHash());
        //System.out.println(h.contains(2));
        //System.out.println(h.contains(7));
        //System.out.println(h.contains(33));
        //System.out.println(h.ShowHash());
        //h.remove(7);
        //System.out.println(h.ShowHash());
        //h.remove(8);
        h.put(18, "dt");
        h.put(19,"EEEEEEEEEEEEEEOOOOOOOOO");
        h.remove(18);
        System.out.println(h.ShowHash());
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println(h.contains(18));
        System.out.println(h.contains(13));
       

    }


}
