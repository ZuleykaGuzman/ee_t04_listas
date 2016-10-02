
package listasimplementeligada;
/**
 *
 * @author Zuleyka Guzman
 */
public class ListaSimplementeLigada<T> implements ILista<T>{
         /**
     * Este es el constructor de la clase
     * Inicializa la varible inicio en null
     */
    public ListaSimplementeLigada(){
        inicio=null;
    }
    /**
     * Esta variable res es un auxiliar para almacenar un dato a retornar en los metodos de tipo T.
     */
    private T res;
    /**
     * Esta variable s es un auxiliar para los metodos recorreIterativo() y recorreRecursivo
     **/
    private String s= " ";
    /**
     * Esta es una variable auxiliar utilizada en el metodo elimina final
     */
    private Nodo<T> a;
    /**
     * Este es el inicio de la lista
     */
    private Nodo<T> inicio;
    /**
     * Este es el get de inicio
     * @return un dato de tipo Nodo
     */
    public Nodo<T> getInicio() {
        return inicio;
    }
    /**
     * Este es el set de inicio
     * @param inicio 
     */
    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }
    /**
     * Este metodo inserta un elemento al inicio de la lista
     * @param dato 
     */
    public void inserta_inicio(T dato){
        Nodo aux = new Nodo(dato); 
        aux.setSiguiente(inicio);
        inicio=aux;
    }
    
    /**
     * Este metodo agrega un nodo al final de la lista.
     * @param dato 
     */
    public void inserta_final(T dato){
        if(inicio == null){
            inserta_inicio(dato);
        }
        else{
            Nodo<T> aux=inicio;
        
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            Nodo<T> a = new Nodo<T>(dato); 
            aux.setSiguiente(a);
        }
    }
        /**
     * Este metodo inserta un elemento antes de otro dado como referencia
     * @param dato
     * @param x es la referencia 
     */
    public void inserta_antes_de(T dato, T x){
        Nodo aux = inicio;
        Integer ban = 1;
        
        while(aux.getDato()!=x && ban==1){
            if(aux.getSiguiente()!=null){
                a = aux;
                aux = aux.getSiguiente();
            }
            else{
                ban = 0;
            }
        }
        if(ban==1){
            Nodo var = new Nodo(dato);
            if(inicio==aux){
                var.setSiguiente(inicio);
                inicio=var;
            }
            else{
                a.setSiguiente(var);
                var.setSiguiente(aux);
            }
        }
        else{
            System.out.println("El nodo dato como referencia no se encuentra en la lista");
        }
    }
    /**
     * Este metodo inserta un nodo despues de otro elemento dado como referencia
     * @param dato
     * @param x 
     */
    public void inserta_despues_de(T dato, T x){
        Nodo aux = inicio;
        Integer ban = 1;
        
        while(aux.getDato()!=x && ban==1){
            if(aux.getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
            else{
                ban = 0;
            }
        }
        if(ban==1){
            Nodo var = new Nodo(dato);
            var.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(var);
        }
        else{
            System.out.println("El nodo dato como referencia no se encuentra en la lista");
        }
    }  
    /**
     * Este metodo elimina el primer nodo de la lista.
     * @return el dato que se elimino de la lista
     */
    public T elimina_primero(){
        Nodo<T> aux=inicio;
        
        if(inicio.getSiguiente()==null){
            res = inicio.getDato();
            inicio=null;
        }
        else{
            res = aux.getDato();
            aux=inicio.getSiguiente();
        }
        inicio=aux;
        return res;
    }
    /**
     * Este metodo elimina el nodo que se encuentra al final de la lista,
     * @return el dato que se elimino de la lista
     */
    public T elimina_ultimo(){
        Nodo<T> aux = inicio;
        
        if(inicio.getSiguiente()==null){
            res=inicio.getDato();
            inicio=null;
        }
        else{
            while(aux.getSiguiente() != null){
                a = aux;
                aux = aux.getSiguiente();
                res = aux.getDato();
            }
            a.setSiguiente(null);
        }
        return res;
    }
    /**
     * Este metodo elimina un elemento en especifico
     * @param x es el elemento a eliminar
     * @return el elemento eliminado
     */
    public T elimina_elemento(T x){ 
        Nodo aux = inicio;
        Integer ban = 1;
        
        while(aux.getDato()!=x && ban==1){
            if(aux.getSiguiente()!=null){
                a = aux;
                aux = aux.getSiguiente();  
            }
            else{
                ban = 0;
                
            }
        }
        if(ban==0){
            System.out.println("El elemento con informacion X no se encuentra en la lista");
        }
        else{
            if(inicio==aux){
                inicio = aux.getSiguiente();
                res = (T) aux.getDato();
            }
            else{
                a.setSiguiente(aux.getSiguiente());
                res = (T) aux.getDato();
            }
        }
        return res;
    }
    /**
     * Este metodo elimina un elemento antes de otro dado como referencia
     * @param x
     * @return el elemento eliminado
     */
    public T elimina_antes(T x){ 
        if(inicio.getDato()==x){
            System.out.println("No existe un nodo que preceda al que contiene a x");
        }
        else{
            Nodo aux = inicio;
            Nodo var = inicio;
            Integer ban = 1;
        
            while(aux.getDato()!=x && ban==1){
                if(aux.getSiguiente()!=null){
                    res = (T) aux.getDato();
                    a=var;
                    var=aux;
                    aux = aux.getSiguiente();
                }
                else{
                    ban=0;
                }
            }
            
            if(ban==0){
                System.out.println("El elemento no se encuentra en la lista");
            }
            else{
                if(inicio.getSiguiente()==aux){
                    inicio=aux;
                }
                else{
                    a.setSiguiente(aux);
                }
            }
        }
        return res;
    }
    /**
     * Este metodo busca un elemento en la lista de manera desordenada
     * @return el elemento buscado
     **/
    public T busca_desordenado(T x){
        Nodo aux = inicio;
        
        while((aux!=null)&&(aux.getDato()!=x)){
            aux=aux.getSiguiente();
        }
        if(aux==null){
            System.out.println("El elemento no se encuentra en la lista");
            return null;
        }
        else{
            System.out.println("El elemento si se encuentra en la lista");
            res = (T) aux.getDato();
        }
        return res;
    }   
    /**
     * Este metodo usca un elemento de manera recursiva
     * @param p
     * @param x
     * @return el elemento buscado
     */
    public T busca_recursivo(Nodo<T> p, T x){ 
        if(p!=null){
            if(p.getDato()==x){
                System.out.println("El elemento se encuentra en la lista");
            }
            else{
                busca_recursivo(p.getSiguiente(),x);
            }   
        }
        else{
            System.out.println("El elemento no se encuentra en la lista");
        }
        return null;
    }
    /**
     * Este metodo recorre la lista ligada
     * @return la lista
     */
    public String recorreIterativo(){
        Nodo aux = inicio;
        while(aux!=null){
            s+=aux.getDato()+"--->";
            aux = aux.getSiguiente();
        }
        return s;
    }
     /**
     * Este metodo recorre la lista ligada de manera recursiva
     * @return la lista
     */ 
    public String recorreRecursivo(Nodo<T> aux){
 
        if(aux!=null){
            s+=aux.getDato()+"--->";
            recorreRecursivo(aux.getSiguiente());
        }  
        return s;
    }
    /**
     * Este metodo obtiene un dato en una posicion especifica de la lista
     * @param posicion
     * @return dato 
     */
    public T obtenDatoEnPosicion(Integer posicion){
         int i = 0;
         Nodo aux = inicio;
        while (aux != null && i<posicion) {
            aux = aux.getSiguiente();
            i++;
        }
        res = (T) aux.getDato();
        return res; 
    }
    
}
