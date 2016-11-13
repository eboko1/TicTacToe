package fvi.ttt;

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.*;

/**
 * Created by Vika on 14.11.2016.
 */
public class TicTacToe extends Application {
private char currentPlayer='X';
    private Cell [][] cell= new Cell[3][3];
    private Label statusMsg=new Label("X must play");

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane= new GridPane();

        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                cell[i][j]=new Cell();
                pane.add(cell[i][j],i,j);
            }
        }


        

    }
}
