package minesweeper.model;

public class Cell {

    /** Cell object */
    private int x;
    private int y;
    private boolean visible;
    private int adjacent;

    /**
     * Constructor method for Cell
     * @param x horizontal position in grid
     * @param y vertical position in grid
     * @param visible visibility (clicked/not clicked)
     * @param adjacent how many mines are adjacent to this cell
     */
    public Cell(int x, int y, boolean visible, int adjacent) {
        this.x = x;
        this.y = y;
        this.visible = visible;
        this.adjacent = adjacent;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getAdjacent() {
        return adjacent;
    }

    public void setAdjacent(int adjacent) {
        this.adjacent = adjacent;
    }
}