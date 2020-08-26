package lab2;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Logicamatrices {
    public String listado;
    
    public void pasar_valores(JTable p){
        
        String []Columns={"",""};
        DefaultTableModel Modelo = new DefaultTableModel(null,Columns);
        if(listado.equals("2 x 2")){
            for(int i=0;i< 2 ;i++){
                String [] filas ={"",""};
                Modelo.addRow(filas);
                
            }
        }else if(listado.equals("3 x 3")){
            for(int i=0;i< 3 ;i++){
                String [] filas ={"",""};
                Modelo.addRow(filas);
            }
        }else if(listado.equals("4 x 4")){
           for(int i=0;i< 4 ;i++){
               String [] filas ={"",""};Modelo.addRow(filas);
               Modelo.addRow(filas);
           }
        }
        
        p.setModel(Modelo);
        
    }
}
    



