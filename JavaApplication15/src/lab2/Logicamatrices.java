package lab2;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Logicamatrices {
    public String lista1;
    public String lista2;
    public String lista3;
    public String lista4;
    public Double [][] Matriz1= new Double[4][4];
    public Double [][] Matriz2= new Double[4][4];
    public Double [][] Res= new Double[4][4];
    int i,j;
    int filas=0;
    int columnas=0;

    
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
        
        DefaultTableModel Modelo1 = new DefaultTableModel();
        for(j=0;j<columnas;j++){
            Modelo1.addColumn(j+1);
        }
        for(i=0;i< filas ;i++){
            String [] filasposicion =new String[filas];
            Modelo1.addRow(filasposicion);
        }
        p.setModel(Modelo1);   
    }
    public  Double [][] sumamatrices( Double[][] Matriz1, Double [][]Matriz2){

        for(i=0;i< filas ;i++){
            for(j=0;j<columnas;j++){
                Res[i][j]= Matriz1[i][j]+Matriz2[i][j];
            }
        }
        return Res ;
    }
    public Double[][] restarmatrices(Double[][] Matriz1, Double[][] Matriz2) {

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                Res[i][j] = Matriz1[i][j] - Matriz2[i][j];
            }
        }
        return Res;
    }
    
}
    



