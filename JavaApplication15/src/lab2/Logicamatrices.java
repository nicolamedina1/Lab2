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
    public Double [][] Inv= new Double[4][4];
    public Double [][] Adj= new Double[4][4];
    public Double [][] Trans= new Double[4][4];
    public Double det;
    int i,j;
    int filas;
    int columnas;
    int filasm2;
    int filasm1;


    
    public void tamaño(JTable p){ // metodo para el tamaño de la tabla1 y 2
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
    public  Double [][] sumamatrices( Double[][] Matriz1, Double [][]Matriz2){// operacion metodo

        for(i=0;i< filas ;i++){
            for(j=0;j<columnas;j++){
                Res[i][j]= Matriz1[i][j]+Matriz2[i][j];
            }
        }
        return Res ;
    }
    public Double[][] restarmatrices(Double[][] Matriz1, Double[][] Matriz2) {// operacion metodo

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                Res[i][j] = Matriz1[i][j] - Matriz2[i][j];
            }
        }
        return Res;
    }
    public Double[][] multiplicarmatrices(Double[][] Matriz1, Double[][] Matriz2) {// operacion metodo
         switch (lista4) {
            case "1":
                filasm2=1;
                 break;
            case "2":
                filasm2=2;
                  break;
            case "3":
                filasm2=3;
                 break;
            case "4":
                filasm2=4;
               break;
            default:
                break;
        }
        switch (lista3) {
            case "1":
                filasm1=1;
                break;
            case "2":
                 filasm1=2;
                  break;
            case "3":
                 filasm1=3;
                 break;
            case "4":
                 filasm1=4;
               break;
            default:
                break;
        }
            if( filasm2 == 1){
           for(i=0;i<filasm1;i++){
            for(j=0;j<columnas;j++){ 
               for(int k=0;k<1;k++){ 
            Res[i][j]= Matriz1[i][k] * Matriz2[k][j];        
        }
        }
        }
      
       }else if(filasm2 == 2){
           for(i=0;i<filasm1;i++){
             for(int k=0;k<2;k++){
               for(j=0;j<columnas;j++){ 
                   Res[i][j] = ((Matriz1[i][k] * Matriz2[k][j]) + (Matriz1[i][1] * Matriz2[1][j]));
        }
        }
        }
       } else if(filasm2 == 3){
           for(i=0;i<filasm1;i++){
             for(int k=0;k<3;k++){
               for(j=0;j<columnas;j++){ 
                   Res[i][j] = ((Matriz1[i][0] * Matriz2[0][j]) + (Matriz1[i][1] * Matriz2[1][j]) + (Matriz1[i][2] * Matriz2[2][j]));
               }
             }
           }
       } else if(filasm2 == 4){
            for(i=0;i<filasm1;i++){
             for(int k=0;k<4;k++){
               for(j=0;j<columnas;j++){ 
                   Res[i][j] = ((Matriz1[i][0] * Matriz2[0][j]) + (Matriz1[i][1] * Matriz2[1][j])+ (Matriz1[i][2] * Matriz2[2][j])+ (Matriz1[i][3] * Matriz2[3][j]));
               }
       } 
       }
       }
        return Res;
    }
    public Double[][] inversamatrices(Double[][] Matriz1){
        switch (lista3) {
            case "1":
                filasm1=1;
                break;
            case "2":
                 filasm1=2;
                  break;
            case "3":
                 filasm1=3;
                 break;
            case "4":
                 filasm1=4;
               break;
            default:
                break;
        }
        if(filasm1 == 2){
            for (i = 0; i < 2; i++){
            for (j = 0; j < 2; j++){
            det = ((Matriz1[0][0]*Matriz1[1][1])-(Matriz1[1][0]*Matriz1[0][1]));
        }
        }
            for (i = 0; i < 2; i++){
            for (j = 0; j < 2; j++){
                Adj[0][0] = Matriz1[1][1];
                Adj[0][1] = -1*Matriz1[0][1];
                Adj[1][0] = -1*Matriz1[1][0];
                Adj[1][1] = Matriz1[0][0];
            }
            }
            for (i = 0; i < 2; i++){
            for (j = 0; j < 2; j++){
                Inv[i][j]=Adj[i][j]/det;
            }
            }
        }
        else if(filasm1 == 3){
            for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
            det = ((Matriz1[0][0] * Matriz1[1][1] * Matriz1[2][2])+(Matriz1[0][1] * Matriz1[1][2] * Matriz1[2][0])+(Matriz1[0][2] * Matriz1[1][0] * Matriz1[2][1])
                    -((Matriz1[2][0] * Matriz1[1][1] * Matriz1[0][2])+(Matriz1[2][1] * Matriz1[1][2] * Matriz1[0][0])+(Matriz1[2][2] * Matriz1[1][0] * Matriz1[0][1])));
            }
        }
            for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
               Adj[0][0] = (Matriz1[1][1] * Matriz1[2][2]) - (Matriz1[2][1] * Matriz1[1][2]);
               Adj[0][1] = -1 *((Matriz1[1][0] * Matriz1[2][2]) - (Matriz1[2][0] * Matriz1[1][2]));
               Adj[0][2] = (Matriz1[1][0] * Matriz1[2][1]) - (Matriz1[2][0] * Matriz1[1][1]);
               Adj[1][0] = -1*((Matriz1[0][1] * Matriz1[2][2]) - (Matriz1[2][1] * Matriz1[0][2]));
               Adj[1][1] = (Matriz1[0][0] * Matriz1[2][2]) - (Matriz1[2][0] * Matriz1[0][2]);
               Adj[1][2] = -1*((Matriz1[0][0] * Matriz1[2][1]) - (Matriz1[2][0] * Matriz1[0][1]));
               Adj[2][0] = (Matriz1[0][1] * Matriz1[1][2]) - (Matriz1[1][1] * Matriz1[0][2]);
               Adj[2][1] = -1*((Matriz1[0][0] * Matriz1[1][2]) - (Matriz1[1][0] * Matriz1[0][2]));
               Adj[2][2] = (Matriz1[0][0] * Matriz1[1][1]) - (Matriz1[1][0] * Matriz1[0][1]);
            }
        }
            for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
               Trans[j][i] = Adj[i][j]; 
            }
            }
            for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                Inv[i][j] = Trans[i][j]/det;
            }
            }
        }
        return Inv;
    }
     public Double determinante(Double[][]matriz1){
        switch (lista3) {
            case "1":
                filasm1=1;
                break;
            case "2":
                 filasm1=2;
                  break;
            case "3":
                 filasm1=3;
                 break;
            case "4":
                 filasm1=4;
               break;
            default:
                break;
        }
        if(filasm1 == 2){
            for (i = 0; i < 2; i++){
            for (j = 0; j < 2; j++){
            det = ((Matriz1[0][0]*Matriz1[1][1])-(Matriz1[1][0]*Matriz1[0][1]));
            }
            }
        }else if(filasm1 == 3){
            for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
            det = ((Matriz1[0][0] * Matriz1[1][1] * Matriz1[2][2])+(Matriz1[0][1] * Matriz1[1][2] * Matriz1[2][0])+(Matriz1[0][2] * Matriz1[1][0] * Matriz1[2][1])
                    -((Matriz1[2][0] * Matriz1[1][1] * Matriz1[0][2])+(Matriz1[2][1] * Matriz1[1][2] * Matriz1[0][0])+(Matriz1[2][2] * Matriz1[1][0] * Matriz1[0][1])));
            }
        }
        }
        return det;
        
     }
}

    



