/*
8.  Un teatro se caracteriza por su nombre y su dirección y en él se realizan 4 funciones al día.
Cada función tiene un nombre y un precio. Realice el diseño de clases definiendo los métodos  y atributos  
que tendría cada clase, teniendo en cuenta que se pueda cambiar los valores de los atributos del teatro y de la función.  
Implemente dichas clases, y defina un método adicional que permita mostrar por pantalla toda la información del teatro. 
Diseñe una clase donde se pruebe las funcionalidades descritas.
 */
package teatro;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Teatro {
    //atributos
    String nombreTearo,nomFuncion, direccion;
    double precio;
    
    //metodo constructor
    Teatro() {
        this.nombreTearo="";
        this.direccion="";
        this.nomFuncion="";        
        this.precio=0;
    }

    //metodos getter y setter
    public String getNomFuncion() {
        return nomFuncion;
    }

    public void setNomFuncion(String nomFuncion) {
        this.nomFuncion = nomFuncion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getNombreTearo() {
        return nombreTearo;
    }

    public void setNombreTearo(String nombreTearo) {
        this.nombreTearo = nombreTearo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //creando archivo txt para almacenar los datos ingresados
    public void crearArchivo(JTable jtab){
        try{
           String fileRectangulo = "D:\\Documents\\NetBeansProjects\\Teatro\\src\\Teatro\\datos.txt";
           BufferedWriter bfw = new BufferedWriter(new FileWriter(fileRectangulo));
            for (int i = 0; i < jtab.getColumnCount(); i++) {
                bfw.write(jtab.getColumnName(i) + "      ");
            }
            bfw.write("\n");
            for (int i = 0; i < jtab.getRowCount(); i++) {
                for (int j = 0; j < jtab.getColumnCount(); j++) {
                    bfw.write(jtab.getValueAt(i, j).toString() + "         ");
                }
                bfw.newLine();
            }
            bfw.close();
            JOptionPane.showMessageDialog(null, "El archivo fue creado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo." + e.getMessage());
        }
    }
    
    //llenar tabla con los registros
    public void llenarTabla(String nomT, String direc, String nomF, double prec, JTable tabla){
       //asignar los valores obtenidos
        setNombreTearo(nomT);
        setDireccion(direc);
        setNomFuncion(nomF);
        setPrecio(prec);
        //añadimos el registro a la tabla
        try {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object nuevaTab[] = {nomT,direc,nomF,prec};
            tb.addRow(nuevaTab);
            JOptionPane.showMessageDialog(null, "Registro Añadido exitosamente"); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se pudo añadir "+e.getMessage());
        }
    }
    
    // Eliminar datos de una tabla
    public void eliminaRegistro(JTable tabla){
        DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
        if (tabla.getSelectedRow()>=0){
            tb.removeRow(tabla.getSelectedRow());
        } 
    }
    
    //guardar datos modificados
    public void guardarDatosModificados(JTable tabla, int filaSelec, String nomT, String direc, String nomF, double prec){
        try {            
            tabla.setValueAt(nomT, filaSelec, 0);
            tabla.setValueAt(direc, filaSelec, 1);
            tabla.setValueAt(nomF, filaSelec, 2);
            tabla.setValueAt(prec, filaSelec, 3);
            
            JOptionPane.showMessageDialog(null, "Registro Modificado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
