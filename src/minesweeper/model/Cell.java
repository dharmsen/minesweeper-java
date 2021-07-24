package minesweeper.model;

public class Cell {

    /** Cell object */
    private int x;
    private int y;
    private boolean visible;
    private int adjacent;
    private boolean flagged;

    /**
     * Constructor method for Cell
     * @param x horizontal position in grid
     * @param y vertical position in grid
     * @param visible visibility (clicked/not clicked)
     * @param adjacent how many mines are adjacent to this cell, -1 = mine
     * @param flagged if player flagged this cell as safe
     */
    public Cell(int x, int y, boolean visible, int adjacent, boolean flagged) {
        this.x = x;
        this.y = y;
        this.visible = visible;
        this.adjacent = adjacent;
        this.flagged = flagged;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean getVisible() {
        return this.visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getAdjacent() {
        return this.adjacent;
    }

    public void setAdjacent(int adjacent) {
        this.adjacent = adjacent;
    }

    public boolean getFlagged() {
        return this.flagged;
    }

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }
}