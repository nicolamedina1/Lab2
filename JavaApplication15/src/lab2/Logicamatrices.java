package lab2;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Logicamatrices {
    public String lista1;
    public String lista2;
    public double Matriz1[][]= new double[4][4];
    public double Matriz2[][]=new double[4][4];
    public Double Res[][];
    int i,j;
    int filas;
    int columnas;

    
    public void tamaño(JTable p){
    
       
        switch (lista1) {
            case "1":
                filas=1;
                 break;
            case "2":
                filas=2;
                  break;
            case "3":
                filas=3;
                 break;
            case "4":
                filas=4;
               break;
            default:
                break;
        }
        switch (lista2) {
            case "1":
                columnas=1;
                break;
            case "2":
                columnas=2;
                  break;
            case "3":
                columnas=3;
                 break;
            case "4":
                columnas=4;
               break;
            default:
                break;
        }
        DefaultTableModel Modelo = new DefaultTableModel();
        for(j=0;j<columnas;j++){
            Modelo.addColumn(j+1);
        }
        for(i=0;i< filas ;i++){
            String [] filasposicion =new String[filas];
            Modelo.addRow(filasposicion);

        }
        p.setModel(Modelo);
        
        

        
        for(i=0;i< filas ;i++){
            for(j=0;j<columnas;j++){
                Res[i][j]= Matriz1[i][j]+Matriz2[i][j];
            }
        }

        
    }
    
    public Double [][] sumamatrices( Double[][] Matriz1, Double [][]Matriz2){

        for(i=0;i< filas ;i++){
            for(j=0;j<columnas;j++){
                Res[i][j]= Matriz1[i][j]+Matriz2[i][j];
            }
        }
        return Res ;
    }
    
}
    



