
package listasimplementeligada;
/**
 *
 * @author Zuleyka Guzman
 */
public class Test{
    public static void main(String[] args){
        ListaSimplementeLigada<Integer> lis = new ListaSimplementeLigada<Integer>();
        
        lis.inserta_final(1);
        lis.inserta_final(2);
        lis.inserta_final(4);
        lis.inserta_antes_de(3,4);
        lis.inserta_despues_de(7,2);
        
        System.out.println("Se elimino a " + lis.elimina_primero());
        //System.out.println("Se elimino a " +lis.elimina_elemento(2));
        //System.out.println("Se elimino a " +lis.elimina_antes(4));
        System.out.println("Se elimino a " + lis.elimina_ultimo());
        
        //System.out.println( lis.busca_desordenado(7));
        //System.out.println( lis.busca_recursivo(lis.getInicio(), 8));
        
        //System.out.println(lis.recorreIterativo());
        System.out.println(lis.recorreRecursivo(lis.getInicio()));
        
        System.out.println(lis.obtenDatoEnPosicion(2));
        
    }
}
