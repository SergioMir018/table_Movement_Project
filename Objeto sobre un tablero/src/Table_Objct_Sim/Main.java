package Table_Objct_Sim;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Object input_movement = new Object();
        Table table = new Table();
        Object object_movement = new Object();

        table.table_value();
        table.table_Display();

        while ( Object.movement != 'e' ||  Object.movement != 'E') {

            input_movement.getMovement();

            switch (Object.movement) {
                case 'd','D' -> {
                    object_movement.table_Movement_Right();
                    table.table_Display();
                }
                case 'a','A' -> {
                    object_movement.table_Movement_Left();
                    table.table_Display();
                }
                case 'w','W' -> {
                    object_movement.table_Movement_Up();
                    table.table_Display();
                }
                case 's','S' -> {
                    object_movement.table_Movement_Down();
                    table.table_Display();
                }
                case 'e', 'E' -> {
                    break;
                }
                default -> JOptionPane.showMessageDialog(null,"ERROR!\nPlease write a valid option");


            }

        }
    }
}
