
package listasimplementeligada;

/**
 *
 * @author Zuleyka Guzman
 */
public interface ILista<T>{
    
    public void inserta_inicio(T dato);
    
    public void inserta_final(T dato);
    
    public void inserta_antes_de(T dato, T referencia);
    
    public void inserta_despues_de(T dato, T referencia);
 
   
    public T elimina_primero();
    
    public T elimina_ultimo();
    
    public T elimina_elemento(T dato);  
    
    public T elimina_antes(T dato); 
    

    public T busca_desordenado(T dato); 
    
    public T busca_recursivo(Nodo<T> p, T dato);  
    

    public String recorreIterativo();  
    public String recorreRecursivo(Nodo<T> p); 
    
    public T obtenDatoEnPosicion(Integer posicion);
    
}
