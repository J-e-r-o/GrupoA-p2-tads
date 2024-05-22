package uy.edu.um.adt.hashCerrado;
import java.util.ArrayList;
import java.util.Vector;




public class hash<K,V> implements hashInterfaze<K,V>{
    //Vamos a lidiear linealmente con las colisiones 
    
    Vector<HashNode<K, V>> Hash;
    int tableSize;
    
    public hash(){
        tableSize=11;
        // Ya se crea un vector con 11 espacios nulos
        Hash= new Vector<HashNode<K,V>>(tableSize);
       
    }   
    
    
    
    public void put(K key, V value){
        HashNode<K,V> nuevoHashNode= new HashNode<K,V>(key, value);
        int LugarDelHash=HashFunction(key);
        
        //Tenemos que ver que el Lugar insertado este vacio
        while(Hash.get(LugarDelHash) !=null){
            LugarDelHash+=1;
        }
        
        Hash.get(LugarDelHash) = nuevoHashNode;
        
        
    }
    
    public boolean contains(K key){
        return true;
    }
    
    public void remove(K clave){}

    private void Rehash(){}

    public int HashFunction(K key){
        return (key.hashCode()) % tableSize;
    }


    
}