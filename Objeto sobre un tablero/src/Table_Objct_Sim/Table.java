package Table_Objct_Sim;

public class Table {
    static int[][] table = new int[5][5];

    public void table_value() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                if (i == 0 && j == 0) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }
            }
        }
    }

    public void table_Display() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("----------");
    }
}



