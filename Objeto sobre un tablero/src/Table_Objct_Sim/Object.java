package Table_Objct_Sim;

import javax.swing.*;

public class Object {
    static char movement;
    int positionX = 0;
    int positionY = 0;

    public char getMovement() {
        movement = JOptionPane.showInputDialog("Where do you want to go?\nD ==> Right\nA ==> Left\nW ==> Up\nS ==> Down\nE ==> EXIT").charAt(0);
        return movement;
    }

    public void table_Movement_Right() {
        int aux;
        int count = 0;

        for (int i = positionY; i < 5; i++) {
            for (int j = positionX; j < 5; j++) {

                while (count < 1) {
                    aux = Table.table[i][j];
                    Table.table[i][j] = Table.table[i][j + 1];
                    Table.table[i][j + 1] = aux;

                    count++;
                    positionX++;
                }
            }
        }
    }

    public void table_Movement_Left() {
        int aux;
        int count = 0;

        for (int i = positionY; i < 5; i++) {
            for (int j = positionX; j < 5; j++) {
                while (count < 1) {

                    aux = Table.table[i][j];
                    Table.table[i][j] = Table.table[i][j - 1];
                    Table.table[i][j - 1] = aux;

                    count++;
                    positionX--;
                }
            }
        }
    }

    public void table_Movement_Up() {
        int aux;
        int count = 0;

        for (int i = positionY; i < 5; i++) {
            for (int j = positionX; j < 5; j++) {

                while (count < 1) {

                    aux = Table.table[i][j];
                    Table.table[i][j] = Table.table[i - 1][j];
                    Table.table[i - 1][j] = aux;

                    count++;
                    positionY--;
                }

            }
        }
    }

    public void table_Movement_Down() {
        int aux;
        int count = 0;

        for (int i = positionY; i < 5; i++) {
            for (int j = positionX; j < 5; j++) {
                while (count < 1) {

                    aux = Table.table[i][j];
                    Table.table[i][j] = Table.table[i + 1][j];
                    Table.table[i + 1][j] = aux;

                    count++;
                    positionY++;
                }
            }


        }
    }
}

