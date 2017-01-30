package drabek;

import static drabek.Column.column;
import static drabek.Row.row;

class Coordinate {

    final Column column;
    final Row row;

    public Coordinate(Column column, Row row) {
        this.column = column;
        this.row = row;
    }

    public static Coordinate valueOf(String coordinates){
        if(coordinates==null || coordinates.isEmpty()){
            throw new IllegalArgumentException("Wrong value of coordinate. It should consist of a letter between A " +
                    "and J concatenated with integer between 1 and 10");
        }
        Column column = column(coordinates.charAt(0));
        Row row = row(Integer.parseInt(coordinates.substring(1)));
        return new Coordinate(column, row);
    }

}
