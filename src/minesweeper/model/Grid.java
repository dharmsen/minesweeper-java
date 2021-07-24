package minesweeper.model;

import minesweeper.model.Cell;

public class Grid {
    
    private Cell[][] matrix;

    public Grid() {
        // TODO add Cell to constructor?
    }

    /** Calculate adjacent value for each cell in grid */
    public void calculateAdjacent() {
        for (int y=0; y<this.matrix.length; y++) {
            for (int x=0; x<this.matrix[y].length; x++) {
                // check/count surrounding cells for -1 
            }
        }
    }

    /** Set mines in grid */
    public void setMines() {
        for (int y=0; y<this.matrix.length; y++) {
            for (int x=0; x<this.matrix[y].length; x++) {
                if ((int)Math.random() * 10 == 0) { // 1 in 10 chance
                    this.matrix[y][x].setAdjacent(-1);
                }
            }
        }
    }

    /** Click cell */
    public void clickCell(int xClicked, int yClicked) {
        if (!this.matrix[yClicked][xClicked].getVisible()) {
            this.matrix[yClicked][xClicked].setVisible(true); // if clicked, show adjacent
        }
    }

    public Cell[][] getMatrix() {
        return this.matrix;
    }

    public void setMatrix(Cell[][] matrix) {
        this.matrix = matrix;
    }
}
