package minesweeper.model;

public class Game {
    Grid grid;

    public void generateGrid(int x, int y) {
        this.grid = new Grid();
        Cell[][] matrix = new Cell[y][x];
        grid.setMatrix(matrix);
        grid.setMines();
        grid.calculateAdjacent();
    }
}
