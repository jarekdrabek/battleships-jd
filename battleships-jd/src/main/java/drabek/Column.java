package drabek;

import com.google.common.base.Objects;

public class Column {

    Character columnValue;

    public static Column column(Character columnValue){
        return new Column(columnValue);
    }

    public Column(Character columnValue) {
        if("ABCDEFGHIJabcdefghij".indexOf(columnValue)<0){
            throw new IllegalArgumentException("Column must be a Character between A and B or between a and b");
        }
        this.columnValue = columnValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Column column = (Column) o;
        return Objects.equal(columnValue, column.columnValue);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(columnValue);
    }
}
