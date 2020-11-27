package lab6_alejandroosorto;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ClaudiList
{
    private String nombre;
    private ArrayList<Programa> lista;
    private File archivo;

    public ClaudiList()
    {
    }

    public ClaudiList(String path)
    {
        archivo = new File(path);
    }

    public File getArchivo()
    {
        return archivo;
    }

    public void setArchivo(File archivo)
    {
        this.archivo = archivo;
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
        return nombre + ": " + lista;
    }
    
    public void EscribirArchivo() throws IOException
    {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try
        {
            for (Programa t : lista)
            {
                bw.write(t.getNombre());
                bw.write(t.getPuntuacion());
                bw.write(t.getAño());
                bw.write(t.getTipo());
                bw.write(t.getGenero());
            }
            bw.flush();
        }
        catch (Exception ex) {}
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo()
    {
        Scanner leer = null;
        lista = new ArrayList();
        if (archivo.exists())
        {
            try
            {
                leer = new Scanner(archivo);
                leer.useDelimiter(";");
                while (leer.hasNext())
                {
                    lista.add(new Programa(leer.next(), leer.nextInt(), leer.nextInt(), leer.next(), leer.next()));
                }
            } 
            catch (Exception ex){}
            leer.close();
        }
    }
    
}
