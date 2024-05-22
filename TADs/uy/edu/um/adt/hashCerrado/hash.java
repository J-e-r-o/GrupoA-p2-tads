package uy.edu.um.adt.hashCerrado;
import java.util.Vector;
import java.util.ArrayList;





public class hash<K,V> implements hashInterfaze<K,V>{
    //Vamos a lidiear linealmente con las colisiones 
    
    Vector<HashNode<K, V>> Hash;
    int tableSize;
    int capacity;
    int percentage_capacity;
 

    public hash(){
        capacity=0;
        tableSize=11;
        percentage_capacity=0;
        Hash= new Vector<>(tableSize);
        for (int i = 0; i < tableSize; i++) {
            Hash.add(null);}
    }   
    
    
    
    public void put(K key, V value){
        HashNode<K,V> nuevoHashNode= new HashNode<K,V>(key, value);
        int LugarDelHash=HashFunction(key);
        
    
        
        //Tenemos que ver que el Lugar insertado este vacio
         while(Hash.get(LugarDelHash) !=null){
            LugarDelHash=LugarDelHash+1;
            if (LugarDelHash >= tableSize){
                LugarDelHash=0;
            }
                
        }
        Hash.set(LugarDelHash,nuevoHashNode);
        this.capacity+=1;
        this.percentage_capacity=((capacity*100)/tableSize);

        //Hacer rehashing cuando el hash es muy grande 
        if(percentage_capacity>=75){
            this.Rehash();
        }
    }
    
    public boolean contains(K key){
        boolean resultado=false;
        
        
        
        return resultado;    
    }
    
    public void remove(K clave){
        int indiceDelBorrado= HashFunction(clave);
    
        while (indiceDelBorrado<this.tableSize){
            /*         while(Hash.get(LugarDelHash) !=null){
            LugarDelHash=LugarDelHash+1;
            if (LugarDelHash >= tableSize){
                LugarDelHash=0;
            }
                
        } */
            
            
            if (this.Hash.get(indiceDelBorrado).key==clave){
                this.Hash.get(indiceDelBorrado).borrado=true;
                break;
            }    
                indiceDelBorrado+=1;
            }
    }

    private void Rehash(){
        NextPrimo np = new NextPrimo();
        int tablesizeVIEJO=this.tableSize;
        this.tableSize= np.nextPrimo(tableSize*2);
        
        Vector<HashNode<K,V>> Hash_nuevo= new Vector<>(tableSize);
        ArrayList<HashNode<K,V>> listaAuxiliar = new ArrayList<>();
        //LLena todo el Hash de nodos nulos
        for(int i = 0; i < tableSize; i++){
            Hash_nuevo.add(null);
        }
        
        
        for (int i = 0; i < tablesizeVIEJO; i++) {
            //Caso 1 y caso 2 no hacemos nada
            if(Hash.get(i)==null){
                
            }    
            if(Hash.get(i)!=null){
                if(Hash.get(i).borrado==true){   
                }
                else{
                    HashNode<K,V> Nodo_Que_Tenemos_Que_Mudar=Hash.get(i);
                    listaAuxiliar.add(Nodo_Que_Tenemos_Que_Mudar);
                    
                    //El error es que si el lugar es el mismo el set los va a poner uno arriba del otro
                    //Hash_nuevo.put(lugarEnNuevoHash, Nodo_Que_Tenemos_Que_Mudar);
                }
            }
        }
        this.Hash=Hash_nuevo;
        for (int i=0; i<listaAuxiliar.size();i++){
            HashNode<K,V> nodoaux= listaAuxiliar.get(i);
            this.put(nodoaux.key,nodoaux.valor);
        }
        
    }

    private int HashFunction(K key){
        return (key.hashCode()) % tableSize;
    }

    public String ShowHash(){
        String resultado="{";
        for(int i=0;i<tableSize;i++){
            if (this.Hash.get(i)==null || this.Hash.get(i).borrado==true){
                resultado = resultado+ "NULL, ";
            }
            else{
            resultado= resultado + this.Hash.get(i).valor+", ";
        }
    }
        resultado= resultado +"\b" +"\b" +"}";
        return resultado;
    }

    

}