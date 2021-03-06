public class Field {

    private final int row;
    private final int column;
    private char takenBy;

    public Field(int row, int column) {
        this.row = row;
        this.column = column;
        takenBy = '.';
    }

    public Field(Field field) {
        this.row = field.row;
        this.column = field.column;
        this.takenBy = field.takenBy;
    }

    public char getTakenBy() {
        return takenBy;
    }

    public void setTakenBy(char takenBy) {
        this.takenBy = takenBy;
    }

    public String toString() {
        return "(" + row + ", " + column + ")";
    }

    public boolean equals(int row, int column) {
        return this.row == row && this.column == column;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Field)) {
            return false;
        }
        return this.row == ((Field) o).row && this.column == ((Field) o).column;
    }

    public int hashCode() {
        return row * 1000 + column;
    }
}
