package drabek;

import com.google.common.base.Objects;

class Row {
    int rowNumber;

    public static Row row(int rowNumber){
        return new Row(rowNumber);
    }

    private Row(int rowNumber) {
        if (rowNumber<1 || rowNumber>10)
            throw new IllegalArgumentException("Row must be a value between 1 and 10");
        this.rowNumber = rowNumber;
    }

    @Override
    public String toString() {
        return "Row{" +
                "rowNumber=" + rowNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Row row = (Row) o;
        return rowNumber == row.rowNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rowNumber);
    }
}
