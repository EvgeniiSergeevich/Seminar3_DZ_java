import java.util.Arrays;

public class Chess {
    public static void main(String[] args) {
        System.out.println(chess(3,3,8));
    }
    public static int chess(int x, int y, int size)      // Метод расчитывает количество ходов без препядствий
    {
        int[][] board = new int[size][size];

        for (int i = 0; i < size; i++) {                // Заполняю строку и столбец, где стоит фигура  единицами
            for (int j = 0; j < size; j++) {
                board[x][i] = 1;
                board[j][y] = 1;

            }
        }

        for (int i = x; i < size; i++) {                // Заполняю масссив количеством путей в каждую клетку
            for (int j = y; j < size; j++) {
                if (i < size-1 && j < size-1)
                {
                    board[i+1][j+1] = board[i+1][j] + board[i][j+1];
                }

            }
        }
        return board[size-1][size-1];                   // Возвращаю значение точки финиша
    }
}
