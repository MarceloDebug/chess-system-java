package board;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setValues(int row, int column){
        this.column = column;
        this.row = row;
    }

    @Override
    public String toString(){
        return row + ", " + column;
    }
}
