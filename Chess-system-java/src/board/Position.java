package board;

public class Position {
    private int row;
    private int column;

    public Position(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public void setValues(int row, int column){
        this.column = column;
        this.row = row;
    }
}
