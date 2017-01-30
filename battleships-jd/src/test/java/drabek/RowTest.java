package drabek;

import org.junit.Test;

public class RowTest {

    @Test(expected = IllegalArgumentException.class)
    public void creating_row_that_is_greater_than_10_should_throw_exception(){
        Row.row(11);
    }

    @Test(expected = IllegalArgumentException.class)
    public void creating_row_that_is_smaller_than_1_should_throw_exception(){
        Row.row(0);
    }

    @Test
    public void value_between_1_and_10_should_not_throw_exception(){
        Row.row(1);
        Row.row(2);
        Row.row(3);
        Row.row(4);
        Row.row(5);
        Row.row(6);
        Row.row(7);
        Row.row(8);
        Row.row(9);
        Row.row(10);
    }
}