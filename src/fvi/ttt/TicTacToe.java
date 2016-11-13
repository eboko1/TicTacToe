package fvi.ttt;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.*;

/**
 * Created by Vika on 14.11.2016.
 */
public class TicTacToe extends Application {
    private char currentPlayer = 'X';
    private Cell[][] cell = new Cell[3][3];
    private Label statusMsg = new Label("X must play");

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cell[i][j] = new Cell();
                pane.add(cell[i][j], i, j);
            }
        }
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(statusMsg);


        Scene scene = new Scene(borderPane, 450, 300);
        primaryStage.setTitle("Created by Vika game TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cell[i][j].getPlayer() == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hasWon(char player) {
        for (int i = 0; i < 3; i++) {
            if (cell[i][0].getPlayer() == player && cell[i][1].getPlayer() == player && cell[i][2].getPlayer() == player) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (cell[0][i].getPlayer() == player && cell[1][i].getPlayer() == player && cell[2][i].getPlayer() == player) {
                return true;
            }
        }

        if (cell[0][0].getPlayer() == player && cell[1][1].getPlayer() == player && cell[2][2].getPlayer() == player) {
            return true;
        }

        if (cell[0][2].getPlayer() == player && cell[1][1].getPlayer() == player && cell[2][0].getPlayer() == player) {
            return true;
        }
    }



}





