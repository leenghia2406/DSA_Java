package lesson4Ex;

import java.util.Random;

public class MineSweeper {
    private static int rows;
    private static int columns;
    private static int numOfBoom;
    private static int[][]matrix;
    public MineSweeper(int rows, int columns, int numOfBoom, int[][]matrix) {
        this.rows = rows;
        this.columns = columns;
        this.numOfBoom = numOfBoom;
        this.matrix = new int[this.rows][this.columns];
        this.createRandomBoomsMatrix();
    }
    private void createRandomBoomsMatrix() {
        int temp = 0;
        while (temp < numOfBoom) {
            setUpRandomABoom();
            temp++;
        }
    }
    private static void setUpRandomABoom(){
        int xRan = new Random().nextInt(rows);
        int yRan = new Random().nextInt(columns);
        if(matrix[xRan][yRan] == -1){
            setUpRandomABoom();
        }else{
            matrix[xRan][yRan] = -1;
        }
    }
    private static int countBoomAround(int x, int y){
        int result = 0;
        for(int xBegin = x -1; xBegin < x + 2; xBegin++){
            for(int yBegin = y -1; yBegin < y + 2; yBegin++){
                if(xBegin < 0 || yBegin < 0 || xBegin >=rows || yBegin >= columns){

                }else{
                    if(matrix[xBegin][yBegin] == -1){
                        result++;
                    }
                }
            }
        }
        return result;
    }
    public static void solutionBoomMatrix(){
        for(int row = 0; row < rows; row++){
            for(int column = 0; column < columns; column++){
                if(matrix[row][column] != -1){
                    matrix[row][column] = countBoomAround(row, column);
                }
            }
        }
    }
    @Override
    public String toString(){
        String result = "";
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                result += matrix[i][j] + "\t";
            }
            result += "\n";
        }
        return result;
    }
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int numOfBoom = 3;
        int[][] matrix = new int[rows][columns];
        MineSweeper ms = new MineSweeper(rows, columns, numOfBoom, matrix);
        ms.solutionBoomMatrix();
        System.out.println(ms);
    }
}
