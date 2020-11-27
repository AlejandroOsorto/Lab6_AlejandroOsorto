package lab6_alejandroosorto;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class ClaudiList
{
    private String nombre;
    private ArrayList<Programa> lista;

    public ClaudiList()
    {
    }

    public ClaudiList(String nombre, ArrayList<Programa> lista)
    {
        this.nombre = nombre;
        this.lista = lista;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getLista()
    {
        return lista;
    }

    public void setLista(ArrayList<Programa> lista)
    {
        this.lista = lista;
    }
    
    @Override
    public String toString()
    {
        return nombre + ", " + lista;
    }
    
    
}
